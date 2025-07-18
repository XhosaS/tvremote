package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jly extends abxd implements abyr {
    public static final abxk a = new jlw();
    public static final jly b;
    private static volatile abyy d;
    public abxj c = abxe.a;

    static {
        jly jlyVar = new jly();
        b = jlyVar;
        jlyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(jly.class, jlyVar);
    }

    private jly() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"c", jlu.a});
        }
        if (i2 == 3) {
            return new jly();
        }
        if (i2 == 4) {
            return new jlx();
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (jly.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
