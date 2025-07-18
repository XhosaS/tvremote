package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acnr extends abxd implements abyr {
    public static final acnr a;
    private static volatile abyy b;
    private int c;
    private ackp d;
    private byte e = 2;

    static {
        acnr acnrVar = new acnr();
        a = acnrVar;
        acnrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acnr.class, acnrVar);
    }

    private acnr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new acnr();
        }
        if (i2 == 4) {
            return new acnq();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acnr.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
