function formValidation()
{
    var ufirst=fname;
    var ulast=sname;
    var age=age;
    var email=email;
    var phonenum=num;
    var add=address;
    var cities=city;
    var states=state;
    var pincod=pincode;

    if(allLetter(ufirst)){
        if(allLeters(ulast)){
            if(Validage(age)){
                if(Validityemail(email)){
                    if(ValidateNum(phonenum)){
                        if(alphanumeric(add)){
                            if(Validcity(cities)){
                                if(Validstates(states)){
                                    if(Validzip(pincod)){

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    return false;
}
function allLetter(ufirst)
{ 
var letters = /^[A-Za-z]+$/;
if(ufirst.value.match(letters))
{
return true;
}
else
{
alert('Username must have alphabet characters only');
ufirst.focus();
return false;
}
}
function allLetters(ulast)
{ 
var letters = /^[A-Za-z]+$/;
if(ulast.value.match(letters))
{
return true;
}
else
{
alert('Username must have alphabet characters only');
ulast.focus();
return false;
}
}
function Validage(age){
    if (isNaN(age) || age < 50 || age > 20)
    { 
      alert("The age must be a number between 20 and 50");
      age.focus();
      return false;
    } 
}
function Validityemail(email){
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    if(uemail.value.match(mailformat))
    {
    return true;
    }
    else
    {
    alert("You have entered an invalid email address!");
    uemail.focus();
    return false;
    }
}
function ValidateNum(phonenum){
    var phoneno = /^\d{10}$/;
  if(phonenum.value.match(phoneno)){
      return true;
        }
      else
        {
        alert("message");
        return false;
        }
}
function alphanumeric(add){
    { 
        var letters = /^[0-9a-zA-Z]+$/;
        if(add.value.match(letters))
        {
        return true;
        }
        else
        {
        alert('User address must have alphanumeric characters only');
        add.focus();
        return false;
        }
        }
}
function Validcity(cities){
    var letter = /^[A-Za-z]+$/;
if(cities.value.match(letter))
{
return true;
}
else
{
alert('Username must have alphabet characters only');
cities.focus();
return false;
}
}
function Validstates(states){
    var lett = /^[A-Za-z]+$/;
    if(states.value.match(lett))
    {
    return true;
    }
    else
    {
    alert('Username must have alphabet characters only');
    states.focus();
    return false;
    }  
}
function Validzip(pincod){
    var numbers = /^[0-9]+$/;
    if(pincode.value.match(numbers))
    {
    return true;
    }
    else
    {
    alert('ZIP code must have numeric characters only');
    pincode.focus();
    return false;
    }
    }