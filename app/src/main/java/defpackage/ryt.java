package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryt extends abxd implements abyr {
    public static final ryt a;
    private static volatile abyy f;
    public int b;
    public ryp c;
    public ryr e;
    private byte g = 2;
    public abvo d = abvo.b;

    static {
        ryt rytVar = new ryt();
        a = rytVar;
        rytVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ryt.class, rytVar);
    }

    private ryt() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ည\u0001\u0002ᐉ\u0002\u0003ဉ\u0000", new Object[]{"b", "d", "e", "c"});
        }
        if (i2 == 3) {
            return new ryt();
        }
        if (i2 == 4) {
            return new rys();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ryt.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
