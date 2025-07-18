package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfm extends abxd implements abyr {
    public static final acfm a;
    private static volatile abyy c;
    public abxj b = abxe.a;

    static {
        acfm acfmVar = new acfm();
        a = acfmVar;
        acfmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acfm.class, acfmVar);
    }

    private acfm() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new acfm();
        }
        if (i2 == 4) {
            return new acfl();
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
        synchronized (acfm.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
