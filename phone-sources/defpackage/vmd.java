package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vmd implements vug {
    REGISTRATION_REASON_UNSPECIFIED(0),
    DEVICE_START(1),
    APP_UPDATED(2),
    ACCOUNT_CHANGED(3),
    SERVER_SYNC_INSTRUCTION(4),
    LOCALE_CHANGED(5),
    TIMEZONE_CHANGED(6),
    COLLABORATOR_API_CALL(7),
    GUNS_MIGRATION(8),
    REGISTRATION_ID_CHANGED(9),
    APP_BLOCK_STATE_CHANGED(14),
    CHANNEL_BLOCK_STATE_CHANGED(10),
    GROWTHKIT_PERIODIC_REGISTRATION(11),
    PERIODIC_REGISTRATION(12),
    GMSCORE_DEBUG(13);

    public final int p;

    vmd(int i) {
        this.p = i;
    }

    public static vmd b(int i) {
        switch (i) {
            case 0:
                return REGISTRATION_REASON_UNSPECIFIED;
            case 1:
                return DEVICE_START;
            case 2:
                return APP_UPDATED;
            case 3:
                return ACCOUNT_CHANGED;
            case 4:
                return SERVER_SYNC_INSTRUCTION;
            case 5:
                return LOCALE_CHANGED;
            case 6:
                return TIMEZONE_CHANGED;
            case 7:
                return COLLABORATOR_API_CALL;
            case 8:
                return GUNS_MIGRATION;
            case 9:
                return REGISTRATION_ID_CHANGED;
            case 10:
                return CHANNEL_BLOCK_STATE_CHANGED;
            case 11:
                return GROWTHKIT_PERIODIC_REGISTRATION;
            case 12:
                return PERIODIC_REGISTRATION;
            case 13:
                return GMSCORE_DEBUG;
            case 14:
                return APP_BLOCK_STATE_CHANGED;
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
