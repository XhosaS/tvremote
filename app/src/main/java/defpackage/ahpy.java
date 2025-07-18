package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahpy extends abxd implements abyr {
    public static final ahpy a;
    private static volatile abyy f;
    public int b;
    public abxs c;
    public abxs d;
    public ahpw e;

    static {
        ahpy ahpyVar = new ahpy();
        a = ahpyVar;
        ahpyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahpy.class, ahpyVar);
    }

    private ahpy() {
        abzb abzbVar = abzb.b;
        this.c = abzbVar;
        this.d = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"b", "c", ahqe.class, "d", ahpu.class, "e"});
        }
        if (i2 == 3) {
            return new ahpy();
        }
        if (i2 == 4) {
            return new ahpx();
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
        synchronized (ahpy.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
