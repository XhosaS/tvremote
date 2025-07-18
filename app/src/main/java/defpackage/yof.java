package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yof extends abxd implements abyr {
    public static final yof a;
    private static volatile abyy b;
    private int c;
    private yol d;
    private yoa e;

    static {
        yof yofVar = new yof();
        a = yofVar;
        yofVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yof.class, yofVar);
    }

    private yof() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0005\n\u0002\u0000\u0000\u0000\u0005ဉ\u0000\nဉ\u0001", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new yof();
        }
        if (i2 == 4) {
            return new yoe();
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
        synchronized (yof.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
