package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum acwh implements abxf {
    SUBSCRIPTION_UNKNOWN(0),
    SUBSCRIPTION_LAYOUT_ROOT_MAX_WIDTH_DIMENSIONS(1),
    SUBSCRIPTION_LAYOUT_ROOT_MAX_HEIGHT_DIMENSIONS(2),
    SUBSCRIPTION_DEVICE_ORIENTATION(3),
    SUBSCRIPTION_WINDOW_SIZE(4),
    SUBSCRIPTION_PLATFORM_NAME(5),
    SUBSCRIPTION_FORM_FACTOR(6),
    SUBSCRIPTION_IS_SCREEN_READER_ACTIVE(7),
    SUBSCRIPTION_WINDOW_SAFE_AREA_INSETS(8),
    SUBSCRIPTION_IS_REDUCE_ANIMATIONS_SETTING_ENABLED(9),
    SUBSCRIPTION_FOLDING_DISPLAY_INFO(10);

    private final int m;

    acwh(int i) {
        this.m = i;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
