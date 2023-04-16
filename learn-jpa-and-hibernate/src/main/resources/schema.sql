-- long type in java maps to bigint in sql

create table course 
(
    id bigint not null,
    name varchar(255) not null,
    author varchar(255) not null,
    primary key (id)
);