package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahty extends abxd implements abyr {
    public static final ahty a;
    private static volatile abyy e;
    public int b = 0;
    public long c;
    public abwf d;
    private int f;
    private Object g;

    static {
        ahty ahtyVar = new ahty();
        a = ahtyVar;
        ahtyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahty.class, ahtyVar);
    }

    private ahty() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"g", "b", "f", "c", "d", ahtv.class, ahtx.class, ahtt.class});
        }
        if (i2 == 3) {
            return new ahty();
        }
        if (i2 == 4) {
            return new ahtr();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahty.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
