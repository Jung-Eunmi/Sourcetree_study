use chundb;
select * from TB_DEPARTMENT; --  학과테이블
select * from TB_STUDENT; -- 학생테이블
select * from TB_PROFESSOR; -- 교수테이블
select * from TB_CLASS; -- 수업테이블
select * from TB_CLASS_PROFESSOR; -- 수업교수테이블
select * from TB_GRADE; -- 학점테이블

-- 1. 학생이름과 주소지를 표시하시오. 단, 출력 헤더는 "학생 이름", "주소지"로 하고, 정렬은 이름으로 오름차순 표시하도록 한다.
select
	STUDENT_NAME as '학생 이름',
	STUDENT_ADDRESS 주소지
from
	tb_student
order by
	STUDENT_NAME;

-- 2. 휴학중인 학생들의 이름과 주민번호를 나이가 적은 순서로 화면에 출력하시오.
SELECT 
    STUDENT_NAME, 
    STUDENT_SSN
FROM 
    tb_student
WHERE 
    ABSENCE_YN = 'Y'
ORDER BY 
    CASE 
        WHEN substring(STUDENT_SSN, 8, 1) IN ('3', '4') THEN concat('20', substring(STUDENT_SSN, 1, 6))  -- 2000년대 출생자
        WHEN substring(STUDENT_SSN, 8, 1) IN ('1', '2') THEN concat('19', substring(STUDENT_SSN, 1, 6))  -- 1900년대 출생자
    END desc;