package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xaq extends abxd implements abyr {
    public static final xaq a;
    private static volatile abyy i;
    public int b;
    public int d;
    public long e;
    public boolean h;
    public String c = "";
    public String f = "";
    public String g = "";

    static {
        xaq xaqVar = new xaq();
        a = xaqVar;
        xaqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xaq.class, xaqVar);
    }

    private xaq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0002\u0003ဈ\u0005\u0004ဈ\u0006\nဇ\f\u000bဂ\u0003", new Object[]{"b", "c", "d", "f", "g", "h", "e"});
        }
        if (i3 == 3) {
            return new xaq();
        }
        if (i3 == 4) {
            return new xap();
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
        synchronized (xaq.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
