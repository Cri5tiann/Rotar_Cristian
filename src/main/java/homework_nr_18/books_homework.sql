create database employee_db

create table Books(
	book_id serial primary KEY,
	name text not null,
	author text not null,
	date_of_publishing date not null,
	genre text not null,
	available_count int not null
);

select *
from books;

insert into books (name, author, date_of_publishing, genre, available_count)
values
('The Great Gatsby', 'F.Sco^ Fitzergald', '1925-01-01', 'Classics', 3),
('To kill a Mockingbird', 'Harpeer Lee', '1960-01-01', 'Ficnon', 5),
('1984','George Orwell', '1949-01-01', 'Science Ficnon', 2),
('Pride and Prejudice', 'Jane Austen', '1812-01-01', 'Romance', 4);
