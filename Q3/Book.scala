object Book extends App{

  def cost(n:Int):Double={
  
   if(n<50){
      var c:Double=((24.95+3)*n)*(60.0/100.0);
      c;
   }
   else{
      var c:Double=((24.95+3)*50 +(24.95+0.75)*(n-50))*(60.0/100.0);
      c;
   }

  }

  println(cost(60));

}
