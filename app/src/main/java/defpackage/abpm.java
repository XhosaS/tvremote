package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpm extends abxd implements abyr {
    public static final abpm a;
    private static volatile abyy b;
    private abyl c;
    private abyl d;

    static {
        abpm abpmVar = new abpm();
        a = abpmVar;
        abpmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abpm.class, abpmVar);
    }

    private abpm() {
        abyl abylVar = abyl.a;
        this.c = abylVar;
        this.d = abylVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0000\u0001\u0004\u0002\u0002\u0000\u0000\u00012\u00042", new Object[]{"c", abpk.a, "d", abpl.a});
        }
        if (i2 == 3) {
            return new abpm();
        }
        if (i2 == 4) {
            return new abpj();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abpm.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
