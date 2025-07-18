package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrv extends jrr {
    private static final zdy f = zdy.h("com/google/android/apps/tvsearch/widget/toast/WarningToastReceiver");
    public jrs c;
    public hgb d;
    public int e;

    public static jrv a(Context context) {
        jrv jrvVar = new jrv();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.apps.tvsearch.SYSTEM_WARNING");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        abs.c(context, jrvVar, intentFilter, null, 2);
        return jrvVar;
    }

    @Override // defpackage.jrr, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        CharSequence string;
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((jrw) aeii.a(context)).hb(this);
                    this.a = true;
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("reason")) {
            return;
        }
        Object obj = extras.get("reason");
        if (obj instanceof CharSequence) {
            if (obj.equals("bad_bluetooth_connection")) {
                string = context.getString(R.string.bad_bluetooth_connection);
            } else if (this.e != 1) {
                return;
            } else {
                string = (CharSequence) obj;
            }
            ((zdv) ((zdv) f.b()).q("com/google/android/apps/tvsearch/widget/toast/WarningToastReceiver", "onReceive", 73, "WarningToastReceiver.java")).x("showing %s", string);
            hgb hgbVar = this.d;
            if (hgbVar == null) {
                this.c.b(string);
                return;
            }
            string.getClass();
            hgbVar.a.m(string);
        }
    }
}
