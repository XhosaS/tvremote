package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.common.collect.UnmodifiableIterator;
import j$.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwu implements iwf {
    public static final tui a;
    private static final Duration w;
    private final pku A;
    public final tmd b;
    public final tmb c;
    public final lie d;
    public final iwr e;
    public final idr f;
    public final CopyOnWriteArraySet g;
    public final ReentrantLock h;
    public tlw i;
    public tlu j;
    public tlp k;
    public tls l;
    public List m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;
    public int p;
    public final tlm q;
    public final tol r;
    public ulo s;
    public final pku t;
    public final pku u;
    public final pku v;
    private final CopyOnWriteArraySet x;
    private final iwt y;
    private final yvc z;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        durationOfSeconds.getClass();
        w = durationOfSeconds;
        a = tui.l("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl");
    }

    public iwu(tmd tmdVar, tmb tmbVar, dve dveVar, lie lieVar) {
        dveVar.getClass();
        this.b = tmdVar;
        this.c = tmbVar;
        this.d = lieVar;
        this.e = new iwr(this);
        idz idzVar = new idz(new iws());
        this.f = idzVar;
        this.z = yvd.a(idzVar.a());
        this.x = new CopyOnWriteArraySet();
        this.g = new CopyOnWriteArraySet();
        this.h = new ReentrantLock();
        this.m = yhb.a;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.n = atomicBoolean;
        this.o = new AtomicBoolean();
        iwt iwtVar = new iwt(this);
        this.y = iwtVar;
        dveVar.c(iwtVar);
        atomicBoolean.set(((dvl) dveVar).b == dvd.e);
        this.v = new pku(this, null);
        this.t = new pku(this);
        this.r = new tol(this);
        pku pkuVar = new pku(this);
        this.A = pkuVar;
        this.q = new tlm(pkuVar);
        this.u = new pku(this);
    }

    @Override // defpackage.iwf
    public final void a(iwb iwbVar) {
        iwbVar.getClass();
        ((tug) a.b().h(tvo.a, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl", "addOnStateChangedListener", 453, "VirtualRemoteImpl.kt")).s("Adding a new state listener.");
        this.x.add(iwbVar);
    }

    @Override // defpackage.iwf
    public final void b(iwb iwbVar) {
        iwbVar.getClass();
        ((tug) a.b().h(tvo.a, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl", "removeOnStateChangedListener", 458, "VirtualRemoteImpl.kt")).s("Removing a state listener.");
        this.x.remove(iwbVar);
    }

    @Override // defpackage.iwf
    public final void c(String str) {
        iwr iwrVar = this.e;
        if (yks.e(iwrVar.h(), false)) {
            iwrVar.p(new iwg(2));
        }
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            ulo uloVar = this.s;
            if (uloVar != null) {
                ((tjo) uloVar.a).d(str);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.iwf
    public final void d() {
        h(84, 3);
    }

    @Override // defpackage.iwf
    public final void e() {
        tlm tlmVar = this.q;
        tlk tlkVar = tlmVar.b;
        if (tlkVar != null) {
            tlkVar.a(true);
            tlmVar.c.e();
            tlmVar.e.i();
            tlmVar.b = null;
        }
    }

    @Override // defpackage.iwf
    public final void f() {
        h(26, 3);
    }

    @Override // defpackage.iwf
    public final yvc g() {
        return this.z;
    }

    @Override // defpackage.iwf
    public final void h(int i, int i2) {
        tlw tlwVar = this.i;
        if (tlwVar != null) {
            int i3 = i2 - 1;
            tlv tlvVar = i3 != 0 ? i3 != 1 ? tlv.PRESS : tlv.UP : tlv.DOWN;
            tlx tlxVar = tlwVar.a;
            vtw vtwVarM = tms.a.m();
            vtw vtwVarM2 = tnj.a.m();
            int i4 = tlvVar.d;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vuc vucVar = vtwVarM2.b;
            tnj tnjVar = (tnj) vucVar;
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            tnjVar.d = i5;
            tnjVar.b |= 2;
            if (!vucVar.A()) {
                vtwVarM2.u();
            }
            tnj tnjVar2 = (tnj) vtwVarM2.b;
            tnjVar2.b = 1 | tnjVar2.b;
            tnjVar2.c = i;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            tms tmsVar = (tms) vtwVarM.b;
            tnj tnjVar3 = (tnj) vtwVarM2.r();
            tnjVar3.getClass();
            tmsVar.c = tnjVar3;
            tmsVar.b = 10;
            tlxVar.a((tms) vtwVarM.r());
        }
    }

    public final void i() {
        new Handler(Looper.getMainLooper()).post(new iuc(this, 7));
    }

    public final void j() {
        ((tug) a.e().h(tvo.a, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl", "disconnect", 311, "VirtualRemoteImpl.kt")).v("Disconnecting virtual remote for %s.", this.b.a());
        this.g.clear();
        this.x.clear();
        k(null);
    }

    public final void k(tmc tmcVar) {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            int i = 0;
            this.o.set(false);
            ulo uloVar = this.s;
            if (uloVar != null) {
                uloVar.f();
            }
            this.s = null;
            iwr iwrVar = this.e;
            int iD = iwrVar.d();
            ivy ivyVarE = iwrVar.e();
            int i2 = 6;
            if (ivyVarE == ivy.d) {
                iwrVar.j(ivy.f);
                ((tug) a.e().h(tvo.a, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl", "disconnectInternal", 326, "VirtualRemoteImpl.kt")).t("Attempting to pair virtual remote. Times tried: %s.", iD);
                this.d.ap(8);
                new Handler(Looper.getMainLooper()).postDelayed(new iuc(this, i2), w.toMillis());
                return;
            }
            if (ivyVarE == ivy.c) {
                this.d.ap(6);
                iwrVar.j(ivy.e);
                return;
            }
            if (tmcVar == tmc.CONNECTION_FAILED) {
                tui tuiVar = a;
                tuv tuvVarF = tuiVar.f();
                tuy tuyVar = tvo.a;
                ((tug) tuvVarF.h(tuyVar, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl", "disconnectInternal", 338, "VirtualRemoteImpl.kt")).s("Virtual remote connection failed.");
                int i3 = this.p + 1;
                this.p = i3;
                if (i3 >= 3) {
                    ((tug) tuiVar.f().h(tuyVar, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl", "disconnectInternal", 345, "VirtualRemoteImpl.kt")).s("Reached max reconnection attempts. Marking virtual remote as lost.");
                    iwrVar.j(ivy.h);
                    this.p = 0;
                    o(4);
                    return;
                }
                ((tug) tuiVar.g().h(tuyVar, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl", "disconnectInternal", 340, "VirtualRemoteImpl.kt")).s("Attempting to reconnect virtual remote.");
                i();
            } else if (tmcVar == tmc.DISCONNECTED) {
                if (iwrVar.e() == ivy.g) {
                    o(3);
                }
                tui tuiVar2 = a;
                tuv tuvVarF2 = tuiVar2.f();
                tuy tuyVar2 = tvo.a;
                ((tug) tuvVarF2.h(tuyVar2, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl", "disconnectInternal", 355, "VirtualRemoteImpl.kt")).s("Unexpectedly disconnected from virtual remote.");
                int i4 = this.p + 1;
                this.p = i4;
                if (i4 >= 3) {
                    ((tug) tuiVar2.f().h(tuyVar2, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl", "disconnectInternal", 362, "VirtualRemoteImpl.kt")).s("Reached max reconnection attempts. Marking virtual remote as lost.");
                    iwrVar.j(ivy.h);
                    this.p = 0;
                    o(4);
                    return;
                }
                ((tug) tuiVar2.g().h(tuyVar2, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl", "disconnectInternal", 357, "VirtualRemoteImpl.kt")).s("Attempting to reconnect virtual remote.");
                i();
            }
            iwrVar.j(ivy.a);
            reentrantLock.unlock();
            ((tug) a.b().h(tvo.a, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl", "disconnectInternal", 372, "VirtualRemoteImpl.kt")).s("Virtual remote has disconnected. Cleaning up state.");
            iwrVar.p(new iwg(i));
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void l() {
        Iterator it = this.x.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ((iwb) next).a(this.e);
        }
        n();
    }

    public final void m() {
        if (this.e.e() == ivy.g) {
            boolean z = this.n.get();
            ((tug) a.e().h(tvo.a, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl", "updateInteractive", 545, "VirtualRemoteImpl.kt")).v("Updating virtual remote interactive state to %s.", Boolean.valueOf(z));
            ReentrantLock reentrantLock = this.h;
            reentrantLock.lock();
            try {
                ulo uloVar = this.s;
                if (uloVar != null) {
                    Object obj = uloVar.b;
                    int i = ((tlx) obj).f;
                    if (i != 4) {
                        if (i != 5) {
                            pku pkuVar = ((tlx) obj).h;
                            ulo uloVar2 = ((tlx) obj).g;
                            pku.h(new tme((byte[]) null));
                        }
                    } else if (((tlx) obj).c != z) {
                        ((tlx) obj).c = z;
                        int i2 = z ? ((tlx) obj).d : ((tlx) obj).e;
                        UnmodifiableIterator it = ((tlx) obj).b.iterator();
                        while (it.hasNext()) {
                            ((tma) it.next()).c(i2);
                        }
                        vtw vtwVarM = tms.a.m();
                        vtw vtwVarM2 = tmr.a.m();
                        if (!vtwVarM2.b.A()) {
                            vtwVarM2.u();
                        }
                        tmr tmrVar = (tmr) vtwVarM2.b;
                        tmrVar.b |= 1;
                        tmrVar.c = i2;
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        tms tmsVar = (tms) vtwVarM.b;
                        tmr tmrVar2 = (tmr) vtwVarM2.r();
                        tmrVar2.getClass();
                        tmsVar.c = tmrVar2;
                        tmsVar.b = 2;
                        ((tlx) obj).a((tms) vtwVarM.r());
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void n() {
        yvc yvcVar;
        Object objD;
        iws iwsVar = new iws();
        iwr iwrVar = this.e;
        iwrVar.e().getClass();
        ymp[] ympVarArr = iwr.a;
        ((ivz) iwrVar.b.d(ympVarArr[1])).getClass();
        iwsVar.a = iwrVar.f();
        iwsVar.b = iwrVar.i();
        iwsVar.c = iwrVar.r();
        iwrVar.g();
        iwrVar.h();
        iwrVar.q();
        ((iwd) iwrVar.e.d(ympVarArr[8])).getClass();
        iwrVar.d();
        this.f.c(iwsVar);
        do {
            yvcVar = this.z;
            objD = yvcVar.d();
        } while (!yvcVar.f(objD, iwsVar));
    }

    public final void o(int i) {
        if (this.n.get()) {
            this.d.ap(i);
        }
    }
}
