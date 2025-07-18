package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qme {
    public static qlz a(Context context, yqt yqtVar, yqt yqtVar2, yqt yqtVar3) {
        final qmd qmdVar = new qmd();
        qmdVar.a = context.getApplicationContext();
        qmdVar.b = (ExecutorService) ((yqz) yqtVar2).a;
        qmdVar.c = (ScheduledExecutorService) ((yqz) yqtVar3).a;
        qmdVar.d = (Handler) ((yqz) yqtVar).a;
        qmdVar.f = null;
        qmdVar.a.getClass();
        if (qmdVar.b == null) {
            ExecutorService executorServiceNewCachedThreadPool = qmdVar.c;
            if (executorServiceNewCachedThreadPool == null) {
                executorServiceNewCachedThreadPool = Executors.newCachedThreadPool((ThreadFactory) qmdVar.g.eV());
            }
            qmdVar.b = executorServiceNewCachedThreadPool;
        }
        if (qmdVar.c == null) {
            qmdVar.c = Executors.newSingleThreadScheduledExecutor((ThreadFactory) qmdVar.g.eV());
        }
        return new qmo(qmdVar.b, new yrp() { // from class: qmb
            @Override // defpackage.yrp
            public final Object eV() {
                final qmd qmdVar2 = qmdVar;
                final qkm qkmVar = new qkm(qmdVar2.a, qmdVar2.c);
                yrp yrpVar = new yrp() { // from class: qmc
                    @Override // defpackage.yrp
                    public final Object eV() {
                        qmd qmdVar3 = qmdVar2;
                        Context applicationContext = qmdVar3.a.getApplicationContext();
                        ExecutorService executorService = qmdVar3.b;
                        applicationContext.getClass();
                        executorService.getClass();
                        lnv lnvVar = new lnv();
                        lnvVar.a = 641;
                        lnw lnwVar = new lnw(lnvVar);
                        return new qoi(new qob(applicationContext, new lnm(applicationContext, lnwVar), new lns(applicationContext, lnwVar), new lno(applicationContext, lnwVar), new qls(applicationContext, executorService), executorService, kcx.a), 2, qkmVar, applicationContext.getPackageName());
                    }
                };
                if (qmdVar2.e.g(qmdVar2.a, 19621000) != 0) {
                    Log.i("OneGoogle", "MDI is not available. Forcing Menagerie");
                    return yrpVar.eV();
                }
                qmo qmoVar = new qmo(qmdVar2.b, yrpVar);
                if (qmdVar2.f == null) {
                    lml lmlVar = new lml(qmdVar2.a);
                    uei ueiVar = new uei(qmdVar2.a);
                    ueiVar.b = lmlVar;
                    ueg uegVar = new ueg(yyk.o(new uej(ueiVar)));
                    uoe uoeVar = uoe.a;
                    HashMap map = new HashMap();
                    ExecutorService executorService = qmdVar2.b;
                    ujr.a(umd.a, map);
                    ujq ujqVar = new ujq(executorService, uegVar, uoeVar, map, null);
                    Context context2 = qmdVar2.a;
                    context2.getClass();
                    ExecutorService executorService2 = qmdVar2.b;
                    executorService2.getClass();
                    Handler handler = qmdVar2.d;
                    if (handler == null) {
                        handler = null;
                    }
                    qil qilVar = new qil(context2);
                    mcw mcwVar = new mcw();
                    if (handler == null) {
                        HandlerThread handlerThread = new HandlerThread("ProtoDataStore-Message-Handler");
                        handlerThread.start();
                        handler = new Handler(handlerThread.getLooper());
                    }
                    uil uilVar = new uil();
                    uilVar.a = context2.getApplicationContext();
                    uilVar.c = "com.google.android.gms.permission.INTERNAL_BROADCAST";
                    uilVar.b = new zvi() { // from class: qgs
                        @Override // defpackage.zvi
                        public final zyd a(Object obj) {
                            return zxn.g(new IllegalStateException());
                        }
                    };
                    uilVar.d = handler;
                    qmdVar2.f = new qif(context2, executorService2, uegVar, ujqVar, qilVar, mcwVar, new uio(uilVar), new ltg(context2));
                }
                return new qnt(new qoi(new qmz(qmdVar2.a, qmdVar2.f, new qls(qmdVar2.a, qmdVar2.b), yqt.i(qkmVar)), 1, qkmVar, qmdVar2.a.getPackageName()), qmoVar);
            }
        });
    }
}
