package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgq extends abxd implements abyr {
    public static final abgq a;
    private static volatile abyy m;
    public abxs b;
    public abxs c;
    public abxs d;
    public String e;
    public boolean f;
    public abxs g;
    public abxs h;
    public abxs i;
    public abxs j;
    public abxs k;
    public abgi l;
    private int n;
    private abyl o = abyl.a;
    private byte p = 2;

    static {
        abgq abgqVar = new abgq();
        a = abgqVar;
        abgqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abgq.class, abgqVar);
    }

    private abgq() {
        abzb abzbVar = abzb.b;
        this.b = abzbVar;
        this.c = abzbVar;
        this.d = abzbVar;
        this.e = "";
        this.g = abzbVar;
        this.h = abzbVar;
        this.i = abzbVar;
        this.j = abzbVar;
        this.k = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.p);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\f\u0000\u0001\u0002\u000e\f\u0001\b\u0002\u0002Л\u0003\u001b\u0004\u001b\u0005Ȉ\u0006\u0007\u0007\u001b\bЛ\t\u001b\n\u001b\u000b2\f\u001b\u000eဉ\u0001", new Object[]{"n", "b", abhn.class, "c", abft.class, "d", abhk.class, "e", "f", "g", abge.class, "h", abhf.class, "i", abeu.class, "j", abgt.class, "o", abgp.a, "k", abgx.class, "l"});
        }
        if (i2 == 3) {
            return new abgq();
        }
        if (i2 == 4) {
            return new abgo();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.p = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = m;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abgq.class) {
            abwxVar = m;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                m = abwxVar;
            }
        }
        return abwxVar;
    }
}
