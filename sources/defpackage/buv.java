package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum buv {
    CONFIGURE,
    SET_ACTIVE,
    PING_REQUEST,
    PING_RESPONSE,
    KEY_INJECT,
    IME_KEY_INJECT,
    IME_BATCH_EDIT,
    IME_SHOW_REQUEST,
    VOICE_BEGIN,
    VOICE_PAYLOAD,
    VOICE_END,
    SET_VOLUME_LEVEL,
    ADJUST_VOLUME_LEVEL,
    SET_PREFERRED_AUDIO_DEVICE,
    RESET_PREFERRED_AUDIO_DEVICE,
    APP_LINK_LAUNCH_REQUEST,
    FMR_TRIGGER,
    MESSAGETYPE_NOT_SET;

    public static buv a(int i) {
        if (i == 0) {
            return MESSAGETYPE_NOT_SET;
        }
        if (i == 1) {
            return CONFIGURE;
        }
        if (i == 2) {
            return SET_ACTIVE;
        }
        if (i == 50) {
            return SET_VOLUME_LEVEL;
        }
        if (i == 51) {
            return ADJUST_VOLUME_LEVEL;
        }
        if (i == 60) {
            return SET_PREFERRED_AUDIO_DEVICE;
        }
        if (i == 61) {
            return RESET_PREFERRED_AUDIO_DEVICE;
        }
        if (i == 70) {
            return FMR_TRIGGER;
        }
        if (i == 90) {
            return APP_LINK_LAUNCH_REQUEST;
        }
        switch (i) {
            case 8:
                return PING_REQUEST;
            case 9:
                return PING_RESPONSE;
            case 10:
                return KEY_INJECT;
            default:
                switch (i) {
                    case 20:
                        return IME_KEY_INJECT;
                    case 21:
                        return IME_BATCH_EDIT;
                    case 22:
                        return IME_SHOW_REQUEST;
                    default:
                        switch (i) {
                            case 30:
                                return VOICE_BEGIN;
                            case 31:
                                return VOICE_PAYLOAD;
                            case 32:
                                return VOICE_END;
                            default:
                                return null;
                        }
                }
        }
    }
}
