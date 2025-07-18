package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aceg extends abxd implements abyr {
    public static final aceg a;
    private static volatile abyy k;
    public int b;
    public int c;
    public long e;
    public boolean f;
    public acgi g;
    public boolean h;
    public int i;
    private byte l = 2;
    public abxs d = abzb.b;
    public String j = "";

    static {
        aceg acegVar = new aceg();
        a = acegVar;
        acegVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aceg.class, acegVar);
    }

    private aceg() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0001\u0001᠌\u0000\u0002\u001a\u0003ဂ\u0001\u0004ဇ\u0002\u0005ᐉ\u0003\u0006ဇ\u0004\u0007᠌\u0005\bဈ\u0006", new Object[]{"b", "c", acgc.a, "d", "e", "f", "g", "h", "i", acep.a, "j"});
        }
        if (i2 == 3) {
            return new aceg();
        }
        if (i2 == 4) {
            return new acef();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.l = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = k;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aceg.class) {
            abwxVar = k;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                k = abwxVar;
            }
        }
        return abwxVar;
    }
}
