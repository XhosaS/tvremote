package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahry extends abxd implements abyr {
    public static final ahry a;
    private static volatile abyy j;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    static {
        ahry ahryVar = new ahry();
        a = ahryVar;
        ahryVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahry.class, ahryVar);
    }

    private ahry() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0007\u0000\u0001\u0011\u0018\u0007\u0000\u0000\u0000\u0011င\u0011\u0012င\u0012\u0014ဂ\u0013\u0015ဂ\u0014\u0016ဂ\u0015\u0017ဂ\u0016\u0018ဂ\u0017", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new ahry();
        }
        if (i2 == 4) {
            return new ahrx();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahry.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
