package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nvi extends ogh {
    final /* synthetic */ nvj a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvi(nvj nvjVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.a = nvjVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        if (message.what != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + message.what);
            return;
        }
        nvj nvjVar = this.a;
        Context context = this.b;
        int iG = nvjVar.g(context);
        if (nwb.f(iG)) {
            nvjVar.f(context, iG, nvjVar.j(context, iG, "n"));
        }
    }
}
