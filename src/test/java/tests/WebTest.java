package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class WebTest extends TestBase {

    @Test
    public void demoqaTest() {
        step("Open page", () ->
                open("/text-box"));

        step("Enter name and submit form", () -> {
            $("#userName").setValue("Ivan");
            $("#submit").click();
        });

        step("Check Name field under form", () ->
                $("#name").shouldHave(text("Ivan")));
    }
}
