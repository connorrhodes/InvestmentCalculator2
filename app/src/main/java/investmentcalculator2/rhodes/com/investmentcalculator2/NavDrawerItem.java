package investmentcalculator2.rhodes.com.investmentcalculator2;



public class NavDrawerItem {
    private String mTitle;
    private int mIcon;



    public NavDrawerItem(String title, int icon){
        this.mTitle = title;
        this.mIcon = icon;
    }

    public String getTitle(){
        return this.mTitle;
    }

    public int getIcon(){
        return this.mIcon;
    }

    public void setTitle(String title){
        this.mTitle = title;
    }

    public void setIcon(int icon){
        this.mIcon = icon;
    }
}