def add(num1:Int,num2:Int):Double = {
   
    return  (num1 +num2); 
     
} 

def isPrime(numCheck:Int): Boolean ={

    for(n <- Range(2,numCheck)){
        if(numCheck % n == 0 ){
            return false;
        }
    }
    return true;
}

 val numbers = List(1,2,3,7,8,1,2,3,3,4,7,34,5,6,7)
 def removeDuplicates(nums:List[Int]): Set[Int]={
     return nums.toSet;
 }

 removeDuplicates(numbers);