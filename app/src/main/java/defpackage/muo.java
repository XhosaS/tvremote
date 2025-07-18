package defpackage;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class muo implements oec {
    private static final yzt b;
    public final oaa a;
    private final ogr c;
    private final oco d;

    static {
        yzt yztVar;
        yzr yzrVar = new yzr();
        int size = 0;
        yzrVar.b(nne.TRANSITION_VALUE_TYPE_X_Y, Arrays.asList(eae.a, eae.b));
        yzrVar.b(nne.TRANSITION_VALUE_TYPE_WIDTH_HEIGHT, Arrays.asList(eae.c, eae.d));
        yzrVar.b(nne.TRANSITION_VALUE_TYPE_ALPHA, Arrays.asList(eae.e));
        yzrVar.b(nne.TRANSITION_VALUE_TYPE_SCALE, Arrays.asList(eae.f));
        yzrVar.b(nne.TRANSITION_VALUE_TYPE_ROTATION, Arrays.asList(eae.g));
        yzrVar.b(nne.TRANSITION_VALUE_TYPE_TRANSLATION, Arrays.asList(eae.h, eae.i));
        Map map = yzrVar.a;
        if (map == null) {
            yztVar = yxk.a;
        } else {
            Set<Map.Entry> setEntrySet = map.entrySet();
            if (setEntrySet.isEmpty()) {
                yztVar = yxk.a;
            } else {
                yyn yynVar = new yyn(setEntrySet.size());
                for (Map.Entry entry : setEntrySet) {
                    Object key = entry.getKey();
                    yzq yzqVarO = yzq.o(((yzo) entry.getValue()).f());
                    if (!yzqVarO.isEmpty()) {
                        yynVar.c(key, yzqVarO);
                        size += yzqVarO.size();
                    }
                }
                yztVar = new yzt(yynVar.a(true), size);
            }
        }
        b = yztVar;
    }

    public muo(oaa oaaVar, ogr ogrVar, oco ocoVar) {
        this.a = oaaVar;
        this.c = ogrVar;
        this.d = ocoVar;
        Boolean bool = false;
        bool.getClass();
    }

    private static float d(DisplayMetrics displayMetrics, nmx nmxVar, eaf eafVar, float f) {
        if (nmxVar != null) {
            if (eae.a.equals(eafVar)) {
                if (nmxVar.k() && ogr.q(nmxVar.h())) {
                    f = nmxVar.h().g();
                }
            } else if (eae.b.equals(eafVar)) {
                if (nmxVar.k() && ogr.q(nmxVar.h())) {
                    f = nmxVar.h().h();
                }
            } else if (eae.c.equals(eafVar)) {
                if (nmxVar.l() && ogr.r(nmxVar.i())) {
                    f = nmxVar.i().h();
                }
            } else if (eae.d.equals(eafVar)) {
                if (nmxVar.l() && ogr.r(nmxVar.i())) {
                    f = nmxVar.i().g();
                }
            } else if (eae.h.equals(eafVar)) {
                if (nmxVar.k() && ogr.q(nmxVar.h())) {
                    f = nmxVar.h().g();
                }
            } else if (eae.i.equals(eafVar)) {
                if (nmxVar.k() && ogr.q(nmxVar.h())) {
                    f = nmxVar.h().h();
                }
            } else if (nmxVar.j()) {
                f = nmxVar.g();
            }
        }
        return (eae.a.equals(eafVar) || eae.b.equals(eafVar) || eae.c.equals(eafVar) || eae.d.equals(eafVar)) ? TypedValue.applyDimension(1, f, displayMetrics) : f;
    }

    @Override // defpackage.oec
    public final mii a() {
        return nnb.ac;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e9 A[SYNTHETIC] */
    @Override // defpackage.oee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void b(defpackage.dru r21, final defpackage.oal r22, java.lang.String r23, java.lang.Object r24, final defpackage.obz r25, defpackage.nzw r26) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.muo.b(dru, oal, java.lang.String, java.lang.Object, obz, nzw):void");
    }

    @Override // defpackage.oee
    public final /* synthetic */ void c(dru druVar, oal oalVar, String str, niv nivVar, Object obj, obz obzVar, nzw nzwVar) {
        b(druVar, oalVar, str, obj, obzVar, nzwVar);
    }
}
