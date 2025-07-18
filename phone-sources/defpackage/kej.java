package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kej extends BroadcastReceiver {
    private static final Intent a = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    private final kek b;
    private final Context c;
    private boolean d;

    public kej(kek kekVar, Context context) {
        this.b = kekVar;
        this.c = context;
    }

    public final void a() {
        if (this.d) {
            this.c.unregisterReceiver(this);
            this.d = false;
        }
    }

    public final void b() {
        Intent intent = new Intent("com.google.android.play.search.VOICE_SEARCH_RESULT");
        Context context = this.c;
        intent.setPackage(context.getPackageName());
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, (Build.VERSION.SDK_INT > 30 ? 33554432 : 0) | 1073741824);
        Intent intent2 = new Intent(a);
        intent2.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", broadcast);
        if (!this.d) {
            czi.f(context, this, new IntentFilter("com.google.android.play.search.VOICE_SEARCH_RESULT"), 4);
            this.d = true;
        }
        context.startActivity(intent2);
    }

    public final boolean c() {
        List<ResolveInfo> listQueryIntentActivities = this.c.getPackageManager().queryIntentActivities(a, 0);
        listQueryIntentActivities.getClass();
        return !listQueryIntentActivities.isEmpty();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        intent.getClass();
        if (!this.d) {
            krd.f("Voice search onReceive called after receiver unregistered. Ignoring.");
            return;
        }
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
        if (stringArrayListExtra != null) {
            Iterator<String> it = stringArrayListExtra.iterator();
            it.getClass();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (next != null) {
                    kek kekVar = this.b;
                    if (kekVar != null) {
                        kekVar.t(next);
                    }
                }
            }
        }
        a();
    }
}
