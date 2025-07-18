package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddb extends dek<ddb, dei> implements dfi {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    public static final ddb DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile dfn<ddb> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    public int valueCase_ = 0;
    public Object value_;

    static {
        ddb ddbVar = new ddb();
        DEFAULT_INSTANCE = ddbVar;
        dek.p(ddb.class, ddbVar);
    }

    private ddb() {
    }

    public static dei b() {
        return DEFAULT_INSTANCE.i();
    }

    @Override // defpackage.dek
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new dfr(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", dda.class});
        }
        if (i2 == 3) {
            return new ddb();
        }
        if (i2 == 4) {
            return new dei(DEFAULT_INSTANCE);
        }
        if (i2 != 5) {
            return null;
        }
        return DEFAULT_INSTANCE;
    }
}
