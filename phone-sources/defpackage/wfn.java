package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.view.Display;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfn {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public wfn(lfn lfnVar, String str, Context context, idf idfVar, kuw kuwVar, kwy kwyVar, Display display, llw llwVar, lux luxVar, idr idrVar, boolean z) {
        this.f = lfnVar;
        this.i = str;
        this.g = kuwVar;
        this.h = display;
        this.b = context;
        this.j = idfVar;
        this.d = kwyVar;
        this.c = llwVar;
        this.k = luxVar;
        this.e = idrVar;
        this.a = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double a(double r10, double r12) {
        /*
            double r0 = defpackage.wbb.l(r10, r12)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lc
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        Lc:
            double r4 = defpackage.wbb.k(r10, r12)
            double r2 = java.lang.Math.max(r2, r4)
            double r4 = defpackage.wbb.m(r0, r10)
            double r6 = defpackage.wbb.m(r2, r10)
            boolean r10 = g(r10)
            if (r10 == 0) goto L46
            double r10 = r4 - r6
            double r10 = java.lang.Math.abs(r10)
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            r11 = 0
            if (r10 >= 0) goto L3b
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3b
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3b
            r11 = 1
        L3b:
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4f
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 >= 0) goto L4f
            if (r11 == 0) goto L50
            goto L4f
        L46:
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L50
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 < 0) goto L4f
            goto L50
        L4f:
            return r0
        L50:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wfn.a(double, double):double");
    }

    public static Function f(Function function) {
        return function == null ? new wfk(0) : new wff(function, 8);
    }

    public static boolean g(double d) {
        return Math.round(d) < 60;
    }

    public static final ieg h(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lcl lclVar = ((lvd) it.next()).b;
            if ((lclVar.b & 512) != 0) {
                kzo kzoVar = lclVar.l;
                if (kzoVar == null) {
                    kzoVar = kzo.a;
                }
                if (!linkedHashSet.contains(kzoVar)) {
                    kzo kzoVar2 = lclVar.l;
                    if (kzoVar2 == null) {
                        kzoVar2 = kzo.a;
                    }
                    linkedHashSet.add(kzoVar2);
                }
            }
        }
        return linkedHashSet.isEmpty() ? ieg.a : ieg.f((kzo[]) linkedHashSet.toArray(new kzo[linkedHashSet.size()]));
    }

    public static final cui i(List list) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            lvd lvdVar = (lvd) list.get(i7);
            int i8 = lvdVar.c.b;
            lcl lclVar = lvdVar.b;
            int i9 = (int) ((lclVar.d * 8000) / lclVar.m);
            if (i8 > 719 && (i8 > i6 || (i8 == i6 && i9 > i))) {
                i4 = lclVar.c;
                i6 = i8;
                i = i9;
            } else if (i8 <= 719 && (i8 > i2 || (i8 == i2 && i9 > i3))) {
                i5 = lclVar.c;
                i2 = i8;
                i3 = i9;
            }
        }
        return new cui(Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public final double b(wfo wfoVar) {
        return wfi.a(wfoVar.l).d(wfoVar, this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.function.Function] */
    public final int c(wfo wfoVar) {
        int i = e(wfoVar).d;
        ?? r1 = this.j;
        if (r1 == 0 || r1.apply(wfoVar) == null) {
            return i;
        }
        return (vyf.j((int) Math.round(((Double) r1.apply(wfoVar)).doubleValue() * 255.0d)) << 24) | (i & 16777215);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.function.Function] */
    public final wfm d() {
        wfm wfmVar = new wfm();
        wfmVar.a = (String) this.b;
        wfmVar.b = this.c;
        wfmVar.c = this.d;
        wfmVar.d = this.a;
        wfmVar.e = this.e;
        wfmVar.f = this.f;
        wfmVar.g = this.g;
        wfmVar.h = this.h;
        wfmVar.i = this.i;
        wfmVar.j = this.j;
        return wfmVar;
    }

    public final wfs e(wfo wfoVar) {
        HashMap map = (HashMap) this.k;
        wfs wfsVar = (wfs) map.get(wfoVar);
        if (wfsVar != null) {
            return wfsVar;
        }
        wfs wfsVarT = wfi.a(wfoVar.l).t(wfoVar, this);
        if (map.size() > 4) {
            map.clear();
        }
        map.put(wfoVar, wfsVarT);
        return wfsVarT;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, lie] */
    public final void j(Throwable th) {
        ContentValues contentValuesS = ktw.s();
        contentValuesS.put("pinned", (Integer) 0);
        contentValuesS.put("pinning_notification_active", (Boolean) false);
        isy isyVar = (isy) this.k;
        kuh kuhVar = (kuh) this.j;
        ktw.B(isyVar, kuhVar, contentValuesS);
        krd.c("Request impossible ".concat(String.valueOf(String.valueOf(th))));
        this.f.C(kuhVar.b, th);
    }

    public wfn(String str, Function function, Function function2, boolean z, Function function3, Function function4, Function function5, Function function6, Function function7, Function function8) {
        this.k = new HashMap();
        this.b = str;
        this.c = function;
        this.d = function2;
        this.a = z;
        this.e = function3;
        this.f = function4;
        this.g = function5;
        this.h = function6;
        this.i = function7;
        this.j = function8;
    }

    public wfn(kuh kuhVar, lie lieVar, idf idfVar, lrq lrqVar, lfn lfnVar, lyz lyzVar, ContentResolver contentResolver, Executor executor, isy isyVar, boolean z, String str) {
        this.j = kuhVar;
        lieVar.getClass();
        this.f = lieVar;
        this.c = lrqVar;
        this.h = idfVar;
        this.e = lfnVar;
        this.d = lyzVar;
        this.b = contentResolver;
        this.i = executor;
        this.k = isyVar;
        this.a = z;
        this.g = str;
    }
}
