package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnw extends dpf<dnw, dpc> implements dqb {
    public static final dnw DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile dqg<dnw> PARSER;
    public int bitField0_;
    public int layoutIndex_;
    public dnx layout_;

    static {
        dnw dnwVar = new dnw();
        DEFAULT_INSTANCE = dnwVar;
        dpf.p(dnw.class, dnwVar);
    }

    private dnw() {
    }

    @Override // defpackage.dpf
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new dqj(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
        }
        if (i2 == 3) {
            return new dnw();
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
