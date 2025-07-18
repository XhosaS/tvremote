package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjj extends abxd implements abyr {
    public static final pjj a;
    public static volatile abyy b;
    public int c;
    public int e;
    public boolean f;
    public long g;
    public int i;
    public String d = "";
    public String h = "";

    static {
        pjj pjjVar = new pjj();
        a = pjjVar;
        pjjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(pjj.class, pjjVar);
    }

    private pjj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0001\u0004\u000b\u0006\u0000\u0000\u0000\u0004ဈ\u0000\u0005᠌\u0001\bဇ\u0002\tဂ\u0003\nဈ\u0004\u000bင\u0005", new Object[]{"c", "d", "e", piv.a, "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new pjj();
        }
        if (i2 == 4) {
            return new pji();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (pjj.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
