package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afkw implements afsc, aflm {
    public static final Logger a = Logger.getLogger(afkw.class.getName());
    public final afkj b;
    public final afln c;
    private final afvo d;
    private final afvo e;
    private final yyk f;
    private final afkn g;
    private afzj h;
    private ScheduledExecutorService i;
    private Executor j;
    private boolean k;

    public afkw(afku afkuVar) {
        afkj afkjVar = afkuVar.a;
        afkjVar.getClass();
        this.b = afkjVar;
        afvo afvoVar = afkuVar.c;
        afvoVar.getClass();
        this.e = afvoVar;
        this.d = afkuVar.d;
        List list = afkuVar.b;
        list.getClass();
        this.f = yyk.j(list);
        afkuVar.e.getClass();
        this.g = afkuVar.f;
        this.c = new afln(this);
    }

    @Override // defpackage.aflm
    public final synchronized boolean a(int i, Parcel parcel) {
        IBinder strongBinder;
        if (i == 1) {
            if (this.k) {
                afkv.a.a(1, parcel);
                return false;
            }
            if (parcel.readInt() > 0 && (strongBinder = parcel.readStrongBinder()) != null) {
                int callingUid = Binder.getCallingUid();
                afeh afehVar = afeh.a;
                afef afefVar = new afef(afeh.a);
                afkj afkjVar = this.b;
                afefVar.b(afgf.b, afkjVar);
                afefVar.b(afgf.a, new aflg(callingUid));
                afefVar.b(afla.c, Integer.valueOf(callingUid));
                afeg afegVar = afla.d;
                Intent intent = afkjVar.a;
                afefVar.b(afegVar, intent.getPackage() != null ? intent.getPackage() : intent.getComponent().getPackageName());
                afefVar.b(afla.e, this.g);
                this.j.getClass();
                afefVar.b(afld.a, new aflc());
                afefVar.b(afri.a, afjh.PRIVACY_AND_INTEGRITY);
                afvo afvoVar = this.d;
                afeh afehVarA = afefVar.a();
                yyk yykVar = this.f;
                Logger logger = aflu.a;
                afkz afkzVar = new afkz(afvoVar, afehVarA, yykVar, strongBinder);
                afzj afzjVar = this.h;
                synchronized (afzjVar) {
                    yqw.M(!((afks) afzjVar).b, "Illegal transportCreated() after serverShutdown()");
                    ((afks) afzjVar).c++;
                }
                afzj afzjVar2 = ((afks) afzjVar).a;
                afzg afzgVar = ((afyz) afzjVar2).a;
                synchronized (afzgVar.n) {
                    afzgVar.p.add(afkzVar);
                }
                afzf afzfVar = new afzf(((afyz) afzjVar2).a, afkzVar);
                afzg afzgVar2 = afzfVar.c;
                long j = afzgVar2.h;
                if (j != Long.MAX_VALUE) {
                    afzfVar.b = ((afla) afzfVar.a).f.schedule(new afzd(afzfVar), j, TimeUnit.MILLISECONDS);
                } else {
                    afzfVar.b = new FutureTask(new afza(), null);
                }
                afgm.b((afgl) afzgVar2.s.g.get(Long.valueOf(afgm.a(afzgVar2))), afzfVar.a);
                afkzVar.f(new afkr((afks) afzjVar, afzfVar));
                return true;
            }
        }
        return false;
    }

    public final synchronized void b() {
        this.e.b(this.j);
        this.j = null;
    }

    @Override // defpackage.afsc
    public final synchronized void c() {
        Runnable runnableA;
        if (this.k) {
            return;
        }
        this.k = true;
        this.c.a = afkv.a;
        afzj afzjVar = this.h;
        afzj afzjVar2 = ((afks) afzjVar).a;
        afzg afzgVar = ((afyz) afzjVar2).a;
        synchronized (afzgVar.n) {
            if (!afzgVar.l) {
                ArrayList arrayList = new ArrayList(afzgVar.p);
                Status status = afzgVar.k;
                afzgVar.l = true;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    afzm afzmVar = (afzm) arrayList.get(i);
                    if (status == null) {
                        afzmVar.g();
                    } else {
                        afzmVar.h(status);
                    }
                }
                afzg afzgVar2 = ((afyz) afzjVar2).a;
                synchronized (afzgVar2.n) {
                    afzgVar2.o = true;
                    afzgVar2.b();
                }
            }
        }
        synchronized (afzjVar) {
            ((afks) afzjVar).b = true;
            runnableA = ((afks) afzjVar).a();
        }
        if (runnableA != null) {
            ((afkt) runnableA).a.b();
        }
        afvo afvoVar = this.d;
        afzu.a.b(((afzv) afvoVar).a, this.i);
        this.i = null;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.afsc
    public final synchronized void d(afzj afzjVar) {
        this.h = new afks(afzjVar, new afkt(this));
        this.i = (ScheduledExecutorService) afzu.a.a(((afzv) this.d).a);
        this.j = this.e.a();
    }

    public final String toString() {
        return "BinderServer[" + this.b.toString() + "]";
    }
}
