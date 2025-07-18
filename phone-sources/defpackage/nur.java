package defpackage;

import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nur implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nur(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, onr] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, RemoteException {
        int i = 0;
        int i2 = 2;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                ((nus) this.a).b();
                return;
            case 1:
                Object obj = this.a;
                while (true) {
                    synchronized (obj) {
                        if (((nus) obj).a != 2) {
                            return;
                        }
                        Queue queue = ((nus) obj).c;
                        if (queue.isEmpty()) {
                            ((nus) obj).d();
                            return;
                        }
                        nuu nuuVar = (nuu) queue.poll();
                        SparseArray sparseArray = ((nus) obj).d;
                        int i3 = nuuVar.a;
                        sparseArray.put(i3, nuuVar);
                        ((nus) obj).e.b.schedule(new non(obj, (Object) nuuVar, 6, bArr), 30L, TimeUnit.SECONDS);
                        nus nusVar = (nus) obj;
                        nux nuxVar = nusVar.e;
                        Messenger messenger = nusVar.b;
                        int i4 = nuuVar.b;
                        Message messageObtain = Message.obtain();
                        messageObtain.what = i4;
                        messageObtain.arg1 = i3;
                        messageObtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", nuuVar.b());
                        bundle.putString("pkg", ((Context) nuxVar.a).getPackageName());
                        bundle.putBundle("data", nuuVar.c);
                        messageObtain.setData(bundle);
                        try {
                            pkg pkgVar = ((nus) obj).f;
                            Object obj2 = pkgVar.a;
                            if (obj2 == null) {
                                Object obj3 = pkgVar.b;
                                if (obj3 == null) {
                                    throw new IllegalStateException("Both messengers are null");
                                    break;
                                } else {
                                    ((nuo) obj3).b(messageObtain);
                                }
                            } else {
                                ((Messenger) obj2).send(messageObtain);
                            }
                        } catch (RemoteException e) {
                            nusVar.g(e.getMessage());
                        }
                    }
                }
            case 2:
                ((nus) this.a).g("Service disconnected");
                return;
            case 3:
                Executor executor = nvc.a;
                if (((kwy) this.a).v(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 4:
                Object obj4 = this.a;
                ((nyb) obj4).g.lock();
                try {
                    ((nyb) obj4).f();
                    return;
                } finally {
                    ((nyb) this.a).g.unlock();
                }
            case 5:
                boolean andSet = nwb.c.getAndSet(true);
                Context context = ((nyr) this.a).c;
                if (andSet) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException unused) {
                    return;
                }
            case 6:
                ((nzd) this.a).h();
                return;
            case 7:
                nwj nwjVar = ((nzd) ((pku) this.a).a).b;
                nwjVar.C(String.valueOf(nwjVar.getClass().getName()).concat(" disconnecting because it was signed out."));
                return;
            case 8:
                ((oaa) this.a).f.b(new nve(4));
                return;
            case 9:
                Object obj5 = this.a;
                synchronized (((onm) obj5).a) {
                    if (((onm) obj5).c()) {
                        ocv ocvVar = onm.h;
                        ocv.k("%s ** IS FORCE-RELEASED ON TIMEOUT **", ((onm) obj5).d);
                        ((onm) obj5).b();
                        if (((onm) obj5).c()) {
                            ((onm) obj5).b = 1;
                            ((onm) obj5).e();
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 10:
                Object obj6 = this.a;
                synchronized (((ons) obj6).a) {
                    ?? r0 = ((ons) obj6).b;
                    if (r0 != 0) {
                        r0.c();
                    }
                }
                return;
            case 11:
                try {
                    Thread.sleep(Math.max(0L, 600000L));
                } catch (InterruptedException e2) {
                    Log.e("AppDoctorRestartUtil", "Interrupted. Killing processes now.", e2);
                    Thread.currentThread().interrupt();
                }
                oqs.a((Context) this.a);
                oqs.b();
                return;
            case 12:
                Object obj7 = this.a;
                orh orhVar = (orh) obj7;
                synchronized (orhVar.a) {
                    ((orh) obj7).b();
                }
                orhVar.b.run();
                return;
            case 13:
                boolean z = orj.a;
                org.a();
                Object obj8 = this.a;
                orj orjVar = (orj) obj8;
                orjVar.c.lock();
                try {
                    ((orj) obj8).d.signalAll();
                    return;
                } finally {
                    orjVar.c.unlock();
                }
            case 14:
                ((Dialog) this.a).dismiss();
                return;
            case 15:
                pgw pgwVar = (pgw) this.a;
                if (!pgwVar.i.booleanValue()) {
                    pgwVar.j.j(pgwVar.h, pfq.SUCCESS);
                }
                pgwVar.i = true;
                return;
            case 16:
                ((pkd) this.a).l();
                return;
            case 17:
                ((pkv) this.a).a();
                return;
            case 18:
                Object obj9 = this.a;
                ((pkv) obj9).h = null;
                tql tqlVarQ = szg.q("GIL:AutoProcessLogBatch");
                try {
                    pji pjiVar = ((pkv) obj9).a;
                    pky pkyVar = ((pkv) obj9).b;
                    pkyVar.getClass();
                    pjiVar.b(new pkt(pkyVar, i2));
                    tqlVarQ.close();
                    return;
                } catch (Throwable th) {
                    try {
                        tqlVarQ.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 19:
                ((pkv) this.a).a();
                return;
            default:
                Object obj10 = this.a;
                pkv pkvVar = (pkv) obj10;
                pkvVar.f = null;
                if (pkvVar.b.c()) {
                    tql tqlVarQ2 = szg.q("GIL:AutoProcessBatch");
                    try {
                        ((pkv) obj10).a.b(new pkt(obj10, i));
                        tqlVarQ2.close();
                        return;
                    } catch (Throwable th3) {
                        try {
                            tqlVarQ2.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                return;
        }
    }

    public nur(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
