package phonebook;

import java.util.Arrays;

public class Directory {

Person[] book = new Person[0];

public void addPerson(Person newPerson) {
Person[] temp = new Person[book.length + 1];
for (int i = 0; i < book.length; i++) {
temp[i] = book[i];
}
temp[temp.length - 1] = newPerson;
book = temp;
}

public void deletePerson(Person removed) {
Person[] temp = new Person[book.length - 1];
int x = 0;
for (int i = 0; i < book.length; i++) {
if (book[i] != removed) {
temp[x] = book[i];
x++;
}
}
book = temp;
}

public Person[] getDirectory() {
return book;
}

public void printDirectory() {
for (int i = 0; i < book.length; i++) {
book[i].printPerson();
}
}

public void printPersonArray(Person[] searched) {
for (int i = 0; i < searched.length; i++) {
searched[i].printPerson();
}
}

public Person searchByPhone(long phoneNum) {
int index = 0;
for (int i = 0; i < book.length; i++) {
if (book[i].getPhoneNum() == phoneNum) {
index = i;
break;
}
}
return book[index];
}

public Person[] getByLastName(String lastName) {
// set counter for the size of the array
int counter = 0;
// for loop to see how many people have the same Last name
for (int i = 0; i < book.length; i++) {
if (book[i].getLastName().equals(lastName)) {
counter++;
}
}
// make a temp array that is the exact size of how many names were found
Person[] temp = new Person[counter];

// set another counter that will use the index value
int x = 0;

for (int i = 0; i < book.length; i++) {
if (book[i].getLastName().equals(lastName)) {
temp[x] = book[i];
x++;
}
}
return temp;
}

public Person[] getByFirstName(String firstName) {
// set counter for the size of the array
int counter = 0;
// for loop to see how many people have the same first name
for (int i = 0; i < book.length; i++) {
if (book[i].getFirstName().equals(firstName)) {
counter++;
}
}
// make a temp array that is the exact size of how many names were found
Person[] temp = new Person[counter];

// set another counter that will use the index value
int x = 0;

for (int i = 0; i < book.length; i++) {
if (book[i].getFirstName().equals(firstName)) {
temp[x] = book[i];
x++;
}
}
return temp;
}


public Person[] getByFullName(String full) {
// set counter for the size of the array
int counter = 0;
// for loop to see how many people have the same first name
for (int i = 0; i < book.length; i++) {
if ((book[i].getFirstName() + " " + book[i].getLastName()).equals(full)) {
counter++;
}
}
// make a temp array that is the exact size of how many names were found
Person[] temp = new Person[counter];

// set another counter that will use the index value
int x = 0;

for (int i = 0; i < book.length; i++) {
if ((book[i].getFirstName() + " " + book[i].getLastName()).equals(full)) {
temp[x] = book[i];
x++;
}
}
return temp;
}
public Person[] getBycity(String city) {
// set counter for the size of the array
int counter = 0;
// for loop to see how many people have the same state name
for (int i = 0; i < book.length; i++) {
if (book[i].getAddress().getCity().equals(city)) {
counter++;
}
}

Person[] temp = new Person[counter];

// set another counter that will use the index value
int x = 0;

for (int i = 0; i < book.length; i++) {
if (book[i].getAddress().getCity().equals(city)) {
temp[x] = book[i];
x++;
}
}
return temp;
}
public Person[] getByState(String state) {
// set counter for the size of the array
int counter = 0;
// for loop to see how many people have the same state name
for (int i = 0; i < book.length; i++) {
if (book[i].getAddress().getState().equals(state)) {
counter++;
}
}

Person[] temp = new Person[counter];

// set another counter that will use the index value
int x = 0;

for (int i = 0; i < book.length; i++) {
if (book[i].getAddress().getState().equals(state)) {
temp[x] = book[i];
x++;
}
}
return temp;
}

public void printAlphabetArray(Person[] searched) {
String[] alphabet = new String[searched.length];
for (int i = 0; i < searched.length; i++) {
alphabet[i] = searched[i].getFirstName();
}

Arrays.sort(alphabet);

for (int i = 0; i < alphabet.length; i++) {
for (int j = 0; j < book.length; j++) {
if(alphabet[j] == book[i].getFirstName()) {
book[j].printPerson();
}
}

}
}
}