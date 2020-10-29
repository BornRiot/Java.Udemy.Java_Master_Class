-- This file corresponds with the lecture video of same title
insert into contacts values ("Avril", "+61 (0)87654321", "avril@email.com.au");
  -- Be sure to check the data types being entered in the tables.
  -- SQLite does not have a mechanism that checks data types like other
  -- databases
  -- SQLite command to backup databases: .backup testbackup
  -- To Update the email column in the table:
  update contacts set email= "steve@hisemail.com";
  -- This will result in updating every email in the database if a row is not specified
  .restore testbackup -- restore the database
  select * from  contacts;

  -- To properly update only Steve's email:
  update contacts set email= "steve@hisemail.com" where name = "Steve";

  -- Use the where clause to select the row where name = 'Brian':
  select * from contacts where name = 'Brian';

  -- Se;ect the phone, email of Brian:
  select phone, email from contacts where name = 'Brian';

  -- Delete Brian's record from the database:
  Delete from contacts where phone = '1234';

  -- A few SQLite commands that may be usefull:
  .schema --shows the schema for the current table
  .dump -- gives all the statments and inserts to Populate the table. Also known as a transaction
