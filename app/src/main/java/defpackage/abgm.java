package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgm extends abxd implements abyr {
    public static final abxk a = new abgk();
    public static final abgm b;
    private static volatile abyy m;
    public int c;
    public boolean e;
    public boolean f;
    public boolean g;
    public abgg h;
    public boolean i;
    public boolean j;
    public boolean k;
    public String d = "";
    public abxj l = abxe.a;

    static {
        abgm abgmVar = new abgm();
        b = abgmVar;
        abgmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abgm.class, abgmVar);
    }

    private abgm() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(b, "\u0000\t\u0000\u0001\u0003\r\t\u0000\u0001\u0000\u0003Ȉ\u0004\u0007\u0005\u0007\u0006\u0007\u0007ဉ\u0000\b\u0007\u000b\u0007\f\u0007\r,", new Object[]{"c", "d", "i", "e", "f", "h", "g", "j", "k", "l"});
        }
        if (i2 == 3) {
            return new abgm();
        }
        if (i2 == 4) {
            return new abgl();
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = m;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abgm.class) {
            abwxVar = m;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                m = abwxVar;
            }
        }
        return abwxVar;
    }
}
