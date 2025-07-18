package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyu extends abwz implements abxa {
    public static final acyu a;
    private static volatile abyy b;
    private byte c = 2;

    static {
        acyu acyuVar = new acyu();
        a = acyuVar;
        acyuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acyu.class, acyuVar);
    }

    private acyu() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new acyu();
        }
        if (i2 == 4) {
            return new acyt();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.c = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acyu.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
