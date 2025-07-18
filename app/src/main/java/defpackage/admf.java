package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class admf extends abxd implements abyr {
    public static final admf a;
    private static volatile abyy e;
    public abxs b;
    public abxs c;
    public abxs d;

    static {
        admf admfVar = new admf();
        a = admfVar;
        admfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(admf.class, admfVar);
    }

    private admf() {
        abzb abzbVar = abzb.b;
        this.b = abzbVar;
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
            return new abzc(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"b", admm.class, "c", admh.class, "d", admo.class});
        }
        if (i2 == 3) {
            return new admf();
        }
        if (i2 == 4) {
            return new adme();
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
        synchronized (admf.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
