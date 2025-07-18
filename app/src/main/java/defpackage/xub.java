package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xub extends abxd implements abyr {
    public static final xub a;
    private static volatile abyy h;
    public int b;
    public int c;
    public ahob d;
    public int e;
    public acjc g;
    private byte i = 2;
    public String f = "";

    static {
        xub xubVar = new xub();
        a = xubVar;
        xubVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xub.class, xubVar);
    }

    private xub() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001᠌\u0000\u0002ᐉ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", xtz.a, "d", "e", yfx.a, "f", "g"});
        }
        if (i2 == 3) {
            return new xub();
        }
        if (i2 == 4) {
            return new xty();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xub.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
