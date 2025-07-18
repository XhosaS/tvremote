package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcz extends dek<dcz, dei> implements dfi {
    public static final dcz DEFAULT_INSTANCE;
    private static volatile dfn<dcz> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    public dfc<String, ddb> preferences_ = dfc.a;

    static {
        dcz dczVar = new dcz();
        DEFAULT_INSTANCE = dczVar;
        dek.p(dcz.class, dczVar);
    }

    private dcz() {
    }

    @Override // defpackage.dek
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new dfr(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", dcy.a});
        }
        if (i2 == 3) {
            return new dcz();
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
