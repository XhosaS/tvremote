package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ylo extends abxd implements abyr {
    public static final ylo a;
    private static volatile abyy d;
    public int b;
    public abxs c = abzb.b;
    private String e = "";

    static {
        ylo yloVar = new ylo();
        a = yloVar;
        yloVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ylo.class, yloVar);
    }

    private ylo() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"b", "c", ylm.class, "e"});
        }
        if (i2 == 3) {
            return new ylo();
        }
        if (i2 == 4) {
            return new yln();
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
        synchronized (ylo.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
