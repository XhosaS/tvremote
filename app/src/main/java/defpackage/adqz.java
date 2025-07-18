package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adqz extends abwz implements abxa {
    public static final adqz a;
    private static volatile abyy g;
    public Object c;
    public int d;
    private int h;
    public int b = 0;
    private byte i = 2;
    public abxs e = abzb.b;
    public String f = "";

    static {
        adqz adqzVar = new adqz();
        a = adqzVar;
        adqzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adqz.class, adqzVar);
    }

    private adqz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0001\u0003\u0001м\u0000\u0002м\u0000\u0003᠌\u0000\u0004м\u0000\u0007\u001b\bဈ\u0002", new Object[]{"c", "b", "h", adpr.class, adqr.class, "d", adsi.a, adqv.class, "e", adqn.class, "f"});
        }
        if (i2 == 3) {
            return new adqz();
        }
        if (i2 == 4) {
            return new adqw();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adqz.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
