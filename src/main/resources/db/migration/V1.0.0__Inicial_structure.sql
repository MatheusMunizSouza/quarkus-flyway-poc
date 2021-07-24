create table flyway.persons
(
    id   serial      not null
        constraint account_pk
            primary key,
    name varchar(25) not null
);

create unique index accounts_id_uindex
    on flyway.persons (id);
