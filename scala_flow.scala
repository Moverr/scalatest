for(num:Int <- List(1,2,3)){
    println("Hello "+num)
}

println("\nWapiiiii \n ")
for(num:Int <- Array.range(1,5)){
    println("Hello "+num)
}



println("\nEven Number \n ")
for(num:Int <- Array.range(0,20)){
  if(num % 2  == 0 ){
      var label:String = s"${num} is an Even Number "
      println(label);
  }
}


