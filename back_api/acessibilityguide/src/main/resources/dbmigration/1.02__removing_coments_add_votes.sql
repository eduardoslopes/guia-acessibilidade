-- apply changes
alter table marker add column complete_address varchar(255);

create table marker_vote (
  id                            bigserial not null,
  user_id                       bigint not null,
  marker_id                     bigint not null,
  constraint pk_marker_vote primary key (id)
);

alter table marker_vote add constraint fk_marker_vote_user_id foreign key (user_id) references guide_user (id) on delete restrict on update restrict;
create index ix_marker_vote_user_id on marker_vote (user_id);

alter table marker_vote add constraint fk_marker_vote_marker_id foreign key (marker_id) references marker (id) on delete restrict on update restrict;
create index ix_marker_vote_marker_id on marker_vote (marker_id);

