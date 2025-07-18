package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adyr extends abxd implements abyr {
    public static final adyr a;
    private static volatile abyy r;
    public int b;
    public adxv g;
    public adxp i;
    public adyf j;
    public adwo l;
    public int n;
    public aeaf o;
    public adzo p;
    public xjr q;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public abxs h = abzb.b;
    public String k = "";
    public String m = "";

    static {
        adyr adyrVar = new adyr();
        a = adyrVar;
        adyrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adyr.class, adyrVar);
    }

    private adyr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u000f\u0000\u0001\u0001\u0013\u000f\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ဉ\u0005\b\u001a\tဉ\u0007\nဉ\t\u000bဈ\n\u000eဉ\f\u000fဈ\r\u0010᠌\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", adyp.a, "o", "p", "q"});
        }
        if (i2 == 3) {
            return new adyr();
        }
        if (i2 == 4) {
            return new adyo();
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
        synchronized (adyr.class) {
            abwxVar = r;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                r = abwxVar;
            }
        }
        return abwxVar;
    }
}
