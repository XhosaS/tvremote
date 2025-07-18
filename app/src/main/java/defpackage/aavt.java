package defpackage;

import io.grpc.Status;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aavt extends afeq {
    public final Executor a;
    public int d;
    public aavs e;
    public afep f;
    public final aavr h;
    public afeq j;
    private final afen k;
    private final afil l;
    private final yyk m;
    private afem q;
    private int s;
    private afih t;
    public final Set b = Collections.newSetFromMap(new IdentityHashMap());
    private final LinkedHashMap n = new LinkedHashMap();
    private final Set o = Collections.newSetFromMap(new IdentityHashMap());
    public boolean g = false;
    public boolean i = false;
    public final Deque c = new ArrayDeque();
    private final Queue r = new ArrayDeque();
    private final Queue p = new ArrayDeque();

    public aavt(afen afenVar, afil afilVar, afem afemVar, yyk yykVar) {
        this.k = afenVar;
        this.l = afilVar;
        this.q = afemVar;
        this.m = yykVar;
        this.e = new aavs(((zcg) yykVar).d, 1, 0, 0);
        Executor executor = afemVar.c;
        aavr aavrVar = new aavr(executor == null ? zwk.a : executor);
        this.h = aavrVar;
        final zyt zytVar = new zyt(aavrVar);
        this.a = new Executor() { // from class: aava
            @Override // java.util.concurrent.Executor
            public final void execute(final Runnable runnable) {
                final aavt aavtVar = this.a;
                zytVar.execute(new Runnable() { // from class: aavj
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            runnable.run();
                        } catch (Throwable th) {
                            aavt aavtVar2 = aavtVar;
                            aavtVar2.i = true;
                            afep afepVar = aavtVar2.f;
                            if (afepVar != null) {
                                afepVar.a(Status.b(th), new afih());
                                afeq afeqVar = aavtVar2.j;
                                if (afeqVar == null || aavtVar2.e.e != 4) {
                                    return;
                                }
                                afeqVar.b(null, th);
                            }
                        }
                    }
                });
            }
        };
    }

    private final aaut l(afem afemVar, afih afihVar, String str) {
        afil afilVar = this.l;
        afilVar.getClass();
        afemVar.getClass();
        afihVar.getClass();
        str.getClass();
        return new aaut(afilVar, afemVar, afihVar, str);
    }

    private final aaut m(aaut aautVar) {
        afem afemVar = this.q;
        return afemVar == aautVar.b ? aautVar : l(afemVar, aautVar.a, aautVar.d);
    }

    private final void n() {
        while (true) {
            Deque deque = this.c;
            if (deque.isEmpty()) {
                return;
            }
            aavq aavqVar = (aavq) deque.peek();
            if (!aavqVar.b.isEmpty() || aavqVar.c != aavqVar.d.e.a) {
                return;
            }
            Object obj = ((aavq) deque.poll()).a;
            if (this.e.e == 4) {
                this.j.e(obj);
            } else {
                this.p.add(obj);
            }
        }
    }

    private final void o(final aavq aavqVar, int i, int i2) {
        final aauu aauuVar = new aauu(aavqVar.a);
        while (i < i2) {
            yyk yykVar = (yyk) this.m.get(i);
            int size = yykVar.size();
            int i3 = 0;
            while (i3 < size) {
                aauv aauvVar = (aauv) yykVar.get(i3);
                aawa aawaVarE = aauvVar.e();
                if (aawaVarE.d == 4) {
                    zyd zydVarA = aawaVarE.a();
                    aavqVar.b.put(aauvVar, zydVarA);
                    zydVarA.d(wyo.h(new Runnable() { // from class: aauz
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.g(aauuVar, aavqVar);
                        }
                    }), this.a);
                }
                i3++;
                if (q(aawaVarE)) {
                    return;
                }
            }
            i++;
        }
        aavqVar.c = i2;
        if (aavqVar.b.isEmpty()) {
            n();
            h();
        }
    }

    private final void p() {
        aavs aavsVar;
        aavs aavsVar2 = this.e;
        int i = aavsVar2.e;
        yqw.M(!(i == 4), "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        if (i == 3) {
            aavsVar = new aavs(aavsVar2.a, 4, aavsVar2.b, aavsVar2.c);
        } else {
            if (i == 1) {
                boolean z = aavsVar2.d;
            }
            int i2 = aavsVar2.b;
            int i3 = i2 + 1;
            int i4 = aavsVar2.a;
            int i5 = aavsVar2.c;
            aavsVar = i3 < i4 ? new aavs(i4, 1, i3, i5) : new aavs(i4, 3, i2, i5);
        }
        this.e = aavsVar;
        int i6 = aavsVar.e - 1;
        if (i6 == 0) {
            j(this.t);
            return;
        }
        if (i6 != 2) {
            i();
            return;
        }
        afeq afeqVarA = this.k.a(this.l, this.q);
        this.j = afeqVarA;
        afeqVarA.a(this.f, this.t);
        int i7 = this.d;
        if (i7 > 0) {
            this.j.d(i7);
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            this.j.e(it.next());
        }
        if (this.g && this.c.isEmpty()) {
            this.j.c();
        }
        p();
    }

    private final boolean q(aawa aawaVar) {
        int i = aawaVar.d - 1;
        if (i == 0) {
            return r(aawaVar);
        }
        if (i != 1) {
            if (i != 3) {
                throw null;
            }
            final zyd zydVarA = aawaVar.a();
            this.b.add(zydVarA);
            zydVarA.d(wyo.h(new Runnable() { // from class: aavd
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b.remove(zydVarA);
                }
            }), this.a);
            return r(aawaVar);
        }
        aavw aavwVar = aawaVar.b;
        afep afepVar = this.f;
        Status status = aavwVar.a;
        afepVar.a(status, aavwVar.b);
        if (this.e.e == 4) {
            this.j.b("Aborted RPC with exception", status.o);
        }
        this.i = true;
        return true;
    }

    private final boolean r(aawa aawaVar) {
        afem afemVar = aawaVar.c;
        if (afemVar == null) {
            return false;
        }
        if (this.e.e == 1) {
            this.q = afemVar;
            return false;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Cannot return *WithCallOptions() from message processing methods");
        this.f.a(Status.b(illegalStateException), new afih());
        if (this.e.e == 4) {
            this.j.b("Interceptor returned invalid outcome", illegalStateException);
        }
        return true;
    }

    @Override // defpackage.afeq
    public final void a(afep afepVar, final afih afihVar) {
        this.f = new aavp(this, new aawf(new aavv(afepVar, this.m, this.o)));
        this.t = afihVar;
        this.a.execute(wyo.h(new Runnable() { // from class: aave
            @Override // java.lang.Runnable
            public final void run() {
                this.a.j(afihVar);
            }
        }));
    }

    @Override // defpackage.afeq
    public final void b(final String str, final Throwable th) {
        this.a.execute(wyo.h(new Runnable() { // from class: aavf
            @Override // java.lang.Runnable
            public final void run() {
                aavt aavtVar = this.a;
                Iterator it = aavtVar.b.iterator();
                while (it.hasNext()) {
                    ((zyd) it.next()).cancel(true);
                }
                afeq afeqVar = aavtVar.j;
                if (afeqVar != null) {
                    afeqVar.b(str, th);
                }
            }
        }));
    }

    @Override // defpackage.afeq
    public final void c() {
        this.a.execute(wyo.h(new Runnable() { // from class: aavb
            @Override // java.lang.Runnable
            public final void run() {
                aavt aavtVar = this.a;
                if (aavtVar.i) {
                    return;
                }
                aavtVar.g = true;
                aavtVar.h();
            }
        }));
    }

    @Override // defpackage.afeq
    public final void d(final int i) {
        synchronized (this.r) {
            this.s += i;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Queue queue = this.r;
        synchronized (queue) {
            if (!queue.isEmpty()) {
                int i2 = this.s;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object objPoll = queue.poll();
                    if (objPoll != null) {
                        arrayDeque.add(objPoll);
                        this.s--;
                    }
                }
                boolean zIsEmpty = queue.isEmpty();
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    this.f.c(it.next());
                }
                if (zIsEmpty) {
                    this.f.a(Status.OK, null);
                }
            }
        }
        this.a.execute(wyo.h(new Runnable() { // from class: aavc
            @Override // java.lang.Runnable
            public final void run() {
                aavt aavtVar = this.a;
                if (aavtVar.i) {
                    return;
                }
                int i4 = i;
                if (aavtVar.e.e == 4) {
                    aavtVar.j.d(i4);
                } else {
                    aavtVar.d += i4;
                }
            }
        }));
    }

    @Override // defpackage.afeq
    public final void e(final Object obj) {
        this.a.execute(wyo.h(new Runnable() { // from class: aavg
            @Override // java.lang.Runnable
            public final void run() {
                aavt aavtVar = this.a;
                aavtVar.c.add(new aavq(aavtVar, obj));
                aavtVar.i();
            }
        }));
    }

    public final void f(final aaut aautVar) {
        LinkedHashMap linkedHashMap = this.n;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((zyd) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            aauv aauvVar = (aauv) entry.getKey();
            m(aautVar);
            aawa aawaVarC = aauvVar.c();
            if (aawaVarC.d == 4) {
                zyd zydVarA = aawaVarC.a();
                linkedHashMap.put(aauvVar, zydVarA);
                zydVarA.d(wyo.h(new Runnable() { // from class: aavk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.f(aautVar);
                    }
                }), this.a);
            }
            if (q(aawaVarC)) {
                return;
            }
        }
        if (!linkedHashMap.isEmpty() || this.i) {
            return;
        }
        p();
    }

    public final void g(final aauu aauuVar, final aavq aavqVar) {
        LinkedHashMap linkedHashMap = aavqVar.b;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((zyd) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            aauv aauvVar = (aauv) entry.getKey();
            aawa aawaVarB = aauvVar.b();
            if (aawaVarB.d == 4) {
                zyd zydVarA = aawaVarB.a();
                linkedHashMap.put(aauvVar, zydVarA);
                zydVarA.d(wyo.h(new Runnable() { // from class: aavh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.g(aauuVar, aavqVar);
                    }
                }), this.a);
            }
            if (q(aawaVarB)) {
                return;
            }
        }
        if (linkedHashMap.isEmpty()) {
            n();
            h();
        }
    }

    public final void h() {
        if (this.g) {
            aavq aavqVar = (aavq) this.c.peekLast();
            int i = this.e.e - 1;
            if (i != 1) {
                if (i == 3 && aavqVar == null) {
                    this.j.c();
                    return;
                }
                return;
            }
            if (aavqVar == null || (aavqVar.b.isEmpty() && aavqVar.c == aavqVar.d.e.c + 1)) {
                p();
            }
        }
    }

    public final void i() {
        int i = this.e.e - 1;
        if (i != 1) {
            if (i != 3) {
                return;
            }
            for (aavq aavqVar : this.c) {
                o(aavqVar, aavqVar.c, this.e.a);
            }
            return;
        }
        for (aavq aavqVar2 : this.c) {
            int i2 = aavqVar2.c;
            int i3 = this.e.c;
            if (i2 <= i3) {
                o(aavqVar2, i2, i3 + 1);
            }
        }
    }

    public final void j(afih afihVar) {
        final aaut aautVarL = l(this.q, afihVar, this.k.b());
        yyk yykVar = (yyk) this.m.get(this.e.b);
        int size = yykVar.size();
        for (int i = 0; i < size; i++) {
            aauv aauvVar = (aauv) yykVar.get(i);
            aawa aawaVarA = aauvVar.a(m(aautVarL));
            if (aawaVarA.d == 4) {
                zyd zydVarA = aawaVarA.a();
                this.n.put(aauvVar, zydVarA);
                zydVarA.d(wyo.h(new Runnable() { // from class: aavi
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.f(aautVarL);
                    }
                }), this.a);
            }
            if (q(aawaVarA)) {
                return;
            }
            this.o.add(aauvVar);
        }
        if (this.n.isEmpty()) {
            p();
        }
    }
}
