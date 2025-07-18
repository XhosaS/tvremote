package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zsd {
    public static final zsd a;
    public static final zsd b;
    public static final zsd c;
    public static final zsd d;
    public static final zsd e;
    public static final zsd f;
    public static final zsd g;
    public static final zsd h;
    public static final zsd i;
    public static final zsd j;
    public static final zsd k;
    public static final zsd l;
    public static final zsd m;
    public static final zsd n;
    public static final zsd o;
    public static final zsd p;
    public static final zsd q;
    public static final zsd r;
    public static final zsd s;
    public static final zsd t;
    private static final Map y;
    public final int u;
    public final int v;
    public final int w;
    public final zjb x;

    static {
        zjb zjbVar = zln.c;
        a = new zsd(5, 32, 5, zjbVar);
        b = new zsd(6, 32, 10, zjbVar);
        c = new zsd(7, 32, 15, zjbVar);
        d = new zsd(8, 32, 20, zjbVar);
        e = new zsd(9, 32, 25, zjbVar);
        f = new zsd(10, 24, 5, zjbVar);
        g = new zsd(11, 24, 10, zjbVar);
        h = new zsd(12, 24, 15, zjbVar);
        i = new zsd(13, 24, 20, zjbVar);
        j = new zsd(14, 24, 25, zjbVar);
        zjb zjbVar2 = zln.o;
        k = new zsd(15, 32, 5, zjbVar2);
        l = new zsd(16, 32, 10, zjbVar2);
        m = new zsd(17, 32, 15, zjbVar2);
        n = new zsd(18, 32, 20, zjbVar2);
        o = new zsd(19, 32, 25, zjbVar2);
        p = new zsd(20, 24, 5, zjbVar2);
        q = new zsd(21, 24, 10, zjbVar2);
        r = new zsd(22, 24, 15, zjbVar2);
        s = new zsd(23, 24, 20, zjbVar2);
        t = new zsd(24, 24, 25, zjbVar2);
        y = new zsc();
    }

    protected zsd(int i2, int i3, int i4, zjb zjbVar) {
        this.u = i2;
        this.v = i3;
        this.w = i4;
        this.x = zjbVar;
    }

    static zsd a(int i2) {
        return (zsd) y.get(Integer.valueOf(i2));
    }
}
