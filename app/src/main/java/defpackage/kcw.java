package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
class kcw extends kos {
    final /* synthetic */ kcx a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcw(kcx kcxVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.a = kcxVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        if (message.what != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + message.what);
            return;
        }
        kcx kcxVar = this.a;
        Context context = this.b;
        int iG = kcxVar.g(context, kcy.c);
        if (kdu.d(iG)) {
            kcxVar.e(context, iG);
        }
    }
}
