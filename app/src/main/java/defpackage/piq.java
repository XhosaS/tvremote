package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class piq extends abxd implements abyr {
    public static final piq a;
    private static volatile abyy i;
    public int b;
    public piy c;
    public long d;
    public String e = "";
    public int f;
    public long g;
    public long h;

    static {
        piq piqVar = new piq();
        a = piqVar;
        piqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(piq.class, piqVar);
    }

    private piq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003င\u0003\u0004ဂ\u0004\u0005ဂ\u0005\u0006ဈ\u0002", new Object[]{"b", "c", "d", "f", "g", "h", "e"});
        }
        if (i3 == 3) {
            return new piq();
        }
        if (i3 == 4) {
            return new pip();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (piq.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
