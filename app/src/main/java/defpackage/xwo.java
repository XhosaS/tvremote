package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xwo extends abwz implements abxa {
    public static final xwo a;
    private static volatile abyy d;
    public int b;
    public xwk c;
    private xwn e;
    private byte f = 2;

    static {
        xwo xwoVar = new xwo();
        a = xwoVar;
        xwoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xwo.class, xwoVar);
    }

    private xwo() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u000e\u0012\u0002\u0000\u0000\u0000\u000eဉ\r\u0012ဉ\u0011", new Object[]{"b", "e", "c"});
        }
        if (i2 == 3) {
            return new xwo();
        }
        if (i2 == 4) {
            return new xwg();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xwo.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
