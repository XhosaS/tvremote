package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abkt extends abxd implements abyr {
    public static final abkt a;
    private static volatile abyy c;
    public abyl b;
    private int d;
    private abyl e;
    private abmh f;
    private adwi g;
    private byte h;

    static {
        abkt abktVar = new abkt();
        a = abktVar;
        abktVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abkt.class, abktVar);
    }

    private abkt() {
        abyl abylVar = abyl.a;
        this.b = abylVar;
        this.e = abylVar;
        this.h = (byte) 2;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0002\u0000\u0001\u00012\u00022\u0005ᐉ\u0001\u0006ဉ\u0002", new Object[]{"d", "b", abkr.a, "e", abks.a, "f", "g"});
        }
        if (i2 == 3) {
            return new abkt();
        }
        if (i2 == 4) {
            return new abkq();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abkt.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
