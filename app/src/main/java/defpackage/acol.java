package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acol extends abxd implements abyr {
    public static final acol a;
    private static volatile abyy d;
    public int b;
    public abxs c = abzb.b;
    private int e;

    static {
        acol acolVar = new acol();
        a = acolVar;
        acolVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acol.class, acolVar);
    }

    private acol() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"e", "b", acgc.a, "c", achi.class});
        }
        if (i2 == 3) {
            return new acol();
        }
        if (i2 == 4) {
            return new acok();
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
        synchronized (acol.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
