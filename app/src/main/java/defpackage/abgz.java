package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgz extends abxd implements abyr {
    public static final abgz a;
    private static volatile abyy d;
    public String b = "";
    public abxs c = abzb.b;

    static {
        abgz abgzVar = new abgz();
        a = abgzVar;
        abgzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abgz.class, abgzVar);
    }

    private abgz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"b", "c", abfv.class});
        }
        if (i2 == 3) {
            return new abgz();
        }
        if (i2 == 4) {
            return new abgy();
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
        synchronized (abgz.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
