package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage {

    public static final Target BUTTON_UC = Target.the("Selecciona cursos y certificaciones choucair")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section[1]/div[2]/aside/section[1]/div/div/div[1]/center/div/div/div/div[2]/div[1]/a/h4/strong"));
    public static final Target INPUT_COURSE = Target.the("Busca el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div/div/section/div[2]/form/fieldset/button"));
    public static final Target SELECT_COURSE = Target.the("Da click para seleccionar el curso")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/section/div/div[1]/div/div[1]/h3/a"));

}
