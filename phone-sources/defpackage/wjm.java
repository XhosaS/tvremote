package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjm extends vuc implements vvk {
    public static final wjm a;
    private static volatile vvq t;
    public int b;
    public wik c;
    public wja d;
    public wip e;
    public wil f;
    public wim g;
    public wih h;
    public wjl i;
    public wje j;
    public ucg k;
    public long l;
    public long m;
    public wiv o;
    public wjd p;
    public wjj q;
    public wiq r;
    public wir s;
    private zba u;
    private byte v = 2;
    public vuj n = vud.a;

    static {
        wjm wjmVar = new wjm();
        a = wjmVar;
        vuc.y(wjm.class, wjmVar);
    }

    private wjm() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.v);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0012\u0000\u0001\u0001\u0018\u0012\u0000\u0001\u0004\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006ဉ\u0005\nဉ\t\u000bဉ\u000b\fဉ\f\u000eᐉ\u000e\u0010ဂ\u0010\u0011ဂ\u0011\u0012ࠞ\u0013ᐉ\u0012\u0014ဉ\u0013\u0015ဉ\u0014\u0016ဉ\u0015\u0017ဉ\u0016\u0018ဉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "k", "u", "l", "m", "n", wia.i, "o", "p", "q", "r", "s", "i"});
        }
        if (i2 == 3) {
            return new wjm();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.v = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = t;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wjm.class) {
            vtxVar = t;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                t = vtxVar;
            }
        }
        return vtxVar;
    }
}
