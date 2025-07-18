package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class addd extends abwz implements abxa {
    public static final addd a;
    public static final abxc b;
    private static volatile abyy c;
    private byte d = 2;

    static {
        addd adddVar = new addd();
        a = adddVar;
        adddVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(addd.class, adddVar);
        b = new abxc(addb.a, abzb.b, adddVar, new abxb(null, 7, acap.MESSAGE, true, false));
    }

    private addd() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new addd();
        }
        if (i2 == 4) {
            return new addc();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.d = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (addd.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
