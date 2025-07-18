package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagy extends abxd implements abyr {
    public static final aagy a;
    private static volatile abyy n;
    public int b;
    public Object d;
    public Object f;
    public boolean h;
    public abvo j;
    public int k;
    public long l;
    public abvo m;
    public int c = 0;
    public int e = 0;
    public String g = "";
    public abxs i = abzb.b;

    static {
        aagy aagyVar = new aagy();
        a = aagyVar;
        aagyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aagy.class, aagyVar);
    }

    private aagy() {
        abxe abxeVar = abxe.a;
        abvo abvoVar = abvo.b;
        this.j = abvoVar;
        this.m = abvoVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u000b\u0002\u0001\u0001\u000f\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u00027\u0000\u0003\u001a\u0005ည\u0002\u0007;\u0001\t᠌\u0005\n;\u0001\u000bဇ\u0001\rဎ\u0007\u000eည\b\u000f5\u0000", new Object[]{"d", "c", "f", "e", "b", "g", "i", "j", "k", aagx.a, "h", "l", "m"});
        }
        if (i2 == 3) {
            return new aagy();
        }
        if (i2 == 4) {
            return new aagw();
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
        synchronized (aagy.class) {
            abwxVar = n;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                n = abwxVar;
            }
        }
        return abwxVar;
    }
}
