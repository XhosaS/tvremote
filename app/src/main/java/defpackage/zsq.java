package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zsq extends abxd implements abyr {
    public static final zsq a;
    private static volatile abyy c;
    public int b;
    private int d;

    static {
        zsq zsqVar = new zsq();
        a = zsqVar;
        zsqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zsq.class, zsqVar);
    }

    private zsq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "b", zso.a});
        }
        if (i2 == 3) {
            return new zsq();
        }
        if (i2 == 4) {
            return new zsn();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zsq.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
