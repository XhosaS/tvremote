package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abos extends abwz implements abxa {
    public static final abos a;
    public static final abxc b;
    private static volatile abyy e;
    public aboq c;
    public aboq d;
    private int f;
    private byte g = 2;

    static {
        abos abosVar = new abos();
        a = abosVar;
        abosVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abos.class, abosVar);
        b = new abxc(aboy.a, abosVar, abosVar, new abxb(null, 1000, acap.MESSAGE, false, false));
    }

    private abos() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004", new Object[]{"f", "c", "d"});
        }
        if (i2 == 3) {
            return new abos();
        }
        if (i2 == 4) {
            return new abor();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abos.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
