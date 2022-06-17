package phoneBook;

import java.util.*;

public class PhonebookMain {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

Person p1 = new Person(13146493662L, "Shah", "Gulmarjan", "Ghafoor");
p1.addAddress(4566, "KingsHighway Blvd.", "St. Louis", "MO", 63156);
p1.printPerson();

Person p2 = new Person(13148855098L, "Ansar", "Sediqi", null);
p2.addAddress(123, Sublette ave", "St. Louis", "MO", 63153);
p2.printPerson();

Directory d1 = new Directory();
d1.addPerson(p1);
d1.addPerson(p2);
int choice = 0;
int updateChoice = 0;
while (choice != 11) {
choice = getMenu();
switch (choice) {
case 1:
System.out.println("Enter person information separated by commas");
System.out.println("FORMAT: Name, Street Address, City, State, Zip, Phone Number");
String info = input.nextLine();

String[] tempInfo = info.split(", ");
String name = tempInfo[0];
String street = tempInfo[1];
String city = tempInfo[2];
String state = tempInfo[3];
int zipCode = Integer.parseInt(tempInfo[4]);
long phoneNum = Long.parseLong(tempInfo[5]);

String[] tempName = name.split(" ");
String fName = tempName[0];
String lName = tempName[tempName.length - 1];

// empty container to hold the middle name
String middleName = "";
for (int i = 1; i < tempName.length - 1; i++) {
middleName += tempName[i];
if (i != tempName.length - 2) {
middleName += " ";
}
}

String[] tempAddress = street.split(" ");
int streetNum = Integer.parseInt(tempAddress[0]);
String streetName = "";

for (int i = 1; i < tempAddress.length; i++) {
streetName = tempAddress[i];
if (i != tempAddress.length - 1) {
streetName = " ";
}
}

Person p3 = new Person(phoneNum, fName, lName, middleName);
p3.addAddress(streetNum, streetName, city, state, zipCode);
d1.addPerson(p3);
d1.printDirectory();
break;
case 2:
System.out.println("Please enter the phonenumber of the person you want to delete");
long case2 = input.nextLong();
d1.deletePerson(d1.searchByPhone(case2));
d1.printDirectory();
break;
case 3:
System.out.println("Enter the first name of the person you are searching for");
String case3 = input.next();
d1.printPersonArray(d1.getByFirstName(case3));
break;
case 4:
System.out.println("Enter the last name of the person you are searching for");
String case4 = input.next();
d1.printPersonArray(d1.getByLastName(case4));
break;
case 5:
System.out.println("Enter the full name of the person you are searching for");
String case5 = input.nextLine();
d1.printPersonArray(d1.getByFullName(case5));
break;
case 6:
System.out.println("Enter the phonenumber of the person you are searching for");
long tempNumber = input.nextLong();
d1.searchByPhone(tempNumber).printPerson();
break;
case 7:
System.out.println("Enter the city of the person you are searching for");
String tempcity = input.nextLine();
d1.printPersonArray(d1.getBycity(tempcity));
break;
case 8:
System.out.println("Enter the State of the person you are searching for");
String tempState = input.nextLine();
d1.printPersonArray(d1.getByState(tempState));
break;
case 9:
d1.printAlphabetArray(d1.getDirectory());
break;
case 10:
System.out.println("Please enter the phone number of the person you are searching for");
long case10 = input.nextLong();
d1.searchByPhone(case10).printPerson();
updateChoice = 0;
while (updateChoice != 8) {
updateChoice = getUpdateMenu();
switch (updateChoice) {
case 1:
System.out.println("Please enter the new first name");
String newFirstName = input.next();
d1.searchByPhone(case10).setFirstName(newFirstName);

break;
case 2:
System.out.println("Please enter the new last name");
String newLastName = input.next();
d1.searchByPhone(case10).setLastName(newLastName);
break;
case 3:
System.out.println("Please enter the new street name");
String newStreetName= input.next();
d1.searchByPhone(case10).getAddress().setStreetName(newStreetName);

break;
case 4:
System.out.println("Please enter the new phone number");
long newPhoneNum = input.nextLong();
d1.searchByPhone(case10).setPhoneNum(newPhoneNum);
break;
case 5:
System.out.println("Please enter the new city");
String newCity = input.next();
d1.searchByPhone(case10).getAddress().setCity(newCity);
break;
case 6:
System.out.println("Please enter the new state");
String newState = input.next();
d1.searchByPhone(case10).getAddress().setState(newState);

break;
case 7:
System.out.println("Please enter the new zip code");
int newZip = input.nextInt();
d1.searchByPhone(case10).getAddress().setZip(newZip);
break;
case 8:
break;
}
}
break;
case 11:
System.exit(0);
break;
}
}
}

public static int getMenu() {
Scanner sc1 = new Scanner(System.in);
// print menu
System.out.println("1. Add new person");
System.out.println("2. Delete new person");
System.out.println("3. Search by first name");
System.out.println("4. Search by last name");
System.out.println("5. Search by full name");
System.out.println("6. Search by phone number");
System.out.println("7. Search by city");
System.out.println("8. Search by state");
System.out.println("9. Sort people alphabetically");
System.out.println("10. Update person information");
System.out.println("11. End the program");
System.out.println("Please enter a number");

int choice = sc1.nextInt();
System.out.println();
return choice;
}

public static int getUpdateMenu() {
Scanner sc1 = new Scanner(System.in);
System.out.println("1. Update first name");
System.out.println("2. Update last name");
System.out.println("3. Update street address");
System.out.println("4. Update phone number");
System.out.println("5. Update city");
System.out.println("6. Update state");
System.out.println("7. Update zip code");
System.out.println("8. Exit record update");
System.out.println("Please enter a number: ");

int choice = sc1.nextInt();
System.out.println();
return choice;
}

}
