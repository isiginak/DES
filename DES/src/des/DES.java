/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package des;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class DES {

    public static String decimalToHex(int decimal) {
        String hex = "";

        while (decimal != 0) {
            int hexValue = decimal % 16;
            hex = toHexChar(hexValue) + hex;
            decimal = decimal / 16;
        }

        return hex;
    }

    public static char toHexChar(int hexValue) {
        if (hexValue <= 9 && hexValue >= 0) {
            return (char) (hexValue + '0');
        } else // hexValue <= 15 && hexValue >= 10
        {
            return (char) (hexValue - 10 + 'A');
        }
    }

    private static String hexToBin(String hex) {
        String bin = "";
        String binFragment = "";
        int iHex;
        hex = hex.trim();
        hex = hex.replaceFirst("0x", "");

        for (int i = 0; i < hex.length(); i++) {
            iHex = Integer.parseInt("" + hex.charAt(i), 16);
            binFragment = Integer.toBinaryString(iHex);

            while (binFragment.length() < 4) {
                binFragment = "0" + binFragment;
            }
            bin += binFragment;
        }
        return bin;
    }
    static int i, j;

    public static String permutasyon(String sifre) {
        String pwd = "", d;
        String matris[][] = new String[8][8];
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {

                if (i == 0 && j == 0) {
                    d = Character.toString(sifre.charAt(57));
                    matris[i][j] = d;
                } else if (i == 0 && j == 1) {
                    matris[i][j] = Character.toString(sifre.charAt(49));

                } else if (i == 0 && j == 2) {
                    matris[i][j] = Character.toString(sifre.charAt(41));

                } else if (i == 0 && j == 3) {
                    matris[i][j] = Character.toString(sifre.charAt(33));

                } else if (i == 0 && j == 4) {
                    matris[i][j] = Character.toString(sifre.charAt(25));

                } else if (i == 0 && j == 5) {
                    matris[i][j] = Character.toString(sifre.charAt(17));

                } else if (i == 0 && j == 6) {
                    matris[i][j] = Character.toString(sifre.charAt(9));

                } else if (i == 0 && j == 7) {
                    matris[i][j] = Character.toString(sifre.charAt(1));

                } else if (i == 1 && j == 0) {
                    matris[i][j] = Character.toString(sifre.charAt(59));

                } else if (i == 1 && j == 1) {
                    matris[i][j] = Character.toString(sifre.charAt(51));

                } else if (i == 1 && j == 2) {
                    matris[i][j] = Character.toString(sifre.charAt(43));

                } else if (i == 1 && j == 3) {
                    matris[i][j] = Character.toString(sifre.charAt(35));

                } else if (i == 1 && j == 4) {
                    matris[i][j] = Character.toString(sifre.charAt(27));

                } else if (i == 1 && j == 5) {
                    matris[i][j] = Character.toString(sifre.charAt(19));

                } else if (i == 1 && j == 6) {
                    matris[i][j] = Character.toString(sifre.charAt(11));

                } else if (i == 1 && j == 7) {
                    matris[i][j] = Character.toString(sifre.charAt(3));

                } else if (i == 2 && j == 0) {
                    matris[i][j] = Character.toString(sifre.charAt(61));

                } else if (i == 2 && j == 1) {
                    matris[i][j] = Character.toString(sifre.charAt(53));

                } else if (i == 2 && j == 2) {
                    matris[i][j] = Character.toString(sifre.charAt(45));

                } else if (i == 2 && j == 3) {
                    matris[i][j] = Character.toString(sifre.charAt(37));

                } else if (i == 2 && j == 4) {
                    matris[i][j] = Character.toString(sifre.charAt(29));

                } else if (i == 2 && j == 5) {
                    matris[i][j] = Character.toString(sifre.charAt(21));

                } else if (i == 2 && j == 6) {
                    matris[i][j] = Character.toString(sifre.charAt(13));

                } else if (i == 2 && j == 7) {
                    matris[i][j] = Character.toString(sifre.charAt(5));

                } else if (i == 3 && j == 0) {
                    matris[i][j] = Character.toString(sifre.charAt(63));

                } else if (i == 3 && j == 1) {
                    matris[i][j] = Character.toString(sifre.charAt(55));

                } else if (i == 3 && j == 2) {
                    matris[i][j] = Character.toString(sifre.charAt(47));

                } else if (i == 3 && j == 3) {
                    matris[i][j] = Character.toString(sifre.charAt(39));

                } else if (i == 3 && j == 4) {
                    matris[i][j] = Character.toString(sifre.charAt(31));

                } else if (i == 3 && j == 5) {
                    matris[i][j] = Character.toString(sifre.charAt(23));

                } else if (i == 3 && j == 6) {
                    matris[i][j] = Character.toString(sifre.charAt(15));

                } else if (i == 3 && j == 7) {
                    matris[i][j] = Character.toString(sifre.charAt(7));

                } else if (i == 4 && j == 0) {
                    matris[i][j] = Character.toString(sifre.charAt(56));

                } else if (i == 4 && j == 1) {
                    matris[i][j] = Character.toString(sifre.charAt(48));

                } else if (i == 4 && j == 2) {
                    matris[i][j] = Character.toString(sifre.charAt(40));

                } else if (i == 4 && j == 3) {
                    matris[i][j] = Character.toString(sifre.charAt(32));

                } else if (i == 4 && j == 4) {
                    matris[i][j] = Character.toString(sifre.charAt(24));

                } else if (i == 4 && j == 5) {
                    matris[i][j] = Character.toString(sifre.charAt(16));

                } else if (i == 4 && j == 6) {
                    matris[i][j] = Character.toString(sifre.charAt(8));

                } else if (i == 4 && j == 7) {
                    matris[i][j] = Character.toString(sifre.charAt(0));

                } else if (i == 5 && j == 0) {
                    matris[i][j] = Character.toString(sifre.charAt(58));

                } else if (i == 5 && j == 1) {
                    matris[i][j] = Character.toString(sifre.charAt(50));

                } else if (i == 5 && j == 2) {
                    matris[i][j] = Character.toString(sifre.charAt(42));

                } else if (i == 5 && j == 3) {
                    matris[i][j] = Character.toString(sifre.charAt(34));

                } else if (i == 5 && j == 4) {
                    matris[i][j] = Character.toString(sifre.charAt(26));

                } else if (i == 5 && j == 5) {
                    matris[i][j] = Character.toString(sifre.charAt(18));

                } else if (i == 5 && j == 6) {
                    matris[i][j] = Character.toString(sifre.charAt(10));

                } else if (i == 5 && j == 7) {
                    matris[i][j] = Character.toString(sifre.charAt(2));

                } else if (i == 6 && j == 0) {
                    matris[i][j] = Character.toString(sifre.charAt(60));

                } else if (i == 6 && j == 1) {
                    matris[i][j] = Character.toString(sifre.charAt(52));

                } else if (i == 6 && j == 2) {
                    matris[i][j] = Character.toString(sifre.charAt(44));

                } else if (i == 6 && j == 3) {
                    matris[i][j] = Character.toString(sifre.charAt(36));

                } else if (i == 6 && j == 4) {
                    matris[i][j] = Character.toString(sifre.charAt(28));

                } else if (i == 6 && j == 5) {
                    matris[i][j] = Character.toString(sifre.charAt(20));

                } else if (i == 6 && j == 6) {
                    matris[i][j] = Character.toString(sifre.charAt(12));

                } else if (i == 6 && j == 7) {
                    matris[i][j] = Character.toString(sifre.charAt(4));

                } else if (i == 7 && j == 0) {
                    matris[i][j] = Character.toString(sifre.charAt(62));

                } else if (i == 7 && j == 1) {
                    matris[i][j] = Character.toString(sifre.charAt(54));

                } else if (i == 7 && j == 2) {
                    matris[i][j] = Character.toString(sifre.charAt(46));

                } else if (i == 7 && j == 3) {
                    matris[i][j] = Character.toString(sifre.charAt(38));

                } else if (i == 7 && j == 4) {
                    matris[i][j] = Character.toString(sifre.charAt(30));

                } else if (i == 7 && j == 5) {
                    matris[i][j] = Character.toString(sifre.charAt(22));

                } else if (i == 7 && j == 6) {
                    matris[i][j] = Character.toString(sifre.charAt(14));

                } else if (i == 7 && j == 7) {
                    matris[i][j] = Character.toString(sifre.charAt(6));

                }
                pwd = pwd + matris[i][j];
            }
        }

        return pwd;
    }

    public static String TersPermutasyon(String sifre) {
        String pwd = "", d;
        String matris[][] = new String[8][8];
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {

                if (i == 0 && j == 0) {
                    d = Character.toString(sifre.charAt(39));
                    matris[i][j] = d;
                } else if (i == 0 && j == 1) {
                    matris[i][j] = Character.toString(sifre.charAt(7));

                } else if (i == 0 && j == 2) {
                    matris[i][j] = Character.toString(sifre.charAt(47));

                } else if (i == 0 && j == 3) {
                    matris[i][j] = Character.toString(sifre.charAt(15));

                } else if (i == 0 && j == 4) {
                    matris[i][j] = Character.toString(sifre.charAt(55));

                } else if (i == 0 && j == 5) {
                    matris[i][j] = Character.toString(sifre.charAt(23));

                } else if (i == 0 && j == 6) {
                    matris[i][j] = Character.toString(sifre.charAt(63));

                } else if (i == 0 && j == 7) {
                    matris[i][j] = Character.toString(sifre.charAt(31));

                } else if (i == 1 && j == 0) {
                    matris[i][j] = Character.toString(sifre.charAt(38));

                } else if (i == 1 && j == 1) {
                    matris[i][j] = Character.toString(sifre.charAt(6));

                } else if (i == 1 && j == 2) {
                    matris[i][j] = Character.toString(sifre.charAt(46));

                } else if (i == 1 && j == 3) {
                    matris[i][j] = Character.toString(sifre.charAt(14));

                } else if (i == 1 && j == 4) {
                    matris[i][j] = Character.toString(sifre.charAt(54));

                } else if (i == 1 && j == 5) {
                    matris[i][j] = Character.toString(sifre.charAt(22));

                } else if (i == 1 && j == 6) {
                    matris[i][j] = Character.toString(sifre.charAt(62));

                } else if (i == 1 && j == 7) {
                    matris[i][j] = Character.toString(sifre.charAt(30));

                } else if (i == 2 && j == 0) {
                    matris[i][j] = Character.toString(sifre.charAt(37));

                } else if (i == 2 && j == 1) {
                    matris[i][j] = Character.toString(sifre.charAt(5));

                } else if (i == 2 && j == 2) {
                    matris[i][j] = Character.toString(sifre.charAt(45));

                } else if (i == 2 && j == 3) {
                    matris[i][j] = Character.toString(sifre.charAt(13));

                } else if (i == 2 && j == 4) {
                    matris[i][j] = Character.toString(sifre.charAt(53));

                } else if (i == 2 && j == 5) {
                    matris[i][j] = Character.toString(sifre.charAt(21));

                } else if (i == 2 && j == 6) {
                    matris[i][j] = Character.toString(sifre.charAt(61));

                } else if (i == 2 && j == 7) {
                    matris[i][j] = Character.toString(sifre.charAt(29));

                } else if (i == 3 && j == 0) {
                    matris[i][j] = Character.toString(sifre.charAt(36));

                } else if (i == 3 && j == 1) {
                    matris[i][j] = Character.toString(sifre.charAt(4));

                } else if (i == 3 && j == 2) {
                    matris[i][j] = Character.toString(sifre.charAt(44));

                } else if (i == 3 && j == 3) {
                    matris[i][j] = Character.toString(sifre.charAt(12));

                } else if (i == 3 && j == 4) {
                    matris[i][j] = Character.toString(sifre.charAt(52));

                } else if (i == 3 && j == 5) {
                    matris[i][j] = Character.toString(sifre.charAt(20));

                } else if (i == 3 && j == 6) {
                    matris[i][j] = Character.toString(sifre.charAt(60));

                } else if (i == 3 && j == 7) {
                    matris[i][j] = Character.toString(sifre.charAt(28));

                } else if (i == 4 && j == 0) {
                    matris[i][j] = Character.toString(sifre.charAt(35));

                } else if (i == 4 && j == 1) {
                    matris[i][j] = Character.toString(sifre.charAt(3));

                } else if (i == 4 && j == 2) {
                    matris[i][j] = Character.toString(sifre.charAt(43));

                } else if (i == 4 && j == 3) {
                    matris[i][j] = Character.toString(sifre.charAt(11));

                } else if (i == 4 && j == 4) {
                    matris[i][j] = Character.toString(sifre.charAt(51));

                } else if (i == 4 && j == 5) {
                    matris[i][j] = Character.toString(sifre.charAt(19));

                } else if (i == 4 && j == 6) {
                    matris[i][j] = Character.toString(sifre.charAt(59));

                } else if (i == 4 && j == 7) {
                    matris[i][j] = Character.toString(sifre.charAt(27));

                } else if (i == 5 && j == 0) {
                    matris[i][j] = Character.toString(sifre.charAt(34));

                } else if (i == 5 && j == 1) {
                    matris[i][j] = Character.toString(sifre.charAt(2));

                } else if (i == 5 && j == 2) {
                    matris[i][j] = Character.toString(sifre.charAt(42));

                } else if (i == 5 && j == 3) {
                    matris[i][j] = Character.toString(sifre.charAt(10));

                } else if (i == 5 && j == 4) {
                    matris[i][j] = Character.toString(sifre.charAt(50));

                } else if (i == 5 && j == 5) {
                    matris[i][j] = Character.toString(sifre.charAt(18));

                } else if (i == 5 && j == 6) {
                    matris[i][j] = Character.toString(sifre.charAt(58));

                } else if (i == 5 && j == 7) {
                    matris[i][j] = Character.toString(sifre.charAt(26));

                } else if (i == 6 && j == 0) {
                    matris[i][j] = Character.toString(sifre.charAt(33));

                } else if (i == 6 && j == 1) {
                    matris[i][j] = Character.toString(sifre.charAt(1));

                } else if (i == 6 && j == 2) {
                    matris[i][j] = Character.toString(sifre.charAt(41));

                } else if (i == 6 && j == 3) {
                    matris[i][j] = Character.toString(sifre.charAt(9));

                } else if (i == 6 && j == 4) {
                    matris[i][j] = Character.toString(sifre.charAt(49));

                } else if (i == 6 && j == 5) {
                    matris[i][j] = Character.toString(sifre.charAt(17));

                } else if (i == 6 && j == 6) {
                    matris[i][j] = Character.toString(sifre.charAt(57));

                } else if (i == 6 && j == 7) {
                    matris[i][j] = Character.toString(sifre.charAt(25));

                } else if (i == 7 && j == 0) {
                    matris[i][j] = Character.toString(sifre.charAt(32));

                } else if (i == 7 && j == 1) {
                    matris[i][j] = Character.toString(sifre.charAt(0));

                } else if (i == 7 && j == 2) {
                    matris[i][j] = Character.toString(sifre.charAt(40));

                } else if (i == 7 && j == 3) {
                    matris[i][j] = Character.toString(sifre.charAt(8));

                } else if (i == 7 && j == 4) {
                    matris[i][j] = Character.toString(sifre.charAt(48));

                } else if (i == 7 && j == 5) {
                    matris[i][j] = Character.toString(sifre.charAt(16));

                } else if (i == 7 && j == 6) {
                    matris[i][j] = Character.toString(sifre.charAt(56));

                } else if (i == 7 && j == 7) {
                    matris[i][j] = Character.toString(sifre.charAt(24));

                }
                pwd = pwd + matris[i][j];
            }
        }

        return pwd;
    }
    private static final byte[][] S = {{
        14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7,
        0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8,
        4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0,
        15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13
    }, {
        15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10,
        3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5,
        0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15,
        13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9
    }, {
        10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8,
        13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1,
        13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7,
        1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12
    }, {
        7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15,
        13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9,
        10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4,
        3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14
    }, {
        2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9,
        14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6,
        4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14,
        11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3
    }, {
        12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11,
        10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8,
        9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6,
        4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13
    }, {
        4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1,
        13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6,
        1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2,
        6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12
    }, {
        13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7,
        1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2,
        7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8,
        2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11
    }};
    // İzin Verilen SEÇİM 1 tablosu
    private static final byte[] PC1 = {
        57, 49, 41, 33, 25, 17, 9,
        1, 58, 50, 42, 34, 26, 18,
        10, 2, 59, 51, 43, 35, 27,
        19, 11, 3, 60, 52, 44, 36,
        63, 55, 47, 39, 31, 23, 15,
        7, 62, 54, 46, 38, 30, 22,
        14, 6, 61, 53, 45, 37, 29,
        21, 13, 5, 28, 20, 12, 4
    };
    // İzin Verilen Seçim 2 tablosu
    private static final byte[] PC2 = {
        14, 17, 11, 24, 1, 5,
        3, 28, 15, 6, 21, 10,
        23, 19, 12, 4, 26, 8,
        16, 7, 27, 20, 13, 2,
        41, 52, 31, 37, 47, 55,
        30, 40, 51, 45, 33, 48,
        44, 49, 39, 56, 34, 53,
        46, 42, 50, 36, 29, 32
    };
    private static final byte[] rotations = {
        1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1
    };
    /* Her biri 28 bitlik, KS'de (Anahtar Yapı) depolamada kullanılan yuvarlak tuşlar 
        oluşturmak için kullanılır (başka bir deyişle alt anahtarlar)*/
    private static int[] C = new int[28];
    private static int[] D = new int[28];

    /*Şifre çözme işlemi, 16 alt tuşun şifreleme ile aynı işlemde kullanılmasını gerektirir; 
        tek fark, tuşların ters sırayla kullanılmasıdır, yani son tuş ilk önce kullanılır.
        Dolayısıyla, şifreleme sırasında tuşlar ilk oluşturulduğunda bu dizide saklanır. 
        Şifreleme ve şifre çözme programlarını ayırmak istiyoruz diye öncelikle alt anahtarları 
        üretmek, depolamak ve ters sırada kullanmak gerekir.*/
    private static int[][] subkey = new int[16][48];

    public static String rounds(String pwd, String key, boolean isCryption) {
        String sag, sol;
        sol = pwd.substring(0, 32);
        sag = pwd.substring(32, pwd.length());

        String s1, s2 = "", sd3, s4 = "", rAnahtar = "";

        int keyBits[] = new int[64];
        for (int i = 0; i < 16; i++) {
            s1 = Integer.toBinaryString(Integer.parseInt(key.charAt(i) + "", 16));

            while (s1.length() < 4) {
                s1 = "0" + s1;
            }
            s2 += s1;//64 bitlik anahtar s2 de
            for (int j = 0; j < 4; j++) {
                keyBits[(4 * i) + j] = Integer.parseInt(s1.charAt(j) + "");
            }
        }
        int i;

        //  Seçim 1 burada yapılır
        for (i = 0; i < 28; i++) {
            C[i] = keyBits[PC1[i] - 1];
        }
        for (; i < 56; i++) {
            D[i - 28] = keyBits[PC1[i] - 1];
        }
        for (int l = 0; l < 16; l++) {
            String fonk;//64 bit metnin son 32 biti s in içinde
            if (isCryption) {//decryption işlemi 
                fonk = fonksiyon(sag);
                int a[] = new int[48];

                for (int m = 0; m < 48; m++) {
                    a[m] = subkey[15 - l][m];
                    rAnahtar += Integer.toBinaryString(a[m]);

                }
                // System.out.println("decryption anahtar:::"+rAnahtar);

               
            } else {//encryption işlemi
                fonk = fonksiyon(sag);
                rAnahtar = AnahtarYapisi(l, keyBits);//48 bitlik her round için anahtarım
              

                // System.out.println("encryption:"+rAnahtar);
            }

            //xor lama yapılıyor (fonksiyon içi )
            for (int k = 0; k < 48; k++) {
                if ((fonk.charAt(k) == '0') && (rAnahtar.charAt(k) == '0')) {
                    s4 += "0";
                } else if ((fonk.charAt(k) == '1') && (rAnahtar.charAt(k) == '1')) {
                    s4 += "0";
                } else if (fonk.charAt(k) == '1' && rAnahtar.charAt(k) == '0') {
                    s4 += "1";
                } else if (fonk.charAt(k) == '0' && rAnahtar.charAt(k) == '1') {
                    s4 += "1";
                }
            }//buraya kadar xor

           //48 bit 32 bite düşürülür
            String b1, b2, sonuc = "";
            for (int k = 0; k < 8; k++) {
                String row[] = new String[2];
                row[0] = Character.toString(s4.charAt(6 * k));
                row[1] = Character.toString(s4.charAt(6 * k + 5));
                b1 = row[0] + row[1];
                String col[] = new String[4];
                col[0] = Character.toString(s4.charAt(6 * k + 1));
                col[1] = Character.toString(s4.charAt(6 * k + 2));
                col[2] = Character.toString(s4.charAt(6 * k + 3));
                col[3] = Character.toString(s4.charAt(6 * k + 4));
                b2 = col[0] + col[1] + col[2] + col[3];
                int iRow = Integer.parseInt(b1, 2);
                int iColumn = Integer.parseInt(b2, 2);
                int x = S[k][(iRow * 16) + iColumn];
                String str = Integer.toBinaryString(x);
                while (str.length() < 4) {
                    str = "0" + str;
                }
                sonuc += str;//fonksiyondan çıkan 32 bitlik sonuç
            }
            String son = FP(sonuc);//fonk çıkmadan önce 32 bit per matrise yerleştirilir.
            String son2 = "";
            //sag ve sol bitler burada xor'lanır.
            for (int k = 0; k < 32; k++) {
                if ((son.charAt(k) == '0') && (sol.charAt(k) == '0')) {
                    son2 += "0";
                } else if ((son.charAt(k) == '1') && (sol.charAt(k) == '1')) {
                    son2 += "0";
                } else if (son.charAt(k) == '1' && sol.charAt(k) == '0') {
                    son2 += "1";
                } else if (son.charAt(k) == '0' && sol.charAt(k) == '1') {
                    son2 += "1";
                }

            }
            sd3 = son2;
            sol = sag;
            sag = sd3;
            rAnahtar = "";
        }

        return sol + sag;// sag+sol;sol+sag;
    }
    
    //fonksiyondan çıkmadan önceki permütasyonu
    public static String FP(String sif) {

        String pwd1 = "";
        String m[][] = new String[4][8];
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 8; j++) {

                if (i == 0 && j == 0) {
                    String k = Character.toString(sif.charAt(15));
                    m[i][j] = k;

                } else if (i == 0 && j == 1) {
                    m[i][j] = Character.toString(sif.charAt(6));

                } else if (i == 0 && j == 2) {
                    m[i][j] = Character.toString(sif.charAt(19));

                } else if (i == 0 && j == 3) {
                    m[i][j] = Character.toString(sif.charAt(20));

                } else if (i == 0 && j == 4) {
                    m[i][j] = Character.toString(sif.charAt(28));

                } else if (i == 0 && j == 5) {
                    m[i][j] = Character.toString(sif.charAt(11));

                } else if (i == 0 && j == 6) {
                    m[i][j] = Character.toString(sif.charAt(27));

                } else if (i == 0 && j == 7) {
                    m[i][j] = Character.toString(sif.charAt(16));

                } else if (i == 1 && j == 0) {
                    m[i][j] = Character.toString(sif.charAt(0));

                } else if (i == 1 && j == 1) {
                    m[i][j] = Character.toString(sif.charAt(14));

                } else if (i == 1 && j == 2) {
                    m[i][j] = Character.toString(sif.charAt(22));

                } else if (i == 1 && j == 3) {
                    m[i][j] = Character.toString(sif.charAt(25));

                } else if (i == 1 && j == 4) {
                    m[i][j] = Character.toString(sif.charAt(4));

                } else if (i == 1 && j == 5) {
                    m[i][j] = Character.toString(sif.charAt(17));

                } else if (i == 1 && j == 6) {
                    m[i][j] = Character.toString(sif.charAt(30));

                } else if (i == 1 && j == 7) {
                    m[i][j] = Character.toString(sif.charAt(9));

                } else if (i == 2 && j == 0) {
                    m[i][j] = Character.toString(sif.charAt(1));

                } else if (i == 2 && j == 1) {
                    m[i][j] = Character.toString(sif.charAt(7));

                } else if (i == 2 && j == 2) {
                    m[i][j] = Character.toString(sif.charAt(23));

                } else if (i == 2 && j == 3) {
                    m[i][j] = Character.toString(sif.charAt(13));

                } else if (i == 2 && j == 4) {
                    m[i][j] = Character.toString(sif.charAt(31));

                } else if (i == 2 && j == 5) {
                    m[i][j] = Character.toString(sif.charAt(26));

                } else if (i == 2 && j == 6) {
                    m[i][j] = Character.toString(sif.charAt(2));

                } else if (i == 2 && j == 7) {
                    m[i][j] = Character.toString(sif.charAt(8));

                } else if (i == 3 && j == 0) {
                    m[i][j] = Character.toString(sif.charAt(18));

                } else if (i == 3 && j == 1) {
                    m[i][j] = Character.toString(sif.charAt(12));

                } else if (i == 3 && j == 2) {
                    m[i][j] = Character.toString(sif.charAt(29));

                } else if (i == 3 && j == 3) {
                    m[i][j] = Character.toString(sif.charAt(5));

                } else if (i == 3 && j == 4) {
                    m[i][j] = Character.toString(sif.charAt(21));

                } else if (i == 3 && j == 5) {
                    m[i][j] = Character.toString(sif.charAt(10));

                } else if (i == 3 && j == 6) {
                    m[i][j] = Character.toString(sif.charAt(3));

                } else if (i == 3 && j == 7) {
                    m[i][j] = Character.toString(sif.charAt(24));

                }
                pwd1 = pwd1 + m[i][j];
            }

        }
        return pwd1;
    }

    private static String AnahtarYapisi(int round, int[] key) {
        //  C ve D'nin yeni değerleri.
        int C1[] = new int[28];
        int D1[] = new int[28];
        String deger = "";
        //  kaç döndürme yapılacağını ayarlamak için kullanılır
        int rotationTimes = (int) rotations[round];
        
        C1 = kaydir(C, rotationTimes);
        D1 = kaydir(D, rotationTimes);
        // CnDn  C1 ve D1 yarılarını depolar
        int CnDn[] = new int[56];
        System.arraycopy(C1, 0, CnDn, 0, 28);
        System.arraycopy(D1, 0, CnDn, 28, 28);
        // Kn, alt anahtarı depolar CnDn'ye
        int Kn[] = new int[48];
        for (int i = 0; i < Kn.length; i++) {
            Kn[i] = CnDn[PC2[i] - 1];
            deger = deger + Integer.toBinaryString(Kn[i]);
        }

        // C1 ve D1'i sırasıyla C ve D olarak depolarız
        subkey[round] = Kn;
        C = C1;
        D = D1;
        return deger;
    }

    private static int[] kaydir(int[] bits, int n) {
//Burada sola kaydırma gerçekleşir, yani her bit sola, en soldaki bit en sağdaki bitte saklanır. 
        int cvp[] = new int[bits.length];
        System.arraycopy(bits, 0, cvp, 0, bits.length);
        for (int i = 0; i < n; i++) {
            int temp = cvp[0];
            for (int j = 0; j < bits.length - 1; j++) {
                cvp[j] = cvp[j + 1];
            }
            cvp[bits.length - 1] = temp;
        }
        return cvp;
    }
    //genişletme işlemi
    public static String fonksiyon(String sif) {
        String pwd1 = "";
        String m[][] = new String[6][8];
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 8; j++) {

                if (i == 0 && j == 0) {
                    String k = Character.toString(sif.charAt(31));
                    m[i][j] = k;

                } else if (i == 0 && j == 1) {
                    m[i][j] = Character.toString(sif.charAt(0));

                } else if (i == 0 && j == 2) {
                    m[i][j] = Character.toString(sif.charAt(2));

                } else if (i == 0 && j == 3) {
                    m[i][j] = Character.toString(sif.charAt(0));

                } else if (i == 0 && j == 4) {
                    m[i][j] = Character.toString(sif.charAt(1));

                } else if (i == 0 && j == 5) {
                    m[i][j] = Character.toString(sif.charAt(3));

                } else if (i == 0 && j == 6) {
                    m[i][j] = Character.toString(sif.charAt(2));

                } else if (i == 0 && j == 7) {
                    m[i][j] = Character.toString(sif.charAt(5));

                } else if (i == 1 && j == 0) {
                    m[i][j] = Character.toString(sif.charAt(3));

                } else if (i == 1 && j == 1) {
                    m[i][j] = Character.toString(sif.charAt(4));

                } else if (i == 1 && j == 2) {
                    m[i][j] = Character.toString(sif.charAt(4));

                } else if (i == 1 && j == 3) {
                    m[i][j] = Character.toString(sif.charAt(6));

                } else if (i == 1 && j == 4) {
                    m[i][j] = Character.toString(sif.charAt(27));

                } else if (i == 1 && j == 5) {
                    m[i][j] = Character.toString(sif.charAt(29));

                } else if (i == 1 && j == 6) {
                    m[i][j] = Character.toString(sif.charAt(6));

                } else if (i == 1 && j == 7) {
                    m[i][j] = Character.toString(sif.charAt(8));

                } else if (i == 2 && j == 0) {
                    m[i][j] = Character.toString(sif.charAt(8));

                } else if (i == 2 && j == 1) {
                    m[i][j] = Character.toString(sif.charAt(6));

                } else if (i == 2 && j == 2) {
                    m[i][j] = Character.toString(sif.charAt(9));

                } else if (i == 2 && j == 3) {
                    m[i][j] = Character.toString(sif.charAt(7));

                } else if (i == 2 && j == 4) {
                    m[i][j] = Character.toString(sif.charAt(21));

                } else if (i == 2 && j == 5) {
                    m[i][j] = Character.toString(sif.charAt(10));

                } else if (i == 2 && j == 6) {
                    m[i][j] = Character.toString(sif.charAt(10));

                } else if (i == 2 && j == 7) {
                    m[i][j] = Character.toString(sif.charAt(14));

                } else if (i == 3 && j == 0) {
                    m[i][j] = Character.toString(sif.charAt(28));

                } else if (i == 3 && j == 1) {
                    m[i][j] = Character.toString(sif.charAt(11));

                } else if (i == 3 && j == 2) {
                    m[i][j] = Character.toString(sif.charAt(13));

                } else if (i == 3 && j == 3) {
                    m[i][j] = Character.toString(sif.charAt(16));

                } else if (i == 3 && j == 4) {
                    m[i][j] = Character.toString(sif.charAt(14));

                } else if (i == 3 && j == 5) {
                    m[i][j] = Character.toString(sif.charAt(15));

                } else if (i == 3 && j == 6) {
                    m[i][j] = Character.toString(sif.charAt(11));

                } else if (i == 3 && j == 7) {
                    m[i][j] = Character.toString(sif.charAt(17));

                } else if (i == 4 && j == 0) {
                    m[i][j] = Character.toString(sif.charAt(12));

                } else if (i == 4 && j == 1) {
                    m[i][j] = Character.toString(sif.charAt(22));

                } else if (i == 4 && j == 2) {
                    m[i][j] = Character.toString(sif.charAt(18));

                } else if (i == 4 && j == 3) {
                    m[i][j] = Character.toString(sif.charAt(20));

                } else if (i == 4 && j == 4) {
                    m[i][j] = Character.toString(sif.charAt(14));

                } else if (i == 4 && j == 5) {
                    m[i][j] = Character.toString(sif.charAt(16));

                } else if (i == 4 && j == 6) {
                    m[i][j] = Character.toString(sif.charAt(13));

                } else if (i == 4 && j == 7) {
                    m[i][j] = Character.toString(sif.charAt(17));

                } else if (i == 5 && j == 0) {
                    m[i][j] = Character.toString(sif.charAt(30));

                } else if (i == 5 && j == 1) {
                    m[i][j] = Character.toString(sif.charAt(19));

                } else if (i == 5 && j == 2) {
                    m[i][j] = Character.toString(sif.charAt(20));

                } else if (i == 5 && j == 3) {
                    m[i][j] = Character.toString(sif.charAt(19));

                } else if (i == 5 && j == 4) {
                    m[i][j] = Character.toString(sif.charAt(23));

                } else if (i == 5 && j == 5) {
                    m[i][j] = Character.toString(sif.charAt(24));

                } else if (i == 5 && j == 6) {
                    m[i][j] = Character.toString(sif.charAt(25));

                } else if (i == 5 && j == 7) {
                    m[i][j] = Character.toString(sif.charAt(26));

                }
                pwd1 = pwd1 + m[i][j];
            }
        }
        return pwd1;
    }

    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);

        System.out.println("sifrelenecek texti giriniz:");
        String text/* ="ikbal siginak ladldlefelf"*/, sd = "", s = "", s1 = "";
        text = kl.nextLine();
        while ((text.length() % 8) != 0) {
            text += " ";

        }
        int sub1 = 0, sub2 = 8;
        String ilkadim = "";
//String matris[][]=new String[4][4];
        System.out.println("16 hex şifre gir:");

        String ky = kl.nextLine();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                while (sub1 < sub2) {
                    if (sub2 <= text.length()) {
                        ilkadim = text.substring(sub1, sub2);

                    } else {
                        ilkadim = text.substring(sub1, text.length());
                        break;
                    }

                    sub1 += 8;
                    sub2 += 8;

                    for (int k = 0; k < ilkadim.length(); k++) {
                        char car = ilkadim.charAt(k);
                        int a = (int) car;
                        s = decimalToHex(a);
                        s1 = hexToBin(s);

                        sd = sd + s1;

                    }
                     //encryption0
                    System.out.println("ana metin=>" + sd);
                    String h = permutasyon(sd);
                    String y = rounds(h, ky, false);
                    String y1 = TersPermutasyon(y);
                    System.out.println("sifreli metin= " + y1);
                    sd = "";
                     //decryption
                    String sifreli = permutasyon(y1);
                    String sifreliM = rounds(sifreli, ky, true);
                    String sm = TersPermutasyon(sifreliM);
                    System.out.println("sifresiz metin:" + sm);
                    int a = 0, b = 8;
                    String ilk = "", mtn;
                    while (a < b) {

                        if (b <= sm.length()) {
                            ilk = sm.substring(a, b);
                            int foo = Integer.parseInt(ilk, 2);
                            mtn = Character.toString((char) foo);
                            System.out.print(mtn);
                            System.out.println(" ");
                        }
                        a += 8;
                        b += 8;
                    }

                }

                break;
            }
        }

    }

}
