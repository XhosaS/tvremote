package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum uwt implements vug {
    CONDITION_UNKNOWN(0),
    CONDITION_NETWORK(1),
    CONDITION_NETWORK_NOT_READY(2),
    CONDITION_LOCALE(3),
    CONDITION_REGION(4),
    CONDITION_BATTERY(5),
    CONDITION_INSTALLED_APP(6),
    CONDITION_VIEW_NOT_IN_SCREEN(7),
    CONDITION_KEYBOARD_PRESENT(8),
    CONDITION_TIME_CONSTRAINT(9),
    CONDITION_SYNC_REQUIRED(10),
    CONDITION_VALID_INTENT(11),
    CONDITION_DASHER(12),
    CONDITION_MINOR(13),
    CONDITION_AUTH_URL(14);

    public final int p;

    uwt(int i) {
        this.p = i;
    }

    public static uwt b(int i) {
        switch (i) {
            case 0:
                return CONDITION_UNKNOWN;
            case 1:
                return CONDITION_NETWORK;
            case 2:
                return CONDITION_NETWORK_NOT_READY;
            case 3:
                return CONDITION_LOCALE;
            case 4:
                return CONDITION_REGION;
            case 5:
                return CONDITION_BATTERY;
            case 6:
                return CONDITION_INSTALLED_APP;
            case 7:
                return CONDITION_VIEW_NOT_IN_SCREEN;
            case 8:
                return CONDITION_KEYBOARD_PRESENT;
            case 9:
                return CONDITION_TIME_CONSTRAINT;
            case 10:
                return CONDITION_SYNC_REQUIRED;
            case 11:
                return CONDITION_VALID_INTENT;
            case 12:
                return CONDITION_DASHER;
            case 13:
                return CONDITION_MINOR;
            case 14:
                return CONDITION_AUTH_URL;
            default:
                return null;
        }
    }

    @Override // defpackage.vug
    public final int a() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
