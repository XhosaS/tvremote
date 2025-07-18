package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adfi extends abxd implements abyr {
    public static final adfi a;
    private static volatile abyy e;
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    private int f;

    static {
        adfi adfiVar = new adfi();
        a = adfiVar;
        adfiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adfi.class, adfiVar);
    }

    private adfi() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new adfi();
        }
        if (i2 == 4) {
            return new adfh();
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
        synchronized (adfi.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
