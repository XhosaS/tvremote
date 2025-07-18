package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezo extends ezm {
    public ezn c;

    @Override // defpackage.ezm, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((ezp) aeii.a(context)).gZ(this);
                    this.a = true;
                }
            }
        }
        intent.getAction();
        ezn eznVar = this.c;
        if (eznVar == null) {
            agvy.b("networkMonitor");
            eznVar = null;
        }
        eznVar.a();
    }
}
