package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zrv {
    public static final zrv a;
    public static final zrv b;
    public static final zrv c;
    public static final zrv d;
    public static final zrv e;
    public static final zrv f;
    public static final zrv g;
    public static final zrv h;
    public static final zrv i;
    public static final zrv j;
    public static final zrv k;
    public static final zrv l;
    public static final zrv m;
    public static final zrv n;
    public static final zrv o;
    public static final zrv p;
    private static final Map v;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final zjb u;

    static {
        zjb zjbVar = zln.c;
        a = new zrv(1, 32, 1, 265, zjbVar);
        b = new zrv(2, 32, 2, 133, zjbVar);
        c = new zrv(3, 32, 4, 67, zjbVar);
        d = new zrv(4, 32, 8, 34, zjbVar);
        e = new zrv(5, 24, 1, 200, zjbVar);
        f = new zrv(6, 24, 2, 101, zjbVar);
        g = new zrv(7, 24, 4, 51, zjbVar);
        h = new zrv(8, 24, 8, 26, zjbVar);
        zjb zjbVar2 = zln.o;
        i = new zrv(9, 32, 1, 265, zjbVar2);
        j = new zrv(10, 32, 2, 133, zjbVar2);
        k = new zrv(11, 32, 4, 67, zjbVar2);
        l = new zrv(12, 32, 8, 34, zjbVar2);
        m = new zrv(13, 24, 1, 200, zjbVar2);
        n = new zrv(14, 24, 2, 101, zjbVar2);
        o = new zrv(15, 24, 4, 51, zjbVar2);
        p = new zrv(16, 24, 8, 26, zjbVar2);
        v = new zsc(null);
    }

    protected zrv(int i2, int i3, int i4, int i5, zjb zjbVar) {
        this.q = i2;
        this.r = i3;
        this.s = i4;
        this.t = i5;
        this.u = zjbVar;
    }

    public static zrv a(int i2) {
        return (zrv) v.get(Integer.valueOf(i2));
    }
}
