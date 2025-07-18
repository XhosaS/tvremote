package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
class kfy implements Runnable {
    final /* synthetic */ kfz a;
    private final kfw b;

    public kfy(kfz kfzVar, kfw kfwVar) {
        this.a = kfzVar;
        this.b = kfwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kfz kfzVar = this.a;
        if (kfzVar.a) {
            kfw kfwVar = this.b;
            ConnectionResult connectionResult = kfwVar.b;
            if (connectionResult.b()) {
                khb khbVar = kfzVar.f;
                Activity activityK = kfzVar.k();
                PendingIntent pendingIntent = connectionResult.d;
                kkk.k(pendingIntent);
                khbVar.startActivityForResult(GoogleApiActivity.a(activityK, pendingIntent, kfwVar.a, false), 1);
                return;
            }
            kcx kcxVar = kfzVar.d;
            Activity activityK2 = kfzVar.k();
            int i = connectionResult.c;
            if (kcxVar.h(activityK2, i, null) != null) {
                Activity activityK3 = kfzVar.k();
                Dialog dialogC = kcxVar.c(activityK3, i, new kji(kcxVar.h(activityK3, i, "d"), kfzVar.f), kfzVar);
                if (dialogC != null) {
                    kcxVar.b(activityK3, dialogC, "GooglePlayServicesErrorDialog", kfzVar);
                    return;
                }
                return;
            }
            if (i != 18) {
                kfzVar.a(connectionResult, kfwVar.a);
                return;
            }
            Activity activityK4 = kfzVar.k();
            ProgressBar progressBar = new ProgressBar(activityK4, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activityK4);
            builder.setView(progressBar);
            builder.setMessage(kje.b(activityK4, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            kcxVar.b(activityK4, alertDialogCreate, "GooglePlayServicesUpdatingDialog", kfzVar);
            Context applicationContext = kfzVar.k().getApplicationContext();
            kfx kfxVar = new kfx(this, alertDialogCreate);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            kgx kgxVar = new kgx(kfxVar);
            abs.c(applicationContext, kgxVar, intentFilter, null, 2);
            kgxVar.a = applicationContext;
            if (kdu.e(applicationContext)) {
                return;
            }
            kfxVar.a();
            kgxVar.a();
        }
    }
}
