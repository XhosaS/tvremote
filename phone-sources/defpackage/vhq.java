package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vhq implements vug {
    NOTIFICATION_FAILURE_UNSPECIFIED(0),
    BAD_CHANNEL(1),
    CHANNEL_NOT_FOUND(34),
    CHANNEL_BLOCKED(35),
    USER_BLOCKED(6),
    BAD_PAYLOAD(2),
    INSUFFICIENT_DATA_NO_TITLE(7),
    INSUFFICIENT_DATA_NO_TEXT(8),
    DROPPED_BY_VERSION(41),
    DROPPED_OLDER_THAN_FIRST_REGISTRATION(51),
    THREAD_ALREADY_DISMISSED(53),
    DROPPED_BY_STATE(65),
    DROPPED_EXPIRED(66),
    MAX_NOTIFICATION_COUNT_REACHED(42),
    DROPPED_BY_CLIENT(3),
    DROPPED_BY_OS(69),
    INVALID_USER(4),
    RECIPIENT_NOT_FOUND(9),
    RECIPIENT_NOT_REGISTERED(10),
    RECIPIENT_INVALID_CREDENTIALS(25),
    FAILED_TO_DOWNLOAD_IMAGE(11),
    FAILED_TO_FETCH_NOTIFICATIONS_BY_ID(37),
    FAILED_TO_FETCH_LATEST_NOTIFICATIONS(12),
    FAILED_TO_FETCH_UPDATED_NOTIFICATIONS(13),
    FAILED_TO_REGISTER(14),
    FAILED_TO_REGISTER_OTHER_ACCOUNT(63),
    FAILED_TO_UNREGISTER(15),
    FAILED_TO_UPDATE_THREAD_STATE(16),
    FAILED_TO_UPDATE_THREAD_STATE_BY_TOKEN(17),
    FAILED_TO_FETCH_SUBSCRIPTIONS(38),
    FAILED_TO_SUBSCRIBE_TO_TOPICS(18),
    FAILED_TO_UNSUBSCRIBE_FROM_TOPICS(19),
    FAILED_TO_FETCH_PREFS(20),
    FAILED_TO_UPDATE_PREFS(21),
    FAILED_TO_ACKNOWLEDGE(22),
    FAILED_TO_FETCH_MULTI_USER_BADGE_COUNT(39),
    FAILED_TO_REGISTER_LOCATION(54),
    FAILED_TO_REGISTER_PUSHKIT(55),
    FAILED_TO_REGISTER_LIVE_ACTIVITY(62),
    FAILED_TO_REGISTER_LIVE_ACTIVITY_PTS(67),
    FAILED_TO_REGISTER_CONTROLS(68),
    FAILED_TO_COUNT_THREADS(56),
    FAILED_TO_UPDATE_ALL_THREAD_STATES(59),
    FAILED_TO_POST_LOCAL_NOTIFICATION(64),
    FAILED_TO_GET_IID(23),
    INCONSISTENT_COUNT(24),
    UPSTREAM_TASK_TOO_BIG(26),
    UPSTREAM_UPDATE_THREAD_STATE_TASK_PARSE_ERROR(27),
    UPSTREAM_UNKNOWN_SEND_ERROR(28),
    UPSTREAM_INVALID_PARAMETERS(29),
    UPSTREAM_TOO_BIG(30),
    UPSTREAM_SENT_BUT_NOT_IN_TASK_TABLE(31),
    FAILED_ACCOUNT_DATA_CLEANUP(36),
    DATABASE_ERROR(40),
    FAILED_TO_APPLY_CUSTOMIZATION(52),
    UPSTREAM_ZOMBIE_FOUND(32),
    UPSTREAM_TOO_MANY_PENDING_MESSAGES(33),
    SDK_DOES_NOT_SUPPORT(5),
    FAILED_TO_DECRYPT_PAYLOAD_FALLBACK_TO_PLACEHOLDER(57),
    FAILED_TO_DECRYPT_PAYLOAD_NO_PLACEHOLDER(58),
    FAILED_TO_DECOMPRESS_FALLBACK_TO_PLACEHOLDER(60),
    FAILED_TO_DECOMPRESS(61);

    public final int ak;

    vhq(int i) {
        this.ak = i;
    }

    public static vhq b(int i) {
        switch (i) {
            case 0:
                return NOTIFICATION_FAILURE_UNSPECIFIED;
            case 1:
                return BAD_CHANNEL;
            case 2:
                return BAD_PAYLOAD;
            case 3:
                return DROPPED_BY_CLIENT;
            case 4:
                return INVALID_USER;
            case 5:
                return SDK_DOES_NOT_SUPPORT;
            case 6:
                return USER_BLOCKED;
            case 7:
                return INSUFFICIENT_DATA_NO_TITLE;
            case 8:
                return INSUFFICIENT_DATA_NO_TEXT;
            case 9:
                return RECIPIENT_NOT_FOUND;
            case 10:
                return RECIPIENT_NOT_REGISTERED;
            case 11:
                return FAILED_TO_DOWNLOAD_IMAGE;
            case 12:
                return FAILED_TO_FETCH_LATEST_NOTIFICATIONS;
            case 13:
                return FAILED_TO_FETCH_UPDATED_NOTIFICATIONS;
            case 14:
                return FAILED_TO_REGISTER;
            case 15:
                return FAILED_TO_UNREGISTER;
            case 16:
                return FAILED_TO_UPDATE_THREAD_STATE;
            case 17:
                return FAILED_TO_UPDATE_THREAD_STATE_BY_TOKEN;
            case 18:
                return FAILED_TO_SUBSCRIBE_TO_TOPICS;
            case 19:
                return FAILED_TO_UNSUBSCRIBE_FROM_TOPICS;
            case 20:
                return FAILED_TO_FETCH_PREFS;
            case 21:
                return FAILED_TO_UPDATE_PREFS;
            case 22:
                return FAILED_TO_ACKNOWLEDGE;
            case 23:
                return FAILED_TO_GET_IID;
            case 24:
                return INCONSISTENT_COUNT;
            case 25:
                return RECIPIENT_INVALID_CREDENTIALS;
            case 26:
                return UPSTREAM_TASK_TOO_BIG;
            case 27:
                return UPSTREAM_UPDATE_THREAD_STATE_TASK_PARSE_ERROR;
            case 28:
                return UPSTREAM_UNKNOWN_SEND_ERROR;
            case 29:
                return UPSTREAM_INVALID_PARAMETERS;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return UPSTREAM_TOO_BIG;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return UPSTREAM_SENT_BUT_NOT_IN_TASK_TABLE;
            case 32:
                return UPSTREAM_ZOMBIE_FOUND;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return UPSTREAM_TOO_MANY_PENDING_MESSAGES;
            case 34:
                return CHANNEL_NOT_FOUND;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return CHANNEL_BLOCKED;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return FAILED_ACCOUNT_DATA_CLEANUP;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return FAILED_TO_FETCH_NOTIFICATIONS_BY_ID;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return FAILED_TO_FETCH_SUBSCRIPTIONS;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return FAILED_TO_FETCH_MULTI_USER_BADGE_COUNT;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return DATABASE_ERROR;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return DROPPED_BY_VERSION;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return MAX_NOTIFICATION_COUNT_REACHED;
            default:
                switch (i) {
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        return DROPPED_OLDER_THAN_FIRST_REGISTRATION;
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        return FAILED_TO_APPLY_CUSTOMIZATION;
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        return THREAD_ALREADY_DISMISSED;
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        return FAILED_TO_REGISTER_LOCATION;
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        return FAILED_TO_REGISTER_PUSHKIT;
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        return FAILED_TO_COUNT_THREADS;
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        return FAILED_TO_DECRYPT_PAYLOAD_FALLBACK_TO_PLACEHOLDER;
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        return FAILED_TO_DECRYPT_PAYLOAD_NO_PLACEHOLDER;
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        return FAILED_TO_UPDATE_ALL_THREAD_STATES;
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        return FAILED_TO_DECOMPRESS_FALLBACK_TO_PLACEHOLDER;
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        return FAILED_TO_DECOMPRESS;
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        return FAILED_TO_REGISTER_LIVE_ACTIVITY;
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        return FAILED_TO_REGISTER_OTHER_ACCOUNT;
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        return FAILED_TO_POST_LOCAL_NOTIFICATION;
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        return DROPPED_BY_STATE;
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        return DROPPED_EXPIRED;
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        return FAILED_TO_REGISTER_LIVE_ACTIVITY_PTS;
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        return FAILED_TO_REGISTER_CONTROLS;
                    case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                        return DROPPED_BY_OS;
                    default:
                        return null;
                }
        }
    }

    @Override // defpackage.vug
    public final int a() {
        return this.ak;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ak);
    }
}
