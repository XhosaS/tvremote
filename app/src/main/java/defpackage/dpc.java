package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
class dpc implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        dpd dpdVar = (dpd) message.obj;
        dpdVar.a.k(dpdVar);
        return true;
    }
}
