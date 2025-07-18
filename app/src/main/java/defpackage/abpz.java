package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpz extends abxd implements abyr {
    public static final abpz a;
    private static volatile abyy b;
    private int c;
    private abpx d;
    private abpv e;
    private byte f = 2;

    static {
        abpz abpzVar = new abpz();
        a = abpzVar;
        abpzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abpz.class, abpzVar);
    }

    private abpz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0002", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new abpz();
        }
        if (i2 == 4) {
            return new abpy();
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
        synchronized (abpz.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
