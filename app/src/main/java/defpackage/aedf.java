package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aedf extends abxd implements abyr {
    public static final aedf a;
    private static volatile abyy e;
    public int b = 0;
    public Object c;
    public int d;
    private int f;

    static {
        aedf aedfVar = new aedf();
        a = aedfVar;
        aedfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aedf.class, aedfVar);
    }

    private aedf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\b\u0001\u0001\u0003\n\b\u0000\u0000\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\nဌ\u0000", new Object[]{"c", "b", "f", aedp.class, aedr.class, aedt.class, aedb.class, aedd.class, aedl.class, aedn.class, "d"});
        }
        if (i2 == 3) {
            return new aedf();
        }
        if (i2 == 4) {
            return new aede();
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
        synchronized (aedf.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
