package testNumberFormat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws ParseException {

		String valores[] = new String[] { "10.000,52", "200.000","17.04.2020", "4,00", "2,00", "sdssd-ssd-sddw223", "22s-3sd-22222-sd-", "1240,35",
				"400.000,20", "test ", "456,08", "hola" };

		Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?(\\,\\d+)");

		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));

		for (String string : valores) {
			if (pattern.matcher(string).matches()) {
				System.out.println(nf.parse(string).doubleValue());

			}

		}

		// String formats = nf.format(x);

	}

}
