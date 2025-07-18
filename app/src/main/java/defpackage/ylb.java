package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ylb extends abxd implements abyr {
    public static final ylb a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        ylb ylbVar = new ylb();
        a = ylbVar;
        ylbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ylb.class, ylbVar);
    }

    private ylb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"b", ykx.class});
        }
        if (i2 == 3) {
            return new ylb();
        }
        if (i2 == 4) {
            return new yla();
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
        synchronized (ylb.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
