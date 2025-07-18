package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yje extends abxd implements abyr {
    public static final yje a;
    private static volatile abyy f;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;

    static {
        yje yjeVar = new yje();
        a = yjeVar;
        yjeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yje.class, yjeVar);
    }

    private yje() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0001\u0001\u0001\u000f\u0003\u0000\u0000\u0000\u0001;\u0000\u0005ဇ\u0003\u000f:\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (i2 == 3) {
            return new yje();
        }
        if (i2 == 4) {
            return new yjd();
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
        synchronized (yje.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
