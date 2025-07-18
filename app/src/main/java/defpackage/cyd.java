package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyd extends abxd implements abyr {
    public static final cyd a;
    private static volatile abyy c;
    public String b = "";
    private int d;

    static {
        cyd cydVar = new cyd();
        a = cydVar;
        cydVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(cyd.class, cydVar);
    }

    private cyd() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new cyd();
        }
        if (i2 == 4) {
            return new cyc();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (cyd.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
