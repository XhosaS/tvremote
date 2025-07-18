package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum wnx implements vug {
    EVENT_TYPE_UNSPECIFIED(0),
    TVOD_TRANSACTION(1),
    WATCHLIST_UPDATE(2),
    PROVIDER_SELECTION_UPDATE(3),
    TVM_PLAYBACK(4),
    PARENTAL_CONTROLS(5),
    DOWNLOAD_LIST_CHANGED(6),
    FAMILY_SHARING(7),
    PREORDER_CANCELLATION(8),
    CONTINUE_WATCHING_UPDATE(9),
    UNRECOGNIZED(-1);

    private final int m;

    wnx(int i) {
        this.m = i;
    }

    public static wnx b(int i) {
        switch (i) {
            case 0:
                return EVENT_TYPE_UNSPECIFIED;
            case 1:
                return TVOD_TRANSACTION;
            case 2:
                return WATCHLIST_UPDATE;
            case 3:
                return PROVIDER_SELECTION_UPDATE;
            case 4:
                return TVM_PLAYBACK;
            case 5:
                return PARENTAL_CONTROLS;
            case 6:
                return DOWNLOAD_LIST_CHANGED;
            case 7:
                return FAMILY_SHARING;
            case 8:
                return PREORDER_CANCELLATION;
            case 9:
                return CONTINUE_WATCHING_UPDATE;
            default:
                return null;
        }
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
