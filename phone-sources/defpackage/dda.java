package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dda extends dek<dda, dei> implements dfi {
    public static final dda DEFAULT_INSTANCE;
    private static volatile dfn<dda> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    public deo<String> strings_ = dfq.a;

    static {
        dda ddaVar = new dda();
        DEFAULT_INSTANCE = ddaVar;
        dek.p(dda.class, ddaVar);
    }

    private dda() {
    }

    @Override // defpackage.dek
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new dfr(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
        }
        if (i2 == 3) {
            return new dda();
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
