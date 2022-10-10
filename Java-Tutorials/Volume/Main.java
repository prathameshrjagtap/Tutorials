class Main {
  public static void main(String[] args) {
    int cansPerPack = 6;
    // Litres in a 12 ounce can
    final double CAN_VOLUME = 0.355;
    double totalVolume = cansPerPack * CAN_VOLUME;

    System.out.println("A six pack of 12 ounce can contains: "+ totalVolume +" litres.");

    final double BOTTLE_VOLUME = 2;

    totalVolume = totalVolume + BOTTLE_VOLUME;
    
    System.out.println("A six pack of 2 litre bottle contains: "+ totalVolume +" liters.");
  }  
}
  
