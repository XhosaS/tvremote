package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adgw extends abwz implements abxa {
    public static final adgw a;
    private static volatile abyy d;
    public float b;
    private int e;
    private float f;
    private float g;
    private float h;
    private byte i = 2;
    public abxs c = abzb.b;

    static {
        adgw adgwVar = new adgw();
        a = adgwVar;
        adgwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adgw.class, adgwVar);
    }

    private adgw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0005\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003\u0005б", new Object[]{"e", "b", "f", "g", "h", "c", adgv.class});
        }
        if (i2 == 3) {
            return new adgw();
        }
        if (i2 == 4) {
            return new adgt();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adgw.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
