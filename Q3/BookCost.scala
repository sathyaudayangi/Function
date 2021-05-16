object BookCost extends App{

  def cost(n:Int):Double={
  
   if(n<50){
      var f:Double=((24.95*n)*(60.0/100.0)+3);
      f;
   }
   else{
      var f:Double=(3*50 +(0.75)*(n-50))+(24.95*n)*(60.0/100.0);
      f;
   }

  }

  println(cost(60));

}