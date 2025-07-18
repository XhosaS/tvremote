package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class llk extends abxd implements abyr {
    public static final llk a;
    private static volatile abyy e;
    public int b;
    public int c;
    public abxm d = abyf.a;

    static {
        llk llkVar = new llk();
        a = llkVar;
        llkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(llk.class, llkVar);
    }

    private llk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new llk();
        }
        if (i2 == 4) {
            return new llj();
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
        synchronized (llk.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
