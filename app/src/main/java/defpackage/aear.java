package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aear extends abxd implements abyr {
    public static final aear a;
    private static volatile abyy r;
    public int b;
    public aebk e;
    public int h;
    public boolean i;
    public boolean l;
    public aeaq n;
    public boolean o;
    public String c = "";
    public String d = "";
    public String f = "";
    public String g = "";
    public abxs j = abzb.b;
    public int k = 1;
    public String m = "";
    public boolean p = true;
    public boolean q = true;

    static {
        aear aearVar = new aear();
        a = aearVar;
        aearVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aear.class, aearVar);
    }

    private aear() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u000f\u0000\u0001\u0002\u0011\u000f\u0000\u0001\u0000\u0002ဈ\u0001\u0003ဉ\u0003\u0004ဈ\u0002\u0005ဈ\u0004\u0006ဈ\u0005\u0007င\u0006\tဇ\b\n\u001b\u000b᠌\t\fဇ\n\rဈ\u000b\u000eဉ\f\u000fဇ\r\u0010ဇ\u000e\u0011ဇ\u000f", new Object[]{"b", "c", "e", "d", "f", "g", "h", "i", "j", xjr.class, "k", aeam.a, "l", "m", "n", "o", "p", "q"});
        }
        if (i2 == 3) {
            return new aear();
        }
        if (i2 == 4) {
            return new aeao();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = r;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aear.class) {
            abwxVar = r;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                r = abwxVar;
            }
        }
        return abwxVar;
    }
}
