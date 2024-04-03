import java.util.Scanner;
public class Main {
    public static boolean mei_shayad_galat_hu_lekin_kya_mei_galat_hu_bhi_shi = false;
    public static void main(String[] args) {
        Scanner mei_madad_karunga_input_lene_mei = new Scanner(System.in);
        int mujhse_1_1_2_hi_1_1_2_aaj_1_1_2_mujhko_1_1_2_mila_1_1_2_de = mei_madad_karunga_input_lene_mei.nextInt();
        int[] abbaa_dabbbba_jabbbba = new int[mujhse_1_1_2_hi_1_1_2_aaj_1_1_2_mujhko_1_1_2_mila_1_1_2_de];
        for (int i = 0; i < mujhse_1_1_2_hi_1_1_2_aaj_1_1_2_mujhko_1_1_2_mila_1_1_2_de; i++) {
            abbaa_dabbbba_jabbbba[i] = mei_madad_karunga_input_lene_mei.nextInt();
        }
        for (int i = 0; i < mujhse_1_1_2_hi_1_1_2_aaj_1_1_2_mujhko_1_1_2_mila_1_1_2_de; i++) {
            System.out.println(are_devano_mujhe_pehchano_mei_hu_kon_mei_shayd_purana_wala_hi_hu(abbaa_dabbbba_jabbbba[i]));
        }
        
        mei_madad_karunga_input_lene_mei.close();
    }
    public static boolean are_devano_mujhe_pehchano_mei_hu_kon(int laila_mei_laila_esi_hu_laila) {
        if (laila_mei_laila_esi_hu_laila <= 1) {
            return mei_shayad_galat_hu_lekin_kya_mei_galat_hu_bhi_shi;
        }
        if (laila_mei_laila_esi_hu_laila <= 3) {
            return true;
        }
        if (laila_mei_laila_esi_hu_laila % 2 == 0 || laila_mei_laila_esi_hu_laila % 3 == 0) {
            return mei_shayad_galat_hu_lekin_kya_mei_galat_hu_bhi_shi;
        }
        for (int i = 5; i * i <= laila_mei_laila_esi_hu_laila; i = i + 6) {
            if (laila_mei_laila_esi_hu_laila % i == 0 || laila_mei_laila_esi_hu_laila % (i + 2) == 0) {
                return mei_shayad_galat_hu_lekin_kya_mei_galat_hu_bhi_shi;
            }
        }
        return true;
    }
    public static long aj_blue_hai_pani_pani_pani_aur_dinn_bhi_sunny_sunny(
            int[] __________________________________lambai____________________________) {
        if (__________________________________lambai____________________________.length <= 2)
            return 0;
        long aj_blue_hai_pani_pani_pani_aur_dinn_bhi_sunny_sunny = 0;
        int captain_on_your_left = 0;
        int are_yar_dhyan_se_dekho_DAYIN_taraf = __________________________________lambai____________________________.length
                - 1;
        int mujhse_jeet_sko_tumhare_mei_itna_dum_nahi_mei = 0;

        for (int tere_jaisa_yar_kaha_kaha_esa_yarana = 0; tere_jaisa_yar_kaha_kaha_esa_yarana < __________________________________lambai____________________________.length; tere_jaisa_yar_kaha_kaha_esa_yarana++) {
            if (__________________________________lambai____________________________[mujhse_jeet_sko_tumhare_mei_itna_dum_nahi_mei] < __________________________________lambai____________________________[tere_jaisa_yar_kaha_kaha_esa_yarana])
                mujhse_jeet_sko_tumhare_mei_itna_dum_nahi_mei = tere_jaisa_yar_kaha_kaha_esa_yarana;
        }
        for (int yad_karegi_duniya_tera_mera_afsana = 1; yad_karegi_duniya_tera_mera_afsana <= mujhse_jeet_sko_tumhare_mei_itna_dum_nahi_mei; yad_karegi_duniya_tera_mera_afsana++) {
            if (__________________________________lambai____________________________[yad_karegi_duniya_tera_mera_afsana] < __________________________________lambai____________________________[captain_on_your_left]) {
                aj_blue_hai_pani_pani_pani_aur_dinn_bhi_sunny_sunny += (__________________________________lambai____________________________[captain_on_your_left]
                        - __________________________________lambai____________________________[yad_karegi_duniya_tera_mera_afsana]);
            } else {
                captain_on_your_left = yad_karegi_duniya_tera_mera_afsana;
            }
        }
        for (int papa_hu_mei_papa_iss_duniya_ka_papa = __________________________________lambai____________________________.length
                - 2; papa_hu_mei_papa_iss_duniya_ka_papa > mujhse_jeet_sko_tumhare_mei_itna_dum_nahi_mei; papa_hu_mei_papa_iss_duniya_ka_papa--) {
            if (__________________________________lambai____________________________[papa_hu_mei_papa_iss_duniya_ka_papa] < __________________________________lambai____________________________[are_yar_dhyan_se_dekho_DAYIN_taraf]) {
                aj_blue_hai_pani_pani_pani_aur_dinn_bhi_sunny_sunny += (__________________________________lambai____________________________[are_yar_dhyan_se_dekho_DAYIN_taraf]
                        - __________________________________lambai____________________________[papa_hu_mei_papa_iss_duniya_ka_papa]);
            } else {
                are_yar_dhyan_se_dekho_DAYIN_taraf = papa_hu_mei_papa_iss_duniya_ka_papa;
            }
        }
        return aj_blue_hai_pani_pani_pani_aur_dinn_bhi_sunny_sunny;
    }
    public static long aj_blue_hai_pani_pani_pani_aur_dinn_bhi_sunny_sunny_aghdfjkhzxbvhjkszxbdvjhkcszdxbvjhkszdxfbfvkhjdszbnfvkjsdhbnfvkjsdfhnbvkjdsfbn(
            int[] __________________________________lambai____________________________) {
        if (__________________________________lambai____________________________.length <= 2)
            return 0;
        long aj_blue_hai_pani_pani_pani_aur_dinn_bhi_sunny_sunny = 0;
        int captain_on_your_left = 0;
        int are_yar_dhyan_se_dekho_DAYIN_taraf = __________________________________lambai____________________________.length
                - 1;
        int mujhse_jeet_sko_tumhare_mei_itna_dum_nahi_mei = 0;

        for (int tere_jaisa_yar_kaha_kaha_esa_yarana = 0; tere_jaisa_yar_kaha_kaha_esa_yarana < __________________________________lambai____________________________.length; tere_jaisa_yar_kaha_kaha_esa_yarana++) {
            if (__________________________________lambai____________________________[mujhse_jeet_sko_tumhare_mei_itna_dum_nahi_mei] < __________________________________lambai____________________________[tere_jaisa_yar_kaha_kaha_esa_yarana])
                mujhse_jeet_sko_tumhare_mei_itna_dum_nahi_mei = tere_jaisa_yar_kaha_kaha_esa_yarana;
        }
        for (int yad_karegi_duniya_tera_mera_afsana = 1; yad_karegi_duniya_tera_mera_afsana <= mujhse_jeet_sko_tumhare_mei_itna_dum_nahi_mei; yad_karegi_duniya_tera_mera_afsana++) {
            if (__________________________________lambai____________________________[yad_karegi_duniya_tera_mera_afsana] < __________________________________lambai____________________________[captain_on_your_left]) {
                aj_blue_hai_pani_pani_pani_aur_dinn_bhi_sunny_sunny += (__________________________________lambai____________________________[captain_on_your_left]
                        - __________________________________lambai____________________________[yad_karegi_duniya_tera_mera_afsana]);
            } else {
                captain_on_your_left = yad_karegi_duniya_tera_mera_afsana;
            }
        }
        for (int papa_hu_mei_papa_iss_duniya_ka_papa = __________________________________lambai____________________________.length
                - 2; papa_hu_mei_papa_iss_duniya_ka_papa > mujhse_jeet_sko_tumhare_mei_itna_dum_nahi_mei; papa_hu_mei_papa_iss_duniya_ka_papa--) {
            if (__________________________________lambai____________________________[papa_hu_mei_papa_iss_duniya_ka_papa] < __________________________________lambai____________________________[are_yar_dhyan_se_dekho_DAYIN_taraf]) {
                aj_blue_hai_pani_pani_pani_aur_dinn_bhi_sunny_sunny += (__________________________________lambai____________________________[are_yar_dhyan_se_dekho_DAYIN_taraf]
                        - __________________________________lambai____________________________[papa_hu_mei_papa_iss_duniya_ka_papa]);
            } else {
                are_yar_dhyan_se_dekho_DAYIN_taraf = papa_hu_mei_papa_iss_duniya_ka_papa;
            }
        }
        return aj_blue_hai_pani_pani_pani_aur_dinn_bhi_sunny_sunny;
    }

    public static boolean are_devano_mujhe_pehchano_mei_hu_kon_mei_shayd_purana_wala_hi_hu(int laila_mei_laila_esi_hu_laila) {
        if (laila_mei_laila_esi_hu_laila <= 1) {
            return mei_shayad_galat_hu_lekin_kya_mei_galat_hu_bhi_shi;
        }
        if (laila_mei_laila_esi_hu_laila <= 3) {
            return true;
        }
        if (laila_mei_laila_esi_hu_laila % 2 == 0 || laila_mei_laila_esi_hu_laila % 3 == 0) {
            return mei_shayad_galat_hu_lekin_kya_mei_galat_hu_bhi_shi;
        }
        for (int i = 5; i * i <= laila_mei_laila_esi_hu_laila; i = i + 6) {
            if (laila_mei_laila_esi_hu_laila % i == 0 || laila_mei_laila_esi_hu_laila % (i + 2) == 0) {
                return mei_shayad_galat_hu_lekin_kya_mei_galat_hu_bhi_shi;
            }
        }
        return true;
    }
}