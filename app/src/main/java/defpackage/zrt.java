package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrt extends abxd implements abyr {
    public static final zrt a;
    private static volatile abyy d;
    public int b;
    public zrs c;

    static {
        zrt zrtVar = new zrt();
        a = zrtVar;
        zrtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zrt.class, zrtVar);
    }

    private zrt() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0005", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zrt();
        }
        if (i2 == 4) {
            return new zrq();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zrt.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
