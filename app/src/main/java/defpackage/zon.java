package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zon extends abwz implements abxa {
    public static final zon a;
    private static volatile abyy l;
    public int b;
    public zpk c;
    public int f;
    public int g;
    public int h;
    public zlt k;
    private byte m = 2;
    public int d = -1;
    public int e = -1;
    public int i = -1;
    public abxs j = abzb.b;

    static {
        zon zonVar = new zon();
        a = zonVar;
        zonVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zon.class, zonVar);
    }

    private zon() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0001\u0003\u0001င\u0002\u0002င\u0003\u0003င\u0004\u0004င\u0005\u0005င\u0006\u0006င\u0007\u000eЛ\u000fᐉ\u000e\u0010ᐉ\u0000", new Object[]{"b", "d", "e", "f", "g", "h", "i", "j", zot.class, "k", "c"});
        }
        if (i2 == 3) {
            return new zon();
        }
        if (i2 == 4) {
            return new zom();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.m = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = l;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zon.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
