package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivi extends abxd implements abyr {
    public static final ivi a;
    private static volatile abyy e;
    public int b;
    public abzy c;
    public xdz d;
    private byte f = 2;

    static {
        ivi iviVar = new ivi();
        a = iviVar;
        iviVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ivi.class, iviVar);
    }

    private ivi() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ivi();
        }
        if (i2 == 4) {
            return new ivh();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ivi.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
