//First practice: Direct insertion
/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    var unord_array = arrayOf(1, 7, 9, 11, 17, 23, 4, 5, -1, -23);
    println("******** Before Sorting *******");
    for(index in unord_array.indices)
     print("${unord_array[index]} ");
    println("\n******** After Sorting *******");
    var ord_array = ascSort(unord_array);
    for(index in unord_array.indices)
     print("${ord_array[index]} ");   
}

fun ascSort(array:Array<Int>):Array<Int> {
    var index:Int = 1;
    var inner_index:Int;
    var aux:Int;
    val array_size = array.size;
    
    while(index <= array_size - 1) {
        if(array[index] < array[index - 1])
        {
            aux = array[index];
            inner_index = index;
         	while(inner_index >= 1 && array[inner_index] < array[inner_index - 1]) {
                array[inner_index] = array[inner_index - 1];
                array[inner_index - 1] = aux; 
                inner_index --;
            }
        }
        index ++;
    }
    
    return array;
}