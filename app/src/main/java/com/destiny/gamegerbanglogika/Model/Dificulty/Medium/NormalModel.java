package com.destiny.gamegerbanglogika.Model.Dificulty.Medium;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class NormalModel
{
    public static String[][] data = new String[][]{
            //OR
            {"1",
                    String.valueOf(R.drawable.normal_1_2_or_mati),
                    String.valueOf(R.drawable.normal_1_2_or_nyala),
                    "XOR",
                    "XNOR",
                    "NAND",
                    "XNOR"
            },
            {"2",
                    String.valueOf(R.drawable.normal_1_2_or_mati),
                    String.valueOf(R.drawable.normal_1_2_or_nyala),
                    "AND",
                    "XOR",
                    "NAND",
                    "AND"
            },
            {"3",
                    String.valueOf(R.drawable.normal_3_or_mati),
                    String.valueOf(R.drawable.normal_3_or_nyala),
                    "NAND",
                    "NOR",
                    "AND",
                    "AND"
            },
            {"4",
                    String.valueOf(R.drawable.normal_4_or_mati),
                    String.valueOf(R.drawable.normal_4_or_nyala),
                    "NAND",
                    "NOR",
                    "AND",
                    "NAND"
            },
            {"5",
                    String.valueOf(R.drawable.normal_5_or_mati),
                    String.valueOf(R.drawable.normal_5_or_nyala),
                    "XNOR",
                    "AND",
                    "OR",
                    "OR"
            },
            {"6",
                    String.valueOf(R.drawable.normal_6_or_mati),
                    String.valueOf(R.drawable.normal_6_or_nyala),
                    "XNOR",
                    "AND",
                    "OR",
                    "XNOR"
            },
            //AND
            {"7",
                    String.valueOf(R.drawable.normal_1_and_mati),
                    String.valueOf(R.drawable.normal_1_and_nyala),
                    "NAND",
                    "XNOR",
                    "AND",
                    "NAND"
            },
            {"8",
                    String.valueOf(R.drawable.normal_2_and_mati),
                    String.valueOf(R.drawable.normal_2_and_nyala),
                    "NAND",
                    "XNOR",
                    "AND",
                    "NAND"
            },
            {"9",
                    String.valueOf(R.drawable.normal_3_and_mati),
                    String.valueOf(R.drawable.normal_3_and_nyala),
                    "XNOR",
                    "NOR",
                    "OR",
                    "OR"
            },
            {"10",
                    String.valueOf(R.drawable.normal_4_and_mati),
                    String.valueOf(R.drawable.normal_4_and_nyala),
                    "XNOR",
                    "XOR",
                    "OR",
                    "XNOR"
            },
            {"11",
                    String.valueOf(R.drawable.normal_5_and_mati),
                    String.valueOf(R.drawable.normal_5_and_nyala),
                    "NOR",
                    "XOR",
                    "OR",
                    "NOR"
            },
            {"12",
                    String.valueOf(R.drawable.normal_6_and_mati),
                    String.valueOf(R.drawable.normal_6_and_nyala),
                    "XOR",
                    "NAND",
                    "OR",
                    "NAND"
            },
            //NAND
            {"13",
                    String.valueOf(R.drawable.normal_1_2_nand_mati),
                    String.valueOf(R.drawable.normal_1_2_nand_nyala),
                    "NAND",
                    "OR",
                    "XOR",
                    "XOR"
            },
            {"14",
                    String.valueOf(R.drawable.normal_1_2_nand_mati),
                    String.valueOf(R.drawable.normal_1_2_nand_nyala),
                    "XOR",
                    "NOR",
                    "AND",
                    "AND"
            },
            {"15",
                    String.valueOf(R.drawable.normal_3_nand_mati),
                    String.valueOf(R.drawable.normal_3_nand_nyala),
                    "XOR",
                    "NAND",
                    "OR",
                    "OR"
            },
            {"16",
                    String.valueOf(R.drawable.normal_4_nand_mati),
                    String.valueOf(R.drawable.normal_4_nand_nyala),
                    "XOR",
                    "NOR",
                    "XNOR",
                    "XOR"
            },
            {"17",
                    String.valueOf(R.drawable.normal_5_6_nand_mati),
                    String.valueOf(R.drawable.normal_5_6_nand_nyala),
                    "XOR",
                    "NOR",
                    "XNOR",
                    "XNOR"
            },
            {"18",
                    String.valueOf(R.drawable.normal_5_6_nand_mati),
                    String.valueOf(R.drawable.normal_5_6_nand_nyala),
                    "XOR",
                    "AND",
                    "NAND",
                    "AND"
            },
            //NOR
            {"19",
                    String.valueOf(R.drawable.normal_1_2_nor_mati),
                    String.valueOf(R.drawable.normal_1_2_nor_nyala),
                    "XOR",
                    "AND",
                    "NAND",
                    "AND"
            },
            {"20",
                    String.valueOf(R.drawable.normal_1_2_nor_mati),
                    String.valueOf(R.drawable.normal_1_2_nor_nyala),
                    "NAND",
                    "OR",
                    "XNOR",
                    "XNOR"
            },
            {"21",
                    String.valueOf(R.drawable.normal_3_nor_mati),
                    String.valueOf(R.drawable.normal_3_nor_nyala),
                    "NOR",
                    "XOR",
                    "OR",
                    "NOR"
            },
            {"22",
                    String.valueOf(R.drawable.normal_4_nor_mati),
                    String.valueOf(R.drawable.normal_4_nor_nyala),
                    "NAND",
                    "OR",
                    "XOR",
                    "NAND"
            },
            {"23",
                    String.valueOf(R.drawable.normal_5_nor_mati),
                    String.valueOf(R.drawable.normal_5_nor_nyala),
                    "NOR",
                    "XNOR",
                    "OR",
                    "OR"
            },
            {"24",
                    String.valueOf(R.drawable.normal_6_nor_mati),
                    String.valueOf(R.drawable.normal_6_nor_nyala),
                    "NOR",
                    "XNOR",
                    "OR",
                    "OR"
            },
            //XOR
            {"25",
                    String.valueOf(R.drawable.normal_1_2_xor_mati),
                    String.valueOf(R.drawable.normal_1_2_xor_nyala),
                    "XOR",
                    "XNOR",
                    "NOR",
                    "XNOR"
            },
            {"26",
                    String.valueOf(R.drawable.normal_1_2_xor_mati),
                    String.valueOf(R.drawable.normal_1_2_xor_nyala),
                    "NOR",
                    "NAND",
                    "OR",
                    "OR"
            },
            {"27",
                    String.valueOf(R.drawable.normal_3_xor_mati),
                    String.valueOf(R.drawable.normal_3_xor_nyala),
                    "NOR",
                    "NAND",
                    "OR",
                    "OR"
            },
            {"28",
                    String.valueOf(R.drawable.normal_4_xor_mati),
                    String.valueOf(R.drawable.normal_4_xor_nyala),
                    "NAND",
                    "XNOR",
                    "NOR",
                    "NAND"
            },
            {"29",
                    String.valueOf(R.drawable.normal_5_xor_mati),
                    String.valueOf(R.drawable.normal_5_xor_nyala),
                    "XNOR",
                    "AND",
                    "OR",
                    "OR"
            },
            {"30",
                    String.valueOf(R.drawable.normal_6_xor_mati),
                    String.valueOf(R.drawable.normal_6_xor_nyala),
                    "AND",
                    "NOR",
                    "XOR",
                    "AND"
            },
            //XNOR
            {"31",
                    String.valueOf(R.drawable.normal_1_xnor_mati),
                    String.valueOf(R.drawable.normal_1_xnor_nyala),
                    "NOR",
                    "XNOR",
                    "XOR",
                    "XNOR"
            },
            {"32",
                    String.valueOf(R.drawable.normal_2_3_xnor_mati),
                    String.valueOf(R.drawable.normal_2_3_xnor_nyala),
                    "NOR",
                    "AND",
                    "OR",
                    "NOR"
            },
            {"33",
                    String.valueOf(R.drawable.normal_2_3_xnor_mati),
                    String.valueOf(R.drawable.normal_2_3_xnor_nyala),
                    "OR",
                    "AND",
                    "XOR",
                    "XOR"
            },
            {"34",
                    String.valueOf(R.drawable.normal_4_xnor_mati),
                    String.valueOf(R.drawable.normal_4_xnor_nyala),
                    "NOR",
                    "AND",
                    "XOR",
                    "XOR"
            },
            {"35",
                    String.valueOf(R.drawable.normal_5_xnor_mati),
                    String.valueOf(R.drawable.normal_5_xnor_nyala),
                    "OR",
                    "XNOR",
                    "NAND",
                    "NAND"
            },
            {"36",
                    String.valueOf(R.drawable.normal_6_xnor_mati),
                    String.valueOf(R.drawable.normal_6_xnor_nyala),
                    "NAND",
                    "XNOR",
                    "OR",
                    "OR"
            },
    };
    public static ArrayList<DataModel> getListData(){
        DataModel models = null;
        ArrayList<DataModel> list = new ArrayList<>();
        for (String[] aData : data) {
            models = new DataModel();
            models.setNo(aData[0]);
            models.setGambar(aData[1]);
            models.setGambar2(aData[2]);
            models.setJawaban1(aData[3]);
            models.setJawaban2(aData[4]);
            models.setJawaban3(aData[5]);
            models.setJawaban(aData[6]);
            list.add(models);
        }
        return list;
    }
}
