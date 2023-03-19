public  abstract class House {

  public String streetname;

  private int etage;
  private int housnamber;

  private String lastname;

  public House(String streetname, int etage, int housnamber,String lastname){
    this.streetname =  streetname;
    this.etage = etage;
    this.housnamber = housnamber;
    this.lastname = lastname;

  }

  public String getStreetname() {
    return streetname;
  }

  public void setStreetname(String streetname) {
    this.streetname = streetname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public int getHousnamber() {
    return housnamber;
  }

  public void setHousnamber(int housnamber) {
    this.housnamber = housnamber;
  }

  public int getEtage() {
    return etage;
  }

  public void setEtage(int etage) {
    this.etage = etage;
  }

  @Override
  public String toString() {
    return String.format();
  }

}
