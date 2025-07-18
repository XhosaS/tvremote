package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aih implements DialogInterface.OnClickListener {
    final /* synthetic */ Intent a;
    final /* synthetic */ Activity b;

    public aih() {
        throw null;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                Intent intent = this.a;
                if (intent != null) {
                    this.b.startActivityForResult(intent, 2);
                }
            } catch (ActivityNotFoundException e) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }

    public aih(Intent intent, Activity activity) {
        this.a = intent;
        this.b = activity;
    }
}
