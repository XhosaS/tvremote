package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnz extends abxd implements abyr {
    public static final fnz a;
    private static volatile abyy e;
    public String b = "";
    public boolean c;
    public boolean d;

    static {
        fnz fnzVar = new fnz();
        a = fnzVar;
        fnzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(fnz.class, fnzVar);
    }

    private fnz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new fnz();
        }
        if (i2 == 4) {
            return new fny();
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
        synchronized (fnz.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
