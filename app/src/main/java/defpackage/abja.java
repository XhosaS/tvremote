package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abja extends abxd implements abyr {
    public static final abja a;
    private static volatile abyy c;
    public abxj b = abxe.a;

    static {
        abja abjaVar = new abja();
        a = abjaVar;
        abjaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abja.class, abjaVar);
    }

    private abja() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new abja();
        }
        if (i2 == 4) {
            return new abiz();
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
        synchronized (abja.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
