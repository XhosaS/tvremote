package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adht extends abwz implements abxa {
    public static final adht a;
    private static volatile abyy f;
    public float c;
    public adgw d;
    public adha e;
    private int g;
    private adgw h;
    private adgw i;
    private adgw j;
    private adgc k;
    private byte l = 2;
    public String b = "";

    static {
        adht adhtVar = new adht();
        a = adhtVar;
        adhtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adht.class, adhtVar);
    }

    private adht() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\b\u0000\u0001\u0001\u0016\b\u0000\u0000\u0005\u0001ဈ\u0000\u0002ခ\u0003\u0003ᐉ\u0007\u0004ᐉ\b\u0006ᐉ\u000b\nᐉ\u0006\u0015ᐉ\t\u0016ဉ\n", new Object[]{"g", "b", "c", "i", "j", "k", "h", "d", "e"});
        }
        if (i2 == 3) {
            return new adht();
        }
        if (i2 == 4) {
            return new adhs();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.l = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adht.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
