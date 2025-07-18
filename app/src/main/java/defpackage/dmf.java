package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
class dmf implements Handler.Callback {
    final /* synthetic */ dmg a;

    public dmf(dmg dmgVar) {
        this.a = dmgVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.a.c((dmd) message.obj);
            return true;
        }
        if (message.what != 2) {
            return false;
        }
        this.a.c.k((dmd) message.obj);
        return false;
    }
}
