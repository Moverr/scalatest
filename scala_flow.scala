for(num:Int <- List(1,2,3)){
    println("Hello "+num)
}

println("\nWapiiiii \n ")
for(num:Int <- Array.range(1,5)){
    println("Hello "+num)
}



println("\nEven Number \n ")
for(num:Int <- Array.range(0,20)){
    var label:String = "";
  if(num % 2  == 0 ){
        label = s"${num} is an Even Number " ;
  }else{
    label = s"${num} is an Odd Number " ;
  }
  println(label);
}


