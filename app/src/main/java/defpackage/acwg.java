package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acwg extends abxd implements abyr {
    public static final acwg a;
    private static volatile abyy k;
    public int b;
    public int c;
    public acwf f;
    public acwb g;
    public acvz i;
    public String d = "";
    public abxj e = abxe.a;
    public String h = "";
    public String j = "";

    static {
        acwg acwgVar = new acwg();
        a = acwgVar;
        acwgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acwg.class, acwgVar);
    }

    private acwg() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\b\u0000\u0001\u0002\u000f\b\u0000\u0001\u0000\u0002᠌\u0001\u0004ဈ\u0003\tဉ\u0006\n'\u000bဉ\u0007\fဈ\b\u000eဉ\n\u000fဈ\u000b", new Object[]{"b", "c", acsv.a, "d", "f", "e", "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new acwg();
        }
        if (i2 == 4) {
            return new acvx();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = k;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acwg.class) {
            abwxVar = k;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                k = abwxVar;
            }
        }
        return abwxVar;
    }
}
