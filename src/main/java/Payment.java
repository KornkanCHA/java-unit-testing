class Payment {
  double getTotal(double price) {

      if (price >= 100) {
          return price * 0.95;
      }
      
      return price;
  }
  
  // Another method in processing payment
  
}