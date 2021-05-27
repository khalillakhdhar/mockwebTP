package com.tp;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.tp.dao.DatabaseDao;
import com.tp.entities.User;
import com.tp.services.InscriptionService;

public class ApplicationTest {
@Before
public void initMocks()
{
	MockitoAnnotations.initMocks(this);

}
@InjectMocks
InscriptionService inscription;
@Mock
DatabaseDao stub;
@Test
public void verifage()
{
assertTrue(inscription.verifage(12));	


}
@Test
public void addUser()
{
	User us=new User(1,"khalil","lakhdhar","khalil@test.com","teste",98,30);
	
	boolean state= inscription.saveUser(us);
	assertTrue(state);
	verify(stub, times(0)).saveUser(us);

}


}
