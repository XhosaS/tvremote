package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyb extends abxd implements abyr {
    public static final acyb a;
    private static volatile abyy e;
    public int b;
    public float c;
    public float d;

    static {
        acyb acybVar = new acyb();
        a = acybVar;
        acybVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acyb.class, acybVar);
    }

    private acyb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new acyb();
        }
        if (i2 == 4) {
            return new acya();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acyb.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
