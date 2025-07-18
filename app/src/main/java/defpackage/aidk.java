package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aidk extends abxd implements abyr {
    public static final aidk a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        aidk aidkVar = new aidk();
        a = aidkVar;
        aidkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aidk.class, aidkVar);
    }

    private aidk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", aidj.a});
        }
        if (i2 == 3) {
            return new aidk();
        }
        if (i2 == 4) {
            return new aidi();
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
        synchronized (aidk.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
