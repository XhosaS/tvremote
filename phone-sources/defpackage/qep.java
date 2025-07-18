package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.SystemClock;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class qep extends BroadcastReceiver {
    public static final tvn a = tvn.n("GnpSdk");
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public static final void d(Intent intent, qeq qeqVar, qdo qdoVar, long j) {
        Intent intent2;
        int threadPriority;
        ((tvk) a.e()).v("Executing async action [%s] in Coroutine Scope.", intent.getAction());
        try {
            try {
                threadPriority = Process.getThreadPriority(0);
            } catch (Exception e) {
                e = e;
                ((tvk) ((tvk) a.g()).i(e)).v("Failed to handle async action [%s] in Coroutine Scope.", intent2.getAction());
                ((tvk) a.e()).v("Finished executing async action [%s] in Coroutine Scope.", intent2.getAction());
            }
        } catch (Exception e2) {
            e = e2;
            intent2 = intent;
            ((tvk) ((tvk) a.g()).i(e)).v("Failed to handle async action [%s] in Coroutine Scope.", intent2.getAction());
            ((tvk) a.e()).v("Finished executing async action [%s] in Coroutine Scope.", intent2.getAction());
        }
        try {
            Process.setThreadPriority(qeqVar.a(intent));
            intent2 = intent;
            try {
                ykr.n(yim.a, new dsk(qeqVar, intent2, qdoVar, j, (yih) null, 3));
                Process.setThreadPriority(threadPriority);
                ((tvk) a.e()).v("Finished executing async action [%s] in Coroutine Scope.", intent2.getAction());
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                Process.setThreadPriority(threadPriority);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public abstract qeq a(Context context);

    public abstract boolean b();

    public abstract boolean c(Context context);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        if (intent == null) {
            ((tvk) ((tvk) a.f()).i(new IllegalArgumentException())).s("Null Intent received.");
            return;
        }
        if (intent.hasExtra("fms") && yks.e(intent.getStringExtra("fms"), "1")) {
            ((tvk) a.e()).s("Chime payload will be processed by Firebase service, returning.");
            return;
        }
        long micros = TimeUnit.MILLISECONDS.toMicros(Instant.now().toEpochMilli());
        a.H(true);
        qdo qdoVarB = qdo.b((intent.getFlags() & 268435456) > 0 ? 8500L : 58500L);
        tvn tvnVar = a;
        ((tvk) tvnVar.e()).B("Intent received for action [%s] package [%s].", intent.getAction(), context.getApplicationContext().getPackageName());
        try {
            qhk qhkVarA = qhj.a(context);
            qhkVarA.getClass();
            qhkVarA.x().a(context);
            ((tvk) tvnVar.e()).s("Phenotype initialized.");
            qdz qdzVar = new qdz(0);
            try {
                if (b()) {
                    qhkVarA.v();
                    if (c(context)) {
                        ((tvk) tvnVar.e()).s("BroadcastReceiver disabled by host app in GnpConfig");
                        wef.v(qdzVar, null);
                        return;
                    }
                }
                qeq qeqVarA = a(context);
                if (qeqVarA.d(intent)) {
                    ((tvk) tvnVar.e()).v("Validation OK for action [%s].", intent.getAction());
                    qgq qgqVarW = qhkVarA.w();
                    if (qtl.J(context)) {
                        ylf ylfVar = new ylf();
                        ylfVar.a = qdoVarB;
                        if (b.compareAndSet(false, true)) {
                            long jElapsedRealtime = SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime();
                            if (jElapsedRealtime <= xff.a.get().a()) {
                                ylfVar.a = qdoVarB.d(jElapsedRealtime);
                            }
                        }
                        if (xfl.b()) {
                            qgqVarW.b(goAsync(), isOrderedBroadcast(), new qeo(intent, qeqVarA, ylfVar, micros, 1), (qdo) ylfVar.a);
                        } else {
                            qgqVarW.b(goAsync(), isOrderedBroadcast(), new qeo(intent, qeqVarA, ylfVar, micros, 0), (qdo) ylfVar.a);
                        }
                    } else if (xfl.b()) {
                        qgqVarW.c(new jcp(intent, qeqVarA, micros, 4));
                    } else {
                        qgqVarW.c(new jcp(intent, qeqVarA, micros, 5));
                    }
                } else {
                    ((tvk) tvnVar.e()).v("Validation failed for action [%s].", intent.getAction());
                }
                wef.v(qdzVar, null);
                if (isOrderedBroadcast()) {
                    setResultCode(-1);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    wef.v(qdzVar, th);
                    throw th2;
                }
            }
        } catch (RuntimeException e) {
            ((tvk) ((tvk) a.g()).i(e)).s("BroadcastReceiver stopped");
        }
    }
}
