public class TemperatureTest {
//          Todo: Write code to make this test pass
    @Test
    public void testThatConvertingFromCelsiusToFahrenheitReturnsTheCorrectValue() {
//        Given I have 100 degrees Celsius and a temperature Converter
        Unit<Celsius> celsiusUnit = new Unit<Celsius>(100);
        Converter<Temperature> temperatureConverter = new Converter<Temperature>();

//        When I convert it to Fahrenheit
        Unit<Fahrenheit> actual = temperatureConverter.convertUnit(celsiusUnit, Fahrenheit);

//        Then the result should be 212 degrees Fahrenheit
        Unit<Fahrenheit> expected = new Unit<Fahrenheit>(212);
        assertEquals("Celsius to Fahrenheit conversion failed", expected, actual);
    }

//          Todo: Test the other temperature conversions


}
