package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abj extends abk {
    @Override // defpackage.abk
    protected final String a() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // defpackage.abk
    public final void b(abb abbVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: 0");
            }
        } else {
            Notification.Builder builder = ((abl) abbVar).b;
            builder.setContentTitle(null);
            Bundle bundle = this.c.o;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.c.o.getCharSequence("android.text");
            builder.setContentText(charSequence != null ? charSequence : null);
            abi.a(builder, "call");
        }
    }

    @Override // defpackage.abk
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.putInt("android.callType", 0);
        bundle.putBoolean("android.callIsVideo", false);
        bundle.putCharSequence("android.verificationText", null);
        bundle.putParcelable("android.answerIntent", null);
        bundle.putParcelable("android.declineIntent", null);
        bundle.putParcelable("android.hangUpIntent", null);
    }
}
