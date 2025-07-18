package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abom extends abxd implements abyr {
    public static final abom a;
    public static final abxc b;
    private static volatile abyy d;
    private byte e = 2;
    public abxs c = abzb.b;

    static {
        abom abomVar = new abom();
        a = abomVar;
        abomVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abom.class, abomVar);
        b = new abxc(aboi.a, abomVar, abomVar, new abxb(null, 66768280, acap.MESSAGE, false, false));
    }

    private abom() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0001\u0001\u0006Л", new Object[]{"c", abol.class});
        }
        if (i2 == 3) {
            return new abom();
        }
        if (i2 == 4) {
            return new aboj();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abom.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
