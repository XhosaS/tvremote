package defpackage;

import android.accounts.Account;
import android.os.PatternMatcher;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ldw implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ldw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo438negate() {
        switch (this.b) {
        }
        return Predicate$CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.b) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, yjv] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        Instant instantD;
        switch (this.b) {
            case 0:
                return ((Account) obj).name.equals(((ksn) ((ldy) this.a).a().g()).a);
            case 1:
                return ((Boolean) this.a.a(obj)).booleanValue();
            case 2:
                return a.Q(kw$$ExternalSyntheticApiModelOutline0.m(obj).getId(), ((kyt) this.a).k);
            case 3:
                int i = lxh.p;
                return !((kva) this.a).a((kvf) obj).m;
            case 4:
                mdw mdwVar = ((lxh) this.a).o;
                kvf kvfVar = (kvf) obj;
                if (mdwVar.o()) {
                    String strD = kvfVar.D();
                    wjz wjzVar = ((isi) mdwVar.h).i.r;
                    if (wjzVar == null) {
                        wjzVar = wjz.a;
                    }
                    wjn wjnVar = wjzVar.c;
                    if (wjnVar == null) {
                        wjnVar = wjn.a;
                    }
                    vun vunVar = wjnVar.b;
                    vunVar.getClass();
                    if (!a.ai(strD, vunVar)) {
                        return false;
                    }
                }
                return true;
            case 5:
                kwn kwnVar = (kwn) obj;
                mdw mdwVar2 = ((lxh) this.a).o;
                if (mdwVar2.o()) {
                    String str = kwnVar.b;
                    wjz wjzVar2 = ((isi) mdwVar2.h).i.r;
                    if (wjzVar2 == null) {
                        wjzVar2 = wjz.a;
                    }
                    wjn wjnVar2 = wjzVar2.d;
                    if (wjnVar2 == null) {
                        wjnVar2 = wjn.a;
                    }
                    vun vunVar2 = wjnVar2.b;
                    vunVar2.getClass();
                    if (!a.ai(str, vunVar2)) {
                        return false;
                    }
                }
                return true;
            case 6:
                return Collection.EL.stream(this.a).anyMatch(new ldw((String) obj, 7));
            case 7:
                return ((PatternMatcher) obj).match((String) this.a);
            default:
                zbe zbeVar = (zbe) obj;
                int i2 = zbeVar.c;
                if (i2 == 1) {
                    vwe vweVar = ((zaa) zbeVar.d).b;
                    if (vweVar == null) {
                        vweVar = vwe.a;
                    }
                    instantD = vxr.d(vweVar);
                } else {
                    vwe vweVar2 = (i2 == 3 ? (zbh) zbeVar.d : zbh.a).c;
                    if (vweVar2 == null) {
                        vweVar2 = vwe.a;
                    }
                    instantD = vxr.d(vweVar2);
                }
                return instantD.isAfter((Instant) this.a);
        }
    }
}
