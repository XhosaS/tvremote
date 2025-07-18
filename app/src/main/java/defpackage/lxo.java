package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxo extends abxd implements abyr {
    public static final lxo a;
    private static volatile abyy g;
    public int b;
    public String c = "";
    public abxs d;
    public abxs e;
    public String f;

    static {
        lxo lxoVar = new lxo();
        a = lxoVar;
        lxoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(lxo.class, lxoVar);
    }

    private lxo() {
        abzb abzbVar = abzb.b;
        this.d = abzbVar;
        this.e = abzbVar;
        this.f = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new lxo();
        }
        if (i2 == 4) {
            return new lxn();
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
        synchronized (lxo.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
