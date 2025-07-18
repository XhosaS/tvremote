package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xui extends abxd implements abyr {
    public static final xui a;
    private static volatile abyy d;
    public xuc b;
    private int e;
    private byte f = 2;
    public abxs c = abzb.b;

    static {
        xui xuiVar = new xui();
        a = xuiVar;
        xuiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xui.class, xuiVar);
    }

    private xui() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"e", "b", "c", xuh.class});
        }
        if (i2 == 3) {
            return new xui();
        }
        if (i2 == 4) {
            return new xud();
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
        synchronized (xui.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
