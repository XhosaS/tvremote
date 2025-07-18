package defpackage;

import android.content.SharedPreferences;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class luz implements lux {
    private final SharedPreferences a;

    public luz(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    private static final String c(String str) {
        if (str == null) {
            return null;
        }
        return (String) uof.g('_').f().d(str).get(0);
    }

    private static final int d(List list) {
        for (int i = 0; i < list.size(); i++) {
            lcl lclVar = ((lvd) list.get(i)).b;
            if ((lclVar.b & 512) != 0) {
                kzo kzoVar = lclVar.l;
                if (kzoVar == null) {
                    kzoVar = kzo.a;
                }
                int iBm = a.bm(kzoVar.f);
                if (iBm == 0) {
                    iBm = 1;
                }
                if (iBm - 1 == 1) {
                    return i;
                }
            }
        }
        return 0;
    }

    @Override // defpackage.lux
    public final int a(List list) throws NumberFormatException {
        String string = this.a.getString(krh.AUDIO_LANGUAGE_PRISM_DOWNLOADS, null);
        if (string == null) {
            return d(list);
        }
        String strC = c(string);
        int i = Integer.parseInt((String) uof.g('_').f().d(string).get(1));
        int i2 = Integer.parseInt((String) uof.g('_').f().d(string).get(2));
        for (int i3 = 0; i3 < list.size(); i3++) {
            lcl lclVar = ((lvd) list.get(i3)).b;
            if ((lclVar.b & 512) != 0) {
                kzo kzoVar = lclVar.l;
                if (kzoVar == null) {
                    kzoVar = kzo.a;
                }
                if (kzoVar.c.equals(strC)) {
                    int iAR = a.aR(kzoVar.d);
                    if (iAR == 0) {
                        iAR = 1;
                    }
                    if (iAR != i) {
                        continue;
                    } else {
                        int iBm = a.bm(kzoVar.f);
                        if (iBm == 0) {
                            iBm = 1;
                        }
                        if (iBm - 1 == i2) {
                            return i3;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return d(list);
    }

    @Override // defpackage.lux
    public final String b(List list) {
        return c(this.a.getString(krh.AUDIO_LANGUAGE_PRISM_DOWNLOADS, null));
    }
}
