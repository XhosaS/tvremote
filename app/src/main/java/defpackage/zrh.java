package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrh extends abxd implements abyr {
    public static final zrh a;
    private static volatile abyy k;
    public int b;
    public abxs c = abzb.b;
    public abxm d;
    public abxm e;
    public abxm f;
    public abxm g;
    public long h;
    public long i;
    public int j;

    static {
        zrh zrhVar = new zrh();
        a = zrhVar;
        zrhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zrh.class, zrhVar);
    }

    private zrh() {
        abyf abyfVar = abyf.a;
        this.d = abyfVar;
        this.e = abyfVar;
        this.f = abyfVar;
        this.g = abyfVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0005\u0000\u0001\u001b\u0002\u0015\u0003\u0015\u0004ဃ\u0000\u0005ဃ\u0001\u0006င\u0002\u0007&\b&", new Object[]{"b", "c", zqf.class, "d", "f", "h", "i", "j", "e", "g"});
        }
        if (i2 == 3) {
            return new zrh();
        }
        if (i2 == 4) {
            return new zrg();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = k;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zrh.class) {
            abwxVar = k;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                k = abwxVar;
            }
        }
        return abwxVar;
    }
}
