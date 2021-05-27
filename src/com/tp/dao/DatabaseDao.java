package com.tp.dao;

import org.apache.catalina.User;

public class DatabaseDao {
public void saveUser(User user)
{
System.out.println("Ajouté avec succés " +user.toString());

}
}
