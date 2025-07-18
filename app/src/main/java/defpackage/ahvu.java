package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvu extends abxd implements abyr {
    public static final ahvu a;
    private static volatile abyy e;
    public int b;
    public int c;
    private ahvs f;
    private byte g = 2;
    public int d = 1;

    static {
        ahvu ahvuVar = new ahvu();
        a = ahvuVar;
        ahvuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahvu.class, ahvuVar);
    }

    private ahvu() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", ahvt.a, "d", "f"});
        }
        if (i2 == 3) {
            return new ahvu();
        }
        if (i2 == 4) {
            return new ahvq();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahvu.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
