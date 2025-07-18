package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cro extends crr {
    @Override // defpackage.crr
    protected final String a() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // defpackage.crr
    public final void d(fhy fhyVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return;
        }
        Notification.Builder builder = (Notification.Builder) fhyVar.d;
        builder.setContentTitle(null);
        Bundle bundle = this.a.w;
        CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.a.w.getCharSequence("android.text");
        builder.setContentText(charSequence != null ? charSequence : null);
        crn.a(builder, "call");
    }

    @Override // defpackage.crr
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("android.callType", 0);
        bundle.putBoolean("android.callIsVideo", false);
        bundle.putCharSequence("android.verificationText", null);
        bundle.putParcelable("android.answerIntent", null);
        bundle.putParcelable("android.declineIntent", null);
        bundle.putParcelable("android.hangUpIntent", null);
    }
}
