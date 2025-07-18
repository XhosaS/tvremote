package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvz extends abxd implements abyr {
    public static final fvz a;
    private static volatile abyy l;
    public int b;
    public yin c;
    public yjc d;
    public abzy e;
    public ylo f;
    public ylx g;
    public int h;
    public yni i;
    public boolean j;
    public boolean k;

    static {
        fvz fvzVar = new fvz();
        a = fvzVar;
        fvzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(fvz.class, fvzVar);
    }

    private fvz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\t\u0000\u0001\u0003\u0014\t\u0000\u0000\u0000\u0003᠌\u0007\u000bဉ\u0006\u000eဉ\u0004\u000fဉ\u0001\u0010ဉ\u0005\u0011ဉ\b\u0012ဉ\u0000\u0013ဇ\t\u0014ဇ\n", new Object[]{"b", "h", yng.a, "g", "e", "d", "f", "i", "c", "j", "k"});
        }
        if (i2 == 3) {
            return new fvz();
        }
        if (i2 == 4) {
            return new fvy();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = l;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (fvz.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
