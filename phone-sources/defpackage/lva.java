package defpackage;

import android.content.SharedPreferences;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lva implements lux {
    private static final String a;
    private static final String b;
    private final ieg c;
    private final String d;
    private final String e;
    private final SharedPreferences f;

    static {
        String string = Integer.toString(1);
        a = string;
        b = "original_".concat(String.valueOf(string));
    }

    public lva(ieg iegVar, String str, String str2, SharedPreferences sharedPreferences) {
        this.c = iegVar;
        this.d = str;
        this.e = str2;
        this.f = sharedPreferences;
    }

    private static ieg c(List list, String str) {
        int i;
        int iAR;
        ieg iegVarF = ieg.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lvf lvfVar = (lvf) it.next();
            kzo kzoVar = lvfVar.a;
            int iBm = a.bm(kzoVar.f);
            if (iBm != 0 && iBm == 2 && ((iAR = a.aR((i = kzoVar.d))) == 0 || iAR != 2)) {
                int iAR2 = a.aR(i);
                if (iAR2 == 0) {
                    iAR2 = 1;
                }
                if (str.equals(Integer.toString(iAR2))) {
                    return ieg.f(lvfVar);
                }
                if ((i(str) && lvfVar.a()) || iegVarF.l()) {
                    iegVarF = ieg.f(lvfVar);
                }
            }
        }
        return iegVarF;
    }

    private static ieg d(List list, String str) {
        int i;
        int iAR;
        String string = Integer.toString(1);
        if (!str.isEmpty()) {
            String strF = f(str);
            String strG = g(str);
            if (!j(strF)) {
                ieg iegVarF = ieg.a;
                Iterator it = list.iterator();
                boolean z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    lvf lvfVar = (lvf) it.next();
                    kzo kzoVar = lvfVar.a;
                    if (Locale.forLanguageTag(kzoVar.c).getLanguage().equals(Locale.forLanguageTag(strF).getLanguage()) && ((iAR = a.aR((i = kzoVar.d))) == 0 || iAR != 2)) {
                        int iAR2 = a.aR(i);
                        if (iAR2 == 0) {
                            iAR2 = 1;
                        }
                        if (strG.equals(Integer.toString(iAR2))) {
                            if (Locale.forLanguageTag(kzoVar.c).getCountry().equals(Locale.forLanguageTag(strF).getCountry())) {
                                iegVarF = ieg.f(lvfVar);
                                break;
                            }
                            iegVarF = ieg.f(lvfVar);
                            z = true;
                        }
                        if ((i(strG) && lvfVar.a()) || iegVarF.l()) {
                            if (!z) {
                                iegVarF = ieg.f(lvfVar);
                            }
                        }
                    }
                }
                if (iegVarF.m()) {
                    return iegVarF;
                }
            }
            string = strG;
        }
        return c(list, string);
    }

    private static ImmutableList e(List list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            lcl lclVar = ((lvd) list.get(i)).b;
            if ((lclVar.b & 512) != 0) {
                kzo kzoVar = lclVar.l;
                if (kzoVar == null) {
                    kzoVar = kzo.a;
                }
                builder.add((ImmutableList.Builder) new lvf(kzoVar, i));
            }
        }
        return builder.build();
    }

    private static String f(String str) {
        List listD = uof.g('_').f().d(h(str));
        return listD.size() != 2 ? "original" : (String) listD.get(0);
    }

    private static String g(String str) {
        List listD = uof.g('_').f().d(h(str));
        return listD.size() != 2 ? a : (String) listD.get(1);
    }

    private static String h(String str) {
        return str.replace(krh.MULTI_AUDIO_LANGUAGE_ASSET_PREFIX, "").replace(krh.MULTI_AUDIO_LANGUAGE_FUTURE_PREFIX, "");
    }

    private static boolean i(String str) {
        return str.equals(Integer.toString(4)) || str.equals(Integer.toString(3));
    }

    private static boolean j(String str) {
        return str.equals("original");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lux
    public final int a(List list) {
        ieg iegVarC;
        SharedPreferences sharedPreferences = this.f;
        ieg iegVar = this.c;
        String str = this.d;
        String str2 = this.e;
        ImmutableList immutableListE = e(list);
        String strA = ktw.a(iegVar, str, str2);
        ieg iegVarD = ieg.a;
        if (sharedPreferences.contains(strA)) {
            iegVarC = d(immutableListE, sharedPreferences.getString(strA, b));
        } else {
            String strB = ktw.b(iegVar);
            if (sharedPreferences.contains(strB)) {
                iegVarD = d(immutableListE, sharedPreferences.getString(strB, b));
            }
            iegVarC = !iegVarD.m() ? c(immutableListE, g(sharedPreferences.getString(ktw.b(iegVar), b))) : iegVarD;
        }
        if (iegVarC.m()) {
            return ((lvf) iegVarC.g()).b;
        }
        if (immutableListE.isEmpty()) {
            return 0;
        }
        return ((lvf) immutableListE.get(0)).b;
    }

    @Override // defpackage.lux
    public final String b(List list) {
        int iAR;
        int iBm;
        ieg iegVar = this.c;
        String str = this.d;
        ImmutableList immutableListE = e(list);
        String str2 = this.e;
        SharedPreferences sharedPreferences = this.f;
        String strA = ktw.a(iegVar, str, str2);
        Object objC = null;
        if (!sharedPreferences.contains(strA)) {
            ieg iegVarD = d(immutableListE, sharedPreferences.getString(ktw.b(iegVar), b));
            if (iegVarD.l()) {
                return null;
            }
            return ((lvf) iegVarD.g()).a.c;
        }
        String string = sharedPreferences.getString(strA, b);
        String strF = f(string);
        String strG = g(string);
        tst tstVarI = trk.a;
        Iterator<E> it = immutableListE.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            kzo kzoVar = ((lvf) it.next()).a;
            if (kzoVar.c.equals(strF) || ((iBm = a.bm(kzoVar.f)) != 0 && iBm == 2 && j(strF))) {
                int iAR2 = a.aR(kzoVar.d);
                if (iAR2 == 0) {
                    iAR2 = 1;
                }
                if (Integer.toString(iAR2).equals(strG)) {
                    tstVarI = tst.i(kzoVar.c);
                    break;
                }
            }
            if (Locale.forLanguageTag(kzoVar.c).getLanguage().equals(Locale.forLanguageTag(strF).getLanguage())) {
                tstVarI = tst.i(kzoVar.c);
            }
        }
        if (tstVarI.g()) {
            objC = tstVarI.c();
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                lcl lclVar = ((lvd) it2.next()).b;
                if ((lclVar.b & 512) != 0) {
                    kzo kzoVar2 = lclVar.l;
                    if (kzoVar2 == null) {
                        kzoVar2 = kzo.a;
                    }
                    int iBm2 = a.bm(kzoVar2.f);
                    if (iBm2 == 0) {
                        iBm2 = 1;
                    }
                    if (iBm2 - 1 == 1 && ((iAR = a.aR(kzoVar2.d)) == 0 || iAR != 2)) {
                        objC = kzoVar2.c;
                        break;
                    }
                }
            }
        }
        return (String) objC;
    }
}
