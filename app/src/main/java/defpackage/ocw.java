package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ocw {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "TAP";
            case 2:
                return "DOUBLE_TAP";
            case 3:
                return "LONG_PRESS";
            case 4:
                return "CONTEXT_CLICK";
            case 5:
                return "DRAG";
            case 6:
                return "DRAG_ENDED";
            case 7:
                return "SWIPE";
            case 8:
                return "SCALE";
            case 9:
                return "SCALE_ENDED";
            case 10:
                return "ROTATE";
            case 11:
                return "ROTATE_ENDED";
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return "FIRST_VISIBLE";
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return "VISIBLE";
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return "HIDDEN";
            case 15:
                return "TOUCH_UP";
            case 16:
                return "TOUCH_DOWN";
            case 17:
                return "TOUCH_MOVED";
            case 18:
                return "TOUCH_CANCELLED";
            case 19:
                return "FOCUS_CHANGED";
            case 20:
                return "DETACHED";
            case 21:
                return "KEYBOARD_ACTION";
            case 22:
                return "HOVER_ENTER";
            case 23:
                return "HOVER_EXIT";
            default:
                return "null";
        }
    }
}
