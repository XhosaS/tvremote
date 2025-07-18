package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjc extends abxd implements abyr {
    public static final abjc a;
    private static volatile abyy f;
    public int b;
    public long c;
    public long d;
    public long e;

    static {
        abjc abjcVar = new abjc();
        a = abjcVar;
        abjcVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abjc.class, abjcVar);
    }

    private abjc() {
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
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0000\u0004ဂ\u0000\u0005ဂ\u0001\u0006ဂ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abjc();
        }
        if (i2 == 4) {
            return new abjb();
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
        synchronized (abjc.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
