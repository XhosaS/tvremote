package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrn extends abxd implements abyr {
    public static final abrn a;
    private static volatile abyy d;
    public int b;
    public acqi c;

    static {
        abrn abrnVar = new abrn();
        a = abrnVar;
        abrnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abrn.class, abrnVar);
    }

    private abrn() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abrn();
        }
        if (i2 == 4) {
            return new abrm();
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
        synchronized (abrn.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
