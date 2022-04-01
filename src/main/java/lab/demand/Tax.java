package lab.demand;

public class Tax {


    double p_tax = 0.18;
    double br_tax = 0.12;
    double cl_tax = 0.0;

    public double calculateTax(String country) {
        if (country.equals("PE")) {
            return p_tax;
        } else if (country.equals("BR")) {
            return br_tax;
        } else {
            return cl_tax;
        }
    }

    public void setP_tax(double _p_tax){p_tax = _p_tax;}
    public void setBr_tax(double _br_tax){br_tax = _br_tax;}
    public void setCl_tax(double _cl_tax){cl_tax = _cl_tax;}


    public double getP_tax(){return p_tax;}
    public double getBr_tax(){return br_tax;}
    public double getCl_tax(){return cl_tax;}



}
