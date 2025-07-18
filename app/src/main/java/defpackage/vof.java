package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vof {
    public final Context a;
    public final wxc b;
    public final Intent c;
    private final Executor d;
    private final yqi e;

    public vof(Context context, Executor executor, wxc wxcVar, Intent intent, yqi yqiVar) {
        this.a = context;
        this.d = executor;
        this.b = wxcVar;
        this.c = intent;
        this.e = yqiVar;
    }

    public final zyd a(Executor executor, final zvi zviVar) {
        final vod vodVar = new vod();
        zyd zydVarA = xt.a(new xq() { // from class: vnz
            @Override // defpackage.xq
            public final Object a(xo xoVar) {
                wyb wybVarO;
                boolean zBindService = false;
                wum.w(false);
                vod vodVar2 = vodVar;
                vodVar2.a = xoVar;
                wzj wzjVar = new wzj(wum.e());
                vof vofVar = this.a;
                wxc wxcVar = vofVar.b;
                Context context = vofVar.a;
                Intent intent = vofVar.c;
                synchronized (vodVar2.c) {
                    vodVar2.e = wxcVar;
                    vodVar2.d = wzjVar;
                }
                try {
                    ServiceConnection serviceConnection = vodVar2.b;
                    wyo wyoVar = wyo.a;
                    context.getClass();
                    serviceConnection.getClass();
                    Intent intent2 = new Intent(intent);
                    wyb wybVar = null;
                    try {
                        wybVarO = wyo.o(intent2);
                        try {
                            try {
                                zBindService = context.bindService(intent2, serviceConnection, 1);
                                aguc.a(wybVarO, null);
                                if (!zBindService) {
                                    wybVarO.a();
                                }
                                uea.a().postDelayed(wzjVar, 5000L);
                                if (zBindService) {
                                    return "Binding to service";
                                }
                                xoVar.d(new SecurityException());
                                return "Binding failed";
                            } finally {
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (!zBindService) {
                                if (wybVarO == null) {
                                    agvy.b("early");
                                } else {
                                    wybVar = wybVarO;
                                }
                                wybVar.a();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        wybVarO = null;
                    }
                } catch (Throwable th3) {
                    try {
                        uea.a().postDelayed(wzjVar, 5000L);
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        });
        yqi yqiVarA = wyo.a(this.e);
        Executor executor2 = this.d;
        zyd zydVarH = zuz.h(zuz.g(zydVarA, yqiVarA, executor2), wyo.c(new zvi() { // from class: voa
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return zviVar.a(obj);
            }
        }), executor);
        zydVarH.d(wyo.h(new Runnable() { // from class: vob
            @Override // java.lang.Runnable
            public final void run() {
                wvx wvxVarF = wzg.f("unbind", wwb.a, true);
                try {
                    this.a.a.unbindService(vodVar.b);
                    wvxVarF.close();
                } catch (Throwable th) {
                    try {
                        wvxVarF.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }), executor2);
        return zydVarH;
    }
}
