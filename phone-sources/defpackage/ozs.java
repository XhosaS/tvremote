package defpackage;

import j$.util.function.BiPredicate$CC;
import java.util.ArrayList;
import java.util.Set;
import java.util.function.BiPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozs implements ozk {
    private static final tvn a = tvn.n("GnpSdk");
    private final Set b;
    private final oxp c;
    private final oyi d;

    public ozs(Set set, oxp oxpVar, oyi oyiVar) {
        this.b = set;
        this.c = oxpVar;
        this.d = oyiVar;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        return BiPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final /* synthetic */ boolean test(Object obj, Object obj2) {
        uzd uzdVar = (uzd) obj;
        ozj ozjVar = (ozj) obj2;
        ArrayList arrayList = new ArrayList();
        oyd oydVar = ozjVar.b;
        if (uzdVar == null) {
            ((tvk) ((tvk) a.f()).j("com/google/android/libraries/internal/growth/growthkit/internal/predicates/impl/CompositeTriggeringConditionsPredicate", "test", 46, "CompositeTriggeringConditionsPredicate.java")).s("Error evaluating Triggering Conditions.");
        } else {
            boolean z = false;
            for (ozh ozhVar : this.b) {
                if (!ozhVar.test(uzdVar, ozjVar)) {
                    arrayList.add(ozhVar.a());
                    this.d.c(oydVar, "Failed Triggering Condition for [%s]", ozhVar.a().name());
                    z = true;
                }
            }
            this.c.c(oydVar, arrayList);
            if (!z) {
                return true;
            }
        }
        return false;
    }
}
