set serveroutput on



create or replace procedure beerlist(b_list in list.l_category%type, list_key in member.m_no%type,
	res_cursor out sys_refcursor)
	is
	begin
		open res_cursor for
		select photo from beer 
		join list using(b_no) 
		where l_category = b_list and list.s_no = (select s_no from storage where m_no = list_key);
	end beerlist;
/



create or replace procedure pointchange(mm_no in member.m_no%type, plus in member.point%type)
	is
	begin
		update member set point = point + plus
        where m_no = mm_no;
    end pointchange;
/




create or replace view viewgrade
	as 
	select m.m_no, m.point, g.gname 
	from member m, grade g 
	where point between lowpoint and highpoint;




create or replace procedure guestbooklist(mm_no in member.m_no%type, res_cursor out sys_refcursor)
is
        begin
                open res_cursor for
                select (select name from member where m_no = g.m_no) "이름", g.body 
                from guestbook g 
                join storage using(s_no) 
                where storage.m_no = mm_no;
    end guestbooklist;
/




create or replace procedure qnachange(qq_no in qna.q_no%type)
is
	q_answer qna.answer%type;
	begin
		select answer into q_answer from qna
		where q_no = qq_no;
			if q_answer != '-' then
				update qna set yesno = 'y'
				where q_no = qq_no;
			else
				update qna set yesno = 'n'
				where q_no = qq_no;
			end if;
	end qnachange;
/





create or replace procedure reviewsearch(r_key in member.m_no%type, res_cursor out sys_refcursor)
is
	begin
		if (substr(r_key, 1, 1) = 'b') then
			open res_cursor for
			select review from review where b_no = r_key;
		else
			open res_cursor for
			select review from review where m_no = r_key;
		end if;
	end reviewsearch;
/



	

create or replace procedure beerfilter(
        f_name in beer.b_no%type,
        f_type in beer.type%type, 
        f_lowavu in beer.avu%type, 
        f_highavu in beer.avu%type, 
        f_country in brand.country%type, 
        res_cursor out sys_refcursor)
is
        begin
                open res_cursor for
                select b_no from beer b, brand br
                where b.br_name = br.br_name
                and b.b_no like nvl(f_name, b.b_no) 
                and b.type = nvl(f_type, b.type) 
                and b.avu between nvl(f_lowavu, 0) and nvl(f_highavu, 1000)
                and br.country = nvl(f_country, br.country) 
                ;
        end beerfilter;
/





create or replace procedure memberfilter(
        f_m_no in member.m_no%type, 
        f_id in member.id%type, 
        f_username in member.name%type, 
        f_birthlow in member.m_no%type, 
        f_birthhigh in member.m_no%type, 
        f_joinlow in member.m_no%type, 
        f_joinhigh in member.m_no%type, 
        f_addr in member.addr%type,
        f_job in member.job%type,
        f_gname in viewgrade.gname%type, 
        res_cursor out sys_refcursor)
is
        begin
                open res_cursor for
                select distinct m.name from member m, viewgrade g 
                where m.m_no = g.m_no
                and m.m_no like nvl(f_m_no, m.m_no) 
                and m.id = nvl(f_id, m.id) 
                and m.name like nvl(f_username, m.name) 
                and m.birth between to_date(nvl(f_birthlow, '1900-01-01'), 'yy-mm-dd') 
                        and to_date(nvl(f_birthhigh, '2099-12-31'), 'yy-mm-dd')
                and to_date(substr(m.m_no, 2, 6), 'yy-mm-dd') between to_date(nvl(f_joinlow, '1900-01-01'), 'yy-mm-dd') 
                        and to_date(nvl(f_joinhigh, '2099-12-31'), 'yy-mm-dd')
                and m.addr like nvl(f_addr, m.addr)
                and m.job = nvl(f_job, m.job)
                and g.gname = nvl(f_gname, g.gname) 
                ;
        end memberfilter;
/

