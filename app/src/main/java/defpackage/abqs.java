package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqs extends abxd implements abyr {
    public static final abqs a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        abqs abqsVar = new abqs();
        a = abqsVar;
        abqsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abqs.class, abqsVar);
    }

    private abqs() {
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0001\u0000\u0000\t\t\u0001\u0000\u0001\u0000\t\u001b", new Object[]{"b", abre.class});
        }
        if (i2 == 3) {
            return new abqs();
        }
        if (i2 == 4) {
            return new abqr();
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
        synchronized (abqs.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
