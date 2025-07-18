package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yfc extends abxd implements abyr {
    public static final yfc a;
    private static volatile abyy h;
    public int b;
    public int c;
    public int d;
    public yfa e;
    public yer f;
    public int g;

    static {
        yfc yfcVar = new yfc();
        a = yfcVar;
        yfcVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yfc.class, yfcVar);
    }

    private yfc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006᠌\u0004", new Object[]{"b", "c", yet.a, "d", yfb.a, "e", "f", "g", yev.a});
        }
        if (i2 == 3) {
            return new yfc();
        }
        if (i2 == 4) {
            return new yes();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (yfc.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
