## Steps to Run the Application

1. Clone the GitHub Repository
2. Change Directory to "Traini8" (cd)
3. Run "docker-compose up" command in the terminal (It may take a while if you do not have the MySQL image installed)
4. The App should be running now.

## Alternate Steps (Without Docker)

1. Clone the GitHub Repository
2. Change Directory to "Traini8" (cd)
3. please add your own details such as URL, username and Password in "application.properties"
4. Run "Traini8Application"
5. The App should be running now.

## API's Implemented

1. Post Training Center
2. Get Training Centers
3. Update Training Center
4. Delete Training Center
5. Get Training Centers By CenterId
6. Get Training Centers By Capacity
7. Get Training Centers By Name
8. Get Training Center by Course Offered


## API CONTRACT
 
### 1. Post Training Center
 
```
POST http://localhost:8080/api/trainingcenters
```
 
#### Request Body
 
```json
{
  "centerName": "Training Center 1",
  "centerCode": "TRN456789121",
  "address": {
    "detailedAddress": "Main St",
    "city": "Ghaziabad",
    "state": "Uttar Pradesh",
    "pincode": "201014"
  },
  "studentCapacity" : 350,
  "coursesOffered": ["Python", "Mathematics", "Data Science"],
  "contactEmail": "trainingcenter1@example.com",
  "contactPhone": "9319943571"
}

```
 
#### Response
 
```json
{
    "centerCode": "TRN456789121",
    "centerName": "Training Center 1",
    "address": {
        "detailedAddress": "Main St",
        "city": "Ghaziabad",
        "state": "Uttar Pradesh",
        "pincode": "201014"
    },
    "coursesOffered": [
        "Python",
        "Mathematics",
        "Data Science"
    ],
    "studentCapacity": 350,
    "contactEmail": "trainingcenter1@example.com",
    "contactPhone": "9319943571",
    "createdOn": 1714299014968
}
```
 
### 2. Get Training Centers
 
```
GET http://localhost:8080/api/trainingcenters
```
 
#### Response
 
```json
[
    {
        "centerCode": "TRN456789121",
        "centerName": "Training Center 1",
        "address": {
            "detailedAddress": "Main St",
            "city": "Ghaziabad",
            "state": "Uttar Pradesh",
            "pincode": "201014"
        },
        "coursesOffered": [
            "Python",
            "Mathematics",
            "Data Science"
        ],
        "studentCapacity": 350,
        "contactEmail": "trainingcenter1@example.com",
        "contactPhone": "9319943571",
        "createdOn": 1714299014968
    },
    {
        "centerCode": "TRN456789122",
        "centerName": "Training Center 2",
        "address": {
            "detailedAddress": "Main St",
            "city": "Ghaziabad",
            "state": "Uttar Pradesh",
            "pincode": "201014"
        },
        "coursesOffered": [
            "C++",
            "Mathematics",
            "Data Science"
        ],
        "studentCapacity": 200,
        "contactEmail": "trainingcenter1@example.com",
        "contactPhone": "9319943571",
        "createdOn": 1714299114577
    },
    {
        "centerCode": "TRN456789123",
        "centerName": "Training Center 3",
        "address": {
            "detailedAddress": "Main St",
            "city": "Ghaziabad",
            "state": "Uttar Pradesh",
            "pincode": "201014"
        },
        "coursesOffered": [
            "Machine Learning",
            "Mathematics",
            "Data Science"
        ],
        "studentCapacity": 220,
        "contactEmail": "trainingcenter1@example.com",
        "contactPhone": "9319943571",
        "createdOn": 1714299139543
    },
    {
        "centerCode": "TRN456789124",
        "centerName": "Training Center 4",
        "address": {
            "detailedAddress": "Main St",
            "city": "Ghaziabad",
            "state": "Uttar Pradesh",
            "pincode": "201014"
        },
        "coursesOffered": [
            "Machine Learning",
            "Deep Learning",
            "Data Science"
        ],
        "studentCapacity": 150,
        "contactEmail": "trainingcenter1@example.com",
        "contactPhone": "9319943571",
        "createdOn": 1714299166668
    },
    {
        "centerCode": "TRN456789125",
        "centerName": "Training Center 5",
        "address": {
            "detailedAddress": "Main St",
            "city": "Ghaziabad",
            "state": "Uttar Pradesh",
            "pincode": "201014"
        },
        "coursesOffered": [
            "Java",
            "SpringBoot",
            "Chemistry"
        ],
        "studentCapacity": 150,
        "contactEmail": "trainingcenter1@example.com",
        "contactPhone": "9319943571",
        "createdOn": 1714299208526
    },
    {
        "centerCode": "TRN456789126",
        "centerName": "Training Center 6",
        "address": {
            "detailedAddress": "Main St",
            "city": "Ghaziabad",
            "state": "Uttar Pradesh",
            "pincode": "201014"
        },
        "coursesOffered": [
            "Java",
            "C++",
            "Chemistry"
        ],
        "studentCapacity": 300,
        "contactEmail": "trainingcenter1@example.com",
        "contactPhone": "9319943571",
        "createdOn": 1714299243385
    },
    {
        "centerCode": "TRN456789127",
        "centerName": "Training Center 7",
        "address": {
            "detailedAddress": "Main St",
            "city": "Ghaziabad",
            "state": "Uttar Pradesh",
            "pincode": "201014"
        },
        "coursesOffered": [
            "Java",
            "C#",
            ".NET"
        ],
        "studentCapacity": 500,
        "contactEmail": "trainingcenter1@example.com",
        "contactPhone": "9319943571",
        "createdOn": 1714299281711
    },
    {
        "centerCode": "TRN456789128",
        "centerName": "Training Center 8",
        "address": {
            "detailedAddress": "Main St",
            "city": "Ghaziabad",
            "state": "Uttar Pradesh",
            "pincode": "201014"
        },
        "coursesOffered": [
            "Azure",
            "C#",
            ".NET"
        ],
        "studentCapacity": 110,
        "contactEmail": "trainingcenter1@example.com",
        "contactPhone": "9319943571",
        "createdOn": 1714299314210
    }
]
```
 
### 3. Update Training Center
 
```
PUT http://localhost:8080/api/trainingcenters/TRN456789121
```
 
#### Request Body
 
```json
{
  "centerName": "Training Center 1",
  "centerCode": "TRN456789121",
  "address": {
    "detailedAddress": "Indirapuram",
    "city": "Ghaziabad ",
    "state": "Uttar Pradesh",
    "pincode": "20101"
  },
  "studentCapacity": 50,
  "coursesOffered": ["Java", "Python", "Data Science"],
  "contactEmail": "trainingcenter@example.com",
  "contactPhone": "9319943572"
}
```
 
#### Response
 
```json
{
    "centerCode": "TRN456789121",
    "centerName": "Training Center 1",
    "address": {
        "detailedAddress": "Indirapuram",
        "city": "Ghaziabad ",
        "state": "Uttar Pradesh",
        "pincode": "20101"
    },
    "coursesOffered": [
        "Java",
        "Python",
        "Data Science"
    ],
    "studentCapacity": 50,
    "contactEmail": "trainingcenter@example.com",
    "contactPhone": "9319943572",
    "createdOn": 1714299014968
}
```
 
### 4. Delete Training Center
 
```
DELETE http://localhost:8080/api/trainingcenters/TRN456789122
```
 
#### Response
 
```json
204 No Content
```
 
### 5. Get Training Centers By Id
 
```
GET http://localhost:8080/api/trainingcenters/id/TRN456789121
```
 
#### Response
 
```json
{
    "centerCode": "TRN456789121",
    "centerName": "Training Center 1",
    "address": {
        "detailedAddress": "Indirapuram",
        "city": "Ghaziabad ",
        "state": "Uttar Pradesh",
        "pincode": "20101"
    },
    "coursesOffered": [
        "Java",
        "Python",
        "Data Science"
    ],
    "studentCapacity": 50,
    "contactEmail": "trainingcenter@example.com",
    "contactPhone": "9319943572",
    "createdOn": 1714299014968
}
```
 
### 6. Get Training Centers By Capacity
 
```
GET http://localhost:8080/api/trainingcenters/capacity?min=200&max=400
```
 
#### Response
 
```json
[
    {
        "centerCode": "TRN456789122",
        "centerName": "Training Center 2",
        "address": {
            "detailedAddress": "Main St",
            "city": "Ghaziabad",
            "state": "Uttar Pradesh",
            "pincode": "201014"
        },
        "coursesOffered": [
            "C++",
            "Mathematics",
            "Data Science"
        ],
        "studentCapacity": 200,
        "contactEmail": "trainingcenter1@example.com",
        "contactPhone": "9319943571",
        "createdOn": 1714299114577
    },
    {
        "centerCode": "TRN456789124",
        "centerName": "Training Center 4",
        "address": {
            "detailedAddress": "Main St",
            "city": "Ghaziabad",
            "state": "Uttar Pradesh",
            "pincode": "201014"
        },
        "coursesOffered": [
            "Machine Learning",
            "Deep Learning",
            "Data Science"
        ],
        "studentCapacity": 150,
        "contactEmail": "trainingcenter1@example.com",
        "contactPhone": "9319943571",
        "createdOn": 1714299166668
    },
    {
        "centerCode": "TRN456789125",
        "centerName": "Training Center 5",
        "address": {
            "detailedAddress": "Main St",
            "city": "Ghaziabad",
            "state": "Uttar Pradesh",
            "pincode": "201014"
        },
        "coursesOffered": [
            "Java",
            "SpringBoot",
            "Chemistry"
        ],
        "studentCapacity": 150,
        "contactEmail": "trainingcenter1@example.com",
        "contactPhone": "9319943571",
        "createdOn": 1714299208526
    },
    {
        "centerCode": "TRN456789128",
        "centerName": "Training Center 8",
        "address": {
            "detailedAddress": "Main St",
            "city": "Ghaziabad",
            "state": "Uttar Pradesh",
            "pincode": "201014"
        },
        "coursesOffered": [
            "Azure",
            "C#",
            ".NET"
        ],
        "studentCapacity": 110,
        "contactEmail": "trainingcenter1@example.com",
        "contactPhone": "9319943571",
        "createdOn": 1714299314210
    }
]
```
 
### 7. Get Training Centers By Name
 
```
GET http://localhost:8080/api/trainingcenters/name/training center 1
```
 
#### Response
 
```json
[
    {
        "centerCode": "TRN456789121",
        "centerName": "Training Center 1",
        "address": {
            "detailedAddress": "Indirapuram",
            "city": "Ghaziabad ",
            "state": "Uttar Pradesh",
            "pincode": "20101"
        },
        "coursesOffered": [
            "Java",
            "Python",
            "Data Science"
        ],
        "studentCapacity": 50,
        "contactEmail": "trainingcenter@example.com",
        "contactPhone": "9319943572",
        "createdOn": 1714299014968
    }
]
```
 
### 8. Get Training Center by Course Offered
 
```
GET http://localhost:8080/api/trainingcenters/course/Java
```
 
#### Response
 
```json
[
    {
        "centerCode": "TRN456789121",
        "centerName": "Training Center 1",
        "address": {
            "detailedAddress": "Indirapuram",
            "city": "Ghaziabad ",
            "state": "Uttar Pradesh",
            "pincode": "20101"
        },
        "coursesOffered": [
            "Java",
            "Python",
            "Data Science"
        ],
        "studentCapacity": 50,
        "contactEmail": "trainingcenter@example.com",
        "contactPhone": "9319943572",
        "createdOn": 1714299014968
    },
    {
        "centerCode": "TRN456789125",
        "centerName": "Training Center 5",
        "address": {
            "detailedAddress": "Main St",
            "city": "Ghaziabad",
            "state": "Uttar Pradesh",
            "pincode": "201014"
        },
        "coursesOffered": [
            "Java",
            "SpringBoot",
            "Chemistry"
        ],
        "studentCapacity": 150,
        "contactEmail": "trainingcenter1@example.com",
        "contactPhone": "9319943571",
        "createdOn": 1714299208526
    },
    {
        "centerCode": "TRN456789126",
        "centerName": "Training Center 6",
        "address": {
            "detailedAddress": "Main St",
            "city": "Ghaziabad",
            "state": "Uttar Pradesh",
            "pincode": "201014"
        },
        "coursesOffered": [
            "Java",
            "C++",
            "Chemistry"
        ],
        "studentCapacity": 300,
        "contactEmail": "trainingcenter1@example.com",
        "contactPhone": "9319943571",
        "createdOn": 1714299243385
    },
    {
        "centerCode": "TRN456789127",
        "centerName": "Training Center 7",
        "address": {
            "detailedAddress": "Main St",
            "city": "Ghaziabad",
            "state": "Uttar Pradesh",
            "pincode": "201014"
        },
        "coursesOffered": [
            "Java",
            "C#",
            ".NET"
        ],
        "studentCapacity": 500,
        "contactEmail": "trainingcenter1@example.com",
        "contactPhone": "9319943571",
        "createdOn": 1714299281711
    }
]
```
