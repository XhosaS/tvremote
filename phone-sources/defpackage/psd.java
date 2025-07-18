package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.AsyncTask;
import com.google.android.libraries.mediahome.providers.video.database.Database;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class psd extends AsyncTask {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ BroadcastReceiver.PendingResult c;
    final /* synthetic */ pse d;

    public psd(pse pseVar, Context context, String str, BroadcastReceiver.PendingResult pendingResult) {
        this.a = context;
        this.b = str;
        this.c = pendingResult;
        this.d = pseVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        pse pseVar = this.d;
        Database databaseY = pseVar.a;
        if (databaseY == null) {
            databaseY = Database.y(this.a.getApplicationContext());
        }
        pseVar.a = databaseY;
        pseVar.a.z().c(this.b);
        this.c.finish();
        return null;
    }
}
