package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class addj extends abxd implements abyr {
    public static final addj a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public abvo d = abvo.b;

    static {
        addj addjVar = new addj();
        a = addjVar;
        addjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(addj.class, addjVar);
        b = new abxc(xew.a, addjVar, addjVar, new abxb(null, 1001, acap.MESSAGE, false, false));
    }

    private addj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new addj();
        }
        if (i2 == 4) {
            return new addi();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (addj.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
