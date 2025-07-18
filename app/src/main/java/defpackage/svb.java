package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svb extends abxd implements abyr {
    public static final svb a;
    private static volatile abyy h;
    public int b;
    public Object d;
    public int e;
    public sva f;
    public rvf g;
    public int c = 0;
    private byte i = 2;

    static {
        svb svbVar = new svb();
        a = svbVar;
        svbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(svb.class, svbVar);
    }

    private svb() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0001\u0001\u0003\u0007\u0005\u0000\u0000\u0002\u0003<\u0000\u0004\u083f\u0000\u0005ᐉ\u0001\u0006᠌\u0000\u0007ᐉ\u0002", new Object[]{"d", "c", "b", sag.class, tiw.a, "f", "e", ruz.a, "g"});
        }
        if (i2 == 3) {
            return new svb();
        }
        if (i2 == 4) {
            return new suy();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (svb.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
