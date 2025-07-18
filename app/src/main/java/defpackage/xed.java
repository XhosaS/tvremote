package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum xed implements abxf {
    UNKNOWN_COMMAND(0),
    PLAY_FROM_SEARCH(1),
    PLAY_FROM_URI(2),
    SEND_CUSTOM_ACTION(3),
    SKIP_TO_NEXT(4),
    SKIP_TO_PREVIOUS(5),
    PLAY(6),
    PAUSE(7),
    STOP(8),
    SET_RATING(9),
    SEEK_TO(10),
    SHUFFLE(11),
    REWIND(12),
    FAST_FORWARD(13),
    SKIP_TO_QUEUE_ITEM(14),
    SET_REPEAT_MODE(15),
    SET_CAPTIONING_ENABLED(16);

    public final int r;

    xed(int i) {
        this.r = i;
    }

    public static xed b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_COMMAND;
            case 1:
                return PLAY_FROM_SEARCH;
            case 2:
                return PLAY_FROM_URI;
            case 3:
                return SEND_CUSTOM_ACTION;
            case 4:
                return SKIP_TO_NEXT;
            case 5:
                return SKIP_TO_PREVIOUS;
            case 6:
                return PLAY;
            case 7:
                return PAUSE;
            case 8:
                return STOP;
            case 9:
                return SET_RATING;
            case 10:
                return SEEK_TO;
            case 11:
                return SHUFFLE;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return REWIND;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return FAST_FORWARD;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return SKIP_TO_QUEUE_ITEM;
            case 15:
                return SET_REPEAT_MODE;
            case 16:
                return SET_CAPTIONING_ENABLED;
            default:
                return null;
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.r;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.r);
    }
}
