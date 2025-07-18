package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjm extends abxd implements abyr {
    public static final abjm a;
    private static volatile abyy e;
    public int b;
    public int c;
    public abjo d;

    static {
        abjm abjmVar = new abjm();
        a = abjmVar;
        abjmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abjm.class, abjmVar);
    }

    private abjm() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"b", "c", abin.a, "d"});
        }
        if (i2 == 3) {
            return new abjm();
        }
        if (i2 == 4) {
            return new abjl();
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
        synchronized (abjm.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
