package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.AsyncTask;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class psb extends AsyncTask {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ BroadcastReceiver.PendingResult c;

    public psb(Context context, String str, BroadcastReceiver.PendingResult pendingResult) {
        this.a = context;
        this.b = str;
        this.c = pendingResult;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Context context = this.a;
        PackageManager packageManager = context.getPackageManager();
        try {
            String str = this.b;
            if (!packageManager.getPackageInfo(str, 0).applicationInfo.enabled) {
                this.c.finish();
                return null;
            }
            if (xcw.a(context).b.contains(str)) {
                Intent intent = new Intent("com.google.android.mediahome.action.INITIALIZE_PROGRAMS");
                intent.setPackage(str);
                List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) {
                    ((tug) ((tug) psc.a.e()).j("com/google/android/libraries/mediahome/providers/video/broadcastreceivers/PackageAddedReceiver$1", "doInBackground", 79, "PackageAddedReceiver.java")).v("Package %s doesn't have such receiver", str);
                } else {
                    ((tug) ((tug) psc.a.e()).j("com/google/android/libraries/mediahome/providers/video/broadcastreceivers/PackageAddedReceiver$1", "doInBackground", 73, "PackageAddedReceiver.java")).v("Sending wake up intent to %s", str);
                    intent.setComponent(new ComponentName(str, listQueryBroadcastReceivers.get(0).activityInfo.name));
                    context.sendBroadcast(intent);
                }
            } else {
                ((tug) ((tug) psc.a.e()).j("com/google/android/libraries/mediahome/providers/video/broadcastreceivers/PackageAddedReceiver$1", "doInBackground", 82, "PackageAddedReceiver.java")).v("Package %s doesn't have permission", str);
            }
            this.c.finish();
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            ((tug) ((tug) ((tug) psc.a.f()).i(e)).j("com/google/android/libraries/mediahome/providers/video/broadcastreceivers/PackageAddedReceiver$1", "doInBackground", 64, "PackageAddedReceiver.java")).v("Package not found %s", this.b);
            this.c.finish();
            return null;
        }
    }
}
