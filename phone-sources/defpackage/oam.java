package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oam extends ogh {
    final /* synthetic */ oat a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oam(oat oatVar, Looper looper) {
        super(looper);
        this.a = oatVar;
    }

    private static final void a(Message message) {
        oan oanVar = (oan) message.obj;
        if (oanVar != null) {
            oanVar.e();
        }
    }

    private static final boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, nyc] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws ClassNotFoundException {
        Object obj;
        oat oatVar = this.a;
        if (oatVar.H.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !oatVar.E()) {
            a(message);
            return;
        }
        if (message.what == 4) {
            oatVar.E = new nve(message.arg2);
            if (!oatVar.F && !TextUtils.isEmpty(oatVar.c()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(oatVar.c());
                    oat oatVar2 = this.a;
                    if (!oatVar2.F) {
                        oatVar2.m(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            oat oatVar3 = this.a;
            nve nveVar = oatVar3.E;
            if (nveVar == null) {
                nveVar = new nve(8);
            }
            oatVar3.z.a(nveVar);
            oatVar3.o(nveVar);
            return;
        }
        if (message.what == 5) {
            oat oatVar4 = this.a;
            nve nveVar2 = oatVar4.E;
            if (nveVar2 == null) {
                nveVar2 = new nve(8);
            }
            oatVar4.z.a(nveVar2);
            oatVar4.o(nveVar2);
            return;
        }
        if (message.what == 3) {
            nve nveVar3 = new nve(message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null);
            oat oatVar5 = this.a;
            oatVar5.z.a(nveVar3);
            oatVar5.o(nveVar3);
            return;
        }
        if (message.what == 6) {
            oat oatVar6 = this.a;
            oatVar6.m(5, null);
            pku pkuVar = oatVar6.K;
            if (pkuVar != null) {
                pkuVar.a.aE(message.arg2);
            }
            oatVar6.P(message.arg2);
            oatVar6.S(5, 1, null);
            return;
        }
        if (message.what == 2 && !this.a.D()) {
            a(message);
            return;
        }
        if (!b(message)) {
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        oan oanVar = (oan) message.obj;
        synchronized (oanVar) {
            obj = oanVar.d;
            if (oanVar.e) {
                Log.w("GmsClient", a.ch(oanVar, "Callback proxy ", " being reused. This is not safe."));
            }
        }
        if (obj != null) {
            oanVar.c();
        }
        synchronized (oanVar) {
            oanVar.e = true;
        }
        oanVar.e();
    }
}
