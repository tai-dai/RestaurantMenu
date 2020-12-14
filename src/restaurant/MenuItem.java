package restaurant;

import java.time.LocalDate;

public class MenuItem {

    //fields
    private String name;
    private Double price;
    private String description;
    private String category;
    private static LocalDate dateAdded;
    private Boolean isNew;

    //constructor
    public MenuItem(String name, Double price, String description, String category, LocalDate dateAdded) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
        this.isNew = true;
    }

    //getters and setters
    public String getName() { return name; }
    public Double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() { return category; }
    public LocalDate getDateAdded() { return dateAdded; }
    public Boolean getNew() { return isNew; }

    public void setName(String name) { this.name = name; }
    public void setPrice(Double price) { this.price = price; }
    public void setDescription(String description) { this.description = description; }
    public void setCategory(String category) { this.category = category; }
    public void setDateAdded(LocalDate dateAdded) { this.dateAdded = dateAdded; }
    public void setNew(Boolean isNew) { this.isNew = isNew; }
}



