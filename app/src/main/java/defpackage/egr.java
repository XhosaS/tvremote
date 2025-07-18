package defpackage;

import android.util.DisplayMetrics;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class egr {
    public static float a(DisplayMetrics displayMetrics, int i) {
        return (i / displayMetrics.density) + 0.5f;
    }

    public static int b(DisplayMetrics displayMetrics, float f) {
        return (int) ((f * displayMetrics.density) + 0.5d);
    }

    public static drq c(dru druVar, List list, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7) {
        DisplayMetrics displayMetrics = druVar.a.getResources().getDisplayMetrics();
        ArrayList arrayList = new ArrayList(list);
        if (i > i2) {
            ekc ekcVarAA = ekd.aA(druVar);
            ekcVarAA.c();
            ekcVarAA.a.a = 0.0f;
            arrayList.add(((ekc) ekcVarAA.i(a(displayMetrics, i - i2))).a());
        } else {
            ekc ekcVarAA2 = ekd.aA(druVar);
            ekcVarAA2.c();
            ekcVarAA2.a.a = 0.0f;
            if (f < 0.0f) {
                f = 0.0f;
            }
            arrayList.add(((ekc) ekcVarAA2.i(f)).a());
        }
        arrayList.addAll(list);
        if (i > i2) {
            ekc ekcVarAA3 = ekd.aA(druVar);
            ekcVarAA3.c();
            ekcVarAA3.a.a = 0.0f;
            arrayList.add(((ekc) ekcVarAA3.i(a(displayMetrics, i - i2))).a());
        }
        dxm dxmVarB = dxn.b(druVar);
        dxn dxnVar = dxmVarB.a;
        dxnVar.d = i4;
        dxnVar.f = i5;
        dxnVar.e = i6;
        dxnVar.c = i7;
        if (i3 == 4) {
            dxmVarB.aa();
        }
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            dxmVarB.e(((drq) arrayList.get(i8)).l());
        }
        return dxnVar;
    }
}
