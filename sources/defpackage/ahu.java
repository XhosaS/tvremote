package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahu extends akn {
    final /* synthetic */ aib a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahu(aib aibVar, Looper looper) {
        super(looper);
        this.a = aibVar;
    }

    private static final void a(Message message) {
        ahv ahvVar = (ahv) message.obj;
        if (ahvVar != null) {
            ahvVar.e();
        }
    }

    private static final boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [agx, java.lang.Object] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws ClassNotFoundException {
        Object obj;
        aib aibVar = this.a;
        if (aibVar.n.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !aibVar.k()) {
            a(message);
            return;
        }
        if (message.what == 4) {
            aibVar.k = new aeq(message.arg2);
            if (!aibVar.l && !TextUtils.isEmpty(aibVar.c()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aibVar.c());
                    aib aibVar2 = this.a;
                    if (!aibVar2.l) {
                        aibVar2.G(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            aib aibVar3 = this.a;
            aeq aeqVar = aibVar3.k;
            if (aeqVar == null) {
                aeqVar = new aeq(8);
            }
            aibVar3.f.a(aeqVar);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 5) {
            aib aibVar4 = this.a;
            aeq aeqVar2 = aibVar4.k;
            if (aeqVar2 == null) {
                aeqVar2 = new aeq(8);
            }
            aibVar4.f.a(aeqVar2);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 3) {
            this.a.f.a(new aeq(message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null));
            System.currentTimeMillis();
            return;
        }
        if (message.what == 6) {
            aib aibVar5 = this.a;
            aibVar5.G(5, null);
            byj byjVar = aibVar5.r;
            if (byjVar != null) {
                byjVar.a.a(message.arg2);
            }
            int i = message.arg2;
            System.currentTimeMillis();
            aibVar5.x(5, 1, null);
            return;
        }
        if (message.what == 2 && !this.a.j()) {
            a(message);
            return;
        }
        if (!b(message)) {
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        ahv ahvVar = (ahv) message.obj;
        synchronized (ahvVar) {
            obj = ahvVar.d;
            if (ahvVar.e) {
                Log.w("GmsClient", b.i(ahvVar, "Callback proxy ", " being reused. This is not safe."));
            }
        }
        if (obj != null) {
            ahvVar.c();
        }
        synchronized (ahvVar) {
            ahvVar.e = true;
        }
        ahvVar.e();
    }
}
