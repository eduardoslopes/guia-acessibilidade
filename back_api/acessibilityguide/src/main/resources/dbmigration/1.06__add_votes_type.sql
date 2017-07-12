-- apply changes
alter table marker_vote add column vote_type varchar(4) check ( vote_type in ('DOWN','UP'));

