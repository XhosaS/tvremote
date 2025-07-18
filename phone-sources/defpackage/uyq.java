package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum uyq implements vug {
    UITYPE_NONE(0),
    UITYPE_DO_NOT_DISPLAY(1),
    UITYPE_RATING_DEFAULT(2),
    UITYPE_RATING_SYSTEM_DIALOG(3),
    UITYPE_RATING_MATERIAL_DIALOG(4),
    UITYPE_RATING_PREFERRED_DIALOG(5),
    UITYPE_RATING_PREFERRED_BOTTOMSHEET(6),
    UITYPE_RATING_NATIVE_STORE_REVIEW_DIALOG(7),
    UITYPE_NON_BLOCKING_BOTTOMSHEET(8),
    UITYPE_DIALOG(12),
    UITYPE_TAP_TARGET(9),
    UITYPE_TOOLTIP(11),
    UITYPE_NOTIFICATION(10),
    UITYPE_PERMISSION(13),
    UITYPE_GM_DIALOG(14),
    UITYPE_GM_TAP_TARGET(15),
    UITYPE_GM_TOOLTIP(16),
    UITYPE_GNP_CUSTOM_UI(17);

    public final int s;

    uyq(int i) {
        this.s = i;
    }

    public static uyq b(int i) {
        switch (i) {
            case 0:
                return UITYPE_NONE;
            case 1:
                return UITYPE_DO_NOT_DISPLAY;
            case 2:
                return UITYPE_RATING_DEFAULT;
            case 3:
                return UITYPE_RATING_SYSTEM_DIALOG;
            case 4:
                return UITYPE_RATING_MATERIAL_DIALOG;
            case 5:
                return UITYPE_RATING_PREFERRED_DIALOG;
            case 6:
                return UITYPE_RATING_PREFERRED_BOTTOMSHEET;
            case 7:
                return UITYPE_RATING_NATIVE_STORE_REVIEW_DIALOG;
            case 8:
                return UITYPE_NON_BLOCKING_BOTTOMSHEET;
            case 9:
                return UITYPE_TAP_TARGET;
            case 10:
                return UITYPE_NOTIFICATION;
            case 11:
                return UITYPE_TOOLTIP;
            case 12:
                return UITYPE_DIALOG;
            case 13:
                return UITYPE_PERMISSION;
            case 14:
                return UITYPE_GM_DIALOG;
            case 15:
                return UITYPE_GM_TAP_TARGET;
            case 16:
                return UITYPE_GM_TOOLTIP;
            case 17:
                return UITYPE_GNP_CUSTOM_UI;
            default:
                return null;
        }
    }

    @Override // defpackage.vug
    public final int a() {
        return this.s;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.s);
    }
}
