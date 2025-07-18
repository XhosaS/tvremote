package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lla extends abxd implements abyr {
    public static final lla a;
    private static volatile abyy i;
    public int b;
    public long e;
    public float f;
    public double g;
    public String c = "";
    public String d = "";
    public abxs h = abzb.b;

    static {
        lla llaVar = new lla();
        a = llaVar;
        llaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(lla.class, llaVar);
    }

    private lla() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", lla.class});
        }
        if (i3 == 3) {
            return new lla();
        }
        if (i3 == 4) {
            return new lkz();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (lla.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
