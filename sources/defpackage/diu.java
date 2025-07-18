package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class diu {
    public static final diu a;
    public static final diu b;
    public static final diu c;
    public static final diu d;
    public static final diu e;
    public static final diu f;
    public static final diu g;
    public static final diu h;
    public static final diu i;
    public static final diu j;
    public static final diu k;
    public static final diu l;
    public static final diu m;
    public static final diu n;
    public static final diu o;
    public static final diu p;
    public static final diu q;
    public static final diu r;
    public static final diu s;
    public static final diu t;
    private static final Map y;
    public final int u;
    public final int v;
    public final int w;
    public final czv x;

    static {
        czv czvVar = dcg.c;
        a = new diu(5, 32, 5, czvVar);
        b = new diu(6, 32, 10, czvVar);
        c = new diu(7, 32, 15, czvVar);
        d = new diu(8, 32, 20, czvVar);
        e = new diu(9, 32, 25, czvVar);
        f = new diu(10, 24, 5, czvVar);
        g = new diu(11, 24, 10, czvVar);
        h = new diu(12, 24, 15, czvVar);
        i = new diu(13, 24, 20, czvVar);
        j = new diu(14, 24, 25, czvVar);
        czv czvVar2 = dcg.o;
        k = new diu(15, 32, 5, czvVar2);
        l = new diu(16, 32, 10, czvVar2);
        m = new diu(17, 32, 15, czvVar2);
        n = new diu(18, 32, 20, czvVar2);
        o = new diu(19, 32, 25, czvVar2);
        p = new diu(20, 24, 5, czvVar2);
        q = new diu(21, 24, 10, czvVar2);
        r = new diu(22, 24, 15, czvVar2);
        s = new diu(23, 24, 20, czvVar2);
        t = new diu(24, 24, 25, czvVar2);
        y = new dit();
    }

    protected diu(int i2, int i3, int i4, czv czvVar) {
        this.u = i2;
        this.v = i3;
        this.w = i4;
        this.x = czvVar;
    }

    static diu a(int i2) {
        return (diu) y.get(Integer.valueOf(i2));
    }
}
