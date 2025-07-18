package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ymc extends abxd implements abyr {
    public static final ymc a;
    private static volatile abyy l;
    public int b;
    public ylo c;
    public ylb d;
    public yka e;
    public yhs f;
    public yin g;
    public yni h;
    public yjc i;
    public ylx j;
    public yjn k;
    private int m;
    private yof n;
    private yhx o;
    private yja p;
    private byte q = 2;

    static {
        ymc ymcVar = new ymc();
        a = ymcVar;
        ymcVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ymc.class, ymcVar);
    }

    private ymc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.q);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\f\u0000\u0002\u0002@\f\u0000\u0000\u0002\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\tဉ\b\u000fဉ\u000e\u0012ဉ\u0012\u0014ᐉ\u0014\u001bဉ\u001a,ဉ+@ဉ:", new Object[]{"b", "m", "c", "d", "e", "f", "g", "n", "h", "i", "o", "j", "p", "k"});
        }
        if (i2 == 3) {
            return new ymc();
        }
        if (i2 == 4) {
            return new ymb();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.q = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = l;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ymc.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
