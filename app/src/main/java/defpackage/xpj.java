package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xpj extends abxd implements abyr {
    public static final xpj a;
    private static volatile abyy b;
    private int c;
    private xan d;
    private xan e;
    private xan f;
    private xan g;
    private byte h = 2;

    static {
        xpj xpjVar = new xpj();
        a = xpjVar;
        xpjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xpj.class, xpjVar);
    }

    private xpj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new xpj();
        }
        if (i2 == 4) {
            return new xpi();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xpj.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
