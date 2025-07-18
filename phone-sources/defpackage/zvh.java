package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zvh {
    public static final Map a;
    public final zvm b;
    public final zvn c;
    public final int d;
    public final int e;

    static {
        HashMap map = new HashMap();
        map.put(1, new zvh(20, 2, zln.c));
        map.put(2, new zvh(20, 4, zln.c));
        map.put(3, new zvh(40, 2, zln.c));
        map.put(4, new zvh(40, 4, zln.c));
        map.put(5, new zvh(40, 8, zln.c));
        map.put(6, new zvh(60, 3, zln.c));
        map.put(7, new zvh(60, 6, zln.c));
        map.put(8, new zvh(60, 12, zln.c));
        map.put(9, new zvh(20, 2, zln.e));
        map.put(10, new zvh(20, 4, zln.e));
        map.put(11, new zvh(40, 2, zln.e));
        map.put(12, new zvh(40, 4, zln.e));
        map.put(13, new zvh(40, 8, zln.e));
        map.put(14, new zvh(60, 3, zln.e));
        map.put(15, new zvh(60, 6, zln.e));
        map.put(16, new zvh(60, 12, zln.e));
        map.put(17, new zvh(20, 2, zln.m));
        map.put(18, new zvh(20, 4, zln.m));
        map.put(19, new zvh(40, 2, zln.m));
        map.put(20, new zvh(40, 4, zln.m));
        map.put(21, new zvh(40, 8, zln.m));
        map.put(22, new zvh(60, 3, zln.m));
        map.put(23, new zvh(60, 6, zln.m));
        map.put(24, new zvh(60, 12, zln.m));
        map.put(25, new zvh(20, 2, zln.n));
        map.put(26, new zvh(20, 4, zln.n));
        map.put(27, new zvh(40, 2, zln.n));
        map.put(28, new zvh(40, 4, zln.n));
        map.put(29, new zvh(40, 8, zln.n));
        map.put(30, new zvh(60, 3, zln.n));
        map.put(31, new zvh(60, 6, zln.n));
        map.put(32, new zvh(60, 12, zln.n));
        a = DesugarCollections.unmodifiableMap(map);
    }

    public zvh(int i, int i2, zjb zjbVar) {
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
        zvn zvnVar = new zvn(i3, zjbVar);
        this.c = zvnVar;
        this.b = (zur) zur.a.get(zur.a(b(), a(), zvnVar.g.b, i, i2));
    }

    public final int a() {
        return this.c.f;
    }

    protected final String b() {
        return this.c.e;
    }

    public zvh(int i, int i2, znp znpVar) {
        this(i, i2, zut.a(znpVar.c()));
    }
}
