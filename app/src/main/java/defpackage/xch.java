package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xch extends abxd implements abyr {
    public static final xch a;
    private static volatile abyy n;
    public int b;
    public int c;
    public boolean d;
    public abxs e = abzb.b;
    public xfy f;
    public int g;
    public int h;
    public abuy i;
    public boolean j;
    public boolean k;
    public boolean l;
    public xcj m;

    static {
        xch xchVar = new xch();
        a = xchVar;
        xchVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xch.class, xchVar);
    }

    private xch() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0000\u0001င\u0000\u0003ဇ\u0001\u0004\u001b\u0005ဉ\u0002\u0006᠌\u0003\u0007᠌\u0004\bဉ\u0005\tဇ\u0006\nဇ\u0007\u000bဇ\b\fဉ\t", new Object[]{"b", "c", "d", "e", xga.class, "f", "g", xcf.a, "h", xcg.a, "i", "j", "k", "l", "m"});
        }
        if (i2 == 3) {
            return new xch();
        }
        if (i2 == 4) {
            return new xce();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = n;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xch.class) {
            abwxVar = n;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                n = abwxVar;
            }
        }
        return abwxVar;
    }
}
