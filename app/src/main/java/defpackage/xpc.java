package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xpc extends abxd implements abyr {
    public static final xpc a;
    private static volatile abyy e;
    public int b;
    public xky c;
    private byte f = 2;
    public abxs d = abzb.b;

    static {
        xpc xpcVar = new xpc();
        a = xpcVar;
        xpcVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xpc.class, xpcVar);
    }

    private xpc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л", new Object[]{"b", "c", "d", xpa.class});
        }
        if (i2 == 3) {
            return new xpc();
        }
        if (i2 == 4) {
            return new xpb();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xpc.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
