const mongoose = require('mongoose');
 

// Connecting with MongoDB

mongoose.connect("mongodb://localhost:27017/readDB",
{useNewUrlParser : true,
useUnifiedTopology : true,
useFindAndModify : false
}).then(() => console.log("connection Successful...!!!"))
.catch((e) => console.log("not connected"))


// create schema

const studentSchema =  new mongoose.Schema({
    name : {type : String, required : true},
    lastName : String,
    age : Number,
    averageScore : mongoose.Decimal128,
    id : Number,
    sec : String,
    gender : {type : String, enum: ['female', 'male']},
    sports : Array,
    date : {type : Date, default : Date.now},
});

// create Model , {Create your Collections}
var collectionName = 'students'
const Student = new mongoose.model("Student", studentSchema,collectionName)

// creating Document

const data1 = new Student({
    name : "Shubbhang",
    course : "B.Tech",
    duration : 4,
    reg : true,
})

//CRUD 

// data1.save().then((doc) => console.log(doc)).catch((e) => console.log("error"));


var data = [
    {
      "name": "priya",
      "lastName": "gupta",
      "age": 17,
      "averageScore": 8.4,
      "id": 1,
      "sec": "A",
      "gender": "female",
      "sports":["cricket", "Bedminton", "Volleyball"]
    },
    {
      "name": "shyam",
      "lastName": "rana",
      "age": 17,
      "averageScore": 5.4,
      "id": 2,
      "sec": "B",
      "gender": "male",
      "sports":["Basketball", "Bedminton", "football"]
  
    },
    {
      "name": "kamal",
      "lastName": "sharma",
      "age": 11,
      "averageScore": 6.4,
      "id": 3,
      "sec": "A",
      "gender": "male",
      "sports":["cricket", "Bedminton", "Basketball"]
    },
    {
      "name": "sachin",
      "lastName": "yadav",
      "age": 19,
      "averageScore": 2.4,
      "id": 4,
      "sec": "B",
      "gender": "male",
      "sports":["cricket", "Bedminton", "football"]
    },
    {
      "name": "varsha",
      "lastName": "kumari",
      "age": 14,
      "averageScore": 6.4,
      "id": 5,
      "sec": "A",
      "gender": "female",
      "sports":["Volleyball", "Bedminton", "Basketball"]
    },
    {
      "name": "priya",
      "lastName": "rana",
      "age": 12,
      "averageScore": 5.4,
      "id": 6,
      "sec": "A",
      "gender": "female",
      "sports":["Tennis", "Bedminton", "Volleyball"]
    },
    {
      "name": "manish",
      "lastName": "kumar",
      "age": 17,
      "averageScore": 1.4,
      "id": 7,
      "sec": "B",
      "gender": "male",
      "sports":["cricket", "Hockey", "football"]
    },
    {
      "name": "sachin",
      "lastName": "sharma",
      "age": 20,
      "averageScore": 9.4,
      "id": 8,
      "sec": "B",
      "gender": "male",
      "sports":["cricket", "Hockey", "Basketball"]
    },
    {
      "name": "pankaj",
      "lastName": "Davis",
      "age": 21,
      "averageScore": 3.4,
      "id": 9,
      "sec": "B",
      "gender": "male",
      "sports":["cricket", "Bedminton", "football"]
    },
    {
      "name": "manish",
      "lastName": "yadav",
      "age": 30,
      "averageScore": 5.4,
      "id": 10,
      "sec": "C",
      "gender": "male",
      "sports":["cricket", "Bedminton", "Basketball"]
    },
    {
      "name": "parul",
      "lastName": "gupta",
      "age": 17,
      "averageScore": 8.4,
      "id": 11,
      "sec": "A",
      "gender": "female",
      "sports":["Table Tennis", "Bedminton", "Basketball"]
    },
    {
      "name": "sneha",
      "lastName": "rana",
      "age": 37,
      "averageScore": 5.4,
      "id": 12,
      "sec": "B",
      "gender": "female",
      "sports":["cricket", "Bedminton", "Table Tennis"]
    },
    {
      "name": "divya",
      "lastName": "sharma",
      "age": 11,
      "averageScore": 6.4,
      "id": 13,
      "sec": "C",
      "gender": "female",
      "sports":["Basketball", "Bedminton", "Volleyball"]
    },
    {
      "name": "sonali",
      "lastName": "yadav",
      "age": 19,
      "averageScore": 5.4,
      "id": 14,
      "sec": "D",
      "gender": "female",
      "sports":["cricket", "Basketball", "Volleyball"]
    },
    {
      "name": "varsh",
      "lastName": "kumar",
      "age": 14,
      "averageScore": 6.4,
      "id": 15,
      "sec": "C",
      "gender": "male",
      "sports":["cricket", "Bedminton", "football"]
    },
    {
      "name": "priyaka",
      "lastName": "rana",
      "age": 12,
      "averageScore": 5.4,
      "id": 16,
      "sec": "D",
      "gender": "female",
      "sports":["Basketball", "Bedminton", "Table Tennis"]
    },
    {
      "name": "manisha",
      "lastName": "rani",
      "age": 17,
      "averageScore": 1.4,
      "id": 17,
      "sec": "C",
      "gender": "female",
      "sports":["Volleyball", "Bedminton", "Table Tennis"]
    },
    {
      "name": "Tanya",
      "lastName": "sharma",
      "age": 22,
      "averageScore": 9.4,
      "id": 18,
      "sec": "C",
      "gender": "female",
      "sports":["cricket", "Basketball", "Volleyball"]
    },
    {
      "name": "pankaj",
      "lastName": "sharma",
      "age": 24,
      "averageScore": 3.4,
      "id": 19,
      "sec": "D",
      "gender": "male",
      "sports":["cricket", "Bedminton", "Hockey"]
    },
    {
      "name": "sanjana",
      "lastName": "yadav",
      "age": 20,
      "averageScore": 5.4,
      "id": 20,
      "sec": "D",
      "gender": "female",
      "sports":["Tennis", "Bedminton", "Volleyball"]
    }
  ]

Student.insertMany(data).then((doc) => console.log("Inserted")).catch((e) => {console.log("error")});

Student.find().then((doc) => {console.log(doc)}).catch(e => console.log("error"))