package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aet extends akn {
    final /* synthetic */ aeu a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aet(aeu aeuVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.a = aeuVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        if (message.what != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + message.what);
            return;
        }
        aeu aeuVar = this.a;
        Context context = this.b;
        int iB = aeuVar.b(context);
        boolean z = afp.a;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            aeuVar.a(context, iB, aeuVar.e(context, iB, "n"));
        }
    }
}
