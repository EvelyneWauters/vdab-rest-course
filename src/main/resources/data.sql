insert into car_model(name, engine_type, pk) values ('M', 'FUEL','118');
insert into car_model(name, engine_type, pk) values ('Spider', 'FUEL','300');
insert into car_model(name, engine_type, pk) values ('Infinity', 'ELECTRIC','200');
insert into car_model(name, engine_type, pk) values ('1-reeks', 'DIESEL','116');
insert into car_model(name, engine_type, pk) values ('Flow', 'ELECTRIC','320');

insert into my_address (city, post_code ) values('Dendermonde', '9200');
insert into my_address (city, post_code ) values('Leuven','3000');
insert into my_address (city, post_code ) values('Antwerpen', '2000');
insert into my_address (city, post_code ) values('Brussel', '100');
insert into my_address (city, post_code ) values('Gent', '9000');
insert into my_address (city, post_code ) values('Heverlee', '3001');
insert into my_address (city, post_code ) values('Kessel-Lo', '3100');
insert into my_address (city, post_code ) values('Zaventem', '1970');


insert into car_owner (first_name, last_name, my_address_id) values ('Evelyne', 'Wauters', 3);
insert into car_owner (first_name, last_name, my_address_id) values ('Ingrid', 'Apers', 2);
insert into car_owner (first_name, last_name, my_address_id) values ('Luke', 'Skywalker', 4);
insert into car_owner (first_name, last_name, my_address_id) values ('Doctor', 'Who', 5);
insert into car_owner (first_name, last_name, my_address_id) values ('Jen', 'Barber', 5);


insert into car_make (name, address_id, model_id) values ('BMW',1,2);
insert into car_make (name, address_id, model_id) values ('Audi',2,3);
insert into car_make (name, address_id, model_id) values ('Maserati',3,5);
insert into car_make (name, address_id, model_id) values ('Tesla',4,4);
insert into car_make (name, address_id, model_id) values ('Aston Martin',5,1);


insert into car (color, licence_plate, make_id, owner_id) values('black', '1-TMC-035', 2, 1);
insert into car (color, licence_plate, make_id, owner_id) values('silver', 'CHWBCA', 3, 2);
insert into car (color, licence_plate, make_id, owner_id) values('midnight blue', '1-AZE-645', 2, 3);
insert into car (color, licence_plate, make_id, owner_id) values('satin', '1-WDF-024', 2, 4);
insert into car (color, licence_plate, make_id, owner_id) values('white', '1-GSD-645', 2, 5);
