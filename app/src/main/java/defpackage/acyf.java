package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyf extends abxd implements abyr {
    public static final acyf a;
    public static volatile abyy b;
    public static final abxc c;
    public int d;
    public int e;
    public boolean f = true;
    private int g;

    static {
        acyf acyfVar = new acyf();
        a = acyfVar;
        acyfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acyf.class, acyfVar);
        c = new abxc(acyu.a, acyfVar, acyfVar, new abxb(null, 188911708, acap.MESSAGE, false, false));
    }

    private acyf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"g", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new acyf();
        }
        if (i2 == 4) {
            return new acye();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acyf.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
