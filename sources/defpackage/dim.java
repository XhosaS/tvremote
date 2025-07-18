package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dim {
    public static final dim a;
    public static final dim b;
    public static final dim c;
    public static final dim d;
    public static final dim e;
    public static final dim f;
    public static final dim g;
    public static final dim h;
    public static final dim i;
    public static final dim j;
    public static final dim k;
    public static final dim l;
    public static final dim m;
    public static final dim n;
    public static final dim o;
    public static final dim p;
    private static final Map v;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final czv u;

    static {
        czv czvVar = dcg.c;
        a = new dim(1, 32, 1, 265, czvVar);
        b = new dim(2, 32, 2, 133, czvVar);
        c = new dim(3, 32, 4, 67, czvVar);
        d = new dim(4, 32, 8, 34, czvVar);
        e = new dim(5, 24, 1, 200, czvVar);
        f = new dim(6, 24, 2, 101, czvVar);
        g = new dim(7, 24, 4, 51, czvVar);
        h = new dim(8, 24, 8, 26, czvVar);
        czv czvVar2 = dcg.o;
        i = new dim(9, 32, 1, 265, czvVar2);
        j = new dim(10, 32, 2, 133, czvVar2);
        k = new dim(11, 32, 4, 67, czvVar2);
        l = new dim(12, 32, 8, 34, czvVar2);
        m = new dim(13, 24, 1, 200, czvVar2);
        n = new dim(14, 24, 2, 101, czvVar2);
        o = new dim(15, 24, 4, 51, czvVar2);
        p = new dim(16, 24, 8, 26, czvVar2);
        v = new dit(null);
    }

    protected dim(int i2, int i3, int i4, int i5, czv czvVar) {
        this.q = i2;
        this.r = i3;
        this.s = i4;
        this.t = i5;
        this.u = czvVar;
    }

    public static dim a(int i2) {
        return (dim) v.get(Integer.valueOf(i2));
    }
}
