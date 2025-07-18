package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class addu extends abwz implements abxa {
    public static final addu a;
    public static final abxc b;
    private static volatile abyy m;
    public int c;
    public int e;
    public acjc f;
    public int g;
    public int h;
    public zsw k;
    public abyl l = abyl.a;
    private byte o = 2;
    public int d = -1;
    public String i = "";
    public int j = -1;

    static {
        addu adduVar = new addu();
        a = adduVar;
        adduVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(addu.class, adduVar);
        b = new abxc(acxt.a, adduVar, adduVar, new abxb(null, 270923820, acap.MESSAGE, false, false));
    }

    private addu() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\t\u0000\u0001\u0001\u000b\t\u0001\u0000\u0002\u0001င\u0000\u0002᠌\u0001\u0003ᐉ\u0002\u0004᠌\u0003\u0005ဈ\u0005\u0006င\u0006\bᐉ\u0007\n᠌\u0004\u000b2", new Object[]{"c", "d", "e", adds.a, "f", "g", addn.a, "i", "j", "k", "h", addq.a, "l", addp.a});
        }
        if (i2 == 3) {
            return new addu();
        }
        if (i2 == 4) {
            return new addm();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.o = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = m;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (addu.class) {
            abwxVar = m;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                m = abwxVar;
            }
        }
        return abwxVar;
    }
}
