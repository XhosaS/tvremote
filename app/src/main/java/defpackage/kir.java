package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kir extends kos {
    final /* synthetic */ kiz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kir(kiz kizVar, Looper looper) {
        super(looper);
        this.a = kizVar;
    }

    private final void a(Message message) {
        kis kisVar = (kis) message.obj;
        if (kisVar != null) {
            kisVar.e();
        }
    }

    private final boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws ClassNotFoundException {
        Object obj;
        kiz kizVar = this.a;
        if (kizVar.r.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !kizVar.n()) {
            a(message);
            return;
        }
        if (message.what == 4) {
            kizVar.o = new ConnectionResult(1, message.arg2, null, null);
            if (!kizVar.p && !TextUtils.isEmpty(kizVar.c()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(kizVar.c());
                    kiz kizVar2 = this.a;
                    if (!kizVar2.p) {
                        kizVar2.C(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            kiz kizVar3 = this.a;
            ConnectionResult connectionResult = kizVar3.o;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(1, 8, null, null);
            }
            kizVar3.g.a(connectionResult);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 5) {
            kiz kizVar4 = this.a;
            ConnectionResult connectionResult2 = kizVar4.o;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(1, 8, null, null);
            }
            kizVar4.g.a(connectionResult2);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 3) {
            this.a.g.a(new ConnectionResult(1, message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (message.what == 6) {
            kiz kizVar5 = this.a;
            kizVar5.C(5, null);
            kip kipVar = kizVar5.j;
            if (kipVar != null) {
                kipVar.a(message.arg2);
            }
            int i = message.arg2;
            kizVar5.H();
            kizVar5.D(5, 1, null);
            return;
        }
        if (message.what == 2 && !this.a.m()) {
            a(message);
            return;
        }
        if (!b(message)) {
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        kis kisVar = (kis) message.obj;
        synchronized (kisVar) {
            obj = kisVar.d;
            if (kisVar.e) {
                Log.w("GmsClient", a.t(kisVar, "Callback proxy ", " being reused. This is not safe."));
            }
        }
        if (obj != null) {
            kisVar.c();
        }
        synchronized (kisVar) {
            kisVar.e = true;
        }
        kisVar.e();
    }
}
