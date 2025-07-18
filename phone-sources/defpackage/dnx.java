package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnx extends dpf<dnx, dpc> implements dqb {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    public static final dnx DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_ALPHA_FIELD_NUMBER = 12;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile dqg<dnx> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    public dpj<dnx> children_ = dqi.a;
    public boolean hasAction_;
    public boolean hasImageAlpha_;
    public boolean hasImageColorFilter_;
    public boolean hasImageDescription_;
    public int height_;
    public int horizontalAlignment_;
    public int identity_;
    public int imageScale_;
    public int type_;
    public int verticalAlignment_;
    public int width_;

    static {
        dnx dnxVar = new dnx();
        DEFAULT_INSTANCE = dnxVar;
        dpf.p(dnx.class, dnxVar);
    }

    private dnx() {
    }

    @Override // defpackage.dpf
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new dqj(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007\f\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", dnx.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_", "hasImageAlpha_"});
        }
        if (i2 == 3) {
            return new dnx();
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
