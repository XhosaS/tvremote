package defpackage;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* compiled from: PG */
/* loaded from: classes.dex */
class abd {
    static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(null);
    }

    static void c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
        bigPictureStyle.showBigPictureWhenCollapsed(false);
    }
}
