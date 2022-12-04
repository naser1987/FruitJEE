package Model;

public class Fruit {

    public int id;
    public String fruitName, image;
    public float Calories, CaloriesfromFat,
            TotalFat_g, Sodium_mg, Potassium_mg, TotalCarb_g,
            DietaryFiber_g, Sugars_g, Protein_g, VitaminA_DV,
            VitaminC_DV, Calcum_DV, Iron_DV;

    public Fruit(String line) {
        String[] strings = line.split("[|]");
        this.id = Integer.parseInt(strings[0]);
        this.fruitName = strings[1];
        this.image = strings[15];
        this.Calories = Float.parseFloat(strings[2]);
        this.CaloriesfromFat = Float.parseFloat(strings[3]);
        this.TotalFat_g = Float.parseFloat(strings[4]);
        this.Sodium_mg = Float.parseFloat(strings[5]);
        this.Potassium_mg = Float.parseFloat(strings[6]);
        this.TotalCarb_g = Float.parseFloat(strings[7]);
        this.DietaryFiber_g = Float.parseFloat(strings[8]);
        this.Sugars_g = Float.parseFloat(strings[9]);
        this.Protein_g = Float.parseFloat(strings[10]);
        this.VitaminA_DV = Float.parseFloat(strings[11]);
        this.VitaminC_DV = Float.parseFloat(strings[12]);
        this.Calcum_DV = Float.parseFloat(strings[13]);
        this.Iron_DV = Float.parseFloat(strings[14]);;
    }

    @Override
    public String toString() {
        return "Fruit{" + "id=" + id + ", fruitName=" + fruitName + ", image=" + image + ", Calories=" + Calories + ", CaloriesfromFat=" + CaloriesfromFat + ", TotalFat_g=" + TotalFat_g + ", Sodium_mg=" + Sodium_mg + ", Potassium_mg=" + Potassium_mg + ", TotalCarb_g=" + TotalCarb_g + ", DietaryFiber_g=" + DietaryFiber_g + ", Sugars_g=" + Sugars_g + ", Protein_g=" + Protein_g + ", VitaminA_DV=" + VitaminA_DV + ", VitaminC_DV=" + VitaminC_DV + ", Calcum_DV=" + Calcum_DV + ", Iron_DV=" + Iron_DV + '}';
    }

  
    
}
