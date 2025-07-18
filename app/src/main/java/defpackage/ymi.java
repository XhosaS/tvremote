package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ymi extends abxd implements abyr {
    public static final ymi a;
    private static volatile abyy e;
    public int b;
    public yke c;
    public ynp d;
    private yir f;

    static {
        ymi ymiVar = new ymi();
        a = ymiVar;
        ymiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ymi.class, ymiVar);
    }

    private ymi() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0010\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0007ဉ\u0006\u0010ဉ\u0010", new Object[]{"b", "c", "d", "f"});
        }
        if (i2 == 3) {
            return new ymi();
        }
        if (i2 == 4) {
            return new ymh();
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
        synchronized (ymi.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
