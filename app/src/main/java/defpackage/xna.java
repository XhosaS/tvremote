package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xna extends abxd implements abyr {
    public static final xna a;
    private static volatile abyy d;
    public byte c = 2;
    public abxs b = abzb.b;

    static {
        xna xnaVar = new xna();
        a = xnaVar;
        xnaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xna.class, xnaVar);
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0001\u0003Л", new Object[]{"b", xne.class});
        }
        if (i2 == 3) {
            return new xna();
        }
        if (i2 == 4) {
            return new xmz();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.c = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xna.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
