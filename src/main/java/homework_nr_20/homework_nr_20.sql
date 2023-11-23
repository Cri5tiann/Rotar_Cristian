
create table departments (
	department_id INT primary key,
	department_name VARCHAR(50)
);

create table employees (
	employee_id INT primary key,
	employee_name VARCHAR(50),
	department_id INT,
	FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

CREATE TABLE projects (
    project_id INT PRIMARY KEY,
    project_name VARCHAR(50)
);

CREATE TABLE employee_projects (
    employee_id INT,
    project_id INT,
    FOREIGN KEY (employee_id) REFERENCES employees(employee_id),
    FOREIGN KEY (project_id) REFERENCES projects(project_id)
);

drop table departments, employees, projects, employee_projects;

insert into departments
(department_id, department_name) values
(1, 'software developing'),
(2, 'hardware developing'),
(3, 'human resources'),
(4, 'accounting');

insert into employees
(employee_id, employee_name, department_id) values
(1, 'Vasile', 2),
(2, 'Andreea', 3),
(3, 'Mihai', 2),
(4, 'George', 1),
(5, 'Octavian', 4),
(6, 'Ion', 2),
(7, 'Mihaela', 3),
(8, 'Ramona', 1),
(9, 'Cristian', 1);

insert into projects
(project_id, project_name) values
(1, 'AIAssistant'),
(2, 'IntegrationAssistant'),
(3, 'NewHelmet'),
(4, 'BrowserDetection');

insert into employee_projects
(employee_id, project_id) values
(1, 2),
(2, 4),
(3, 1),
(3, 2),
(5, 3),
(7, 1),
(7, 4),
(8, 1);

--a. Получите список всех сотрудников и соответствующих названий их департаментов.
select *
from employees e
	inner join departments d on e.department_id = d.department_id

--b. Получите имена сотрудников, которые не прикреплены к какому-либо департаменту.
update employees e
set department_id = null
where employee_name in ('Mihai', 'Ion');

select *
from employees e
where department_id is null;

--c. Отобразите названия проектов вместе с именами сотрудников, работающих над каждым проектом.
select project_name, employee_name
from employees e
	inner join employee_projects ep on e.employee_id = ep.project_id
	inner join projects p on ep.project_id = p.project_id;

--d. Найдите имена сотрудников и их департаментов, включая тех, кто не прикреплен к какому-либо департаменту.
select employee_name, department_name
from employees e
	left join departments d on e.department_id = d.department_id;

--e. Выведите названия департаментов и общее количество сотрудников в каждом департаменте.
select count(employee_id), department_name
from employees e
	inner join departments d on e.department_id = d.department_id
group by department_name;