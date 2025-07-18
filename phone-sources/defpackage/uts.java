package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uts extends xtc {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public boolean c;
    public xtk d;
    public xsm e;
    private final ImmutableList g;
    private final Queue h;
    private final Set i;
    private int j;
    private boolean k;
    private boolean l;
    private xsm m;

    public uts(wbb wbbVar, ImmutableList immutableList, Set set) {
        super(wbbVar);
        this.a = new LinkedHashMap();
        this.h = new ArrayDeque();
        this.b = new LinkedHashMap();
        this.g = immutableList;
        this.j = immutableList.size();
        this.i = set;
    }

    private final void Z() {
        if (h() || !this.h.isEmpty() || !this.l || this.c) {
            return;
        }
        g();
    }

    @Override // defpackage.wbb
    public final void a(xtk xtkVar, xsm xsmVar) {
        this.d = xtkVar;
        this.e = xsmVar;
        this.l = true;
        Z();
    }

    @Override // defpackage.xtc, defpackage.wbb
    public final void c(xsm xsmVar) {
        this.m = xsmVar;
        upq upqVar = new upq(xsmVar);
        Iterator it = Lists.reverse(this.g.subList(0, this.j)).iterator();
        while (it.hasNext()) {
            this.j--;
            for (utj utjVar : Lists.reverse((List) it.next())) {
                if (this.i.contains(utjVar)) {
                    try {
                        utjVar.e(upqVar);
                    } catch (Throwable th) {
                        this.d = xtk.c(th);
                        this.e = new xsm();
                        g();
                        return;
                    }
                }
            }
            if (h()) {
                return;
            }
        }
        this.f.c(this.m);
        this.k = true;
        f();
    }

    @Override // defpackage.xtc, defpackage.wbb
    public final void d(Object obj) {
        this.h.add(new nuh(obj, this.g.size()));
        f();
    }

    public final void f() {
        if (this.k) {
            Queue<nuh> queue = this.h;
            for (nuh nuhVar : queue) {
                Iterator it = Lists.reverse(this.g.subList(0, nuhVar.a)).iterator();
                while (it.hasNext()) {
                    for (utj utjVar : Lists.reverse((List) it.next())) {
                        if (this.i.contains(utjVar)) {
                            try {
                                utjVar.i(new upo(nuhVar.c));
                            } catch (Throwable th) {
                                this.d = xtk.c(th);
                                this.e = new xsm();
                                g();
                                this.c = true;
                                return;
                            }
                        }
                    }
                    if (!nuhVar.u()) {
                        return;
                    } else {
                        nuhVar.a--;
                    }
                }
            }
            while (!queue.isEmpty()) {
                nuh nuhVar2 = (nuh) queue.peek();
                if (!nuhVar2.u() || nuhVar2.a != 0) {
                    break;
                } else {
                    this.f.d(((nuh) queue.poll()).c);
                }
            }
            Z();
        }
    }

    public final void g() {
        Iterator it = Lists.reverse(this.g).iterator();
        while (it.hasNext()) {
            for (utj utjVar : Lists.reverse((List) it.next())) {
                upo upoVar = new upo(this.d, this.e);
                if (this.i.contains(utjVar)) {
                    try {
                        utjVar.d(upoVar);
                    } catch (Throwable th) {
                        this.d = xtk.c(th);
                        this.e = new xsm();
                    }
                }
            }
        }
        if (this.b.isEmpty()) {
            this.f.a(this.d, this.e);
        }
    }

    public final boolean h() {
        return !this.a.isEmpty();
    }
}
