fun main() {

    var hargaBayar: Int
    var hargaKembali: Int
    var byr: Int
    var inp: Int
    var repeat = "Y"
    while (repeat.equals("Y") || repeat.equals("y")) {
        println("===============")
        println("Menu Kasir")
        println("===============")
        println("1. Paket 1 (Rawon + Jus Jeruk)")
        println("2. Paket 2 (Ayam Geprek + Jus Tomat)")
        println("3. Paket 3 (Nasi Goreng + Es Teh)")
        println("================")
        print("Pilih Menu: ")
        val choice = readLine()!!.toInt()

        when (choice) {
            1 -> {
                println("\n Total bayar Paket 1")

                val hargaRawon = HargaMenu()
                println("Harga Spesial Jumbo:  ${hargaRawon.hrgRawon}")
                println("Jus Jeruk: ${hargaRawon.jusJeruk}")
                print("Pesan jus Jeruk(isi dengan angka): ")
                inp = readLine()?.toIntOrNull() ?: 0
                if (inp == 0) {
                    hargaBayar = hargaRawon.hargaRawon(inp)
                    println("\n\nTotal harga yang dibayarkan: Rp. $hargaBayar")
                    print("Dibayar Rp. ")
                    byr = readLine()?.toIntOrNull() ?: 0
                    if (byr == 0) {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    } else {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    }

                } else {
                    hargaBayar = hargaRawon.hargaRawon(inp)
                    println("\n\nTotal harga yang dibayarkan: Rp. $hargaBayar")
                    print("Dibayar Rp. ")
                    byr = readLine()?.toIntOrNull() ?: 0
                    if (byr == 0) {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    } else {

                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    }

                }
            }
            2 -> {
                println("\n Total bayar Paket 2")
                println("---------------------------")
                val harga = HargaMenu()
                println("Harga Spesial Jumbo:  ${harga.hrgAyamGeprek}")
                println("Jus Tomat: ${harga.jusTomat}")
                print("Pesan jus tomat(isi dengan angka): ")
                inp = readLine()?.toIntOrNull() ?: 0
                if (inp == 0) {
                    hargaBayar = harga.hargaAyamGeprek(inp)
                    println("\n\nTotal harga yang dibayarkan: Rp. $hargaBayar")
                    print("Dibayar Rp. ")
                    byr = readLine()?.toIntOrNull() ?: 0
                    if (byr == 0) {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    } else {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    }

                } else {
                    hargaBayar = harga.hargaAyamGeprek(inp)
                    println("\n\nTotal harga yang dibayarkan: Rp. $hargaBayar")
                    print("Dibayar Rp. ")
                    byr = readLine()?.toIntOrNull() ?: 0
                    if (byr == 0) {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    } else {

                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    }

                }
            }
            3 -> {
                println("\n Total bayar Paket 3")
                println("---------------------------")
                val harga = HargaMenu()
                println("Harga Spesial Jumbo:  ${harga.hrgNasiGoreng}")
                println("Es Teh: ${harga.EsTeh}")
                print("Pesan Es Teh(isi dengan angka): ")
                inp = readLine()?.toIntOrNull() ?: 0
                if (inp == 0) {
                    hargaBayar = harga.hargaNasiGoreng(inp)
                    println("\n\nTotal harga yang dibayarkan: Rp. $hargaBayar")
                    print("Dibayar Rp. ")
                    byr = readLine()?.toIntOrNull() ?: 0
                    if (byr == 0) {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    } else {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    }

                } else {
                    hargaBayar = harga.hargaNasiGoreng(inp)
                    println("\n\nTotal harga yang dibayarkan: Rp. $hargaBayar")
                    print("Dibayar Rp. ")
                    byr = readLine()?.toIntOrNull() ?: 0
                    if (byr == 0) {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    } else {

                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    }

                }
            }
            else -> println("Pilihan salah")

        }

        print("Transaksi selanjutnya? (Y/T)")
        repeat = readLine()!!.toString()
    }
}
class HargaMenu() {
    val hrgRawon: Int = 25000
    val jusJeruk: Int = 8000

    val hrgAyamGeprek: Int = 15000
    val jusTomat: Int = 7000

    val hrgNasiGoreng: Int = 12000
    val EsTeh: Int = 5000

    fun hargaRawon(jmlPesananJeruk: Int): Int {
        val totalHrgJusJeruk: Int
        if (jmlPesananJeruk == 0) {
            totalHrgJusJeruk = hrgRawon + (jusJeruk * 1)
        } else {
            totalHrgJusJeruk = hrgRawon + (jusJeruk * jmlPesananJeruk)
        }
        return totalHrgJusJeruk
    }

    fun hargaAyamGeprek(jmlPesananTomat: Int): Int {
        val totalHrgJusTomat: Int
        if (jmlPesananTomat == 0) {
            totalHrgJusTomat = hrgAyamGeprek + (jusTomat * 1)
        } else {
            totalHrgJusTomat = hrgAyamGeprek + (jusTomat * jmlPesananTomat)
        }
        return totalHrgJusTomat
    }

    fun hargaNasiGoreng(jmlPesananGoreng: Int): Int {
        val totalEsTeh: Int
        if (jmlPesananGoreng == 0) {
            totalEsTeh= hrgNasiGoreng + (EsTeh * 1)
        } else {
            totalEsTeh = hrgNasiGoreng + (EsTeh * jmlPesananGoreng)
        }
        return totalEsTeh
    }
}