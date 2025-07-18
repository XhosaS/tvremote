package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpi extends abxd implements abyr {
    public static final abpi a;
    private static volatile abyy b;
    private int c;
    private abpg d;
    private abpq e;
    private abpm f;
    private byte g = 2;

    static {
        abpi abpiVar = new abpi();
        a = abpiVar;
        abpiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abpi.class, abpiVar);
    }

    private abpi() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0003\t\u0003\u0000\u0000\u0000\u0003ဉ\u0002\u0004ဉ\u0003\tဉ\b", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new abpi();
        }
        if (i2 == 4) {
            return new abph();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abpi.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
