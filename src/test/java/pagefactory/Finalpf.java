package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Finalpf {
	WebDriver driver;
	//create constructer method to connect with step defination
	public void Finalpf() {
		this.driver=driver;
				//pagefactorydriver= final step dirver
				PageFactory.initElements(driver, this);
	}
	
	@FindBy (how=How.XPATH, using="//*[@class='login']")
	private WebElement login;
	
	@FindBy (how=How.XPATH, using="//*[@id='email']")
private WebElement email;
	
	@FindBy(how=How.XPATH, using="//*[@id='passwd']")
	private WebElement pwd;
	
	@FindBy(how=How.XPATH, using="//*[@id='SubmitLogin']")
	private WebElement submit;
	
	@FindBy(how=How.XPATH, using="(//*[@class='sf-with-ul'])[4]")
	private WebElement dresses;
	
	@FindBy(how=How.XPATH, using="(//*[@class='price product-price'])[2]")
	private WebElement price1;
	
	@FindBy(how=How.XPATH, using="(//*[@class='price product-price'])[4]")
	private WebElement price2;
	
	@FindBy(how=How.XPATH, using="(//*[@class='price product-price'])[6]")
	private WebElement price3;
	
	@FindBy(how=How.XPATH, using="(//*[@class='price product-price'])[8]")
	private WebElement price4;
	
	@FindBy(how=How.XPATH, using="(//*[@class='price product-price'])[10]")
	private WebElement price5;
	
	@FindBy(how=How.XPATH, using="(//*[@class='right-block'])[2]")
	private WebElement hoverover;
	
	@FindBy(how=How.XPATH, using="(//*[@title='Add to cart'])[2]")
	private WebElement addtocart;
	
	@FindBy(how=How.XPATH, using="(//*[@class='icon-chevron-right right'])[2]")
	private WebElement proceed;
	
	@FindBy(how=How.XPATH, using="//*[@id='total_price']")
	private WebElement total;
	
	@FindBy(how=How.XPATH, using="//*[@class='logout']")
	private WebElement logout;
//using gettersetter method
	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public void setPwd(WebElement pwd) {
		this.pwd = pwd;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	public WebElement getDresses() {
		return dresses;
	}

	public void setDresses(WebElement dresses) {
		this.dresses = dresses;
	}

	public WebElement getPrice1() {
		return price1;
	}

	public void setPrice1(WebElement price1) {
		this.price1 = price1;
	}

	public WebElement getPrice2() {
		return price2;
	}

	public void setPrice2(WebElement price2) {
		this.price2 = price2;
	}

	public WebElement getPrice3() {
		return price3;
	}

	public void setPrice3(WebElement price3) {
		this.price3 = price3;
	}

	public WebElement getPrice4() {
		return price4;
	}

	public void setPrice4(WebElement price4) {
		this.price4 = price4;
	}

	public WebElement getPrice5() {
		return price5;
	}

	public void setPrice5(WebElement price5) {
		this.price5 = price5;
	}

	public WebElement getHoverover() {
		return hoverover;
	}

	public void setHoverover(WebElement hoverover) {
		this.hoverover = hoverover;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public void setAddtocart(WebElement addtocart) {
		this.addtocart = addtocart;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public void setProceed(WebElement proceed) {
		this.proceed = proceed;
	}

	public WebElement getTotal() {
		return total;
	}

	public void setTotal(WebElement total) {
		this.total = total;
	}

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}
	
	
}

