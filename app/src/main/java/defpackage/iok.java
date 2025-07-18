package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iok extends abxd implements abyr {
    public static final iok a;
    private static volatile abyy e;
    public String b = "";
    public String c = "";
    public boolean d;

    static {
        iok iokVar = new iok();
        a = iokVar;
        iokVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(iok.class, iokVar);
    }

    private iok() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new iok();
        }
        if (i2 == 4) {
            return new ioj();
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
        synchronized (iok.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
