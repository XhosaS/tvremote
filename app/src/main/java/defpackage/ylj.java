package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ylj extends abxd implements abyr {
    public static final ylj a;
    private static volatile abyy e;
    public int b;
    public double c;
    public double d;

    static {
        ylj yljVar = new ylj();
        a = yljVar;
        yljVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ylj.class, yljVar);
    }

    private ylj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ylj();
        }
        if (i2 == 4) {
            return new yli();
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
        synchronized (ylj.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
