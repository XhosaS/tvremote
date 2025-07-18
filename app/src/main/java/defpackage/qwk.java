package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qwk extends abxd implements abyr {
    public static final qwk a;
    private static volatile abyy d;
    public int b;
    public int c;
    private int e;

    static {
        qwk qwkVar = new qwk();
        a = qwkVar;
        qwkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(qwk.class, qwkVar);
    }

    private qwk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new qwk();
        }
        if (i2 == 4) {
            return new qwj();
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
        synchronized (qwk.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
