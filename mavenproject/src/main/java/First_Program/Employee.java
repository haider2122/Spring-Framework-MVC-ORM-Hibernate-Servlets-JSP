package First_Program;

public class Employee {
private String name;
private int empId;
private Device LaptopDevice;

Employee(){
	
}
Employee(String name,Device device){
	this.name=name;
	this.LaptopDevice=device;
}
public Device getDevice() {
	return LaptopDevice;
}

public void setDevice(Device device) {
	this.LaptopDevice =(Device) device;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
//	System.out.println(name);
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
//	System.out.println(empId);
}
	
	
	
}
