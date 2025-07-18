package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adwk extends abxd implements abyr {
    public static final adwk a;
    private static volatile abyy b;
    private int c;
    private long d;
    private long e;
    private int f;
    private byte g = 2;

    static {
        adwk adwkVar = new adwk();
        a = adwkVar;
        adwkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adwk.class, adwkVar);
    }

    private adwk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0002\u0003ᔆ\u0004", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new adwk();
        }
        if (i2 == 4) {
            return new adwj();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adwk.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
