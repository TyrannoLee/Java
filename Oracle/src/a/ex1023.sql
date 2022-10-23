/*2022-10-23 (일) */

/*1. EMP테이블에서 급여가 2500 이상인 사원 정보를
 * 사원번호, 이름, 급여를 출력하는 SELECT 문장 */
select empno, ename, sal from emp where sal >= 2500;


/*2. EMP테이블에서 사원번호가 7782인 사원의 이름을 출력하시오.*/
select ename from emp where empno = 7783;


/*3. emp테이블에서 부서번호가 10, 30인 사원의 모든 정보룰 출력하시오. (이름순 정렬)*/
select * from emp where deptno in (10,20) order by ename;

/*4. emp 테이블에서 급여가 2500이상 & 부서 번호가 10, 20인 사원의 이름과 급여를 출력하는 select 문장을 작성하시오.
 * heading 바꾸는 법: select 부분에서 "바꿀명" 으로 설정*/
select ename "Employee", sal "Monthly Sal" from emp where sal >=2500 and deptno = 10 or deptno = 20; 

/*5. emp테이블에서 1985년에 입사한 사원의 모든 정보를 출력하시오.*/
select * from emp where hiredate between '1985-01-01' and '1985-12-31';

/*6.emp테이블에서 수당이 있는 사원의 모든 정보를 출력하시오.*/
select * from emp where comm is not null;

/*☆☆☆7. emp테이블에서 수당이 급여보다 10% 많은 직원에 대하여 이름, 급여, 수당을 출력하시오.*/
select ename, sal, comm from emp where comm > nvl(sal*1.1, 0);

/*8. emp테이블에서 직업이 clerk이거나 analyst이고 급여가 1000,2000,3000이 아닌 모든 정보의 사원을 출력하시오.*/
select * from emp where job in ('CLERK','ANALYST') 
and sal not in(1000,2000,3000);

/*9. emp테이블에서 이름에 L가 두 자 있고 부서번호가 30이거나 또는 관리가자 7782인 사원의 모든 정보를 출력하시오.*/
select * from emp where ename like '%L%L%' and deptno = 30 or mgr = 7782;

/*10. 현재 날짜를 출력하시오.*/
select sysdate as now from dual;

/*11. emp테이블에서 현재 급여에 10%가 증가된 사원의 사원번호, 이름, 직업, 급여, 증가된 급여, 증가액을 출력하시오.*/
select empno, ename, job, sal*1.10 as "new sal", sal*0.10 as "increase" from emp;


/*12. emp테이블에서 이름, 입사일, 입사일로부터 3개월 후 돌아오는 월요일을 구하는 select문을 기술하시오.
 * add_months(hiredate,3) 입사일 + 3개월
 * next_day(add_months(hiredate,3),'월요일') 월요일 구하기
 * to_char(next_day(add_months(hiredate,3),'월요일'),'YYYY-MM-DD'  데이터타입 변환
 * */

select ename, to_char(hiredate,'YYYY-MM-DD') as hiredate,
to_char(next_day(add_months(hiredate,3),'월요일'),'YYYY-MM-DD') as "3개월후 월요일" 
from emp;

/*13. emp테이블에서 이름, 입사일, 입사일로부터 현재까지의 월수, 급여, 입사일부터 현재까지의 급여의 총계를 출력하시오.
 * months_between(sysdate,hiredate) 현재 - 입사일 (월수)
 *(months_between(sysdate,hiredate)*sal)월수 * 급여 = ☆☆☆현재까지의 급여 총계 
 * */
select ename, hiredate,
round(months_between(sysdate,hiredate)) as "months",
sal,
round(months_between(sysdate,hiredate)*sal) as "m*sal"
from emp;

/* 14. KINGhi $5,000.00hey $15,000.00
 * || 두 문자열 연결*/
select ename|| 'hi' || to_char(sal, '$9,999.00') || 'hey' || to_char(sal*3,'$99,999.00') as "connect" from emp;

/*15. emp테이블에서 이름의 길이가 6자 이상인 사원의 이름, 이름의 글자수를 출력하시오.*/
select ename, length(ename) as "이름 글자수" from emp where length(ename) >=6;

/*☆☆☆16. emp 테이블에서 모든 사원의 이름, 급여, 수당, 급여+수당을 출력하시오.*/
select ename, sal, comm, nvl(comm,0)+sal as "급여+수당" from emp;

/*17.emp테이블에서 인원수, 최대 급여, 최소 급여, 급여의 합을 계산하여 출력하시오.*/
select count(*), max(sal), min(sal), sum(sal) from emp;

/*18. emp테이블에서 각 직업별 최대 급여, 최소 급여, 급여의 합을 출력*/
select job, max(sal), min(sal), sum(sal) from emp group by job;

/*☆☆☆19. emp테이블에서 입사연도별 인원수, 최대급여, 최소급여, 평균급여, 급여의 총계를 출력하시오.*/
select to_char(hiredate,'YY') as "입사연도",
count(*), max(sal), min(sal), avg(sal), sum(sal) from emp group by to_char(hiredate,'YY');

/*20. case - when - then - end */
select job, 
sum(case deptno when 10 then sal end) as "deptno10",
sum(case deptno when 20 then sal end) as "deptno20",
sum(case deptno when 30 then sal end) as "deptno30",
sum(sal) as "total"
from emp
group by job;
