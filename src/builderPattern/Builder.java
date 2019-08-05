package builderPattern;

public class Builder {
	

    public static void main(String[] args) 
    { 
        HouseBuilder iglooBuilder = new IHousebuilder(); 
        CivilEngineer engineer = new CivilEngineer(iglooBuilder); 
  
        engineer.constructHouse(); 
  
        House house = engineer.getHouse(); 
  
        System.out.println("Builder constructed: "+ house); 
    }

}
