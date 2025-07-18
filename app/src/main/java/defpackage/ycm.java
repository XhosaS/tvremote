package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ycm extends abxd implements abyr {
    public static final ycm a;
    private static volatile abyy h;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;

    static {
        ycm ycmVar = new ycm();
        a = ycmVar;
        ycmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ycm.class, ycmVar);
    }

    private ycm() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004ဇ\u0003\u0005ဇ\u0004\u0006᠌\u0005", new Object[]{"b", "c", ycj.a, "d", adzc.a, "e", "f", "g", adzi.a});
        }
        if (i2 == 3) {
            return new ycm();
        }
        if (i2 == 4) {
            return new ycl();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ycm.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
