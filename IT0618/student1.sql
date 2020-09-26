create table student1 (
    id      number(38,0) primary key
    ,name   varchar2(20)    not null
    ,kor    number(3,0) default 0
    ,eng    number(3,0) default 0
    ,mat    number(3,0) default 0
    ,indate date        default sysdate
    ,gps_x  number(9,6) default 38.000000
    );

--id에 사용할 시퀀스
create  sequence student1_seq;

--입력 예
insert into student1(
	id
	,name
	,kor
	,eng
	,mat
	,gps_x
	) values (
	student_seq.nextval
	,'홍길동'
	,100
	,90
	,80
	,38.002312
);

commit;