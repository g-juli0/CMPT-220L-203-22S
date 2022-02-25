package base;

/** 
 * Plant practice class
 * @author Gianna Julio
*/
public class Plant {
    
    boolean needsWatering;
    String plantFamily;
    String name;

    /**
     * Constructor method
     * @param needsWatering - boolean indicating if Plant object needs to be watered
     * @param plantFamily - family Plant object belongs to
     * @param name - name of Plant type
     */
    Plant(boolean needsWatering, String plantFamily, String name) {
        needsWatering = this.needsWatering;
        plantFamily = this.plantFamily;
        name = this.name;
    }

    /**
     * prints watering instructions
     * @return String detailing instructions for watering
     */
    public String wateringInstructions() {
        return "Water when soil appears to be dry.";
    }

    /**
     * prints sunlight requirements of Plant
     * @return String detailing requirements for sunlight
     */
    public String sunlightRequirements() {
        return "Leave plant in indirect sunlight.";
    }
}
