package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.google.android.libraries.mediahome.providers.video.broadcastreceivers.BootCompletedReceiver;
import com.google.android.libraries.mediahome.providers.video.database.Database;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class psa extends AsyncTask {
    final /* synthetic */ Context a;
    final /* synthetic */ BroadcastReceiver.PendingResult b;
    final /* synthetic */ BootCompletedReceiver c;

    public psa(BootCompletedReceiver bootCompletedReceiver, Context context, BroadcastReceiver.PendingResult pendingResult) {
        this.a = context;
        this.b = pendingResult;
        this.c = bootCompletedReceiver;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) throws PackageManager.NameNotFoundException {
        Context context = this.a;
        BootCompletedReceiver bootCompletedReceiver = this.c;
        Database databaseY = bootCompletedReceiver.b;
        if (databaseY == null) {
            databaseY = Database.y(context.getApplicationContext());
        }
        bootCompletedReceiver.b = databaseY;
        List list = (List) gez.j(((psv) bootCompletedReceiver.b.z()).a, true, false, new oun(8));
        PackageManager packageManager = context.getPackageManager();
        for (int i = 0; i < list.size(); i++) {
            try {
                packageManager.getApplicationInfo((String) list.get(i), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                ((tug) ((tug) BootCompletedReceiver.a.e()).j("com/google/android/libraries/mediahome/providers/video/broadcastreceivers/BootCompletedReceiver$1", "doInBackground", 50, "BootCompletedReceiver.java")).v("Delete data about package %s", list.get(i));
                Database database = this.c.b;
                if (database != null) {
                    database.z().c((String) list.get(i));
                }
            }
        }
        this.b.finish();
        return null;
    }
}
