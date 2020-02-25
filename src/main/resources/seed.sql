INSERT INTO `users` (`id`, `username`, `born_on`, `email`, `password`, `deleted`)
VALUES (1, 'xxx','2000-01-11','xxx@gmail.com','$2a$10$1Bf4OrvLptBsshqRICuNeOYkP25lOhBPqPyJs1WxKDMPgKC3AkGfa', 0);

INSERT INTO roles (id, name)
VALUES (1, "USER"),
       (2, "ADMIN");

INSERT INTO roles_users (roles_id, users_id)
VALUES (1, 1);
