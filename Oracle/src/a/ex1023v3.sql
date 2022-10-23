/*2022-10-23*/

/*1. 같은 직책(job)에 종사하는 사원이 4명 이상인 직책과 인원수를 출력하시오.
 * GROUP BY -> HAVING*/
select job, count(*) 인원수 from emp group by job having count(*) >=4;

/*2. 수당 받는 사람 안 받는 사람 구분, 인원수 출력.
 * NVL2*/
select nvl2(to_char(comm),'O','X') 수당 , count(*) 인원수 from emp group by nvl2(to_char(comm),'O','X');

/*3. SAL이 2500이상인 사원들의 부서 정보, 사원 정보를 출력하시오.
 *1) emp 테이블과 detp 테이블 사용 ==> deptno 중복 */
select e.deptno, dname, empno, ename, sal from emp e, dept d
where e.deptno = d.deptno
and sal >= 2500;

/*2) sql 99 이후
 * NATURAL JOIN==> 두테이블 간에 동일한 컬럼을 갖는 데이터가 모두 조회된다. 
 * */
select deptno, dname, empno, ename, sal
from emp natural join dept
where sal >= 2500;