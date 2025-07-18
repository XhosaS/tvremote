package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vmh implements vug {
    UNKNOWN_INSTRUCTION(0),
    SYNC(1),
    FULL_SYNC(2),
    STORE_ALL_ACCOUNTS(3),
    UPDATE_THREAD(4),
    UPDATE_BADGE_COUNT(5),
    REMOVE_STORAGE(6),
    DELETE_NOTIFICATION(7),
    REFRESH_REGISTRATION(8);

    private final int k;

    vmh(int i) {
        this.k = i;
    }

    public static vmh b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_INSTRUCTION;
            case 1:
                return SYNC;
            case 2:
                return FULL_SYNC;
            case 3:
                return STORE_ALL_ACCOUNTS;
            case 4:
                return UPDATE_THREAD;
            case 5:
                return UPDATE_BADGE_COUNT;
            case 6:
                return REMOVE_STORAGE;
            case 7:
                return DELETE_NOTIFICATION;
            case 8:
                return REFRESH_REGISTRATION;
            default:
                return null;
        }
    }

    @Override // defpackage.vug
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
