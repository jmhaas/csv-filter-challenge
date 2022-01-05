# csv-filter-challenge-public
# Instructions
1. Click "Use this template" to create a copy of this repository in your personal github account.  
1. Using technology of your choice, complete assignment listed below.
1. Update the README in your new repo with:
    * a `How-To` section containing any instructions needed to execute your program.
    * an `Assumptions` section containing documentation on any assumptions made while interpreting the requirements.
1. Send an email to Scoir (andrew@scoir.com) with a link to your newly created repo containing the completed exercise.

## Expectations
1. This exercise is meant to drive a conversation. 
1. Please invest only enough time needed to demonstrate your approach to problem solving, code design, etc.
1. Within reason, treat your solution as if it would become a production system.

## Assignment
Create a command line application that parses a CSV file and filters the data per user input.

The CSV will contain three fields: `first_name`, `last_name`, and `dob`. The `dob` field will be a date in YYYYMMDD format.

The user should be prompted to filter by `first_name`, `last_name`, or birth year. The application should then accept a name or year and return all records that match the value for the provided filter. 

Example input:
```
first_name,last_name,dob
Bobby,Tables,19700101
Ken,Thompson,19430204
Rob,Pike,19560101
Robert,Griesemer,19640609
```


# How-To - 
The CSV filter runs like any other Java project, either utilizing the java run command "java -jar csv_filter-0.0.1-SNAPSHOT.jar" or through an IDE as a regular compiled project.

Once it is running...
1. There will be a prompt for a file path to the CSV file locally, input that literal path
2. A prompt for a specific header search will show, search the three given headers for the filtered data
3. After this, you have the option for searching for a name or date of birth match. If yes, input a name or DOB...if not, just type no
4. Then the application will prompt you for another scan, if yes: input another file literal path and the process will start again, if no: the application will close, if else: the application will close with a 404 error

# Assumptions
1. The CSV file will have a fixed column length of 3...first_name, last_name, DOB
2. The CSV file row length does not matter
3. The CSV file will follow the same format as the above 'Example Input:'
4. The name filter will pick up anything with a similar name, i.e. search "Michael Jordan"...data will return both "Michael, Jordan" and "Michael, Jackson" because the first_name is the same
5. The user is going to follow the instructions...there is error handling but not crazy levels, tried to create a simple console-based application that was easy to use and "just work"
6. I tried to limit my time to just solving the problem, normally there would be unit tests, exception handling, logging, etc.




