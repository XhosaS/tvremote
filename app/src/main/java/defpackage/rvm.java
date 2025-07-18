package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rvm extends abxd implements abyr {
    public static final rvm a;
    private static volatile abyy e;
    public int b;
    public rxd c;
    public int d;

    static {
        rvm rvmVar = new rvm();
        a = rvmVar;
        rvmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rvm.class, rvmVar);
    }

    private rvm() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", rxm.a});
        }
        if (i2 == 3) {
            return new rvm();
        }
        if (i2 == 4) {
            return new rvl();
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
        synchronized (rvm.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
