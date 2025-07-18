package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwc extends abxd implements abyr {
    public static final fwc a;
    private static volatile abyy c;
    public int b;

    static {
        fwc fwcVar = new fwc();
        a = fwcVar;
        fwcVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(fwc.class, fwcVar);
    }

    private fwc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new fwc();
        }
        if (i2 == 4) {
            return new fwb();
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
        synchronized (fwc.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
