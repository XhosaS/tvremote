package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ymn extends abxd implements abyr {
    public static final ymn a;
    private static volatile abyy g;
    public String b = "";
    public abxs c;
    public String d;
    public abxs e;
    public String f;
    private int h;

    static {
        ymn ymnVar = new ymn();
        a = ymnVar;
        ymnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ymn.class, ymnVar);
    }

    private ymn() {
        abzb abzbVar = abzb.b;
        this.c = abzbVar;
        this.d = "";
        this.e = abzbVar;
        this.f = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0001\u0002\u001a\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0002", new Object[]{"h", "b", "c", "e", "f", "d"});
        }
        if (i2 == 3) {
            return new ymn();
        }
        if (i2 == 4) {
            return new ymm();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ymn.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
