package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acij extends abxd implements abyr {
    public static final acij a;
    private static volatile abyy e;
    public int b;
    public int c;
    public abyl d = abyl.a;

    static {
        acij acijVar = new acij();
        a = acijVar;
        acijVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acij.class, acijVar);
    }

    private acij() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001င\u0000\u00022", new Object[]{"b", "c", "d", acih.a});
        }
        if (i2 == 3) {
            return new acij();
        }
        if (i2 == 4) {
            return new acii();
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
        synchronized (acij.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
