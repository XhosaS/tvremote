package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abkp extends abxd implements abyr {
    public static final abkp a;
    private static volatile abyy e;
    public int b;
    public int c;
    public abkk d;

    static {
        abkp abkpVar = new abkp();
        a = abkpVar;
        abkpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abkp.class, abkpVar);
    }

    private abkp() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0003ဉ\u0003", new Object[]{"b", "c", abih.a, "d"});
        }
        if (i2 == 3) {
            return new abkp();
        }
        if (i2 == 4) {
            return new abko();
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
        synchronized (abkp.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
