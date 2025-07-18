package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afzg extends afji implements afgq {
    public static final Logger b = Logger.getLogger(afzg.class.getName());
    public static final afzl c = new afyy();
    public final afvo d;
    public Executor e;
    public final afgg f;
    public final List g;
    public final long h;
    public boolean i;
    public boolean j;
    public Status k;
    public boolean l;
    public final afsc m;
    public final Object n;
    public boolean o;
    public final Set p;
    public final affp q;
    public final affw r;
    public final afgm s;
    public final affs t;
    private final afgr u;
    private boolean v;

    public afzg(afzi afziVar, afsc afscVar, affp affpVar) {
        List listUnmodifiableList;
        Object obj = new Object();
        this.n = obj;
        this.p = new HashSet();
        afvo afvoVar = afziVar.g;
        afvoVar.getClass();
        this.d = afvoVar;
        afsa afsaVar = afziVar.b;
        HashMap map = new HashMap();
        Iterator it = afsaVar.a.values().iterator();
        if (it.hasNext()) {
            throw null;
        }
        DesugarCollections.unmodifiableList(new ArrayList(afsaVar.a.values()));
        this.f = new afsb(DesugarCollections.unmodifiableMap(map));
        afziVar.f.getClass();
        this.m = afscVar;
        synchronized (obj) {
            listUnmodifiableList = DesugarCollections.unmodifiableList(yyk.o(((afkw) afscVar).b));
        }
        this.u = afgr.a("Server", String.valueOf(listUnmodifiableList));
        affpVar.getClass();
        this.q = new affp(affpVar.f, affpVar.g + 1);
        this.r = afziVar.h;
        this.g = DesugarCollections.unmodifiableList(new ArrayList(afziVar.c));
        List list = afziVar.d;
        this.h = afziVar.i;
        afgm afgmVar = afziVar.o;
        this.s = afgmVar;
        new afns(agaa.a);
        affs affsVar = afziVar.j;
        affsVar.getClass();
        this.t = affsVar;
        afgm.b(afgmVar.c, this);
    }

    @Override // defpackage.afji
    public final /* bridge */ /* synthetic */ void a() {
        synchronized (this.n) {
            if (!this.j) {
                this.j = true;
                boolean z = this.i;
                if (!z) {
                    this.o = true;
                    b();
                }
                if (z) {
                    this.m.c();
                }
            }
        }
        Status statusWithDescription = Status.l.withDescription("Server shutdownNow invoked");
        synchronized (this.n) {
            if (this.k != null) {
                return;
            }
            this.k = statusWithDescription;
            ArrayList arrayList = new ArrayList(this.p);
            boolean z2 = this.l;
            if (z2) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((afzm) arrayList.get(i)).h(statusWithDescription);
                }
            }
        }
    }

    public final void b() {
        Object obj = this.n;
        synchronized (obj) {
            if (this.j && this.p.isEmpty() && this.o) {
                if (this.v) {
                    throw new AssertionError("Server already terminated");
                }
                this.v = true;
                afgm afgmVar = this.s;
                afgm.c(afgmVar.c, this);
                Executor executor = this.e;
                if (executor != null) {
                    this.d.b(executor);
                    this.e = null;
                }
                obj.notifyAll();
            }
        }
    }

    @Override // defpackage.afgx
    public final afgr c() {
        return this.u;
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.c("logId", String.valueOf(this.u.a));
        yqqVarB.b("transportServer", this.m);
        return yqqVarB.toString();
    }
}
