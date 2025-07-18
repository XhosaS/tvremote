package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adnz extends abxd implements abyr {
    public static final adnz a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;
    private int e;
    private adrt f;

    static {
        adnz adnzVar = new adnz();
        a = adnzVar;
        adnzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adnz.class, adnzVar);
    }

    private adnz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0001\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002=\u0000\u0003ဉ\u0002\u0005;\u0000\u0006;\u0000", new Object[]{"c", "b", "e", "f"});
        }
        if (i2 == 3) {
            return new adnz();
        }
        if (i2 == 4) {
            return new adny();
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
        synchronized (adnz.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
