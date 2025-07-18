package defpackage;

import io.grpc.Status;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afmp implements afot {
    public final String a;
    public afvb b;
    public final Object c = new Object();
    public final Set d = Collections.newSetFromMap(new IdentityHashMap());
    public final Executor e;
    public final int f;
    public final agae g;
    public afeh h;
    public final afmf i;
    public boolean j;
    public Status k;
    public boolean l;
    private final afgr m;
    private final InetSocketAddress n;
    private final String o;
    private boolean p;
    private boolean q;

    public afmp(afmf afmfVar, InetSocketAddress inetSocketAddress, String str, String str2, afeh afehVar, Executor executor, int i, agae agaeVar) {
        inetSocketAddress.getClass();
        this.n = inetSocketAddress;
        this.m = afgr.a(afgr.b(getClass()), inetSocketAddress.toString());
        this.o = str;
        this.a = afrq.e("cronet", str2);
        this.f = i;
        this.e = executor;
        this.i = afmfVar;
        this.g = agaeVar;
        afeh afehVar2 = afeh.a;
        afef afefVar = new afef(afeh.a);
        afefVar.b(afri.a, afjh.PRIVACY_AND_INTEGRITY);
        afefVar.b(afri.b, afehVar);
        this.h = afefVar.a();
    }

    @Override // defpackage.afot
    public final afeh a() {
        return this.h;
    }

    @Override // defpackage.afoh
    public final /* bridge */ /* synthetic */ afoe b(afil afilVar, afih afihVar, afem afemVar, afev[] afevVarArr) {
        return new afmo(this, "https://" + this.o + "/".concat(afilVar.b), afihVar, afilVar, afzw.h(afevVarArr, this.h), afemVar).a;
    }

    @Override // defpackage.afgx
    public final afgr c() {
        return this.m;
    }

    @Override // defpackage.afvc
    public final Runnable d(afvb afvbVar) {
        this.b = afvbVar;
        synchronized (this.c) {
            this.l = true;
        }
        return new afmn(this);
    }

    final void e(afmm afmmVar, Status status) {
        synchronized (this.c) {
            if (this.d.remove(afmmVar)) {
                boolean z = true;
                if (status.getCode() != Status.Code.CANCELLED && status.getCode() != Status.Code.DEADLINE_EXCEEDED) {
                    z = false;
                }
                afmmVar.o.j(status, afof.PROCESSED, z, new afih());
                h();
            }
        }
    }

    @Override // defpackage.afvc
    public final void f(Status status) {
        synchronized (this.c) {
            if (this.j) {
                return;
            }
            synchronized (this.c) {
                if (this.p) {
                    return;
                }
                this.p = true;
                this.b.c(status);
                synchronized (this.c) {
                    this.j = true;
                    this.k = status;
                }
                h();
            }
        }
    }

    @Override // defpackage.afvc
    public final void g(Status status) {
        ArrayList arrayList;
        f(status);
        synchronized (this.c) {
            arrayList = new ArrayList(this.d);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((afmm) arrayList.get(i)).n(status);
        }
        h();
    }

    final void h() {
        synchronized (this.c) {
            if (this.j && !this.q && this.d.isEmpty()) {
                this.q = true;
                this.b.d();
            }
        }
    }

    @Override // defpackage.afoh
    public final void i(afta aftaVar, Executor executor) {
        throw null;
    }

    public final String toString() {
        InetSocketAddress inetSocketAddress = this.n;
        return super.toString() + "(" + inetSocketAddress.toString() + ")";
    }
}
