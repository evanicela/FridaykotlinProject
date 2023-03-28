//1.

fun main() {
    val list1: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val list2: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 9)

    val sum = list1.sum() + list2.sum()
    println("The sum is $sum")


    // 2.list of integers and returns the sum

    val list3: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val mysum = list3.sum()
    println("The sum is $mysum")


//5 removing duplicate


    val list = listOf("level", "sept", "level")

    val removing = list.toSet().toList();

    println(removing)


    // 3. Palindrome

    print("Enter a string : ")
    val string = readln()

    if (string == string.reversed()) {
        print("$string is palindrome.")
    } else {
        print("$string is not palindrome.")
    }


}






