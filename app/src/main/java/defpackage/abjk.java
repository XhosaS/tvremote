package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjk extends abxd implements abyr {
    public static final abjk a;
    private static volatile abyy e;
    public int b;
    public abjj c;
    public abjg d;

    static {
        abjk abjkVar = new abjk();
        a = abjkVar;
        abjkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abjk.class, abjkVar);
    }

    private abjk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abjk();
        }
        if (i2 == 4) {
            return new abjh();
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
        synchronized (abjk.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
