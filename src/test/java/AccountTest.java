import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {
    private final String accountName;
    private Boolean expectedResult;

    public AccountTest(String accountName, Boolean expectedResult){
        this.accountName = accountName;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "Account - {0}")
    public static Object[][] data() {
        return new Object[][] {
                { "Тимоти Шаламе", true },
                { " Тимоти Шаламе", false },
                { "Тимоти Шаламе ", false },
                { "Тимоти Шаламеgvjvlvl", false },
                { "ТимотейШевроле", false }
        };
    }

    @Test
    @DisplayName("Creating account") // имя тест
    @Description("Checking whether it is possible to print a line on the card")
    public void checkPrintAccountData() {
        //System.out.println("'"+accountName+"'");
        Account account = new Account(accountName);

        boolean actualResult = account.checkNameToEmboss();

        assertEquals(expectedResult, actualResult);
    }

}
