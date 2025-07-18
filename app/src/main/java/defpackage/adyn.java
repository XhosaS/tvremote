package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adyn extends abxd implements abyr {
    public static final adyn a;
    private static volatile abyy l;
    public int b;
    public int c = 1;
    public String d = "";
    public abxs e = abzb.b;
    public int f;
    public int g;
    public adzs h;
    public int i;
    public String j;
    public adzq k;

    static {
        adyn adynVar = new adyn();
        a = adynVar;
        adynVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adyn.class, adynVar);
    }

    private adyn() {
        abxe abxeVar = abxe.a;
        this.j = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\t\u0000\u0001\u0001\r\t\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003\u001b\u0004င\u0002\u0005င\u0003\tဉ\u0006\u000bင\b\fဈ\t\rဉ\n", new Object[]{"b", "c", adyl.a, "d", "e", adyr.class, "f", "g", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new adyn();
        }
        if (i2 == 4) {
            return new adyk();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = l;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adyn.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
