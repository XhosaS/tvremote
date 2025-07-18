package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adbi extends abxd implements abyr {
    public static final adbi a;
    private static volatile abyy b;
    private int c;
    private aazw d;
    private adbh e;
    private byte f = 2;

    static {
        adbi adbiVar = new adbi();
        a = adbiVar;
        adbiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adbi.class, adbiVar);
    }

    private adbi() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0002\u0006ᐉ\u0007\u0007ᐉ\b", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new adbi();
        }
        if (i2 == 4) {
            return new adbf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adbi.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
