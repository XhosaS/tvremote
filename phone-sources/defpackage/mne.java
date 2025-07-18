package defpackage;

import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mne implements idf {
    public final ksy a;
    public final mmd b;
    public final idf c;
    public final ieh d;
    private final boolean e;
    private final idf f = new idf() { // from class: mnd
        @Override // defpackage.idf
        public final Object b(Object obj) {
            ieg iegVarF;
            ieg iegVarF2;
            ieg iegVarF3;
            mne mneVar = this.a;
            ieh iehVar = mneVar.d;
            List list = (List) obj;
            kva kvaVar = (kva) iehVar.a();
            ieg iegVar = (ieg) mneVar.c.b(mneVar.a);
            ieg iegVar2 = mneVar.b.d;
            if (iegVar2.m() && kuf.b((kuf) iegVar2.g())) {
                kuf kufVar = (kuf) iegVar2.g();
                if (iegVar.m() && ((kwq) iegVar.g()).b.equals(kufVar)) {
                    ksy ksyVar = ((kwq) iegVar.g()).a;
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            iegVarF3 = ieg.b;
                            break;
                        }
                        kwl kwlVar = (kwl) it.next();
                        if (ksyVar.equals(kwlVar.d) && mne.e(kwlVar, kufVar)) {
                            iegVarF3 = ieg.f(new mmq(kwlVar, ieg.f(kufVar)));
                            break;
                        }
                    }
                    if (iegVarF3.m()) {
                        return iegVarF3;
                    }
                }
                for (kwl kwlVar2 : Lists.reverse(list)) {
                    if (kvaVar.a(kwlVar2).b || kvaVar.d(kwlVar2.d)) {
                        return ieg.f(new mmq(kwlVar2, ieg.f(kufVar)));
                    }
                }
                if (kuf.b(kufVar)) {
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            kwl kwlVar3 = (kwl) list.get(size);
                            if (kvaVar.a(kwlVar3).b) {
                                iegVarF2 = ieg.f(new mmq(kwlVar3, ieg.f(kufVar)));
                                break;
                            }
                        } else {
                            int size2 = list.size();
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    iegVarF2 = ieg.b;
                                    break;
                                }
                                kwl kwlVar4 = (kwl) list.get(size2);
                                if (kwlVar4.d()) {
                                    iegVarF2 = ieg.f(new mmq(kwlVar4, ieg.f(kufVar)));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    int size3 = list.size();
                    while (true) {
                        size3--;
                        if (size3 < 0) {
                            iegVarF2 = ieg.b;
                            break;
                        }
                        kwl kwlVar5 = (kwl) list.get(size3);
                        if (mne.e(kwlVar5, kufVar)) {
                            iegVarF2 = ieg.f(new mmq(kwlVar5, ieg.f(kufVar)));
                            break;
                        }
                    }
                }
                if (iegVarF2.m()) {
                    return iegVarF2;
                }
            }
            if (iegVar.m()) {
                ieg iegVarA = mne.a(ieg.f(((kwq) iegVar.g()).a), list);
                if (iegVarA.m()) {
                    kwl kwlVar6 = (kwl) iegVarA.g();
                    ieg.f(((kwq) iegVar.g()).b);
                    return ieg.f(new mmq(kwlVar6, mne.f(kwlVar6, kvaVar)));
                }
            }
            int size4 = list.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    iegVarF = ieg.b;
                    break;
                }
                kwl kwlVar7 = (kwl) list.get(size4);
                ieg iegVarD = mne.d(false, kwlVar7, kvaVar);
                if (iegVarD.m()) {
                    iegVarF = ieg.f(new mmq(kwlVar7, iegVarD));
                    break;
                }
            }
            if (!iegVarF.m()) {
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < 0) {
                        iegVarF = ieg.b;
                        break;
                    }
                    kwl kwlVar8 = (kwl) list.get(size5);
                    ieg iegVarC = mne.c(false, kwlVar8, (kva) iehVar.a());
                    if (iegVarC.m()) {
                        iegVarF = ieg.f(new mmq(kwlVar8, iegVarC));
                        break;
                    }
                }
                if (!iegVarF.m()) {
                    return ieg.f(new mmq((kwl) list.get(list.size() - 1), ieg.b));
                }
            }
            return iegVarF;
        }
    };

    public mne(ksy ksyVar, mmd mmdVar, idf idfVar, ieh iehVar, boolean z) {
        this.a = ksyVar;
        this.b = mmdVar;
        this.c = idfVar;
        this.d = iehVar;
        this.e = z;
    }

    public static ieg a(ieg iegVar, List list) {
        if (iegVar.m()) {
            ksy ksyVar = (ksy) iegVar.g();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kwl kwlVar = (kwl) it.next();
                if (ksyVar.equals(kwlVar.d)) {
                    return ieg.f(kwlVar);
                }
            }
        }
        return ieg.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ieg c(boolean z, kwl kwlVar, kva kvaVar) {
        ieg iegVarD = d(z, kwlVar, kvaVar);
        if (iegVarD.m()) {
            return iegVarD;
        }
        if (kwlVar.d()) {
            return ieg.f(kuf.a);
        }
        if (z) {
            UnmodifiableIterator it = kwlVar.q.iterator();
            while (it.hasNext()) {
                kup kupVar = (kup) it.next();
                if (kupVar.a() > 0) {
                    return ieg.f(kupVar.a);
                }
            }
        }
        return ieg.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ieg d(boolean z, kwl kwlVar, kva kvaVar) {
        if (kvaVar.a(kwlVar).b || kvaVar.d(kwlVar.d)) {
            return ieg.f(kuf.a);
        }
        if (!z) {
            return ieg.b;
        }
        UnmodifiableIterator it = kwlVar.q.iterator();
        while (it.hasNext()) {
            kup kupVar = (kup) it.next();
            if (h(kupVar)) {
                return ieg.f(kupVar.a);
            }
        }
        return ieg.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(kwl kwlVar, kuf kufVar) {
        UnmodifiableIterator it = kwlVar.q.iterator();
        while (it.hasNext()) {
            if (kufVar.equals(((kup) it.next()).a)) {
                return true;
            }
        }
        return false;
    }

    public static ieg f(kwl kwlVar, kva kvaVar) {
        return (kwlVar.d() || kvaVar.a(kwlVar).b || kvaVar.d(kwlVar.d)) ? ieg.f(kuf.a) : ieg.b;
    }

    private final List g(List list) {
        ieg iegVar = this.b.c;
        ieg iegVarF = iegVar.m() ? ieg.f(xbn.b(((Integer) iegVar.g()).intValue())) : ieg.a;
        return iegVarF.l() ? Lists.reverse(list) : ((xbn) iegVarF.g()).ordinal() != 1 ? Lists.reverse(list) : list;
    }

    private static boolean h(kup kupVar) {
        return kupVar.c > 0 || kupVar.b > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        ieg iegVarF;
        List list = (List) obj;
        if (list.isEmpty()) {
            return ieg.a;
        }
        mmd mmdVar = this.b;
        ieg iegVarA = a(mmdVar.b, list);
        if (iegVarA.m()) {
            ieg iegVar = mmdVar.d;
            kwl kwlVar = (kwl) iegVarA.g();
            return mmdVar.h ? ieg.f(new mmq(kwlVar, iegVar)) : ieg.f(new mmq(kwlVar, f(kwlVar, (kva) this.d.a())));
        }
        if (!this.e || mmdVar.a().l()) {
            return this.f.b(list);
        }
        int iOrdinal = ((xbm) mmdVar.a().g()).ordinal();
        if (iOrdinal == 1) {
            for (kwl kwlVar2 : g(list)) {
                if (!kwlVar2.d()) {
                    ieh iehVar = this.d;
                    if (((kva) iehVar.a()).a(kwlVar2).b || ((kva) iehVar.a()).d(kwlVar2.d)) {
                    }
                }
                return ieg.f(new mmq(kwlVar2, ieg.f(kuf.a)));
            }
            return this.f.b(list);
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                for (kwl kwlVar3 : g(list)) {
                    ieg iegVarD = d(true, kwlVar3, (kva) this.d.a());
                    if (iegVarD.m()) {
                        return ieg.f(new mmq(kwlVar3, iegVarD));
                    }
                }
                return this.f.b(list);
            }
            if (iOrdinal != 4) {
                return this.f.b(list);
            }
            for (kwl kwlVar4 : g(list)) {
                ieg iegVarC = c(true, kwlVar4, (kva) this.d.a());
                if (iegVarC.m()) {
                    return ieg.f(new mmq(kwlVar4, iegVarC));
                }
            }
            return this.f.b(list);
        }
        ieg iegVar2 = mmdVar.d;
        if (iegVar2.m()) {
            if (kuf.a((kuf) iegVar2.g())) {
                for (kwl kwlVar5 : g(list)) {
                    UnmodifiableIterator it = kwlVar5.q.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            iegVarF = ieg.b;
                            break;
                        }
                        kup kupVar = (kup) it.next();
                        if (!h(kupVar)) {
                            kuf kufVar = kupVar.a;
                            if (!kuf.b(kufVar)) {
                                iegVarF = ieg.f(kufVar);
                                break;
                            }
                        }
                    }
                    if (iegVarF.m()) {
                        return ieg.f(new mmq(kwlVar5, iegVarF));
                    }
                }
                return this.f.b(list);
            }
            for (kwl kwlVar6 : g(list)) {
                kuf kufVar2 = (kuf) iegVar2.g();
                UnmodifiableIterator it2 = kwlVar6.q.iterator();
                while (it2.hasNext()) {
                    if (((kup) it2.next()).a.equals(kufVar2)) {
                        return ieg.f(new mmq(kwlVar6, iegVar2));
                    }
                }
            }
        }
        return this.f.b(list);
    }
}
