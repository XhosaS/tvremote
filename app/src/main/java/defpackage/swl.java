package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swl extends abxd implements abyr {
    public static final swl a;
    private static volatile abyy i;
    public int b;
    public boolean e;
    public int g;
    public int h;
    public int c = 4;
    public boolean d = true;
    public int f = 3;

    static {
        swl swlVar = new swl();
        a = swlVar;
        swlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(swl.class, swlVar);
    }

    private swl() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဇ\u0002", new Object[]{"b", "c", "d", "f", "g", "h", "e"});
        }
        if (i3 == 3) {
            return new swl();
        }
        if (i3 == 4) {
            return new swk();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (swl.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
