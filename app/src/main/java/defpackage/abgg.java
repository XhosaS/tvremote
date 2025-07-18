package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgg extends abxd implements abyr {
    public static final abgg a;
    private static volatile abyy e;
    public abxs b;
    public abxs c;
    public abxs d;

    static {
        abgg abggVar = new abgg();
        a = abggVar;
        abggVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abgg.class, abggVar);
    }

    private abgg() {
        abzb abzbVar = abzb.b;
        this.b = abzbVar;
        this.c = abzbVar;
        this.d = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001Ț\u0002Ț\u0003Ț", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abgg();
        }
        if (i2 == 4) {
            return new abgf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abgg.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
