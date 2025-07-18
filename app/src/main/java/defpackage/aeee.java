package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeee extends abxd implements abyr {
    public static final aeee a;
    private static volatile abyy j;
    public int b;
    public abxj c;
    public zmx d;
    public String e;
    public String f;
    public zox g;
    public znj h;
    public zng i;
    private mak k;
    private xbn l;
    private byte m = 2;

    static {
        aeee aeeeVar = new aeee();
        a = aeeeVar;
        aeeeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aeee.class, aeeeVar);
    }

    private aeee() {
        Object[] objArr = abzb.a;
        this.c = abxe.a;
        this.e = "";
        this.f = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\t\u0000\u0001\u0006\u0015\t\u0000\u0001\u0003\u0006ဈ\u0004\u0007ᐉ\u0002\nဈ\u0007\r\u0018\u0010ᐉ\u000b\u0012ᐉ\r\u0013ဉ\u000e\u0014ဉ\u000f\u0015ဉ\u0010", new Object[]{"b", "e", "d", "f", "c", "k", "l", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new aeee();
        }
        if (i2 == 4) {
            return new aeed();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.m = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aeee.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
