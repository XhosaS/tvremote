package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abkn extends abxd implements abyr {
    public static final abkn a;
    private static volatile abyy d;
    public int b;
    public int c;

    static {
        abkn abknVar = new abkn();
        a = abknVar;
        abknVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abkn.class, abknVar);
    }

    private abkn() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", abkm.a});
        }
        if (i2 == 3) {
            return new abkn();
        }
        if (i2 == 4) {
            return new abkl();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abkn.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
