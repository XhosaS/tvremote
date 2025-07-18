package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abag extends abxd implements abyr {
    public static final abag a;
    private static volatile abyy b;
    private int c;
    private abac d;
    private abac e;
    private byte f = 2;

    static {
        abag abagVar = new abag();
        a = abagVar;
        abagVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abag.class, abagVar);
    }

    private abag() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔉ\u0000\u0002ᔉ\u0001", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new abag();
        }
        if (i2 == 4) {
            return new abaf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abag.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
