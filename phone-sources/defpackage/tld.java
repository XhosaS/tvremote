package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tld extends Handler {
    final /* synthetic */ tlf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tld(tlf tlfVar, Looper looper) {
        super(looper);
        this.a = tlfVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        tlf tlfVar = this.a;
        if (tlfVar.i != null) {
            tlfVar.g();
        }
        tlfVar.e(tlfVar.d);
    }
}
