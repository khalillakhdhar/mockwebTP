package com.tp.services;

import com.tp.dao.DatabaseDao;
import com.tp.entities.User;

public class InscriptionService {
DatabaseDao database;

public DatabaseDao getDatabase() {
	return database;
}

public void setDatabase(DatabaseDao database) {
	this.database = database;
}

public boolean verifBlank(String name)
{
return !name.isBlank();	

}
public boolean verifage(int age)
{
	return age>18;

}
public boolean verifscore(int score)
{
return score>80;	

}

public boolean saveUser(User user) {
	if ((verifBlank(user.getNom())) && (verifBlank(user.getPrenom())) && (verifage(user.getAge()))
			&& (verifscore(user.getScore()))) {
		return true;
	} else
		return false;

}



}
