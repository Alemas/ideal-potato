drop table app.products;

create table app.products (id int,
					Title varchar(255),
					Author varchar(255) not null,
					Material varchar(100) not null,
					Price decimal(5,2) not null,
					Release_Date date not null,
					primary key (id)
					);

insert into app.products values (0,
								'The Sister',
								'Louise Jensen',
								'Paperback',
								10.07,
								'2016-07-05');
								
insert into app.products values (1,
								'The Butterfly Garden (The Collector Trilogy)',
								'Dot Hutchison',
								'Paperback',
								15.95,
								'2016-06-01');
								
insert into app.products values (2,
								'The Girl in the Ice: A gripping serial killer thriller (Detective Erika Foster crime
thriller novel) (Volume 1)',
								'Robert Bryndza',
								'Paperback',
								12.99,
								'2016-02-17');
								
insert into app.products values (3,
								'The Silent Girls',
								'Eric Rickstad',
								'Paperback',
								11.99,
								'2015-01-27');
								
insert into app.products values (4,
								'A Criminal Defense',
								'Myers, Jr., William L.',
								'Paperback',
								10.00,
								'2017-04-01');
								
select * from app.products;