package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adgm extends abwz implements abxa {
    public static final adgm a;
    private static volatile abyy d;
    public int b;
    public adgl c;
    private byte e = 2;

    static {
        adgm adgmVar = new adgm();
        a = adgmVar;
        adgmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adgm.class, adgmVar);
    }

    private adgm() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\u0007", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new adgm();
        }
        if (i2 == 4) {
            return new adgf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adgm.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
