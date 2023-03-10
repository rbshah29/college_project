package com.student_bank.project.Interfaces;

public interface Iregistration {
		public void setFirstName(String firstName);
	    public void setLastName(String lastName);
	    public void setMiddleName(String middleName);
	    public void setPass(String pass);
	    public void setDOB(String Dob);
	    public void setAddress(String address);
	    public void setEmail(String email);
	    public void setCity(String city);
	    public void setPostalCode(String PO);
	    public void setPhoneno(String phoneno);
	    public void setUser(String user);
	    public void setAccNo(String accNo);
		public String getFirstName();
		public String getLastName();
		public String getMiddleName();
		public String getUserName();
		public String getEmail();
		public String getAddress();
		public String getCity();
		public String getDob();
		public String getPhoneNumber();
		public String getPostalCode();
		public String getPass();
		public String getAccNo();
		public void setDob(String dob);
		public boolean validateAll() throws Exception;
}
