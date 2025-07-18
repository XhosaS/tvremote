package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adzd implements abxf {
    UNDEFINED_CLICK(0),
    SIGNED_IN_ENTRY_SCREEN_CONTINUE(1),
    SIGNED_OUT_ENTRY_SCREEN_SIGN_IN(2),
    SIGNED_OUT_ENTRY_SCREEN_SKIP(3),
    SIGN_IN_OPT_IN_SCREEN_SIGN_IN(4),
    SIGN_IN_OPT_IN_SCREEN_CONTINUE(5),
    OPT_IN_SCREEN_OPT_IN(6),
    OPT_IN_SCREEN_NO_THANKS(7),
    OPT_IN_LATER_SCREEN_CONTINUE(8),
    OPT_IN_LATER_SCREEN_REVIEW_PERMISSIONS(9),
    PERSONAL_RESULT_SCREEN_ALLOW(10),
    PERSONAL_RESULT_SCREEN_SKIP(11),
    PROMOTIONS_OPT_IN_SCREEN_YES(12),
    PROMOTIONS_OPT_IN_SCREEN_NO(13),
    FINISH_SCREEN_CONTINUE(14),
    BACK_BUTTON(15),
    HOME_BUTTON(16),
    THIRD_PARTY_DISCLOSURE_SCREEN_CONTINUE(17),
    DATA_SHARING_CONSENT_GRANTED(18),
    DATA_SHARING_CONSENT_DENIED(19),
    SIGNED_OUT_ENTRY_SCREEN_USE_WITHOUT_SIGN_IN(20),
    VOICE_MATCH_YES(21),
    VOICE_MATCH_NO(22),
    NETWORK_REAUTH_VERIFY(23),
    NETWORK_REAUTH_DECLINE(24);

    public final int z;

    adzd(int i) {
        this.z = i;
    }

    public static adzd b(int i) {
        switch (i) {
            case 0:
                return UNDEFINED_CLICK;
            case 1:
                return SIGNED_IN_ENTRY_SCREEN_CONTINUE;
            case 2:
                return SIGNED_OUT_ENTRY_SCREEN_SIGN_IN;
            case 3:
                return SIGNED_OUT_ENTRY_SCREEN_SKIP;
            case 4:
                return SIGN_IN_OPT_IN_SCREEN_SIGN_IN;
            case 5:
                return SIGN_IN_OPT_IN_SCREEN_CONTINUE;
            case 6:
                return OPT_IN_SCREEN_OPT_IN;
            case 7:
                return OPT_IN_SCREEN_NO_THANKS;
            case 8:
                return OPT_IN_LATER_SCREEN_CONTINUE;
            case 9:
                return OPT_IN_LATER_SCREEN_REVIEW_PERMISSIONS;
            case 10:
                return PERSONAL_RESULT_SCREEN_ALLOW;
            case 11:
                return PERSONAL_RESULT_SCREEN_SKIP;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return PROMOTIONS_OPT_IN_SCREEN_YES;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return PROMOTIONS_OPT_IN_SCREEN_NO;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return FINISH_SCREEN_CONTINUE;
            case 15:
                return BACK_BUTTON;
            case 16:
                return HOME_BUTTON;
            case 17:
                return THIRD_PARTY_DISCLOSURE_SCREEN_CONTINUE;
            case 18:
                return DATA_SHARING_CONSENT_GRANTED;
            case 19:
                return DATA_SHARING_CONSENT_DENIED;
            case 20:
                return SIGNED_OUT_ENTRY_SCREEN_USE_WITHOUT_SIGN_IN;
            case 21:
                return VOICE_MATCH_YES;
            case 22:
                return VOICE_MATCH_NO;
            case 23:
                return NETWORK_REAUTH_VERIFY;
            case 24:
                return NETWORK_REAUTH_DECLINE;
            default:
                return null;
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.z;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.z);
    }
}
