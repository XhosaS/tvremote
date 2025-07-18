package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxz extends abxd implements abyr {
    public static final rxz a;
    private static volatile abyy f;
    public int b;
    public int c;
    public rur d;
    private byte g = 2;
    public String e = "";

    static {
        rxz rxzVar = new rxz();
        a = rxzVar;
        rxzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rxz.class, rxzVar);
    }

    private rxz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0001\u0002᠌\u0000\u0003ᐉ\u0001\u0004ဈ\u0002", new Object[]{"b", "c", sdv.a, "d", "e"});
        }
        if (i2 == 3) {
            return new rxz();
        }
        if (i2 == 4) {
            return new rxy();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (rxz.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
