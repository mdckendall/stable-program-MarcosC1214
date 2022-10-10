public class Horse extends Stable {
  String name; 
  Double weight;
  Boolean tame;
  
  public Horse (String name, Double weight, Boolean tame){
    this.name = name;
    this.weight = weight;
    this.tame = tame;
  }

   public String getName() {
    return name;
  }

   public Double getDouble() {
     return weight;
   }

    public Boolean getValid() {
     return tame;
   }
  
}