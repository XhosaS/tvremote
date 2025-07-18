package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adtk extends abxd implements abyr {
    public static final adtk a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        adtk adtkVar = new adtk();
        a = adtkVar;
        adtkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adtk.class, adtkVar);
    }

    private adtk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", adta.class, adtp.class, adtr.class});
        }
        if (i2 == 3) {
            return new adtk();
        }
        if (i2 == 4) {
            return new adtj();
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
        synchronized (adtk.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
