/*
*dev
*/
CREATE USER userdev IDENTIFIED BY 'userdev@password';
GRANT ALL PRIVILEGES ON devdb.* To 'userdev';
CREATE DATABASE devdb;

/*
*uat
*/
CREATE USER useruat IDENTIFIED BY 'useruat@password';
GRANT ALL PRIVILEGES ON uatdb.* To 'useruat';
CREATE DATABASE uatdb;

/*
*preprod
*/
CREATE USER userpreprod IDENTIFIED BY 'userpreprod@password';
GRANT ALL PRIVILEGES ON preproddb.* To 'userpreprod';
CREATE DATABASE preproddb;

/*
*prod
*/
CREATE USER userprod IDENTIFIED BY 'userprod@password';
GRANT ALL PRIVILEGES ON proddb.* To 'userprod';
CREATE DATABASE proddb;

/**
Table creation and rows insertion devdb
*/

USE devdb;

CREATE TABLE IF NOT EXISTS tasks (
    task_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    start_date DATE,
    due_date DATE,
    status TINYINT NOT NULL,
    priority TINYINT NOT NULL,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)  ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS checklists (
    todo_id INT AUTO_INCREMENT,
    task_id INT,
    todo VARCHAR(255) NOT NULL,
    is_completed BOOLEAN NOT NULL DEFAULT FALSE,
    PRIMARY KEY (todo_id , task_id),
    FOREIGN KEY (task_id)
        REFERENCES tasks (task_id)
        ON UPDATE RESTRICT ON DELETE CASCADE
);


INSERT INTO tasks(title,start_date,due_date,status,priority,description)
VALUES
('Task-1',CURRENT_DATE(),CURRENT_DATE(),0,3,'task one run now'),
('Task-2',CURRENT_DATE(),CURRENT_DATE(),0,3,'task two run now'),
('Task-3',CURRENT_DATE(),CURRENT_DATE(),1,2,'task three run now'),
('Task-4',CURRENT_DATE(),CURRENT_DATE(),0,5,'task four run now'),
('Task-5',CURRENT_DATE(),CURRENT_DATE(),1,2,'task five run now'),
('Task-6',CURRENT_DATE(),CURRENT_DATE(),0,1,'task six run now'),
('Task-7',CURRENT_DATE(),CURRENT_DATE(),0,4,'task seven run now'),
('Task-8',CURRENT_DATE(),CURRENT_DATE(),1,2,'task eight run now');
INSERT INTO 
  checklists(task_id, todo, is_completed)
VALUES
  (1,'todo description-1',true),
  (2,'todo description-2',false),
  (3,'todo description-3',true),
  (4,'todo description-4',false),
  (5,'todo description-5',true),
  (6,'todo description-6',true);

/**
Table creation and rows insertion uatdb
*/

USE uatdb;

CREATE TABLE IF NOT EXISTS tasks (
    task_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    start_date DATE,
    due_date DATE,
    status TINYINT NOT NULL,
    priority TINYINT NOT NULL,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)  ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS checklists (
    todo_id INT AUTO_INCREMENT,
    task_id INT,
    todo VARCHAR(255) NOT NULL,
    is_completed BOOLEAN NOT NULL DEFAULT FALSE,
    PRIMARY KEY (todo_id , task_id),
    FOREIGN KEY (task_id)
        REFERENCES tasks (task_id)
        ON UPDATE RESTRICT ON DELETE CASCADE
);

INSERT INTO tasks(title,start_date,due_date,status,priority,description)
VALUES
('Task-1',CURRENT_DATE(),CURRENT_DATE(),0,3,'task one run now'),
('Task-2',CURRENT_DATE(),CURRENT_DATE(),0,3,'task two run now'),
('Task-3',CURRENT_DATE(),CURRENT_DATE(),1,2,'task three run now'),
('Task-4',CURRENT_DATE(),CURRENT_DATE(),0,5,'task four run now'),
('Task-5',CURRENT_DATE(),CURRENT_DATE(),1,2,'task five run now'),
('Task-6',CURRENT_DATE(),CURRENT_DATE(),0,1,'task six run now'),
('Task-7',CURRENT_DATE(),CURRENT_DATE(),0,4,'task seven run now'),
('Task-8',CURRENT_DATE(),CURRENT_DATE(),1,2,'task eight run now');
INSERT INTO 
  checklists(task_id, todo, is_completed)
VALUES
  (1,'todo description-1',true),
  (2,'todo description-2',false),
  (3,'todo description-3',true),
  (4,'todo description-4',false),
  (5,'todo description-5',true),
  (6,'todo description-6',true);

/**
Table creation and rows insertion preprod
*/

USE preproddb;

CREATE TABLE IF NOT EXISTS tasks (
    task_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    start_date DATE,
    due_date DATE,
    status TINYINT NOT NULL,
    priority TINYINT NOT NULL,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)  ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS checklists (
    todo_id INT AUTO_INCREMENT,
    task_id INT,
    todo VARCHAR(255) NOT NULL,
    is_completed BOOLEAN NOT NULL DEFAULT FALSE,
    PRIMARY KEY (todo_id , task_id),
    FOREIGN KEY (task_id)
        REFERENCES tasks (task_id)
        ON UPDATE RESTRICT ON DELETE CASCADE
);

INSERT INTO tasks(title,start_date,due_date,status,priority,description)
VALUES
('Task-1',CURRENT_DATE(),CURRENT_DATE(),0,3,'task one run now'),
('Task-2',CURRENT_DATE(),CURRENT_DATE(),0,3,'task two run now'),
('Task-3',CURRENT_DATE(),CURRENT_DATE(),1,2,'task three run now'),
('Task-4',CURRENT_DATE(),CURRENT_DATE(),0,5,'task four run now'),
('Task-5',CURRENT_DATE(),CURRENT_DATE(),1,2,'task five run now'),
('Task-6',CURRENT_DATE(),CURRENT_DATE(),0,1,'task six run now'),
('Task-7',CURRENT_DATE(),CURRENT_DATE(),0,4,'task seven run now'),
('Task-8',CURRENT_DATE(),CURRENT_DATE(),1,2,'task eight run now');
INSERT INTO 
  checklists(task_id, todo, is_completed)
VALUES
  (1,'todo description-1',true),
  (2,'todo description-2',false),
  (3,'todo description-3',true),
  (4,'todo description-4',false),
  (5,'todo description-5',true),
  (6,'todo description-6',true);


/**
Table creation and rows insertion proddb
*/

USE proddb;

CREATE TABLE IF NOT EXISTS tasks (
    task_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    start_date DATE,
    due_date DATE,
    status TINYINT NOT NULL,
    priority TINYINT NOT NULL,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)  ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS checklists (
    todo_id INT AUTO_INCREMENT,
    task_id INT,
    todo VARCHAR(255) NOT NULL,
    is_completed BOOLEAN NOT NULL DEFAULT FALSE,
    PRIMARY KEY (todo_id , task_id),
    FOREIGN KEY (task_id)
        REFERENCES tasks (task_id)
        ON UPDATE RESTRICT ON DELETE CASCADE
);

INSERT INTO tasks(title,start_date,due_date,status,priority,description)
VALUES
('Task-1',CURRENT_DATE(),CURRENT_DATE(),0,3,'task one run now'),
('Task-2',CURRENT_DATE(),CURRENT_DATE(),0,3,'task two run now'),
('Task-3',CURRENT_DATE(),CURRENT_DATE(),1,2,'task three run now'),
('Task-4',CURRENT_DATE(),CURRENT_DATE(),0,5,'task four run now'),
('Task-5',CURRENT_DATE(),CURRENT_DATE(),1,2,'task five run now'),
('Task-6',CURRENT_DATE(),CURRENT_DATE(),0,1,'task six run now'),
('Task-7',CURRENT_DATE(),CURRENT_DATE(),0,4,'task seven run now'),
('Task-8',CURRENT_DATE(),CURRENT_DATE(),1,2,'task eight run now');
INSERT INTO 
  checklists(task_id, todo, is_completed)
VALUES
  (1,'todo description-1',true),
  (2,'todo description-2',false),
  (3,'todo description-3',true),
  (4,'todo description-4',false),
  (5,'todo description-5',true),
  (6,'todo description-6',true);