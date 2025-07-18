package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vii extends abxd implements abyr {
    public static final vii a;
    private static volatile abyy f;
    public int b;
    public long c;
    public long d;
    public long e;

    static {
        vii viiVar = new vii();
        a = viiVar;
        viiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(vii.class, viiVar);
    }

    private vii() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0002\u0003ဂ\u0001", new Object[]{"b", "c", "e", "d"});
        }
        if (i2 == 3) {
            return new vii();
        }
        if (i2 == 4) {
            return new vih();
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
        synchronized (vii.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
