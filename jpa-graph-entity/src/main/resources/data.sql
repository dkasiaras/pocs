insert into employee(id, name, email, profession, seniority)
values ('1', 'Dimitris', 'kasiarakos@gmail.com','engineer', 'senior');

insert into city(id, name)
values ('1', 'kastoria');

insert into address(address_id, street_name, street_number, employee_id, city_id , address_type)
values ('1', 'nosokomeiou', '18', '1', '1', 'physical');

insert into laptop (employee_id, brand)
values ('1', 'macbook');

insert into coordinates (address_id, latitude, longitude) values ('1', '12.12', '11.11');