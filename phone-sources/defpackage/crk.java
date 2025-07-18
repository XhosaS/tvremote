package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crk extends crr {
    private CharSequence c;

    @Override // defpackage.crr
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    public final void b(CharSequence charSequence) {
        this.c = crm.c(charSequence);
    }

    public final void c(CharSequence charSequence) {
        this.b = crm.c(charSequence);
    }

    @Override // defpackage.crr
    public final void d(fhy fhyVar) {
        new Notification.BigTextStyle((Notification.Builder) fhyVar.d).setBigContentTitle(this.b).bigText(this.c);
    }
}
