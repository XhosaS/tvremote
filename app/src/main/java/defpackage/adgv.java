package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adgv extends abxd implements abyr {
    public static final adgv a;
    private static volatile abyy d;
    public long b;
    private int e;
    private long f;
    private float g;
    private float h;
    private float i;
    private long j;
    private long k;
    private float m;
    private byte n = 2;
    private String l = "";
    public String c = "";

    static {
        adgv adgvVar = new adgv();
        a = adgvVar;
        adgvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adgv.class, adgvVar);
    }

    private adgv() {
        abyf abyfVar = abyf.a;
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\n\u0000\u0001\u0006\u0010\n\u0000\u0000\n\u0006ᔂ\u0000\u0007ᔂ\u0001\bᔁ\u0004\tᔁ\u0002\nᔁ\u0003\u000bᔂ\u0005\fᔂ\u0006\rᔈ\u0007\u000eᔈ\b\u0010ᔁ\n", new Object[]{"e", "b", "f", "i", "g", "h", "j", "k", "l", "c", "m"});
        }
        if (i2 == 3) {
            return new adgv();
        }
        if (i2 == 4) {
            return new adgu();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.n = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adgv.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
