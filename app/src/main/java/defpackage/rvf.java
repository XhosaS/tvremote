package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rvf extends abxd implements abyr {
    public static final rvf a;
    private static volatile abyy m;
    public int b;
    public Object d;
    public Object f;
    public ruo g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int c = 0;
    public int e = 0;
    private byte n = 2;

    static {
        rvf rvfVar = new rvf();
        a = rvfVar;
        rvfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rvf.class, rvfVar);
    }

    private rvf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u000f\u0002\u0001\u0001\u0014\u000f\u0000\u0000\u0001\u0001ᐉ\u0000\u0003<\u0000\u0004ဇ\u0001\u0005;\u0000\u0006ဇ\u0002\n:\u0000\u000bဇ\u0004\f<\u0001\r<\u0000\u000e\u083f\u0001\u0010᠌\u0005\u0011:\u0000\u0012:\u0000\u0013:\u0000\u0014ဇ\u0003", new Object[]{"d", "c", "f", "e", "b", "g", rzf.class, "h", "i", "k", sag.class, saa.class, tiw.a, "l", rzq.a, "j"});
        }
        if (i2 == 3) {
            return new rvf();
        }
        if (i2 == 4) {
            return new rve();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.n = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = m;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (rvf.class) {
            abwxVar = m;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                m = abwxVar;
            }
        }
        return abwxVar;
    }
}
