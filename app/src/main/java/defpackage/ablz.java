package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablz extends abxd implements abyr {
    public static final ablz a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        ablz ablzVar = new ablz();
        a = ablzVar;
        ablzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ablz.class, ablzVar);
    }

    private ablz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001;\u0000\u00025\u0000\u00033\u0000\u0004:\u0000\u0005;\u0000\u0006<\u0000", new Object[]{"c", "b", acip.class});
        }
        if (i2 == 3) {
            return new ablz();
        }
        if (i2 == 4) {
            return new ably();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ablz.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
