-- liquibase formatted sql

-- changeset rusiopavlovsky:dm_002
create sequence order_order_id_sequence start with 1 increment by 1;

create table order_order
(
    id          bigint not null,
    created_at  timestamp(3) with time zone,
    updated_at  timestamp(3) with time zone,
    order_id    uuid,
    customer_id uuid,
    operator_id uuid,
    primary key (id)
);

alter sequence order_order_id_sequence owned by order_order.id;

