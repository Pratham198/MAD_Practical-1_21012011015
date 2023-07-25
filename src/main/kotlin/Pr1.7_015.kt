var count=0
fun main()
{
    println("Enter the number:")
    var r = readln().toInt()
    var result=fact(r)
    println("factorial of $r=$result")

}
fun fact(r:Int):Int
{
    if(r==0 || r==1 )
    {
        return 1;
    }
    else
    {
        return r*fact(r-1)
    }
}