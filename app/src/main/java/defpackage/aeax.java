package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeax extends abxd implements abyr {
    public static final aeax a;
    private static volatile abyy k;
    public int b;
    public int e;
    public int f;
    public int g;
    public int i;
    public int j;
    public String c = "";
    public String d = "";
    public int h = 1;

    static {
        aeax aeaxVar = new aeax();
        a = aeaxVar;
        aeaxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aeax.class, aeaxVar);
    }

    private aeax() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004င\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\bင\u0007\tင\b", new Object[]{"b", "c", "d", "e", "f", "g", aeas.a, "h", aeau.a, "i", "j"});
        }
        if (i2 == 3) {
            return new aeax();
        }
        if (i2 == 4) {
            return new aeaw();
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
        synchronized (aeax.class) {
            abwxVar = k;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                k = abwxVar;
            }
        }
        return abwxVar;
    }
}
