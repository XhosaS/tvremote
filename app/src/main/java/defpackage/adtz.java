package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adtz extends abxd implements abyr {
    public static final adtz a;
    private static volatile abyy g;
    public int b;
    public int d;
    public boolean f;
    public String c = "";
    public abxs e = abzb.b;

    static {
        adtz adtzVar = new adtz();
        a = adtzVar;
        adtzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adtz.class, adtzVar);
    }

    private adtz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u001a\u0004ဇ\u0002", new Object[]{"b", "c", "d", adsf.a, "e", "f"});
        }
        if (i2 == 3) {
            return new adtz();
        }
        if (i2 == 4) {
            return new adty();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adtz.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
