class Matematika {
    var pertambahan = 0
    var pengurangan = 0
    var perkalian = 0
    var pembagian = 0
}
fun Pertambahan(x: Int,y: Int): Int{
    return(x + y)
}
fun Perkurangan(x: Int,y: Int): Int{
    return(x - y)
}
fun Perkalian(x: Int,y: Int): Int{
    return(x * y)
}
fun Pembagian(x: Int,y: Int): Int{
    return(x / y)
}
fun main() {
    val matematikaDemo = Matematika()
    var resultTambah = Pertambahan(20,20)
    var resultKurang = Perkurangan(10,5)
    var resultKali = Perkalian(10,20)
    var resultBagi = Pembagian(20,2)
    matematikaDemo.pertambahan = resultTambah
    matematikaDemo.pengurangan = resultKurang
    matematikaDemo.perkalian = resultKali
    matematikaDemo.pembagian = resultBagi
    println("Pertambahan : "+resultTambah)
    println("Pengurangan : "+resultKurang)
    println("Perkalian : "+resultKali)
    println("Pembagian : "+resultBagi)
}
