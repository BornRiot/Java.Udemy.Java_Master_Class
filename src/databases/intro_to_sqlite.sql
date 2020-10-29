.open test.db
-- Show the columns names on database tables:
.headers on
-- Create a contacts table
create table contacts (name text, phone integer, email text);
-- Populate contacts table with info
insert into contacts(name, phone, email) values("Tim", 654678, 'tim@email.com');
-- Get info from contacts table:
SELECT * FROM contacts;
-- Insert another contact in the contacts table:
Insert into contacts values("Brian", 1234, 'brian@myemail.com');
-- Insert a contact with only 2 columns:
insert into contacts (name, phone) values ('Steve', 8754);
