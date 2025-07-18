package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adod extends abxd implements abyr {
    public static final adod a;
    private static volatile abyy e;
    public int b;
    public boolean c;
    public abxs d = abzb.b;

    static {
        adod adodVar = new adod();
        a = adodVar;
        adodVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adod.class, adodVar);
    }

    private adod() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0003\u001a", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new adod();
        }
        if (i2 == 4) {
            return new adoc();
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
        synchronized (adod.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
