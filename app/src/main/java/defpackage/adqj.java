package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adqj extends abwz implements abxa {
    public static final adqj a;
    private static volatile abyy g;
    public abxs b;
    public int c;
    public abxs d;
    public int e;
    public int f;
    private int h;
    private byte i = 2;

    static {
        adqj adqjVar = new adqj();
        a = adqjVar;
        adqjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adqj.class, adqjVar);
    }

    private adqj() {
        abzb abzbVar = abzb.b;
        this.b = abzbVar;
        this.d = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0001\u0001Л\u0002᠌\u0000\u0003᠌\u0001\u0004\u001a\u0005᠌\u0002", new Object[]{"h", "b", adql.class, "c", adqh.a, "e", adqe.a, "d", "f", adqc.a});
        }
        if (i2 == 3) {
            return new adqj();
        }
        if (i2 == 4) {
            return new adqg();
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
        synchronized (adqj.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
