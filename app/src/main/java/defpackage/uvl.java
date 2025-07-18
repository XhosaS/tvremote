package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvl extends abxd implements abyr {
    public static final uvl a;
    private static volatile abyy f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        uvl uvlVar = new uvl();
        a = uvlVar;
        uvlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(uvl.class, uvlVar);
    }

    private uvl() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new uvl();
        }
        if (i2 == 4) {
            return new uvk();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (uvl.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
