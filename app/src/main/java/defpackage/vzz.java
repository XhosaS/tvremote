package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzz extends abxd implements abyr {
    public static final vzz a;
    private static volatile abyy f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        vzz vzzVar = new vzz();
        a = vzzVar;
        vzzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(vzz.class, vzzVar);
    }

    private vzz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0007\u0001\u0001\u0001\n\u0007\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\u0006=\u0000\nဈ\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (i2 == 3) {
            return new vzz();
        }
        if (i2 == 4) {
            return new vzx();
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
        synchronized (vzz.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
