package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adrl extends abxd implements abyr {
    public static final adrl a;
    private static volatile abyy d;
    public int b;
    public int c;
    private int e;

    static {
        adrl adrlVar = new adrl();
        a = adrlVar;
        adrlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adrl.class, adrlVar);
    }

    private adrl() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001", new Object[]{"e", "b", "c", adqx.a});
        }
        if (i2 == 3) {
            return new adrl();
        }
        if (i2 == 4) {
            return new adrk();
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
        synchronized (adrl.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
