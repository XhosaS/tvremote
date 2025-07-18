package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acuj extends abxd implements abyr {
    public static final acuj a;
    public static final abxc b;
    private static volatile abyy g;
    public int c;
    public acyw d;
    public acur e;
    public acuz f;
    private byte h = 2;

    static {
        acuj acujVar = new acuj();
        a = acujVar;
        acujVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acuj.class, acujVar);
        b = new abxc(aczf.a, acujVar, acujVar, new abxb(null, 168777401, acap.MESSAGE, false, false));
    }

    private acuj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0000\u0003\u0003ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\u0004", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new acuj();
        }
        if (i2 == 4) {
            return new acui();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acuj.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
