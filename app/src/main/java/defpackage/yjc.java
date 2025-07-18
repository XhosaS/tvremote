package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yjc extends abxd implements abyr {
    public static final yjc a;
    private static volatile abyy d;
    public abxs b = abzb.b;
    public boolean c;
    private int e;

    static {
        yjc yjcVar = new yjc();
        a = yjcVar;
        yjcVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yjc.class, yjcVar);
    }

    private yjc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0003\b\u0002\u0000\u0001\u0000\u0003\u001a\bဇ\u0003", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new yjc();
        }
        if (i2 == 4) {
            return new yjb();
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
        synchronized (yjc.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
