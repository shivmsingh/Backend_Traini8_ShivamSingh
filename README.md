## Endpoints
 
### 1. Post Training Center
 
```
POST {{base_url}}
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
GET {{base_url}}
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
PUT {{base_url}}/TRN456789121
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
DELETE {{base_url}}/TRN456789122
```
 
#### Response
 
```json
204 No Content
```
 
### 5. Get Training Centers By Id
 
```
GET {{base_url}}/id/TRN456789121
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
GET {{base_url}}/capacity?min=200&max=400
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
GET {{base_url}}/name/training center 1
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
 
### 8. Get data by course
 
```
GET {{base_url}}/course/Java
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
