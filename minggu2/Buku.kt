class Buku (var judul : String, var pengarang : String, var penerbit : String,var tahun : String){

}

fun main(args : Array<String>) {
    val BukuDemo = Buku("Dasar Pemrograman Java","Abdul Kadir","Andi Offset","2004")
    val BukuDemo2 = Buku ("Pemrograman Berorientasi Objek dengan Java","Indrajani","Elexmedia Komputindo","2007" )
    println("Judul : "+BukuDemo.judul)
    println("Pengarang : "+BukuDemo.pengarang)
    println("Penerbit : "+BukuDemo.penerbit)
    println("Tahun : "+BukuDemo.tahun)
    println()
    println("Judul : "+BukuDemo2.judul)
    println("Pengarang : "+BukuDemo2.pengarang)
    println("Penerbit : "+BukuDemo2.penerbit)
    println("Tahun : "+BukuDemo2.tahun)
}
