-- apply changes
create table acessibility_type (
  id                            bigserial not null,
  name                          varchar(255),
  another                       boolean,
  constraint pk_acessibility_type primary key (id)
);

create table acessibility_type_marker (
  acessibility_type_id          bigint not null,
  marker_id                     bigint not null,
  constraint pk_acessibility_type_marker primary key (acessibility_type_id,marker_id)
);

create table guide_user (
  id                            bigserial not null,
  name                          varchar(255),
  cpf                           varchar(255) not null,
  username                      varchar(255) not null,
  password                      varchar(255) not null,
  constraint uq_guide_user_cpf unique (cpf),
  constraint uq_guide_user_username unique (username),
  constraint pk_guide_user primary key (id)
);

create table marker (
  id                            bigserial not null,
  name                          varchar(255),
  description                   varchar(255),
  latitude                      float,
  longitude                     float,
  marker_type_id                bigint not null,
  user_id                       bigint not null,
  constraint pk_marker primary key (id)
);

create table marker_type (
  id                            bigserial not null,
  name                          varchar(255),
  constraint pk_marker_type primary key (id)
);

alter table acessibility_type_marker add constraint fk_acessibility_type_marker_acessibility_type foreign key (acessibility_type_id) references acessibility_type (id) on delete restrict on update restrict;
create index ix_acessibility_type_marker_acessibility_type on acessibility_type_marker (acessibility_type_id);

alter table acessibility_type_marker add constraint fk_acessibility_type_marker_marker foreign key (marker_id) references marker (id) on delete restrict on update restrict;
create index ix_acessibility_type_marker_marker on acessibility_type_marker (marker_id);

alter table marker add constraint fk_marker_marker_type_id foreign key (marker_type_id) references marker_type (id) on delete restrict on update restrict;
create index ix_marker_marker_type_id on marker (marker_type_id);

alter table marker add constraint fk_marker_user_id foreign key (user_id) references guide_user (id) on delete restrict on update restrict;
create index ix_marker_user_id on marker (user_id);

