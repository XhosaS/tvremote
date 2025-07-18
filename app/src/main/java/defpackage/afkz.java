package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import io.grpc.Status;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afkz extends afla implements afzm {
    public final List a;
    private afzn l;

    public afkz(afvo afvoVar, afeh afehVar, List list, IBinder iBinder) throws RemoteException {
        super(afvoVar, afehVar, afgr.a(afgr.b(afkz.class), "from ".concat(String.valueOf(String.valueOf(afehVar.b.get(afgf.a))))));
        this.a = list;
        ScheduledExecutorService scheduledExecutorService = this.f;
        Logger logger = aflu.a;
        aflu aflsVar = iBinder instanceof Binder ? new afls(iBinder, scheduledExecutorService) : new aflt(iBinder);
        this.k = aflsVar;
        try {
            aflsVar.b.linkToDeath(this, 0);
        } catch (RemoteException unused) {
        }
    }

    final synchronized Status b(afzk afzkVar, String str, afih afihVar) {
        affi affiVar;
        if (o()) {
            return Status.l.withDescription("transport is shutdown");
        }
        afzn afznVar = ((afkr) this.l).a;
        int i = agfd.a;
        afzg afzgVar = ((afzf) afznVar).c;
        Executor afyqVar = afzgVar.e != zwk.a ? new afyq(afzgVar.e) : new afym();
        afid afidVar = afrq.b;
        boolean z = true;
        if (afihVar.f(afidVar)) {
            String str2 = (String) afihVar.a(afidVar);
            if (afzgVar.r.a(str2) == null) {
                afzkVar.g(afzg.c);
                afzkVar.b(Status.j.withDescription(String.format("Can't find decompressor for %s", str2)), new afih());
            }
            return Status.OK;
        }
        afzw afzwVarA = afzkVar.a();
        afzwVarA.getClass();
        Long l = (Long) afihVar.a(afrq.a);
        affp affpVar = afzgVar.q;
        afjy[] afjyVarArr = afzwVarA.b;
        if (afjyVarArr.length > 0) {
            throw null;
        }
        affm affmVar = afgu.a;
        afje afjeVar = affpVar.f;
        affp affpVar2 = new affp(affpVar, afjeVar == null ? new afjd(affmVar, afzgVar) : afjeVar.b(affmVar, afzgVar, affmVar.hashCode(), 0));
        if (l == null) {
            affiVar = new affi(affpVar2);
        } else {
            afft afftVarC = afft.c(l.longValue(), TimeUnit.NANOSECONDS, afzgVar.t);
            ScheduledExecutorService scheduledExecutorService = ((afla) ((afzf) afznVar).a).f;
            affp.l(scheduledExecutorService, "scheduler");
            afft afftVarB = affpVar2.b();
            if (afftVarB != null && afftVarB.compareTo(afftVarC) <= 0) {
                z = false;
                afftVarC = afftVarB;
            }
            affi affiVar2 = new affi(affpVar2, afftVarC);
            if (z) {
                if (afftVarC.f()) {
                    affiVar2.j(new TimeoutException("context timed out"));
                } else {
                    synchronized (affiVar2) {
                        affh affhVar = new affh(affiVar2);
                        scheduledExecutorService.getClass();
                        affiVar2.b = scheduledExecutorService.schedule(affhVar, afftVarC.c - System.nanoTime(), TimeUnit.NANOSECONDS);
                    }
                }
            }
            affiVar = affiVar2;
        }
        afyx afyxVar = new afyx(afyqVar, afzgVar.e, afzkVar, affiVar);
        afzkVar.g(afyxVar);
        zyu zyuVar = new zyu();
        afyqVar.execute(new afzc((afzf) afznVar, affiVar, str, afzkVar, afyxVar, zyuVar));
        afyqVar.execute(new afzb(affiVar, zyuVar, afzkVar, afyxVar));
        return Status.OK;
    }

    @Override // defpackage.afla
    protected final afll d(int i) {
        return new afli(this, this.i, i);
    }

    @Override // defpackage.afla
    public final void e() {
        Runnable runnableA;
        afzn afznVar = this.l;
        if (afznVar != null) {
            afkr afkrVar = (afkr) afznVar;
            afzf afzfVar = (afzf) afkrVar.a;
            Future future = afzfVar.b;
            if (future != null) {
                future.cancel(false);
                afzfVar.b = null;
            }
            afzg afzgVar = afzfVar.c;
            Iterator it = afzgVar.g.iterator();
            if (it.hasNext()) {
                throw null;
            }
            afzm afzmVar = afzfVar.a;
            synchronized (afzgVar.n) {
                if (!afzgVar.p.remove(afzmVar)) {
                    throw new AssertionError("Transport already removed");
                }
                afgm.c((afgl) afzgVar.s.g.get(Long.valueOf(afgm.a(afzgVar))), afzmVar);
                afzgVar.b();
            }
            afks afksVar = afkrVar.b;
            synchronized (afksVar) {
                afksVar.c--;
                runnableA = afksVar.a();
            }
            if (runnableA != null) {
                ((afkt) runnableA).a.b();
            }
        }
    }

    public final synchronized void f(afzn afznVar) {
        aflx aflxVarB;
        this.l = afznVar;
        if (o()) {
            p(5);
            e();
            j();
            return;
        }
        aflu afluVar = this.k;
        afluVar.getClass();
        try {
            aflxVarB = aflx.b();
        } catch (RemoteException e) {
            l(afla.i(e), true);
        }
        try {
            aflxVarB.a().writeInt(1);
            aflxVarB.a().writeStrongBinder(this.g);
            afluVar.a(1, aflxVarB);
            aflxVarB.close();
            if (o()) {
                return;
            }
            p(3);
            afeh afehVar = this.i;
            afzn afznVar2 = ((afkr) afznVar).a;
            ((afzf) afznVar2).b.cancel(false);
            ((afzf) afznVar2).b = null;
            Iterator it = ((afzf) afznVar2).c.g.iterator();
            if (it.hasNext()) {
                throw null;
            }
            this.i = afehVar;
        } catch (Throwable th) {
            try {
                aflxVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.afzm
    public final synchronized void g() {
        l(Status.OK, false);
    }

    @Override // defpackage.afzm
    public final synchronized void h(Status status) {
        l(status, true);
    }
}
