package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yko extends abxd implements abyr {
    public static final yko a;
    private static volatile abyy e;
    public int b;
    public String c = "";
    public int d;
    private ykm f;

    static {
        yko ykoVar = new yko();
        a = ykoVar;
        ykoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yko.class, ykoVar);
    }

    private yko() {
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u000f\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u000b᠌\u0003\u000fဉ\r", new Object[]{"b", "c", "d", yib.a, "f"});
        }
        if (i2 == 3) {
            return new yko();
        }
        if (i2 == 4) {
            return new ykn();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (yko.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
