package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ydk extends abxd implements abyr {
    public static final ydk a;
    private static volatile abyy f;
    public int b;
    public int c;
    public int d;
    public boolean e;

    static {
        ydk ydkVar = new ydk();
        a = ydkVar;
        ydkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ydk.class, ydkVar);
    }

    private ydk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", ygg.a, "e"});
        }
        if (i2 == 3) {
            return new ydk();
        }
        if (i2 == 4) {
            return new ydj();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ydk.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
