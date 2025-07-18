package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwp extends abxd implements abyr {
    public static final fwp a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        fwp fwpVar = new fwp();
        a = fwpVar;
        fwpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(fwp.class, fwpVar);
    }

    private fwp() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new fwp();
        }
        if (i2 == 4) {
            return new fwo();
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
        synchronized (fwp.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
