package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adwb extends abxd implements abyr {
    public static final adwb a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        adwb adwbVar = new adwb();
        a = adwbVar;
        adwbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adwb.class, adwbVar);
    }

    private adwb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", advp.class, advx.class, advz.class, adwf.class, advt.class, advv.class});
        }
        if (i2 == 3) {
            return new adwb();
        }
        if (i2 == 4) {
            return new adwa();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adwb.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
