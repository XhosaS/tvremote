package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acqo extends abxd implements abyr {
    public static final acqo a;
    private static volatile abyy b;
    private int c;
    private eox d;
    private eov e;

    static {
        acqo acqoVar = new acqo();
        a = acqoVar;
        acqoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acqo.class, acqoVar);
    }

    private acqo() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0005\u0007\u0002\u0000\u0000\u0000\u0005ဉ\u0004\u0007ဉ\u0006", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new acqo();
        }
        if (i2 == 4) {
            return new acqn();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acqo.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
