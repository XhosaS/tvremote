package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjh extends abxd implements abyr {
    public static final xjh a;
    public static volatile abyy b;
    private byte d = 2;
    public abxs c = abzb.b;

    static {
        xjh xjhVar = new xjh();
        a = xjhVar;
        xjhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xjh.class, xjhVar);
    }

    private xjh() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"c", xjg.class});
        }
        if (i2 == 3) {
            return new xjh();
        }
        if (i2 == 4) {
            return new xje();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.d = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xjh.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
