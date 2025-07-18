package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum uwz implements vug {
    TARGETING_FAILED_REASON_UNKNOWN(0),
    TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT(1),
    TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE(12),
    TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE(2),
    TARGETING_FAILED_REASON_MISSING_APP_STATE(3),
    TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE(4),
    TARGETING_FAILED_REASON_MISSING_APP_STATE_ELEMENTS_CONTAINED(5),
    TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE(6),
    TARGETING_FAILED_REASON_APP_STATE_NOT_MATCHING(7),
    TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND(8),
    TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK(9),
    TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED(10),
    TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET(11);

    public final int n;

    uwz(int i) {
        this.n = i;
    }

    public static uwz b(int i) {
        switch (i) {
            case 0:
                return TARGETING_FAILED_REASON_UNKNOWN;
            case 1:
                return TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT;
            case 2:
                return TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE;
            case 3:
                return TARGETING_FAILED_REASON_MISSING_APP_STATE;
            case 4:
                return TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE;
            case 5:
                return TARGETING_FAILED_REASON_MISSING_APP_STATE_ELEMENTS_CONTAINED;
            case 6:
                return TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE;
            case 7:
                return TARGETING_FAILED_REASON_APP_STATE_NOT_MATCHING;
            case 8:
                return TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND;
            case 9:
                return TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK;
            case 10:
                return TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED;
            case 11:
                return TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET;
            case 12:
                return TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE;
            default:
                return null;
        }
    }

    @Override // defpackage.vug
    public final int a() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
