package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thh extends BroadcastReceiver {
    public static final Intent a = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    public boolean b;
    private final tgw c;

    public thh(tgw tgwVar) {
        this.c = tgwVar;
    }

    public final void a(Context context) {
        if (this.b) {
            context.unregisterReceiver(this);
            this.b = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
        if (stringArrayListExtra != null) {
            int size = stringArrayListExtra.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                String str = stringArrayListExtra.get(i);
                i++;
                if (str != null) {
                    this.c.f(str);
                    break;
                }
            }
        }
        a(context);
    }
}
