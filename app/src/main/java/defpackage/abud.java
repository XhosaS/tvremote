package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abud extends abxd implements abyr {
    public static final abud a;
    private static volatile abyy d;
    public int b;
    public abto c;

    static {
        abud abudVar = new abud();
        a = abudVar;
        abudVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abud.class, abudVar);
    }

    private abud() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abud();
        }
        if (i2 == 4) {
            return new abuc();
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
        synchronized (abud.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
