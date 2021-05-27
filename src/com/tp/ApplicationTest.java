package com.tp;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.tp.dao.DatabaseDao;
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
public void addUser()
{
	

}


}
