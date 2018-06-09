package cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsBasicApplication;
import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.cdi.SomeCdiDao;
import com.in28minutes.spring.basics.springin5steps.cdi.SomeCdibusiness;

//@RunWith(SpringRunner.class)
//@ContextConfiguration(classes=SpringIn5StepsBasicApplication.class)

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

	//Inject Mockito
	@InjectMocks
	SomeCdibusiness business;
	
	//Create Mock
	@Mock
	SomeCdiDao daoMock;
	
	@Test
	public void testBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
		assertEquals(4, business.findGreatest());
	}
	
	
	@Test
	public void testBasicScenario_NoElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, business.findGreatest());
	}

	@Test
	public void testBasicScenario_EqualElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2});
		assertEquals(2, business.findGreatest());
	}
}
