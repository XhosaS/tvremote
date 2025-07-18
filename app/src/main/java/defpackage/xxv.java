package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xxv extends abxd implements abyr {
    public static final xxv a;
    private static volatile abyy b;

    static {
        xxv xxvVar = new xxv();
        a = xxvVar;
        xxvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xxv.class, xxvVar);
    }

    private xxv() {
        float[] fArr = abwt.a;
        abyf abyfVar = abyf.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new xxv();
        }
        if (i2 == 4) {
            return new xxu();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xxv.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
