package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aedr extends abxd implements abyr {
    public static final aedr a;
    private static volatile abyy b;

    static {
        aedr aedrVar = new aedr();
        a = aedrVar;
        aedrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aedr.class, aedrVar);
    }

    private aedr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new aedr();
        }
        if (i2 == 4) {
            return new aedq();
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
        synchronized (aedr.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
