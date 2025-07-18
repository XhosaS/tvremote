package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pbd implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ pbd(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo438negate() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        if (i == 0) {
            return pbg.a((uwi) obj);
        }
        if (i == 1) {
            return ((vzq) obj).equals(vzq.HDR_10_PLUS);
        }
        if (i == 2) {
            uxw uxwVar = (uxw) obj;
            tvn tvnVar = pgw.a;
            uxs uxsVar = uxwVar.c == 14 ? (uxs) uxwVar.d : uxs.a;
            return (uxsVar.b == 3 ? (uyf) uxsVar.c : uyf.a).d;
        }
        if (i == 3) {
            uxw uxwVar2 = (uxw) obj;
            uxs uxsVar2 = uxwVar2.c == 14 ? (uxs) uxwVar2.d : uxs.a;
            return !(uxsVar2.b == 3 ? (uyf) uxsVar2.c : uyf.a).c.isEmpty();
        }
        if (i != 4) {
            return !((String) obj).contains("_CBC_");
        }
        return true;
    }
}
