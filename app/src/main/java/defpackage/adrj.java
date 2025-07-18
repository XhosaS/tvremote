package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adrj extends abxd implements abyr {
    public static final adrj a;
    private static volatile abyy c;
    public long b;
    private int d;

    static {
        adrj adrjVar = new adrj();
        a = adrjVar;
        adrjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adrj.class, adrjVar);
    }

    private adrj() {
        abyf abyfVar = abyf.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဂ\u0002", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new adrj();
        }
        if (i2 == 4) {
            return new adri();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adrj.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
