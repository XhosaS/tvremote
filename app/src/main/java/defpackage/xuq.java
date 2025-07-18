package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xuq extends abxd implements abyr {
    public static final xuq a;
    private static volatile abyy g;
    public int b;
    public xup c;
    public xuc d;
    public xuc e;
    public xuc f;
    private xup h;
    private xup i;
    private byte j = 2;

    static {
        xuq xuqVar = new xuq();
        a = xuqVar;
        xuqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xuq.class, xuqVar);
    }

    private xuq() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0005\f\u0006\u0000\u0000\u0006\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0004\nᐉ\u0005\u000bᐉ\u0006\fᐉ\u0007", new Object[]{"b", "c", "h", "i", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new xuq();
        }
        if (i2 == 4) {
            return new xuj();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xuq.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
