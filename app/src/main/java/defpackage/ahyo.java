package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahyo extends abxd implements abyr {
    public static final int CONSTRAINED_VALUES_FIELD_NUMBER = 8;
    public static final ahyo DEFAULT_INSTANCE;
    private static volatile abyy PARSER;
    public abxs constrainedValues_ = abzb.b;

    static {
        ahyo ahyoVar = new ahyo();
        DEFAULT_INSTANCE = ahyoVar;
        ahyoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahyo.class, ahyoVar);
    }

    private ahyo() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"constrainedValues_", ahyn.class});
        }
        if (i2 == 3) {
            return new ahyo();
        }
        if (i2 == 4) {
            return new ahyl();
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (i2 != 6) {
            return null;
        }
        abyy abyyVar = PARSER;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahyo.class) {
            abwxVar = PARSER;
            if (abwxVar == null) {
                abwxVar = new abwx(DEFAULT_INSTANCE);
                PARSER = abwxVar;
            }
        }
        return abwxVar;
    }
}
