# SpotifyData
<space> Lab #2 for the CISC 3130 Course section TY-9.\
csvSpotify.java reads from the spotify viral week csv file and stores the artist names and creates a new text file with the artists names.\
I created an array and put together a small project that uses the BufferedReader to read from the csv file.\
I created the text file by using File class.\
Using the PrintStream I was able to save the data in the text file.  

## Installation & Setup
- Download the csvSpotify.java
- Download the csv file viral-global-daily-latest.csv
- Once you download the csv file, save it on your desktop and save the file location.
- Delete previous file location and paste the new file location in line 20 of the csvSpotify.java code
- Example if file location is C:\Users\Files\viral-global-daily-latest.csv then paste the file in between the " ".
- Run the code and the program will create a new text file showing the top 50 artists of that given week.

## Task list
- [x] Download a csv file from SpotifyCharts or anywhere. For this assignment you may choose to download any date or country from Spotify Charts of interest
- [x] Write the source code to produce the report. Include comments.
- [x] Documentation for the project explaining the problem and how you implemented it.
- [x] Produce the report in a file. Artists-WeekOfMMDDYYYY.txt or similar.
- [x] Include all of above files in a repo. Use your best judgement on organization.
- [x] Submit to the form.

## Dependencies
- Java 8 

## Folder Structure
- Code is saved into the src folder.
- Data is saved into the data folder.

## Updates
- Updated the program by creating list of artist name.
- Added collection sorts for ascending order of artist's names from A to Z
- Added trim method to trim white spaces in artists names.
