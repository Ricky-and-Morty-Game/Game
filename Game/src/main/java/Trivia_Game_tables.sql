
        -- Use this to create the table for use in this demo

        CREATE TABLE trivia_game.Questions (
                question_id INT AUTO_INCREMENT PRIMARY KEY,
                question_text TEXT NOT NULL );

        CREATE TABLE trivia_game.Answers (
            answer_id INT AUTO_INCREMENT PRIMARY KEY,
            question_id INT,
            answer_text TEXT NOT NULL,
            is_correct BOOLEAN NOT NULL,
            FOREIGN KEY (question_id) REFERENCES Questions(question_id));

        CREATE TABLE trivia_game.Users (
            user_id INT AUTO_INCREMENT PRIMARY KEY,
            username VARCHAR(50) NOT NULL,
            email VARCHAR(50) NOT NULL,
            password VARCHAR(50) NOT NULL );


        CREATE TABLE trivia_game.ScoreBoard (
            id INT AUTO_INCREMENT PRIMARY KEY,
            userName VARCHAR(255) NOT NULL,
            score INT NOT NULL,
            timestamp timestamp);
