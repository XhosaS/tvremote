package defpackage;

import android.app.Notification;
import android.os.Build;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class dyl extends crr {
    public int[] c = null;
    public et d;

    @Override // defpackage.crr
    public final void d(fhy fhyVar) {
        if (Build.VERSION.SDK_INT < 34) {
            Object obj = fhyVar.d;
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            dvb.m(mediaStyle, this.c, this.d);
            ((Notification.Builder) obj).setStyle(mediaStyle);
            return;
        }
        Object obj2 = fhyVar.d;
        Notification.MediaStyle mediaStyle2 = new Notification.MediaStyle();
        Boolean bool = false;
        bool.getClass();
        dvb.m(mediaStyle2, this.c, this.d);
        ((Notification.Builder) obj2).setStyle(mediaStyle2);
    }
}
