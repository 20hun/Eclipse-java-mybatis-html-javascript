create table student1 (
    id      number(38,0) primary key
    ,name   varchar2(20)    not null
    ,kor    number(3,0) default 0
    ,eng    number(3,0) default 0
    ,mat    number(3,0) default 0
    ,indate date        default sysdate
    ,gps_x  number(9,6) default 38.000000
    );

--id�� ����� ������
create  sequence student1_seq;

--�Է� ��
insert into student1(
	id
	,name
	,kor
	,eng
	,mat
	,gps_x
	) values (
	student_seq.nextval
	,'ȫ�浿'
	,100
	,90
	,80
	,38.002312
);

commit;