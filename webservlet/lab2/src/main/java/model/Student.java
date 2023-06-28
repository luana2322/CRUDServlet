package model;

public class Student {
private String id, name,pass,adress;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Student(String id, String name, String pass, String adress, int age) {
	super();
	this.id = id;
	this.name = name;
	this.pass = pass;
	this.adress = adress;
	this.age = age;
}


}
