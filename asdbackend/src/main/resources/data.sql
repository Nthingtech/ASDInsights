INSERT INTO TB_USERS (first_name, last_name, email, user_profile, password) VALUES ('Fernando','Lopes', 'fe@gmail.com', 'Teacher', '123');
INSERT INTO TB_USERS (first_name, last_name, email, user_profile, password) VALUES ('Gustavo','Ribeiro', 'guri@gmail.com', 'Healthcare Professionals', '456');


INSERT INTO TB_ROLES (authority) VALUES ('ROLE_TEACHER');
INSERT INTO TB_ROLES (authority) VALUES ('ROLE_HEALTHCARE');

INSERT INTO TB_USERS_ROLES (user_id, role_id) VALUES (1, 1);
INSERT INTO TB_USERS_ROLES (user_id, role_id) VALUES (2, 2);


