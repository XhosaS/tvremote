package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vie implements vug {
    INTERACTION_TYPE_UNSPECIFIED(0),
    ACTION_CLICK(1),
    CLICKED(2),
    DISMISSED(5),
    DISMISSED_REMOTE(30),
    DISMISSED_BY_API(35),
    DISMISS_ALL(6),
    ADDED_TO_STORAGE(34),
    REPLACED_IN_STORAGE(36),
    SHOWN(9),
    SHOWN_REPLACED(28),
    SHOWN_FORCED(29),
    SHOWN_WITHOUT_IMAGE(10),
    CONTENT_EXPANDED(51),
    REMOVED_FROM_STORAGE(37),
    REMOVED(41),
    UNSHOWN(19),
    DELIVERED_FCM_PUSH(33),
    DELIVERED(11),
    DELIVERED_SYNC_INSTRUCTION(12),
    DELIVERED_FULL_SYNC_INSTRUCTION(13),
    DELIVERED_UPDATE_THREAD_INSTRUCTION(23),
    DELIVERED_REMOVE_STORAGE_INSTRUCTION(43),
    DELIVERED_REPLACED(57),
    DELIVERED_SILENT_NOTIFICATION(45),
    FETCHED_THREADS_BY_ID(42),
    FETCHED_LATEST_THREADS(20),
    FETCHED_UPDATED_THREADS(21),
    FETCHED_MULTI_USER_BADGE_COUNT(38),
    SUCCEED_TO_UPDATE_THREAD_STATE(15),
    SHOW_SKIPPED_DUE_TO_COUNTERFACTUAL(16),
    LOCAL_NOTIFICATION_CREATED(17),
    LOCAL_NOTIFICATION_UPDATED(22),
    EXPIRED(18),
    APP_BLOCK_STATE_CHANGED(24),
    NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED(25),
    NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED(26),
    PERIODIC_LOG(27),
    ACCOUNT_DATA_CLEANED(31),
    ACCOUNT_USERNAME_CHANGE(54),
    GMS_ACCOUNT_USERNAME_CHANGE(55),
    NOTIFICATION_DATA_CLEANED(44),
    TARGET_REGISTERED(32),
    LOCATION_TARGET_REGISTERED(46),
    VOIP_TARGET_REGISTERED(47),
    LIVE_ACTIVITY_TARGET_REGISTERED(49),
    LIVE_ACTIVITY_PTS_TARGET_REGISTERED(50),
    CONTROLS_TARGET_REGISTERED(56),
    LIVE_ACTIVITY_STARTED_LOCALLY(52),
    CLICK_DURATION_CLICK_OPENED_APP(39),
    CLICK_DURATION_CLICK_WHILE_OPEN(40),
    DSC_POSTPONED(48),
    DECRYPTED_SUCCESSFULLY(53);

    public final int ab;

    vie(int i) {
        this.ab = i;
    }

    public static vie b(int i) {
        switch (i) {
            case 0:
                return INTERACTION_TYPE_UNSPECIFIED;
            case 1:
                return ACTION_CLICK;
            case 2:
                return CLICKED;
            case 3:
            case 4:
            case 7:
            case 8:
            case 14:
            default:
                return null;
            case 5:
                return DISMISSED;
            case 6:
                return DISMISS_ALL;
            case 9:
                return SHOWN;
            case 10:
                return SHOWN_WITHOUT_IMAGE;
            case 11:
                return DELIVERED;
            case 12:
                return DELIVERED_SYNC_INSTRUCTION;
            case 13:
                return DELIVERED_FULL_SYNC_INSTRUCTION;
            case 15:
                return SUCCEED_TO_UPDATE_THREAD_STATE;
            case 16:
                return SHOW_SKIPPED_DUE_TO_COUNTERFACTUAL;
            case 17:
                return LOCAL_NOTIFICATION_CREATED;
            case 18:
                return EXPIRED;
            case 19:
                return UNSHOWN;
            case 20:
                return FETCHED_LATEST_THREADS;
            case 21:
                return FETCHED_UPDATED_THREADS;
            case 22:
                return LOCAL_NOTIFICATION_UPDATED;
            case 23:
                return DELIVERED_UPDATE_THREAD_INSTRUCTION;
            case 24:
                return APP_BLOCK_STATE_CHANGED;
            case 25:
                return NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED;
            case 26:
                return NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED;
            case 27:
                return PERIODIC_LOG;
            case 28:
                return SHOWN_REPLACED;
            case 29:
                return SHOWN_FORCED;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return DISMISSED_REMOTE;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return ACCOUNT_DATA_CLEANED;
            case 32:
                return TARGET_REGISTERED;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return DELIVERED_FCM_PUSH;
            case 34:
                return ADDED_TO_STORAGE;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return DISMISSED_BY_API;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return REPLACED_IN_STORAGE;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return REMOVED_FROM_STORAGE;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return FETCHED_MULTI_USER_BADGE_COUNT;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return CLICK_DURATION_CLICK_OPENED_APP;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return CLICK_DURATION_CLICK_WHILE_OPEN;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return REMOVED;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return FETCHED_THREADS_BY_ID;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return DELIVERED_REMOVE_STORAGE_INSTRUCTION;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return NOTIFICATION_DATA_CLEANED;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return DELIVERED_SILENT_NOTIFICATION;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return LOCATION_TARGET_REGISTERED;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return VOIP_TARGET_REGISTERED;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return DSC_POSTPONED;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return LIVE_ACTIVITY_TARGET_REGISTERED;
            case 50:
                return LIVE_ACTIVITY_PTS_TARGET_REGISTERED;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return CONTENT_EXPANDED;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return LIVE_ACTIVITY_STARTED_LOCALLY;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return DECRYPTED_SUCCESSFULLY;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return ACCOUNT_USERNAME_CHANGE;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return GMS_ACCOUNT_USERNAME_CHANGE;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return CONTROLS_TARGET_REGISTERED;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return DELIVERED_REPLACED;
        }
    }

    @Override // defpackage.vug
    public final int a() {
        return this.ab;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ab);
    }
}
