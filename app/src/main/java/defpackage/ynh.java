package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ynh implements abxf {
    UNSPECIFIED(0),
    ASK_FOR_CONSENT(1),
    ALREADY_CONSENTED(2),
    CONSENT_NOT_POSSIBLE(3),
    INVALID_PARAM_ERROR(4),
    UDC_SERVER_ERROR(5),
    SHOULD_NOT_TRIGGER_UDC_SETUP(6);

    public final int h;

    ynh(int i2) {
        this.h = i2;
    }

    public static ynh b(int i2) {
        switch (i2) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return ASK_FOR_CONSENT;
            case 2:
                return ALREADY_CONSENTED;
            case 3:
                return CONSENT_NOT_POSSIBLE;
            case 4:
                return INVALID_PARAM_ERROR;
            case 5:
                return UDC_SERVER_ERROR;
            case 6:
                return SHOULD_NOT_TRIGGER_UDC_SETUP;
            default:
                return null;
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
