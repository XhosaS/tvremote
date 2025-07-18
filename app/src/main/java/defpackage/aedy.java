package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aedy extends abxd implements abyr {
    public static final aedy a;
    private static volatile abyy h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g = "";
    private int i;

    static {
        aedy aedyVar = new aedy();
        a = aedyVar;
        aedyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aedy.class, aedyVar);
    }

    private aedy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0004\n\u0006\u0000\u0000\u0000\u0004ဌ\u0000\u0005ဌ\u0001\u0006ဌ\u0002\bဌ\u0004\tဌ\u0005\nለ\u0006", new Object[]{"i", "b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new aedy();
        }
        if (i2 == 4) {
            return new aedw();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aedy.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
