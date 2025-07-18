package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utr extends xqb {
    public final Executor a;
    public int d;
    public utq e;
    public final utp g;
    public xqb i;
    public wbb j;
    private final xpz k;
    private final xsq l;
    private final ImmutableList m;
    private xpy q;
    private int s;
    private xsm t;
    private xsm u;
    public final Set b = Sets.newIdentityHashSet();
    private final LinkedHashMap n = new LinkedHashMap();
    private final Set o = Sets.newIdentityHashSet();
    public boolean f = false;
    public boolean h = false;
    public final Deque c = new ArrayDeque();
    private final Queue r = new ArrayDeque();
    private final Queue p = new ArrayDeque();

    public utr(xpz xpzVar, xsq xsqVar, xpy xpyVar, ImmutableList immutableList) {
        this.k = xpzVar;
        this.l = xsqVar;
        this.q = xpyVar;
        this.m = immutableList;
        this.e = new utq(immutableList.size(), 1, 0, 0);
        Executor executor = xpyVar.c;
        utp utpVar = new utp(executor == null ? ugk.a : executor);
        this.g = utpVar;
        this.a = new max(this, new uib(utpVar), 2);
    }

    private final void k() {
        ArrayDeque arrayDeque = new ArrayDeque();
        Queue queue = this.r;
        synchronized (queue) {
            if (queue.isEmpty()) {
                return;
            }
            xsm xsmVar = this.t;
            int i = this.s;
            for (int i2 = 0; i2 < i; i2++) {
                Object objPoll = queue.poll();
                if (objPoll != null) {
                    arrayDeque.add(objPoll);
                    this.s--;
                }
            }
            boolean zIsEmpty = queue.isEmpty();
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                this.j.d(it.next());
            }
            if (zIsEmpty) {
                this.j.a(xtk.b, xsmVar);
            }
        }
    }

    private final void l() {
        while (true) {
            Deque deque = this.c;
            if (deque.isEmpty()) {
                return;
            }
            uto utoVar = (uto) deque.peek();
            if (!utoVar.b.isEmpty() || utoVar.c != utoVar.d.e.a) {
                return;
            }
            Object obj = ((uto) deque.poll()).a;
            if (this.e.e == 4) {
                this.i.f(obj);
            } else {
                this.p.add(obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m(uto utoVar, int i, int i2) {
        uto utoVar2;
        upq upqVar = new upq(utoVar.a);
        while (i < i2) {
            UnmodifiableIterator it = ((ImmutableList) this.m.get(i)).iterator();
            while (it.hasNext()) {
                utj utjVar = (utj) it.next();
                utv utvVarF = utjVar.f(upqVar);
                if (utvVarF.e == 4) {
                    uhp uhpVarA = utvVarF.a();
                    utoVar.b.put(utjVar, uhpVarA);
                    utoVar2 = utoVar;
                    uhpVarA.c(trc.f(new rvp(this, upqVar, utoVar2, 12, (char[]) null)), this.a);
                } else {
                    utoVar2 = utoVar;
                }
                if (o(utvVarF)) {
                    return;
                } else {
                    utoVar = utoVar2;
                }
            }
            i++;
        }
        uto utoVar3 = utoVar;
        utoVar3.c = i2;
        if (utoVar3.b.isEmpty()) {
            l();
            b();
        }
    }

    private final void n() {
        utq utqVar;
        utq utqVar2 = this.e;
        int i = utqVar2.e;
        sij.x(!(i == 4), "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        if (i == 3) {
            utqVar = new utq(utqVar2.a, 4, utqVar2.b, utqVar2.c);
        } else if (i == 1 && utqVar2.d) {
            int i2 = utqVar2.a;
            int i3 = utqVar2.b;
            utqVar = new utq(i2, 2, i3, i3);
        } else {
            int i4 = utqVar2.b;
            int i5 = i4 + 1;
            int i6 = utqVar2.a;
            int i7 = utqVar2.c;
            utqVar = i5 < i6 ? new utq(i6, 1, i5, i7) : new utq(i6, 3, i4, i7);
        }
        this.e = utqVar;
        int i8 = utqVar.e - 1;
        if (i8 == 0) {
            h(this.u);
            return;
        }
        if (i8 != 2) {
            g();
            return;
        }
        xqb xqbVarA = this.k.a(this.l, this.q);
        this.i = xqbVarA;
        xqbVarA.a(this.j, this.u);
        int i9 = this.d;
        if (i9 > 0) {
            this.i.e(i9);
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            this.i.f(it.next());
        }
        if (this.f && this.c.isEmpty()) {
            this.i.d();
        }
        n();
    }

    private final boolean o(utv utvVar) {
        int i = utvVar.e - 1;
        if (i == 0) {
            return p(utvVar);
        }
        if (i == 1) {
            usr usrVar = utvVar.f;
            wbb wbbVar = this.j;
            xtk xtkVar = (xtk) usrVar.c;
            wbbVar.a(xtkVar, (xsm) usrVar.b);
            if (this.e.e == 4) {
                this.i.c("Aborted RPC with exception", xtkVar.p);
            }
        } else {
            if (i != 2) {
                if (i != 3) {
                    this.e.d = true;
                    return false;
                }
                uhp uhpVarA = utvVar.a();
                this.b.add(uhpVarA);
                uhpVarA.c(trc.f(new ukm(this, uhpVarA, 17, null)), this.a);
                return p(utvVar);
            }
            utu utuVar = utvVar.c;
            this.j.c(utuVar.a);
            Queue queue = this.r;
            synchronized (queue) {
                vvj vvjVar = utuVar.c;
                if (vvjVar == null) {
                    throw null;
                }
                queue.add(vvjVar);
                this.t = utuVar.b;
            }
            k();
            if (this.e.e == 4) {
                this.i.c("Aborted RPC with response", null);
            }
        }
        this.h = true;
        return true;
    }

    private final boolean p(utv utvVar) {
        xpy xpyVar = utvVar.d;
        if (xpyVar == null) {
            return false;
        }
        if (this.e.e == 1) {
            this.q = xpyVar;
            return false;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Cannot return *WithCallOptions() from message processing methods");
        this.j.a(xtk.c(illegalStateException), new xsm());
        if (this.e.e == 4) {
            this.i.c("Interceptor returned invalid outcome", illegalStateException);
        }
        return true;
    }

    private final vvd q(xpy xpyVar, xsm xsmVar, String str) {
        xpyVar.getClass();
        xsmVar.getClass();
        str.getClass();
        return new vvd(this.l, xpyVar, xsmVar, str);
    }

    private final vvd r(vvd vvdVar) {
        xpy xpyVar = this.q;
        if (xpyVar == vvdVar.d) {
            return vvdVar;
        }
        return q(xpyVar, (xsm) vvdVar.b, (String) vvdVar.c);
    }

    @Override // defpackage.xqb
    public final void a(wbb wbbVar, xsm xsmVar) {
        this.j = new utn(this, new utw(new uts(wbbVar, this.m, this.o)));
        this.u = xsmVar;
        this.a.execute(trc.f(new ukm(this, xsmVar, 18)));
    }

    public final void b() {
        if (this.f) {
            uto utoVar = (uto) this.c.peekLast();
            int i = this.e.e - 1;
            if (i != 1) {
                if (i == 3 && utoVar == null) {
                    this.i.d();
                    return;
                }
                return;
            }
            if (utoVar == null || (utoVar.b.isEmpty() && utoVar.c == utoVar.d.e.c + 1)) {
                n();
            }
        }
    }

    @Override // defpackage.xqb
    public final void c(String str, Throwable th) {
        this.a.execute(trc.f(new rvp(this, str, th, 13)));
    }

    @Override // defpackage.xqb
    public final void d() {
        this.a.execute(trc.f(new ufx(this, 13)));
    }

    @Override // defpackage.xqb
    public final void e(int i) {
        synchronized (this.r) {
            this.s += i;
        }
        k();
        this.a.execute(trc.f(new utl(this, i, 0)));
    }

    @Override // defpackage.xqb
    public final void f(Object obj) {
        this.a.execute(trc.f(new ukm(this, obj, 19)));
    }

    public final void g() {
        int i = this.e.e - 1;
        if (i != 1) {
            if (i != 3) {
                return;
            }
            for (uto utoVar : this.c) {
                m(utoVar, utoVar.c, this.e.a);
            }
            return;
        }
        for (uto utoVar2 : this.c) {
            int i2 = utoVar2.c;
            int i3 = this.e.c;
            if (i2 <= i3) {
                m(utoVar2, i2, i3 + 1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(xsm xsmVar) {
        vvd vvdVarQ = q(this.q, xsmVar, this.k.b());
        UnmodifiableIterator it = ((ImmutableList) this.m.get(this.e.b)).iterator();
        while (it.hasNext()) {
            utj utjVar = (utj) it.next();
            utv utvVarH = utjVar.h(r(vvdVarQ));
            if (utvVarH.e == 4) {
                uhp uhpVarA = utvVarH.a();
                this.n.put(utjVar, uhpVarA);
                uhpVarA.c(trc.f(new ukm(this, vvdVarQ, 20, null)), this.a);
            }
            if (o(utvVarH)) {
                return;
            } else {
                this.o.add(utjVar);
            }
        }
        if (this.n.isEmpty()) {
            n();
        }
    }

    public final void i(upq upqVar, uto utoVar) {
        upq upqVar2;
        uto utoVar2;
        LinkedHashMap linkedHashMap = utoVar.b;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((uhp) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            utj utjVar = (utj) entry.getKey();
            utv utvVarB = utjVar.b();
            if (utvVarB.e == 4) {
                uhp uhpVarA = utvVarB.a();
                linkedHashMap.put(utjVar, uhpVarA);
                upqVar2 = upqVar;
                utoVar2 = utoVar;
                uhpVarA.c(trc.f(new rvp(this, upqVar2, utoVar2, 14, (char[]) null)), this.a);
            } else {
                upqVar2 = upqVar;
                utoVar2 = utoVar;
            }
            if (o(utvVarB)) {
                return;
            }
            upqVar = upqVar2;
            utoVar = utoVar2;
        }
        if (linkedHashMap.isEmpty()) {
            l();
            b();
        }
    }

    public final void j(vvd vvdVar) {
        LinkedHashMap linkedHashMap = this.n;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((uhp) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            utj utjVar = (utj) entry.getKey();
            utv utvVarG = utjVar.g(r(vvdVar));
            if (utvVarG.e == 4) {
                uhp uhpVarA = utvVarG.a();
                linkedHashMap.put(utjVar, uhpVarA);
                uhpVarA.c(trc.f(new utm(this, vvdVar, 0, (short[]) null)), this.a);
            }
            if (o(utvVarG)) {
                return;
            }
        }
        if (!linkedHashMap.isEmpty() || this.h) {
            return;
        }
        n();
    }
}
