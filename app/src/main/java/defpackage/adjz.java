package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adjz extends abxd implements abyr {
    public static final adjz a;
    public static final abxc b;
    private static volatile abyy d;
    private byte e = 2;
    public abxj c = abxe.a;

    static {
        adjz adjzVar = new adjz();
        a = adjzVar;
        adjzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adjz.class, adjzVar);
        b = new abxc(adkb.a, adjzVar, adjzVar, new abxb(null, 33357560, acap.MESSAGE, false, false));
    }

    private adjz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u0016", new Object[]{"c"});
        }
        if (i2 == 3) {
            return new adjz();
        }
        if (i2 == 4) {
            return new adjy();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj != null ? (byte) 1 : (byte) 0;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adjz.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
