package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtf extends abxd implements abyr {
    public static final rtf a;
    private static volatile abyy f;
    public int b;
    public long c;
    public long d;
    public int e;

    static {
        rtf rtfVar = new rtf();
        a = rtfVar;
        rtfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rtf.class, rtfVar);
    }

    private rtf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", rtg.a});
        }
        if (i2 == 3) {
            return new rtf();
        }
        if (i2 == 4) {
            return new rte();
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
        synchronized (rtf.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
