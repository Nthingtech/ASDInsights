INSERT INTO TB_USERS (first_name, last_name, email, user_profile, password) VALUES ('Fernando','Lopes', 'fe@gmail.com', 'Teacher', '123');
INSERT INTO TB_USERS (first_name, last_name, email, user_profile, password) VALUES ('Gustavo','Ribeiro', 'guri@gmail.com', 'Healthcare Professionals', '456');


INSERT INTO TB_ROLES (authority) VALUES ('ROLE_TEACHER');
INSERT INTO TB_ROLES (authority) VALUES ('ROLE_HEALTHCARE');

INSERT INTO TB_USERS_ROLES (user_id, role_id) VALUES (1, 1);
INSERT INTO TB_USERS_ROLES (user_id, role_id) VALUES (2, 2);

INSERT INTO TB_CHILDS (first_name, last_name) VALUES ('Alessandro', 'Lisboa');
INSERT INTO TB_CHILDS (first_name, last_name) VALUES ('Otavio', 'Andrade');

INSERT INTO TB_REPORTS (date_post, day_rating, social_interaction, anxiety, pleasant, impatience, aggressiveness, friendliness, communication, concentration, author_id, child_id) VALUES ('2020-12-12T13:00:00Z', 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2);
INSERT INTO TB_REPORTS (date_post, day_rating, social_interaction, anxiety, pleasant, impatience, aggressiveness, friendliness, communication, concentration, author_id, child_id) VALUES ('2020-12-12T13:00:00Z', 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 1);
