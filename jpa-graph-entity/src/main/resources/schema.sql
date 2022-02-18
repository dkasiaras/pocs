CREATE TABLE employee
(
    name       varchar(100) NOT NULL,
    id         varchar(11)  NOT NULL,
    email      varchar(100) DEFAULT NULL,
    profession varchar(50),
    seniority  varchar(20),
    PRIMARY KEY (id)
);

CREATE TABLE address
(
    address_id    varchar(5),
    street_name   varchar(100) NOT NULL,
    street_number varchar(11)  NOT NULL,
    employee_id   varchar(11),
    city_id       varchar(5),
    address_type  varchar(12),
    PRIMARY KEY (address_id)
);

create table city
(
    id   varchar(5),
    name varchar(50),
    PRIMARY KEY (id)
);

create table laptop
(
    employee_id varchar(11),
    brand       varchar(25),
    primary key (employee_id)
);

create table pen
(
    employee_id varchar(11),
    color       varchar(25),
    primary key (employee_id)

);

create table coordinates
(
    address_id varchar(5),
    latitude   varchar(10),
    longitude  varchar(10),
    primary key (address_id)
);