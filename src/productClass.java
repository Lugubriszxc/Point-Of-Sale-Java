 
public class productClass {
    
    private String productid, categoryname, productname, description, quantity, price, date, status;
    
    public productClass(String productid, String categoryname, String productname, String description, String quantity, String price, String date, String status)
    {
        this.productid = productid;
        this.categoryname = categoryname;
        this.productname = productname;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
        this.status = status;
    }

    public String getDate()
    {
        return this.date;
    }
    
    public String getCat()
    {
        return this.categoryname;
    }
    
    public String getProdName()
    {
        return this.productname;
    }
    
    public String getDesc()
    {
        return this.description;
    }
    
    public String getQuantity()
    {
        return this.quantity;
    }
    
    public String getPrice()
    {
        return this.price;
    }
    
    public String getProdId()
    {
        return this.productid;
    }
    
    public String getStatus()
    {
        return this.status;
    }
}
