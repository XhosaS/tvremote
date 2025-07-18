package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahyn extends abxd implements abyr {
    public static final int APP_ID_FIELD_NUMBER = 1;
    public static final int BOOL_VALUE_FIELD_NUMBER = 3;
    public static final int BYTES_VALUE_FIELD_NUMBER = 7;
    public static final ahyn DEFAULT_INSTANCE;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 5;
    public static final int INT_VALUE_FIELD_NUMBER = 4;
    public static final int MIN_VERSION_FIELD_NUMBER = 2;
    private static volatile abyy PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 6;
    public int bitField0_;
    public Object value_;
    public int valueCase_ = 0;
    public String appId_ = "";
    public String minVersion_ = "";

    static {
        ahyn ahynVar = new ahyn();
        DEFAULT_INSTANCE = ahynVar;
        ahynVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahyn.class, ahynVar);
    }

    private ahyn() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003:\u0000\u00045\u0000\u00054\u0000\u0006;\u0000\u0007=\u0000", new Object[]{"value_", "valueCase_", "bitField0_", "appId_", "minVersion_"});
        }
        if (i2 == 3) {
            return new ahyn();
        }
        if (i2 == 4) {
            return new ahym();
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
        synchronized (ahyn.class) {
            abwxVar = PARSER;
            if (abwxVar == null) {
                abwxVar = new abwx(DEFAULT_INSTANCE);
                PARSER = abwxVar;
            }
        }
        return abwxVar;
    }
}
