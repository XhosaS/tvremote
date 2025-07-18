package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahyr extends abxd implements abyr {
    public static final ahyr DEFAULT_INSTANCE;
    public static final int FLAGS_FIELD_NUMBER = 1;
    private static volatile abyy PARSER;
    public abyl flags_ = abyl.a;

    static {
        ahyr ahyrVar = new ahyr();
        DEFAULT_INSTANCE = ahyrVar;
        ahyrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahyr.class, ahyrVar);
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"flags_", ahyq.a});
        }
        if (i2 == 3) {
            return new ahyr();
        }
        if (i2 == 4) {
            return new ahyp();
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
        synchronized (ahyr.class) {
            abwxVar = PARSER;
            if (abwxVar == null) {
                abwxVar = new abwx(DEFAULT_INSTANCE);
                PARSER = abwxVar;
            }
        }
        return abwxVar;
    }
}
