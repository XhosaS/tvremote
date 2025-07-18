package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adaz extends abxd implements abyr {
    public static final adaz a;
    private static volatile abyy h;
    public int b;
    public abuy d;
    public long f;
    public int g;
    public String c = "";
    public abxs e = abzb.b;

    static {
        adaz adazVar = new adaz();
        a = adazVar;
        adazVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adaz.class, adazVar);
    }

    private adaz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001a\u0004ဂ\u0002\u0005᠌\u0003", new Object[]{"b", "c", "d", "e", "f", "g", adba.a});
        }
        if (i2 == 3) {
            return new adaz();
        }
        if (i2 == 4) {
            return new aday();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adaz.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
