package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vlk implements vug {
    CUSTOM_UI_TYPE_UNKNOWN(0),
    CUSTOM_UI_TYPE_GROWTH_CATALOG_DIALOG(1),
    GROWTH_CATALOG_IOS_CUSTOM_UI_ID(2),
    CUSTOM_UI_TYPE_UI_TESTING_ID(3),
    CUSTOM_UI_TYPE_ANDROID_DESKTOP_GROWTH_NUDGE(4),
    CUSTOM_UI_TYPE_OG_CALLOUT(5),
    CUSTOM_UI_TYPE_APP_LAUNCHER(6);

    public final int h;

    vlk(int i2) {
        this.h = i2;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
