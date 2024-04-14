## Spring Boot Basics Practice Task: Job Listings CRUD Application

### Objective:
To implement a simple CRUD application using Spring Boot framework for managing job listings.

### Task Description:
You are required to create a basic Spring Boot application with RESTful endpoints for managing job listings. The application should allow users to perform CRUD operations on job listings.

### Requirements:
1. Implement a `Job` model class with the following attributes:
   - `id` (integer): Unique identifier for the job listing.
   - `title` (string): Title of the job listing.
   - `description` (string): Description of the job listing.
   - `location` (string): Location of the job.
   - `company` (string): Company offering the job.
   - You may add additional fields if necessary.

2. Create a `JobController` class to handle HTTP requests related to job listings. Implement the following RESTful endpoints:
   - `GET /jobs`: Get a list of all job listings.
   - `GET /jobs/{id}`: Get details of a specific job listing by its ID.
   - `POST /jobs`: Create a new job listing.
   - `PUT /jobs/{id}`: Update an existing job listing.
   - `DELETE /jobs/{id}`: Delete a job listing by its ID.

3. Configure the application to use an in-memory H2 database for storing job listings.

4. Use appropriate HTTP status codes and error handling mechanisms.

### Instructions:
1. Set up a new Spring Boot project using your preferred IDE or build tool (e.g., Maven, Gradle).
2. Define the `Job` model class with appropriate attributes.
3. Implement the `JobController` class with the required endpoints for CRUD operations.
4. Configure the application to use an in-memory H2 database.
5. Test the API endpoints using tools like Postman or curl.
6. Ensure validation for required fields and handle edge cases such as invalid requests or missing resources.

### Additional Notes:
- You may use any dependencies or libraries commonly used with Spring Boot for this task.
- Focus on understanding the basic concepts of Spring Boot, such as model creation, controller implementation, and database configuration.
- Feel free to refer to official Spring Boot documentation or online tutorials for guidance.

### Submission:
- Once completed, share your project code or repository link with your instructor for review.
