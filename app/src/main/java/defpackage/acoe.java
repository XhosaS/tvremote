package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acoe extends abxd implements abyr {
    public static final acoe a;
    public static final abxc b;
    private static volatile abyy f;
    public acow c;
    public acpc d;
    public acom e;
    private int g;

    static {
        acoe acoeVar = new acoe();
        a = acoeVar;
        acoeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acoe.class, acoeVar);
        b = new abxc(acgi.a, acoeVar, acoeVar, new abxb(null, 284070414, acap.MESSAGE, false, false));
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0006ဉ\u0005", new Object[]{"g", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new acoe();
        }
        if (i2 == 4) {
            return new acod();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acoe.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
