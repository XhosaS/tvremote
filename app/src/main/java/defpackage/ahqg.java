package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahqg extends abxd implements abyr {
    public static final ahqg a;
    private static volatile abyy f;
    public int b;
    public int c;
    public long d;
    public ahpw e;

    static {
        ahqg ahqgVar = new ahqg();
        a = ahqgVar;
        ahqgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahqg.class, ahqgVar);
    }

    private ahqg() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ahqg();
        }
        if (i2 == 4) {
            return new ahqf();
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
        synchronized (ahqg.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
