package defpackage;

import com.google.common.collect.Lists;
import io.grpc.Status;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavv extends afgc {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public boolean c;
    public afih d;
    public Status e;
    public afih f;
    private final yyk h;
    private final Queue i;
    private final Set j;
    private int k;
    private boolean l;
    private boolean m;

    public aavv(afep afepVar, yyk yykVar, Set set) {
        super(afepVar);
        this.a = new LinkedHashMap();
        this.i = new ArrayDeque();
        this.b = new LinkedHashMap();
        this.h = yykVar;
        this.k = ((zcg) yykVar).d;
        this.j = set;
    }

    private final void j() {
        if (h() || !this.i.isEmpty() || !this.m || this.c) {
            return;
        }
        f();
    }

    @Override // defpackage.afep
    public final void a(Status status, afih afihVar) {
        this.e = status;
        this.f = afihVar;
        this.m = true;
        j();
    }

    @Override // defpackage.afja, defpackage.afep
    public final void b(afih afihVar) {
        this.d = afihVar;
        g();
    }

    @Override // defpackage.afgd, defpackage.afep
    public final void c(Object obj) {
        this.i.add(new aavu(obj, ((zcg) this.h).d));
        e();
    }

    public final void e() {
        if (this.l) {
            Queue<aavu> queue = this.i;
            for (aavu aavuVar : queue) {
                Iterator it = Lists.b(this.h.subList(0, aavuVar.c)).iterator();
                while (it.hasNext()) {
                    for (aauv aauvVar : Lists.b((List) it.next())) {
                        if (this.j.contains(aauvVar)) {
                            aavuVar.a.getClass();
                            try {
                                aauvVar.g();
                            } catch (Throwable th) {
                                this.e = Status.b(th);
                                this.f = new afih();
                                f();
                                this.c = true;
                                return;
                            }
                        }
                    }
                    if (!aavuVar.b.isEmpty()) {
                        return;
                    } else {
                        aavuVar.c--;
                    }
                }
            }
            while (!queue.isEmpty()) {
                aavu aavuVar2 = (aavu) queue.peek();
                if (!aavuVar2.b.isEmpty() || aavuVar2.c != 0) {
                    break;
                } else {
                    this.g.c(((aavu) queue.poll()).a);
                }
            }
            j();
        }
    }

    public final void f() {
        Iterator it = Lists.b(this.h).iterator();
        while (it.hasNext()) {
            for (aauv aauvVar : Lists.b((List) it.next())) {
                aaus aausVar = new aaus(this.e, this.f);
                if (this.j.contains(aauvVar)) {
                    try {
                        aauvVar.d(aausVar);
                    } catch (Throwable th) {
                        this.e = Status.b(th);
                        this.f = new afih();
                    }
                }
            }
        }
        if (this.b.isEmpty()) {
            this.g.a(this.e, this.f);
        }
    }

    public final void g() {
        this.d.getClass();
        Iterator it = Lists.b(this.h.subList(0, this.k)).iterator();
        while (it.hasNext()) {
            this.k--;
            for (aauv aauvVar : Lists.b((List) it.next())) {
                if (this.j.contains(aauvVar)) {
                    try {
                        aauvVar.f();
                    } catch (Throwable th) {
                        this.e = Status.b(th);
                        this.f = new afih();
                        f();
                        return;
                    }
                }
            }
            if (h()) {
                return;
            }
        }
        this.g.b(this.d);
        this.l = true;
        e();
    }

    public final boolean h() {
        return !this.a.isEmpty();
    }
}
