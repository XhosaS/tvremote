package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adzf implements abxf {
    ERROR_SETUP_UNKNOWN(0),
    ERROR_UPDATE_PERSONAL_RESULTS_OPTIN(1),
    ERROR_UPDATE_PROMOTION_EMAILS_OPTIN(2),
    ERROR_UPDATE_UDC_SETTINGS(3),
    ERROR_UPDATE_DEVICE_REGISTRATION(4),
    ERROR_GET_UDC_SETTINGS(5),
    ERROR_SET_DEFAULT_MUSIC_PROVIDER(6),
    ERROR_GET_INITIAL_SETTINGS(7),
    ERROR_CHECK_AUTH_STATUS(8),
    ERROR_GET_INTENT_FOR_ADD_ACCOUNT(9),
    ERROR_GET_ACTIVITY_FOR_ADD_ACCOUNT(10),
    ERROR_UPDATE_CAST_SETTINGS(11),
    RECOVERABLE_ERROR_CHECK_AUTH_STATUS(12),
    ERROR_UPDATE_DSC_SETTINGS(13),
    ERROR_VOICE_MATCH_LOADING_TIMED_OUT(14),
    ERROR_VOICE_MATCH_LOADING(15),
    ERROR_GET_NEUTRAL_BUTTON_SETTINGS(16),
    ERROR_SOMETHING_WENT_WRONG_TOAST(17),
    ERROR_LOAD_AGSA_EXPERIMENTS_CONFIG(18),
    ERROR_LOAD_KATNISS_EXPERIMENTS_CONFIG(19),
    ERROR_GET_NULL_UDC_SETTINGS_STATUS(20),
    ERROR_GET_INVALID_PARAM_ERROR_UDC(21),
    ERROR_GET_UDC_SERVER_ERROR(22),
    ERROR_GET_CONSENT_NOT_POSSIBLE_UDC(23),
    ERROR_GET_SHOULD_NOT_TRIGGER_UDC_SETUP_UDC(24),
    ERROR_INITIAL_LOADING_TIMED_OUT(25);

    public final int A;

    adzf(int i) {
        this.A = i;
    }

    public static adzf b(int i) {
        switch (i) {
            case 0:
                return ERROR_SETUP_UNKNOWN;
            case 1:
                return ERROR_UPDATE_PERSONAL_RESULTS_OPTIN;
            case 2:
                return ERROR_UPDATE_PROMOTION_EMAILS_OPTIN;
            case 3:
                return ERROR_UPDATE_UDC_SETTINGS;
            case 4:
                return ERROR_UPDATE_DEVICE_REGISTRATION;
            case 5:
                return ERROR_GET_UDC_SETTINGS;
            case 6:
                return ERROR_SET_DEFAULT_MUSIC_PROVIDER;
            case 7:
                return ERROR_GET_INITIAL_SETTINGS;
            case 8:
                return ERROR_CHECK_AUTH_STATUS;
            case 9:
                return ERROR_GET_INTENT_FOR_ADD_ACCOUNT;
            case 10:
                return ERROR_GET_ACTIVITY_FOR_ADD_ACCOUNT;
            case 11:
                return ERROR_UPDATE_CAST_SETTINGS;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return RECOVERABLE_ERROR_CHECK_AUTH_STATUS;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return ERROR_UPDATE_DSC_SETTINGS;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ERROR_VOICE_MATCH_LOADING_TIMED_OUT;
            case 15:
                return ERROR_VOICE_MATCH_LOADING;
            case 16:
                return ERROR_GET_NEUTRAL_BUTTON_SETTINGS;
            case 17:
                return ERROR_SOMETHING_WENT_WRONG_TOAST;
            case 18:
                return ERROR_LOAD_AGSA_EXPERIMENTS_CONFIG;
            case 19:
                return ERROR_LOAD_KATNISS_EXPERIMENTS_CONFIG;
            case 20:
                return ERROR_GET_NULL_UDC_SETTINGS_STATUS;
            case 21:
                return ERROR_GET_INVALID_PARAM_ERROR_UDC;
            case 22:
                return ERROR_GET_UDC_SERVER_ERROR;
            case 23:
                return ERROR_GET_CONSENT_NOT_POSSIBLE_UDC;
            case 24:
                return ERROR_GET_SHOULD_NOT_TRIGGER_UDC_SETUP_UDC;
            case 25:
                return ERROR_INITIAL_LOADING_TIMED_OUT;
            default:
                return null;
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.A;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.A);
    }
}
