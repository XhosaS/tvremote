package defpackage;

import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class afla implements IBinder.DeathRecipient, aflm {
    public static final Logger b = Logger.getLogger(afla.class.getName());
    public static final afeg c = new afeg("internal:remote-uid");
    public static final afeg d = new afeg("internal:server-authority");
    public static final afeg e = new afeg("internal:inbound-parcelable-policy");
    private final afvo a;
    public final ScheduledExecutorService f;
    protected afeh i;
    protected Status j;
    public aflu k;
    private final afgr l;
    private long p;
    private final LinkedHashSet m = new LinkedHashSet();
    private int q = 1;
    public final afln g = new afln(this);
    protected final ConcurrentHashMap h = new ConcurrentHashMap();
    private final aflh n = new aflh();
    private final AtomicLong o = new AtomicLong();

    public afla(afvo afvoVar, afeh afehVar, afgr afgrVar) {
        this.a = afvoVar;
        this.i = afehVar;
        this.l = afgrVar;
        this.f = (ScheduledExecutorService) afzu.a.a(((afzv) afvoVar).a);
    }

    private final void b() {
        aflu afluVar = this.k;
        if (afluVar != null) {
            try {
                afluVar.b.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
            try {
                aflx aflxVarB = aflx.b();
                try {
                    aflxVarB.a().writeInt(0);
                    this.k.a(2, aflxVarB);
                    aflxVarB.close();
                } finally {
                }
            } catch (RemoteException unused2) {
            }
        }
    }

    public static Status i(RemoteException remoteException) {
        return ((remoteException instanceof DeadObjectException) || (remoteException instanceof TransactionTooLargeException)) ? Status.l.c(remoteException) : Status.k.c(remoteException);
    }

    @Override // defpackage.aflm
    public final boolean a(int i, Parcel parcel) {
        aflx aflxVarB;
        aflw aflwVar;
        afzz afzzVar;
        try {
            if (i < 1001) {
                synchronized (this) {
                    if (i != 1) {
                        if (i == 2) {
                            l(Status.l.withDescription("transport shutdown by peer"), true);
                        } else if (i == 3) {
                            if (this.n.a(parcel.readLong())) {
                                b.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "handleAcknowledgedBytes", "handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: ".concat(toString()));
                                LinkedHashSet linkedHashSet = this.m;
                                ConcurrentHashMap concurrentHashMap = this.h;
                                linkedHashSet.addAll(concurrentHashMap.keySet());
                                Iterator it = linkedHashSet.iterator();
                                while (n() && it.hasNext()) {
                                    afll afllVar = (afll) concurrentHashMap.get(it.next());
                                    it.remove();
                                    if (afllVar != null) {
                                        synchronized (afllVar) {
                                            aflwVar = afllVar.d;
                                            afzzVar = afllVar.f;
                                        }
                                        if (afzzVar != null) {
                                            afzzVar.e();
                                        }
                                        if (aflwVar != null) {
                                            try {
                                                synchronized (aflwVar) {
                                                    aflwVar.c();
                                                }
                                            } catch (StatusException e2) {
                                                synchronized (afllVar) {
                                                    Status status = e2.a;
                                                    afllVar.f(status, status, false);
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                        } else if (i == 4) {
                            int i2 = parcel.readInt();
                            if (this.q == 3) {
                                try {
                                    aflxVarB = aflx.b();
                                    try {
                                        aflxVarB.a().writeInt(i2);
                                        this.k.a(5, aflxVarB);
                                        aflxVarB.close();
                                    } finally {
                                    }
                                } catch (RemoteException unused) {
                                }
                            }
                        } else if (i != 5) {
                            return false;
                        }
                    }
                }
            } else {
                int iDataSize = parcel.dataSize();
                ConcurrentHashMap concurrentHashMap2 = this.h;
                Integer numValueOf = Integer.valueOf(i);
                afll afllVarD = (afll) concurrentHashMap2.get(numValueOf);
                if (afllVarD == null) {
                    synchronized (this) {
                        if (!o()) {
                            afllVarD = d(i);
                            afll afllVar2 = (afll) this.h.put(numValueOf, afllVarD);
                            yry.a(afllVar2 == null, "impossible appearance of %s", afllVar2);
                        }
                    }
                }
                if (afllVarD != null) {
                    afllVarD.h(parcel);
                }
                if (this.o.addAndGet(iDataSize) - this.p <= 16384) {
                    return true;
                }
                synchronized (this) {
                    aflu afluVar = this.k;
                    afluVar.getClass();
                    long j = this.o.get();
                    this.p = j;
                    try {
                        aflxVarB = aflx.b();
                    } catch (RemoteException e3) {
                        l(i(e3), true);
                    }
                    try {
                        aflxVarB.a().writeLong(j);
                        afluVar.a(3, aflxVarB);
                        aflxVarB.close();
                    } finally {
                    }
                }
            }
            return true;
        } catch (RuntimeException e4) {
            b.logp(Level.SEVERE, "io.grpc.binder.internal.BinderTransport", "handleTransaction", a.b(i, "Terminating transport for uncaught Exception in transaction "), (Throwable) e4);
            synchronized (this) {
                l(Status.k.c(e4), true);
                return false;
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final synchronized void binderDied() {
        l(Status.l.withDescription("Peer process crashed, exited or was killed (binderDied)"), true);
    }

    public final afgr c() {
        return this.l;
    }

    protected afll d(int i) {
        throw null;
    }

    public abstract void e();

    final void j() {
        afzu.a.b(((afzv) this.a).a, this.f);
    }

    final void k(int i, aflx aflxVar) throws StatusException {
        int iDataSize = aflxVar.a().dataSize();
        try {
            this.k.a(i, aflxVar);
            if (this.n.b(iDataSize)) {
                b.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "sendTransaction", "transmit window now full ".concat(toString()));
            }
        } catch (RemoteException e2) {
            throw i(e2).asException();
        }
    }

    final void l(final Status status, boolean z) {
        if (!o()) {
            this.j = status;
            p(4);
        }
        if (q(5)) {
            return;
        }
        if (z || this.h.isEmpty()) {
            this.g.a = null;
            p(5);
            b();
            ConcurrentHashMap concurrentHashMap = this.h;
            final ArrayList arrayList = new ArrayList(concurrentHashMap.values());
            concurrentHashMap.clear();
            this.f.execute(new Runnable() { // from class: afky
                @Override // java.lang.Runnable
                public final void run() {
                    Status status2 = status;
                    ArrayList arrayList2 = arrayList;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        afll afllVar = (afll) arrayList2.get(i);
                        synchronized (afllVar) {
                            afllVar.f(status2, status2, false);
                        }
                    }
                    afla aflaVar = this.a;
                    synchronized (aflaVar) {
                        aflaVar.e();
                    }
                    aflaVar.j();
                }
            });
        }
    }

    final void m(int i) {
        ConcurrentHashMap concurrentHashMap = this.h;
        if (concurrentHashMap.remove(Integer.valueOf(i)) == null || !concurrentHashMap.isEmpty()) {
            return;
        }
        this.f.execute(new Runnable() { // from class: afkx
            @Override // java.lang.Runnable
            public final void run() {
                afla aflaVar = this.a;
                synchronized (aflaVar) {
                    if (aflaVar.q(4)) {
                        aflaVar.l(aflaVar.j, true);
                    }
                }
            }
        });
    }

    final boolean n() {
        return !this.n.a;
    }

    final boolean o() {
        return q(4) || q(5);
    }

    final void p(int i) {
        int i2 = this.q;
        int i3 = i - 1;
        if (i3 == 2) {
            yqw.L(i2 == 1 || i2 == 2);
        } else if (i3 != 3) {
            yqw.L(i2 == 4);
        } else {
            yqw.L(i2 == 1 || i2 == 2 || i2 == 3);
        }
        this.q = i;
    }

    final boolean q(int i) {
        return this.q == i;
    }
}
