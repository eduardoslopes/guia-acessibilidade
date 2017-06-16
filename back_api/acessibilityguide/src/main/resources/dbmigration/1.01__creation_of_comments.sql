-- apply changes
create table comment (
  id                            bigserial not null,
  content                       varchar(255),
  marker_id                     bigint not null,
  user_id                       bigint not null,
  constraint pk_comment primary key (id)
);

alter table comment add constraint fk_comment_marker_id foreign key (marker_id) references marker (id) on delete restrict on update restrict;
create index ix_comment_marker_id on comment (marker_id);

alter table comment add constraint fk_comment_user_id foreign key (user_id) references guide_user (id) on delete restrict on update restrict;
create index ix_comment_user_id on comment (user_id);

