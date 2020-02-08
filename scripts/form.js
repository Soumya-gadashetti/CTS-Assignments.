const APPOINTMENTS_KEY = "appointment";

getAppointmentsFromLocalStorage = () =>{
    let appointments=[];
    
    if(localStorage.getItem(APPOINTMENTS_KEY)){
        appointments=JSON.parse(localStorage.getItem(APPOINTMENTS_KEY));
    }

    return appointments;
}

addAppointmentFormSubmit = () =>{
    let appointments = getAppointmentsFromLocalStorage();

    let firstNameTextBox = document.querySelector("#fnm");
    let lastNameTextBox = document.querySelector("#lnm");
    let ageTextBox = document.querySelector("#age");
    let emailTextBox = document.querySelector("#email");
    let contactTextBox = document.querySelector("#phno");
    let streetTextBox = document.querySelector("#street");
    let cityTextBox = document.querySelector("#city");
    let stateTextBox = document.querySelector("#state");
    let countryTextBox = document.querySelector("#country");
   

    let appointment = {
        fname:firstNameTextBox.value,
        lname:lastNameTextBox.value,
        age:parseInt(ageTextBox.value),
        email:emailTextBox.value,
        contact:parseInt(contactTextBox.value),
        street:streetTextBox.value,
        city:cityTextBox.value,
        state:stateTextBox.value,
        country:countryTextBox.value,
    };

    appointments.push(appointment);
    localStorage.setItem(APPOINTMENTS_KEY,JSON.stringify(appointments));
}

loadAppointments = () =>{
    let appointments = getAppointmentsFromLocalStorage();

    let tableBody = document.querySelector("#aptData");

/*  products.forEach(product => {
        let prdRow = createProductRow(product);
        tableBody.append(prdRow);
    }); */

    for(let appointment of appointments){
        let aptRow = createAppointmentRow(appointment);
        tableBody.append(aptRow);
    }
}

createAppointmentRow = (appointment) =>{

    let firstName = document.createElement("td");
    firstName.textContent=appointment.fname;

    let lasstName = document.createElement("td");
    lastName.textContent=appointment.lname;
    
    let ages= document.createElement("td");
    ages.textContent=appointment.age;
    
    let mail = document.createElement("td");
    mail.textContent=appointment.email;

    let contact = document.createElement("td");
    contact.textContent=appointment.phno;

    let streets = document.createElement("td");
    streets.textContent=appointment.street;

    let cities = document.createElement("td");
    cities.textContent=appointment.city;

    let states = document.createElement("td");
    states.textContent=appointment.state;

    let countries = document.createElement("td");
    countries.textContent=appointment.country;

    let aptRow = document.createElement("tr");
    aptRow.append(firstName);
    aptRow.append(lastName);
    aptRow.append(ages);
    aptRow.append(mail);
    aptRow.append(contact);
    aptRow.append(streets);
    aptRow.append(cities);
    aptRow.append(states);
    aptRow.append(countries);

    return aptRow;
}