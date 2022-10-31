package pages;

public class GooglePage extends BasePage {

    private String searchButton = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]";
    private String searchTextField = "//input[@title='Buscar']";
    private String firstResult = "";

    private String cookiesButton = "/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div";

    public GooglePage (){
        super(driver);
    }

    public void navigateToGoogle(){

        navigateTo("https://www.google.com");
    }

    public void acceptCookies(){
        clickElement(cookiesButton);
    }
    public void clickGoogleSearch(){
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);
    }

    public String firstResult(){
        return textFromElement(firstResult);
    }
}