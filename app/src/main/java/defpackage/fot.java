package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fot extends abxd implements abyr {
    public static final fot a;
    private static volatile abyy k;
    public int b;
    public abwf c;
    public abwf d;
    public abwf e;
    public abwf f;
    public abwf g;
    public abwf h;
    public abwf i;
    public abwf j;

    static {
        fot fotVar = new fot();
        a = fotVar;
        fotVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(fot.class, fotVar);
    }

    private fot() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new fot();
        }
        if (i2 == 4) {
            return new fos();
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
        synchronized (fot.class) {
            abwxVar = k;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                k = abwxVar;
            }
        }
        return abwxVar;
    }
}
