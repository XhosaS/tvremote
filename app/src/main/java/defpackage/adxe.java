package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adxe extends abxd implements abyr {
    public static final adxe a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        adxe adxeVar = new adxe();
        a = adxeVar;
        adxeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adxe.class, adxeVar);
    }

    private adxe() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", adxc.class});
        }
        if (i2 == 3) {
            return new adxe();
        }
        if (i2 == 4) {
            return new adxd();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adxe.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
