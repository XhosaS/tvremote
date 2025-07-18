package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfy extends abxd implements abyr {
    public static final abfy a;
    private static volatile abyy e;
    public String b = "";
    public String c = "";
    public abxs d = abzb.b;

    static {
        abfy abfyVar = new abfy();
        a = abfyVar;
        abfyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abfy.class, abfyVar);
    }

    private abfy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004Ț", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abfy();
        }
        if (i2 == 4) {
            return new abfx();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abfy.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
