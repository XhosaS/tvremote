package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yme extends abxd implements abyr {
    public static final yme a;
    private static volatile abyy n;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public yld g;
    public boolean h;
    public boolean i;
    public ynl j;
    public boolean k;
    public ylz l;
    public boolean m;

    static {
        yme ymeVar = new yme();
        a = ymeVar;
        ymeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yme.class, ymeVar);
    }

    private yme() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\t\u0000\u0003\u0002N\t\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0004\u0005ဇ\u0007\u0006ဇ\t\u0010ဉ\u0006\u0015ဉ\u0017\u0018ဇ\u001b#ဉ%NဇE", new Object[]{"b", "c", "d", "e", "f", "h", "i", "g", "j", "k", "l", "m"});
        }
        if (i2 == 3) {
            return new yme();
        }
        if (i2 == 4) {
            return new ymd();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = n;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (yme.class) {
            abwxVar = n;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                n = abwxVar;
            }
        }
        return abwxVar;
    }
}
