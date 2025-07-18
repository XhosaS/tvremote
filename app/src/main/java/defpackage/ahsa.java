package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahsa extends abxd implements abyr {
    public static final ahsa a;
    private static volatile abyy d;
    public int b;
    public boolean c;

    static {
        ahsa ahsaVar = new ahsa();
        a = ahsaVar;
        ahsaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahsa.class, ahsaVar);
    }

    private ahsa() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ahsa();
        }
        if (i2 == 4) {
            return new ahrz();
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
        synchronized (ahsa.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
