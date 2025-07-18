package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yas extends abxd implements abyr {
    public static final yas a;
    private static volatile abyy e;
    public int b;
    public int c;
    public int d;

    static {
        yas yasVar = new yas();
        a = yasVar;
        yasVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yas.class, yasVar);
    }

    private yas() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", yap.a, "d", yaq.a});
        }
        if (i2 == 3) {
            return new yas();
        }
        if (i2 == 4) {
            return new yar();
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
        synchronized (yas.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
