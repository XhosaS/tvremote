package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxg extends abxd implements abyr {
    public static final fxg a;
    private static volatile abyy f;
    public abyl b = abyl.a;
    public abxs c = abzb.b;
    public String d = "";
    public String e = "";

    static {
        fxg fxgVar = new fxg();
        a = fxgVar;
        fxgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(fxg.class, fxgVar);
    }

    private fxg() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0000\u0001\u0005\u0004\u0001\u0001\u0000\u00012\u0002Ȉ\u0003Ȉ\u0005Ț", new Object[]{"b", fxf.a, "d", "e", "c"});
        }
        if (i2 == 3) {
            return new fxg();
        }
        if (i2 == 4) {
            return new fxc();
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
        synchronized (fxg.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
