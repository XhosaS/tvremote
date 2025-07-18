package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnv extends dpf<dnv, dpc> implements dqb {
    public static final dnv DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile dqg<dnv> PARSER;
    public dpj<dnw> layout_ = dqi.a;
    public int nextIndex_;

    static {
        dnv dnvVar = new dnv();
        DEFAULT_INSTANCE = dnvVar;
        dpf.p(dnv.class, dnvVar);
    }

    private dnv() {
    }

    @Override // defpackage.dpf
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new dqj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", dnw.class, "nextIndex_"});
        }
        if (i2 == 3) {
            return new dnv();
        }
        if (i2 == 4) {
            return new dpc(DEFAULT_INSTANCE);
        }
        if (i2 != 5) {
            return null;
        }
        return DEFAULT_INSTANCE;
    }
}
