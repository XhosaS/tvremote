package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvu extends abxd implements abyr {
    public static final acvu a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public abvo d = abvo.b;

    static {
        acvu acvuVar = new acvu();
        a = acvuVar;
        acvuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acvu.class, acvuVar);
        b = new abxc(acyw.a, acvuVar, acvuVar, new abxb(null, 169768054, acap.MESSAGE, false, false));
    }

    private acvu() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ည\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new acvu();
        }
        if (i2 == 4) {
            return new acvt();
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
        synchronized (acvu.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
