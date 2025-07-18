package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dly {
    public static final Map a;
    public final dmd b;
    public final dme c;
    public final int d;
    public final int e;

    static {
        HashMap map = new HashMap();
        map.put(1, new dly(20, 2, dcg.c));
        map.put(2, new dly(20, 4, dcg.c));
        map.put(3, new dly(40, 2, dcg.c));
        map.put(4, new dly(40, 4, dcg.c));
        map.put(5, new dly(40, 8, dcg.c));
        map.put(6, new dly(60, 3, dcg.c));
        map.put(7, new dly(60, 6, dcg.c));
        map.put(8, new dly(60, 12, dcg.c));
        map.put(9, new dly(20, 2, dcg.e));
        map.put(10, new dly(20, 4, dcg.e));
        map.put(11, new dly(40, 2, dcg.e));
        map.put(12, new dly(40, 4, dcg.e));
        map.put(13, new dly(40, 8, dcg.e));
        map.put(14, new dly(60, 3, dcg.e));
        map.put(15, new dly(60, 6, dcg.e));
        map.put(16, new dly(60, 12, dcg.e));
        map.put(17, new dly(20, 2, dcg.m));
        map.put(18, new dly(20, 4, dcg.m));
        map.put(19, new dly(40, 2, dcg.m));
        map.put(20, new dly(40, 4, dcg.m));
        map.put(21, new dly(40, 8, dcg.m));
        map.put(22, new dly(60, 3, dcg.m));
        map.put(23, new dly(60, 6, dcg.m));
        map.put(24, new dly(60, 12, dcg.m));
        map.put(25, new dly(20, 2, dcg.n));
        map.put(26, new dly(20, 4, dcg.n));
        map.put(27, new dly(40, 2, dcg.n));
        map.put(28, new dly(40, 4, dcg.n));
        map.put(29, new dly(40, 8, dcg.n));
        map.put(30, new dly(60, 3, dcg.n));
        map.put(31, new dly(60, 6, dcg.n));
        map.put(32, new dly(60, 12, dcg.n));
        a = DesugarCollections.unmodifiableMap(map);
    }

    public dly(int i, int i2, czv czvVar) {
        this.d = i;
        this.e = i2;
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i % i2 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i3 = i / i2;
        if (i3 == 1) {
            throw new IllegalArgumentException("height / layers must be greater than 1");
        }
        dme dmeVar = new dme(i3, czvVar);
        this.c = dmeVar;
        this.b = (dli) dli.a.get(dli.a(b(), a(), dmeVar.g.b, i, i2));
    }

    public final int a() {
        return this.c.f;
    }

    protected final String b() {
        return this.c.e;
    }

    public dly(int i, int i2, deh dehVar) {
        this(i, i2, dlk.a(dehVar.c()));
    }
}
