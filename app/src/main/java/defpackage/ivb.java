package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivb extends abxd implements abyr {
    public static final ivb a;
    private static volatile abyy f;
    public int b;
    public abzy c;
    public abxs d;
    public abxs e;

    static {
        ivb ivbVar = new ivb();
        a = ivbVar;
        ivbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ivb.class, ivbVar);
    }

    private ivb() {
        abzb abzbVar = abzb.b;
        this.d = abzbVar;
        this.e = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"b", "c", "d", iur.class, "e", iur.class});
        }
        if (i2 == 3) {
            return new ivb();
        }
        if (i2 == 4) {
            return new iva();
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
        synchronized (ivb.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
