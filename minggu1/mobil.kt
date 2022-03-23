class Mobil {
    var warna = ""
    var tahunProduksi = 0
    var startup = ""
    var off = ""
    var gear = 0
}
fun main(args : Array<String>) {
    val mobilku = Mobil()
    mobilku.warna = "Merah"
    mobilku.tahunProduksi = 2006
    mobilku.off = "Mobil Mati"
    println("Warna : "+mobilku.warna)
    println("Tahun Produksi : "+mobilku.tahunProduksi)

    val mobil2 = Mobil()
    mobil2.startup = "Mobil Menyala"
    mobil2.off = "Mobil Mati"
    mobil2.gear = 0
    println("On : "+mobil2.startup)
    println("Off : "+mobil2.off)
    println("Gear : "+mobil2.gear + 1)
}
