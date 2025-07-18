package defpackage;

import j$.util.Comparator;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssk {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;

    public ssk(Object obj) {
        this.a = obj;
    }

    public static tst f(unx unxVar) {
        Object obj = unxVar.a;
        if (obj != null) {
            tst tstVar = ((qua) obj).b;
            if (tstVar.g()) {
                return tstVar;
            }
        }
        return trk.a;
    }

    private final ssd g() {
        return (ssd) h().get(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    private final List h() {
        ?? r0 = this.b;
        if (r0 != 0) {
            return r0;
        }
        ArrayList arrayList = new ArrayList(b());
        arrayList.add(this.a);
        Collections.sort(arrayList, Comparator.CC.comparing(new ssj(this, 0), new qbi(6)));
        this.b = arrayList;
        return arrayList;
    }

    public final double a(ssd ssdVar) {
        double dDoubleValue = ((Double) c().get((ssd) h().get(h().size() - 1))).doubleValue() - ((Double) c().get(g())).doubleValue();
        double dDoubleValue2 = ((Double) c().get(ssdVar)).doubleValue() - ((Double) c().get(g())).doubleValue();
        if (dDoubleValue == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue2 / dDoubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List b() {
        ?? r0 = this.c;
        if (r0 != 0) {
            return r0;
        }
        ArrayList arrayList = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            ssd ssdVar = (ssd) this.a;
            arrayList.add(ssd.a(d, ssdVar.b, ssdVar.c));
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        this.c = listUnmodifiableList;
        return listUnmodifiableList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final Map c() {
        ?? r0 = this.d;
        if (r0 != 0) {
            return r0;
        }
        ArrayList arrayList = new ArrayList(b());
        arrayList.add(this.a);
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ssd ssdVar = (ssd) arrayList.get(i);
            double[] dArrL = srz.l(ssdVar.d);
            map.put(ssdVar, Double.valueOf(((Math.pow(Math.hypot(dArrL[1], dArrL[2]), 1.07d) * 0.02d) * Math.cos(Math.toRadians(sik.f(sik.f(Math.toDegrees(Math.atan2(dArrL[2], dArrL[1]))) - 50.0d)))) - 0.5d));
        }
        this.d = map;
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, quc] */
    public final void d(que queVar, Object obj) {
        if (obj == null || queVar == null) {
            return;
        }
        queVar.a(obj).i(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, quc] */
    public final void e(que queVar, Object obj) {
        if (obj == null || queVar == null) {
            return;
        }
        queVar.a(obj).j(this.a);
    }

    private ssk() {
        throw new UnsupportedOperationException();
    }
}
