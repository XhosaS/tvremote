package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acnl extends abxd implements abyr {
    public static final acnl a;
    private static volatile abyy b;
    private int c;
    private acnr d;
    private byte e = 2;

    static {
        acnl acnlVar = new acnl();
        a = acnlVar;
        acnlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acnl.class, acnlVar);
    }

    private acnl() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0003", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new acnl();
        }
        if (i2 == 4) {
            return new acnk();
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
        synchronized (acnl.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
