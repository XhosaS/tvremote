package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ybb extends abxd implements abyr {
    public static final ybb a;
    private static volatile abyy o;
    public int b;
    public Object d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public ygk l;
    public boolean m;
    public int c = 0;
    public String i = "";
    public String j = "";
    public abxs k = abzb.b;
    public String n = "";

    static {
        ybb ybbVar = new ybb();
        a = ybbVar;
        ybbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ybb.class, ybbVar);
    }

    private ybb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u000f\u0001\u0001\u0001\u0010\u000f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006;\u0000\u0007;\u0000\b;\u0000\tဈ\u0005\n\u001b\u000bဉ\u0006\f;\u0000\r;\u0000\u000fဇ\b\u0010ဈ\t", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", "k", ygq.class, "l", "m", "n"});
        }
        if (i2 == 3) {
            return new ybb();
        }
        if (i2 == 4) {
            return new yba();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = o;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ybb.class) {
            abwxVar = o;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                o = abwxVar;
            }
        }
        return abwxVar;
    }
}
