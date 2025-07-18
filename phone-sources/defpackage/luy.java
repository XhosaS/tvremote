package defpackage;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class luy implements lux {
    private final SharedPreferences a;
    private final String b;

    public luy(SharedPreferences sharedPreferences, String str) {
        this.a = sharedPreferences;
        this.b = str;
    }

    private static final int c(List list, SharedPreferences sharedPreferences, int i, String str) {
        int i2;
        int iAR;
        int iA;
        int iAR2;
        int iBm;
        String string = sharedPreferences.getString(krh.AUDIO_LANGUAGE, str);
        int i3 = 0;
        while (true) {
            i2 = -1;
            if (i3 >= list.size()) {
                i3 = -1;
                break;
            }
            kzo kzoVar = ((lvd) list.get(i3)).b.l;
            if (kzoVar == null) {
                kzoVar = kzo.a;
            }
            if ((((lvd) list.get(i3)).b.b & 512) != 0 && (((iAR2 = a.aR(kzoVar.d)) == 0 || iAR2 == 1) && (iBm = a.bm(kzoVar.f)) != 0 && iBm == 2)) {
                break;
            }
            i3++;
        }
        if (!string.equals(str) || i3 < 0) {
            String string2 = Locale.getDefault().toString();
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                kzo kzoVar2 = ((lvd) list.get(i5)).b.l;
                if (kzoVar2 == null) {
                    kzoVar2 = kzo.a;
                }
                if ((((lvd) list.get(i5)).b.b & 512) != 0 && (((iAR = a.aR(kzoVar2.d)) == 0 || iAR == 1) && (iA = ksg.a(string2, kzoVar2.c)) > i4)) {
                    i2 = i5;
                    i4 = iA;
                }
            }
            if (i2 >= 0) {
                return i2;
            }
            if (i3 < 0) {
                return i;
            }
        }
        return i3;
    }

    @Override // defpackage.lux
    public final int a(List list) {
        return c(list, this.a, 0, this.b);
    }

    @Override // defpackage.lux
    public final String b(List list) {
        int iC = c(list, this.a, -1, this.b);
        if (iC < 0) {
            return null;
        }
        kzo kzoVar = ((lvd) list.get(iC)).b.l;
        if (kzoVar == null) {
            kzoVar = kzo.a;
        }
        return kzoVar.c;
    }
}
