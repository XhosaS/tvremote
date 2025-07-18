package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uva extends abxd implements abyr {
    public static final uva a;
    private static volatile abyy t;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int l;
    public float m;
    public int n;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public abxj j = abxe.a;
    public abxi k = abwt.b;
    public String o = "";

    static {
        uva uvaVar = new uva();
        a = uvaVar;
        uvaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(uva.class, uvaVar);
    }

    private uva() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0012\u0000\u0000\u0001\u0012\u0012\u0000\u0002\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004\t\u0001\n\u0004\u000bȈ\f\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010'\u0011$\u0012\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "m", "n", "o", "p", "q", "r", "s", "j", "k", "l"});
        }
        if (i2 == 3) {
            return new uva();
        }
        if (i2 == 4) {
            return new uuz();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = t;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (uva.class) {
            abwxVar = t;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                t = abwxVar;
            }
        }
        return abwxVar;
    }
}
