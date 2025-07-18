package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum xoa implements abxf {
    UNKNOWN_CONTROL(0),
    BACK(1),
    CLOSE(2),
    FORWARD(3),
    HOME(4),
    SCROLL_DOWN(5),
    SCROLL_LEFT(6),
    SCROLL_RIGHT(7),
    SCROLL_UP(8),
    PREVIOUS(9),
    NEXT(10),
    PLAY(11),
    PAUSE(12),
    STOP(13),
    AMBIENT(14),
    CLICK(15),
    HOME_CONTROL(16),
    RELOAD(17),
    ZOOM_IN(18),
    ZOOM_OUT(19),
    ENTER(20),
    UNRECOGNIZED(-1);

    private final int x;

    xoa(int i) {
        this.x = i;
    }

    public static xoa b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CONTROL;
            case 1:
                return BACK;
            case 2:
                return CLOSE;
            case 3:
                return FORWARD;
            case 4:
                return HOME;
            case 5:
                return SCROLL_DOWN;
            case 6:
                return SCROLL_LEFT;
            case 7:
                return SCROLL_RIGHT;
            case 8:
                return SCROLL_UP;
            case 9:
                return PREVIOUS;
            case 10:
                return NEXT;
            case 11:
                return PLAY;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return PAUSE;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return STOP;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return AMBIENT;
            case 15:
                return CLICK;
            case 16:
                return HOME_CONTROL;
            case 17:
                return RELOAD;
            case 18:
                return ZOOM_IN;
            case 19:
                return ZOOM_OUT;
            case 20:
                return ENTER;
            default:
                return null;
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.x;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.x);
    }
}
