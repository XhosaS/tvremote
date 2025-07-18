package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acoa extends abxd implements abyr {
    public static final acoa a;
    private static volatile abyy g;
    public int b;
    public int c = 0;
    public Object d;
    public abre e;
    public boolean f;

    static {
        acoa acoaVar = new acoa();
        a = acoaVar;
        acoaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acoa.class, acoaVar);
    }

    private acoa() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002:\u0000\u0003ဉ\u0000\u0004ဇ\u0001", new Object[]{"d", "c", "b", acoq.class, "e", "f"});
        }
        if (i2 == 3) {
            return new acoa();
        }
        if (i2 == 4) {
            return new acnz();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acoa.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
