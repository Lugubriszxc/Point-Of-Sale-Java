
public class categoryClass {
    private String categoryname, categoryid, categorystatus;
    
    /**
     *
     * @param categoryid
     * @param categoryname
     */
    public categoryClass(String categoryid, String categoryname, String categorystatus)
    {
        this.categoryid = categoryid;
        this.categoryname = categoryname;
        this.categorystatus = categorystatus;
    }

  
    public String getCatId()
    {
        return this.categoryid;
    }
    
    public String getCatName()
    {
        return this.categoryname;
    }
    
    public String getCatStatus()
    {
        return this.categorystatus;
    }
}
