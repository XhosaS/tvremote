package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tiq extends abxd implements abyr {
    public static final tiq a;
    private static volatile abyy g;
    public int b;
    public int d;
    public acjc f;
    private byte h = 2;
    public String c = "";
    public abxs e = abzb.b;

    static {
        tiq tiqVar = new tiq();
        a = tiqVar;
        tiqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(tiq.class, tiqVar);
    }

    private tiq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002င\u0001\u0003\u001a\u0004ᐉ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new tiq();
        }
        if (i2 == 4) {
            return new tip();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (tiq.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
