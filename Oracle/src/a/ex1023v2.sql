/*2022-10-23*/

/*1 masking 
 * length() 길이를 구함
 * empno 세번쨰부터 *로 마스킹
 * ename 두번째부터 a로 마스킹
 * */
select empno,
rpad(substr(empno,1,2), length(empno), '*') as masking_empno,
ename, 
rpad(substr(ename,1,1), length(ename), 'a') as masking_ename
from emp 
where length(ename) >= 5 and length(ename) <6 ;

/*2.일급, 시급*
 * trunc 소수점 버림 (소수점 세번째 자리에서)
 * round 반올림 (소수점 두번쨰자리에서)*/
select empno, ename, sal, 
trunc(sal/21.5,2) as day_pay,
round(sal/21.5/8,1) as time_pay
from emp;

/*3. 입사일 기준 3개월이 지난 월요일에 정직원이 된다.
 * 정직원이 되는 날을 출력해보자. */
select empno, ename, hiredate,
to_char(hiredate,'yyyy/mm/dd'),  /*입사일*/
add_months(hiredate,3), /*3개월 더하기*/
next_day(add_months(hiredate,3),'월요일'), /*3개월 후 월요일*/
to_char(next_day(add_months(hiredate,3),'월요일'),'yyyy-mm-dd') as "정직원", /*깔끔하게 다듬기*/
nvl(to_char(comm),'N/A') as "수당" /*nvl로 comm이 없다면 n/a 처리, 숫자를 문자로 타입변환*/
from emp;

/*4. (1) case*/
select empno, ename, mgr, 
 case substr(mgr,1,2) /*mgr의 첫번째 숫자 두번째 숫자*/
 	when '75' then '5555'
 	when '76' then '6666'
	when '77' then '7777'
	when '78' then '8888'
	else nvl(to_char(mgr),'0000') /*직속상관이 없다면 0000*/
	end
	from emp;
	

	/*decode*/
select empno, ename, mgr, 
	substr(mgr,1,2),
	decode(substr(mgr,1,2), '75', '5555','76','6666','77','7777','78''8888',
	nvl(to_char(mgr),'0000')) 
	from emp;
