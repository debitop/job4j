package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Aleksandr Kochkurkin (mailto:info@debitop.com)
* @version $Id$
* @since 09.09.2018
*/
public class CalculateTest {
	/**
	* Test echo.
	*/
	@Test
	public void whenTakeNameThenTreeEchoPlusName() {
		String input = "Aleksandr Kochkurkin";
		String expect = "Echo, echo, echo : Aleksandr Kochkurkin"; 
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
 
}