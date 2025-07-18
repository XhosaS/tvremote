package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yoh extends abxd implements abyr {
    public static final yoh a;
    private static volatile abyy b;
    private int c;
    private yod d;

    static {
        yoh yohVar = new yoh();
        a = yohVar;
        yohVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yoh.class, yohVar);
    }

    private yoh() {
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
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0019\u0019\u0001\u0000\u0000\u0000\u0019ဉ\u000f", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new yoh();
        }
        if (i2 == 4) {
            return new yog();
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
        synchronized (yoh.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
