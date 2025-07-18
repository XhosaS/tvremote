package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnp extends abxd implements fnr {
    public static final fnp a;
    private static volatile abyy p;
    public int b;
    public fnd c;
    public fnk d;
    public fnm e;
    public fnv f;
    public fnz g;
    public fod h;
    public fog i;
    public foi j;
    public foo k;
    public foq l;
    public fox m;
    public fpc n;
    public fpf o;

    static {
        fnp fnpVar = new fnp();
        a = fnpVar;
        fnpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(fnp.class, fnpVar);
    }

    private fnp() {
    }

    @Override // defpackage.fnr
    public final fog a() {
        fog fogVar = this.i;
        return fogVar == null ? fog.a : fogVar;
    }

    @Override // defpackage.fnr
    public final boolean b() {
        return (this.b & 64) != 0;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001ဉ\u000b\u0002ဉ\u0003\u0003ဉ\u0006\u0004ဉ\u0005\u0005ဉ\t\u0006ဉ\u0004\u0007ဉ\u0002\bဉ\f\tဉ\r\nဉ\u0000\fဉ\u0007\rဉ\b\u000eဉ\u0001", new Object[]{"b", "m", "f", "i", "h", "l", "g", "e", "n", "o", "c", "j", "k", "d"});
        }
        if (i2 == 3) {
            return new fnp();
        }
        if (i2 == 4) {
            return new fno();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = p;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (fnp.class) {
            abwxVar = p;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                p = abwxVar;
            }
        }
        return abwxVar;
    }
}
