drop table product;

create table app.products ( id int,
					Title varchar(255),
					Author varchar(255) not null,
					Material varchar(100) not null,
					Price decimal(5,2) not null,
					Release_Date date not null,
					primary key (id)
					);
