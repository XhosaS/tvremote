package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jaw extends abxd implements abyr {
    public static final jaw a;
    private static volatile abyy f;
    public int b;
    public String c = "";
    public String d = "";
    public abxs e = abzb.b;

    static {
        jaw jawVar = new jaw();
        a = jawVar;
        jawVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(jaw.class, jawVar);
    }

    private jaw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", jau.class});
        }
        if (i2 == 3) {
            return new jaw();
        }
        if (i2 == 4) {
            return new jav();
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
        synchronized (jaw.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
