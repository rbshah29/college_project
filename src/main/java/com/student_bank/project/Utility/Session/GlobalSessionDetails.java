package com.student_bank.project.Utility.Session;

import com.student_bank.project.Interfaces.Iuser;

public class GlobalSessionDetails  {

	private static GlobalSessionDetails globalSession = null;
	private static SessionData sessionData;
	private boolean sess = false;

	private GlobalSessionDetails(){
		sessionData= new SessionData();

	}

	public Iuser getUser() {
		return sessionData.getUser();
	}

	public void setUser(Iuser user) {
		sessionData.setUser(user);
	}

	public static GlobalSessionDetails getInstance() {
		if(globalSession == null){
			globalSession = new GlobalSessionDetails();
		}
		return globalSession;
	}

	public void endSession() {
		globalSession = null;
		sess=false;
	}
	
	
	public boolean getSession() {

		return sess;
	}

	public void startSession() {

		sess= true;
	}

}
