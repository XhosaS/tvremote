package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yav implements Runnable {
    final Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public yav(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.DialogInterface$OnCancelListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            ybb ybbVar = (ybb) this.b;
            yaz yazVarB = ybbVar.b(ybbVar.r.e, false);
            if (yazVarB == null) {
                return;
            }
            ybbVar.g.execute(new xxl((Object) this, (Object) yazVarB, 6, (byte[]) null));
            return;
        }
        ?? r0 = this.b;
        nxu nxuVar = (nxu) r0;
        if (nxuVar.a) {
            zuw zuwVar = (zuw) this.a;
            nve nveVar = (nve) zuwVar.b;
            if (nveVar.b()) {
                nzp nzpVar = nxuVar.f;
                Activity activityK = ((nzo) r0).k();
                PendingIntent pendingIntent = nveVar.d;
                ocv.aF(pendingIntent);
                nzpVar.startActivityForResult(GoogleApiActivity.getIntentForResolution(activityK, pendingIntent, zuwVar.a, false), 1);
                return;
            }
            nvj nvjVar = nxuVar.d;
            nzo nzoVar = (nzo) r0;
            Activity activityK2 = nzoVar.k();
            int i = nveVar.c;
            if (nvjVar.i(activityK2, i, null) != null) {
                Activity activityK3 = nzoVar.k();
                Dialog dialogE = nvjVar.e(activityK3, i, new oba(nvjVar.i(activityK3, i, "d"), nxuVar.f), r0);
                if (dialogE != null) {
                    nvjVar.c(activityK3, dialogE, "GooglePlayServicesErrorDialog", r0);
                    return;
                }
                return;
            }
            if (i != 18) {
                nxuVar.a(nveVar, zuwVar.a);
                return;
            }
            Activity activityK4 = nzoVar.k();
            ProgressBar progressBar = new ProgressBar(activityK4, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activityK4);
            builder.setView(progressBar);
            builder.setMessage(oaw.b(activityK4, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            nvjVar.c(activityK4, alertDialogCreate, "GooglePlayServicesUpdatingDialog", r0);
            nvjVar.a(nzoVar.k().getApplicationContext(), new nxt(this, alertDialogCreate));
        }
    }
}
