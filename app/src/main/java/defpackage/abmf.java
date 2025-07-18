package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmf extends abxd implements abyr {
    public static final abmf a;
    private static volatile abyy e;
    public int b;
    public long d;
    private abyl f = abyl.a;
    public String c = "";

    static {
        abmf abmfVar = new abmf();
        a = abmfVar;
        abmfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abmf.class, abmfVar);
    }

    private abmf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\n\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0004\n2", new Object[]{"b", "c", "d", "f", abme.a});
        }
        if (i2 == 3) {
            return new abmf();
        }
        if (i2 == 4) {
            return new abmd();
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
        synchronized (abmf.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
