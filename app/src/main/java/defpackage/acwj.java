package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acwj extends abxd implements abyr {
    public static final acwj a;
    private static volatile abyy m;
    public int b;
    public float c;
    public float d;
    public acvf e;
    public acys f;
    public int g;
    public int h;
    public boolean i;
    public acvi j;
    public boolean k;
    public acwt l;

    static {
        acwj acwjVar = new acwj();
        a = acwjVar;
        acwjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acwj.class, acwjVar);
    }

    private acwj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဇ\u0006\bဉ\u0007\tဇ\b\nဉ\t", new Object[]{"b", "c", "d", "e", "f", "g", acwl.a, "h", acwk.a, "i", "j", "k", "l"});
        }
        if (i2 == 3) {
            return new acwj();
        }
        if (i2 == 4) {
            return new acwi();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = m;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acwj.class) {
            abwxVar = m;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                m = abwxVar;
            }
        }
        return abwxVar;
    }
}
