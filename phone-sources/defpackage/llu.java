package defpackage;

import android.content.res.Resources;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llu implements idf {
    private final Resources a;

    public llu(Resources resources) {
        this.a = resources;
    }

    @Override // defpackage.idf
    public final /* bridge */ /* synthetic */ Object b(Object obj) throws Resources.NotFoundException {
        String string;
        llt lltVar = (llt) obj;
        int i = lltVar.a;
        switch (i) {
            case -1:
            case 0:
                return this.a.getString(R.string.error_generic);
            case 1:
                return this.a.getString(R.string.error_purchase_not_found);
            case 2:
                return this.a.getString(R.string.error_restricted_content_without_rating);
            case 3:
                return this.a.getString(R.string.error_restricted_content_with_rating, ((lma) lltVar.getCause()).a);
            case 4:
                return this.a.getString(R.string.error_preorder_not_released);
            case 5:
                return this.a.getString(R.string.error_cannot_activate_rental);
            case 6:
                return this.a.getString(R.string.no_network);
            case 7:
                return this.a.getString(R.string.unsupported_video_format);
            case 8:
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return this.a.getString(R.string.error_media_cannot_read, Integer.valueOf(lltVar.b));
            case 9:
                return this.a.getString(R.string.error_media_removed);
            case 10:
                return this.a.getString(R.string.error_media_shared);
            case 11:
                return this.a.getString(R.string.error_authenticating);
            case 12:
                return this.a.getString(R.string.error_connection);
            case 13:
                return this.a.getString(R.string.error_service_unavailable_with_code, Integer.valueOf(lltVar.b));
            case 14:
                return this.a.getString(R.string.error_http, Integer.valueOf(lltVar.b));
            case 15:
                return this.a.getString(R.string.error_response);
            case 16:
                return this.a.getString(R.string.error_network);
            case 17:
                return this.a.getString(R.string.video_not_found);
            case 18:
                return this.a.getString(R.string.error_download_not_started);
            case 19:
                return this.a.getString(R.string.error_download_not_found);
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 32:
            case 34:
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_buttonStyle /* 46 */:
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_colorError /* 56 */:
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
            default:
                return "";
            case 26:
                return this.a.getString(R.string.error_rental_pinned_elsewhere);
            case 27:
                return this.a.getString(R.string.error_purchase_pinned_elsewhere);
            case 28:
                return this.a.getString(R.string.error_simultaneous_playback_detected);
            case 29:
                return this.a.getString(R.string.error_concurrent_playbacks_by_account);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return this.a.getString(R.string.connection_to_server_lost);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return this.a.getString(R.string.error_unusual_account_activity);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return this.a.getString(R.string.rental_period_expired);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return this.a.getString(R.string.error_network_required_for_offline_license_refresh);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return this.a.getString(R.string.error_fetching_license, Integer.valueOf(lltVar.b));
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return this.a.getString(R.string.video_not_available_in_your_country);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return this.a.getString(R.string.error_playback_on_unsupported_device);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return this.a.getString(R.string.streaming_devices_quota_exceeded);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return this.a.getString(R.string.error_simultaneous_playback_by_family_detected);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return this.a.getString(R.string.error_concurrent_playbacks_by_family);
            case 50:
                return this.a.getString(R.string.error_invalid_offline_license);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return this.a.getString(R.string.error_generic_restart_device);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return this.a.getString(R.string.error_provisioning_device);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return this.a.getString(R.string.error_protected_buffer_not_supported);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                llz llzVar = (llz) lltVar.getCause();
                if (i == 54) {
                    string = this.a.getString(R.string.error_remote_license_aquire, llzVar.b());
                } else if (i != 63) {
                    switch (i) {
                        case android.support.v7.appcompat.R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                            string = this.a.getString(R.string.error_remote_connect_failed, llzVar.b());
                            break;
                        case android.support.v7.appcompat.R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                            string = this.a.getString(R.string.error_remote_connect_dropped, llzVar.b());
                            break;
                        case android.support.v7.appcompat.R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                            string = this.a.getString(R.string.error_remote_playing_video, llzVar.b());
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } else {
                    string = this.a.getString(R.string.error_remote_generic, llzVar.b());
                }
                llzVar.d();
                return string;
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return this.a.getString(R.string.error_network_low_bandwidth);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return this.a.getString(R.string.error_active_family_devices);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return this.a.getString(R.string.error_pinned_different_source);
        }
    }
}
