package defpackage;

import android.os.SystemClock;
import j$.util.DesugarCollections;
import j$.util.function.Consumer$CC;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rrk implements rrc {
    private final rqb f;
    private int h;
    private final LinkedList c = new LinkedList();
    private final yvs d = new yvs();
    private final Set e = new HashSet();
    public final Object a = new Object();
    public yqt b = ypv.a;
    private final Map g = new HashMap();

    public rrk(yqt yqtVar, int i) {
        this.h = 300;
        this.f = (rqb) yqtVar.e(rqb.b().a());
        this.h = i;
    }

    private static boolean c(Map map, Map map2) {
        for (String str : ((yyr) map2).keySet()) {
            if (map.containsKey(str)) {
                Set set = (Set) map.get(str);
                Set set2 = (Set) map2.get(str);
                set.getClass();
                set2.getClass();
                if (!new zcy(set, set2).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, zyh] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.util.Collection, java.util.List] */
    @Override // defpackage.rrc
    public final synchronized yqt a(rqv rqvVar) {
        rrf rrfVar;
        rrh rrhVarA;
        zyd zydVar;
        rqv rqvVar2;
        LinkedList linkedList = this.c;
        if (linkedList.size() + 1 > this.h && (rqvVar2 = (rqv) linkedList.pollFirst()) != null) {
            yvs yvsVar = this.d;
            Collection collection = (Collection) ((yve) yvsVar).a.remove(rqvVar2);
            if (collection == null) {
                List list = Collections.EMPTY_LIST;
            } else {
                ?? A = yvsVar.a();
                A.addAll(collection);
                ((yve) yvsVar).b -= collection.size();
                collection.clear();
                DesugarCollections.unmodifiableList(A);
            }
            this.e.remove(rqvVar2);
            if (rqvVar2.c().d) {
                Map map = this.g;
                if (map.containsKey(rqvVar2)) {
                    zyd zydVar2 = (zyd) map.get(rqvVar2);
                    if (!zydVar2.isDone()) {
                        zydVar2.cancel(false);
                    }
                }
            }
        }
        yyr yyrVar = ((rqy) rqvVar).e;
        ListIterator listIterator = linkedList.listIterator(linkedList.size());
        ypv ypvVar = ypv.a;
        yqt yqtVarI = ypvVar;
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            rqv rqvVar3 = (rqv) listIterator.previous();
            adga adgaVar = ((epb) rqvVar3.b().b).d;
            if (adgaVar == null) {
                adgaVar = adga.a;
            }
            abzy abzyVar = adgaVar.c;
            if (abzyVar == null) {
                abzyVar = abzy.a;
            }
            adga adgaVar2 = ((epb) ((rqy) rqvVar).d.b).d;
            if (adgaVar2 == null) {
                adgaVar2 = adga.a;
            }
            abzy abzyVar2 = adgaVar2.c;
            if (abzyVar2 == null) {
                abzyVar2 = abzy.a;
            }
            acbj.f(abzyVar);
            acbj.f(abzyVar2);
            int iCompare = Long.compare(abzyVar.b, abzyVar2.b);
            if (iCompare == 0) {
                iCompare = Integer.compare(abzyVar.c, abzyVar2.c);
            }
            if (iCompare <= 0) {
                listIterator.next();
                break;
            }
            if (rqvVar3.c().c && rqvVar3.c().a().contains(((rqy) rqvVar).c.a) && (yyrVar.isEmpty() || rqvVar3.g().isEmpty() || c(rqvVar3.g(), yyrVar))) {
                if (!yqtVarI.g()) {
                    yqtVarI = yqt.i(rqvVar3);
                }
            }
        }
        listIterator.add(rqvVar);
        if (yqtVarI.g()) {
            listIterator.previous();
            this.d.l(rqvVar, ((rqv) yqtVarI.c()).c().f);
            rrfVar = new rrf(listIterator, 2, yqtVarI);
        } else {
            rpz rpzVar = ((rqy) rqvVar).c;
            if (rpzVar.d) {
                rqb rqbVar = this.f;
                if (rqbVar.c().g()) {
                    yqt yqtVar = rpzVar.e;
                    if (yqtVar.g()) {
                        epa epaVar = ((rqy) rqvVar).d;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        adga adgaVar3 = ((epb) epaVar.b).d;
                        if (adgaVar3 == null) {
                            adgaVar3 = adga.a;
                        }
                        abzy abzyVar3 = adgaVar3.c;
                        if (abzyVar3 == null) {
                            abzyVar3 = abzy.a;
                        }
                        long jA = acbj.a(abzyVar3);
                        if (jA > jElapsedRealtime) {
                            jA = jElapsedRealtime;
                        }
                        long jLongValue = ((Long) yqtVar.c()).longValue() - (jElapsedRealtime - jA);
                        if (jLongValue <= 0) {
                            b(rqvVar);
                        } else {
                            this.g.put(rqvVar, rqbVar.c().c().schedule(new rrj(new Consumer() { // from class: rri
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj) {
                                    this.a.b((rqv) obj);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }, rqvVar), jLongValue, TimeUnit.MILLISECONDS));
                        }
                    }
                }
            }
            rrfVar = new rrf(listIterator, 1, ypvVar);
        }
        if (rrfVar.c - 1 != 0) {
            rrd rrdVar = new rrd();
            int i = yyk.e;
            yyf yyfVar = new yyf(4);
            while (true) {
                ListIterator listIterator2 = rrfVar.a;
                if (!listIterator2.hasNext()) {
                    break;
                }
                rqv rqvVar4 = (rqv) listIterator2.next();
                if (yyrVar.isEmpty() || rqvVar4.g().isEmpty() || c(rqvVar4.g(), yyrVar)) {
                    yyfVar.g(rqvVar4);
                    if (rqvVar4 == rrfVar.b.c()) {
                        break;
                    }
                }
            }
            rrdVar.b(yyfVar.f());
            rrdVar.a = 7;
            return yqt.i(rrdVar.a());
        }
        rpz rpzVar2 = ((rqy) rqvVar).c;
        if (!rpzVar2.c) {
            return ypvVar;
        }
        ListIterator listIterator3 = rrfVar.a;
        yzq yzqVarA = rpzVar2.a();
        rqp rqpVar = rpzVar2.f;
        rrd rrdVar2 = new rrd();
        int i2 = yyk.e;
        yyf yyfVar2 = new yyf(4);
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (!listIterator3.hasPrevious()) {
                rrdVar2.b(yyk.j(linkedList));
                rrdVar2.a = 3;
                rrhVarA = rrdVar2.a();
                break;
            }
            rqv rqvVar5 = (rqv) listIterator3.previous();
            if (yyrVar.isEmpty() || rqvVar5.g().isEmpty() || c(rqvVar5.g(), yyrVar)) {
                arrayDeque.add(rqvVar5);
                if (yzqVarA.contains(rqvVar5.c().a)) {
                    if (this.f.c().g() && (zydVar = (zyd) this.g.remove(rqvVar5)) != null) {
                        zydVar.cancel(false);
                    }
                    if (this.e.contains(rqvVar5)) {
                        rrdVar2.a = 6;
                    } else {
                        yvs yvsVar2 = this.d;
                        if (yvsVar2.o(rqvVar5, rqpVar)) {
                            rrdVar2.a = 5;
                        } else {
                            yvsVar2.l(rqvVar5, rqpVar);
                            rrdVar2.a = 2;
                        }
                    }
                    yyfVar2.i(arrayDeque.descendingIterator());
                    rrdVar2.b(yyfVar2.f());
                    rrhVarA = rrdVar2.a();
                }
            }
        }
        return yqt.i(rrhVarA);
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, rot] */
    public final void b(rqv rqvVar) {
        rqv rqvVar2;
        ArrayDeque arrayDeque = new ArrayDeque();
        rrd rrdVar = new rrd();
        int i = yyk.e;
        yyf yyfVar = new yyf(4);
        synchronized (this) {
            this.g.remove(rqvVar);
            this.e.add(rqvVar);
            LinkedList linkedList = this.c;
            ListIterator listIterator = linkedList.listIterator(linkedList.size());
            while (listIterator.hasPrevious() && (rqvVar2 = (rqv) listIterator.previous()) != rqvVar) {
                arrayDeque.add(rqvVar2);
            }
        }
        arrayDeque.add(rqvVar);
        yyfVar.i(arrayDeque.descendingIterator());
        rrdVar.b(yyfVar.f());
        rrdVar.a = 4;
        synchronized (this.a) {
            if (this.b.g()) {
                Object objC = this.b.c();
                rrh rrhVarA = rrdVar.a();
                Object obj = ((rph) objC).a;
                rru rruVarA = ((rph) objC).a(rrhVarA);
                synchronized (obj) {
                    if (((rph) objC).c.g()) {
                        ((rph) objC).c.c().b(rruVarA);
                        ((rph) objC).b(rruVarA);
                    }
                }
            }
        }
    }
}
