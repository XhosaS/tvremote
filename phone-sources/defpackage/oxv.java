package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oxv extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uwz uwzVar = (uwz) obj;
        switch (uwzVar) {
            case TARGETING_FAILED_REASON_UNKNOWN:
                return von.TARGETING_FAILED_REASON_UNKNOWN;
            case TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT:
                return von.TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT;
            case TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE:
                return von.TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE;
            case TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE:
                return von.TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE:
                return von.TARGETING_FAILED_REASON_MISSING_APP_STATE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE:
                return von.TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE_ELEMENTS_CONTAINED:
                return von.TARGETING_FAILED_REASON_MISSING_APP_STATE_ELEMENTS_CONTAINED;
            case TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE:
                return von.TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE;
            case TARGETING_FAILED_REASON_APP_STATE_NOT_MATCHING:
                return von.TARGETING_FAILED_REASON_APP_STATE_NOT_MATCHING;
            case TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND:
                return von.TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND;
            case TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK:
                return von.TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK;
            case TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED:
                return von.TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED;
            case TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET:
                return von.TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(uwzVar))));
        }
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        von vonVar = (von) obj;
        switch (vonVar) {
            case TARGETING_FAILED_REASON_UNKNOWN:
                return uwz.TARGETING_FAILED_REASON_UNKNOWN;
            case TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT:
                return uwz.TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT;
            case TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE:
                return uwz.TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE;
            case TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE:
                return uwz.TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE:
                return uwz.TARGETING_FAILED_REASON_MISSING_APP_STATE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE:
                return uwz.TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE_ELEMENTS_CONTAINED:
                return uwz.TARGETING_FAILED_REASON_MISSING_APP_STATE_ELEMENTS_CONTAINED;
            case TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE:
                return uwz.TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE;
            case TARGETING_FAILED_REASON_APP_STATE_NOT_MATCHING:
                return uwz.TARGETING_FAILED_REASON_APP_STATE_NOT_MATCHING;
            case TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND:
                return uwz.TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND;
            case TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK:
                return uwz.TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK;
            case TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED:
                return uwz.TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED;
            case TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET:
                return uwz.TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vonVar))));
        }
    }
}
