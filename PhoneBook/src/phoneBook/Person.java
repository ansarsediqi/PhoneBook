package phonebook;

public class Person {
private long phoneNum;
    private String firstName;
private String lastName;
private Address address;
private String middleName;

public void printPerson() {
if(middleName != null) {
System.out.println(firstName + " " + middleName + " " + lastName + " ");
} else {
System.out.println(firstName + " " + lastName + " ");
}
address.printAddress();
formatPhone(phoneNum);
System.out.println("----------------------------");
}
public Person() {

}

public Person(long phoneNum, String firstName, String lastName, String middleName) {
this.phoneNum = phoneNum;
this.firstName = firstName;
this.lastName = lastName;
this.middleName = middleName;
}

public void addAddress(int streetNum, String streetName, String city, String state, int zip) {
Address temp = new Address(streetNum, streetName, city, state, zip);
address = temp;
}

public long getPhoneNum() {
return phoneNum;
}

public void setPhoneNum(long phoneNum) {
this.phoneNum = phoneNum;
}

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public Address getAddress() {
return address;
}

public void setAddress(Address address) {
this.address = address;
}

public String getMiddleName() {
return middleName;
}

public void setMiddleName(String middleName) {
this.middleName = middleName;
}

public void formatPhone(long phoneNum) {
String phoneNumber = String.valueOf(phoneNum);
String formattedphone = "(" + phoneNumber.substring(1,4) +")" + phoneNumber.substring(4,7) +"-" 
+phoneNumber.substring (7,10) + "" + phoneNumber.substring(10);

System.out.println(formattedphone);
}