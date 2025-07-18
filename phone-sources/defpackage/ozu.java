package defpackage;

import j$.util.function.BiPredicate$CC;
import java.util.function.BiPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozu implements ozh {
    private static final tvn a = tvn.n("GnpSdk");
    private final oyi b;

    public ozu(oyi oyiVar) {
        this.b = oyiVar;
    }

    @Override // defpackage.ozh
    public final ozg a() {
        return ozg.DASHER_FILTER;
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
        if (uzdVar == null) {
            if (ozjVar == null) {
                return false;
            }
            this.b.c(ozjVar.b, "TriggeringConditions is null in DasherFilteringPredicate", new Object[0]);
            return false;
        }
        uzc uzcVarB = uzc.b(uzdVar.i);
        if (uzcVarB == null) {
            uzcVarB = uzc.DASHER_DEVICE_FILTER_UNKNOWN;
        }
        if (uzcVarB == uzc.BLOCK_WHEN_DASHER_ON_DEVICE) {
            xet xetVar = xet.a;
            if (xetVar.get().b()) {
                ((tvk) ((tvk) a.g()).j("com/google/android/libraries/internal/growth/growthkit/internal/predicates/impl/DasherFilteringPredicate", "test", 44, "DasherFilteringPredicate.java")).s("Promotion is shown because there is a Google account on device");
                return true;
            }
            if (xetVar.get().a()) {
                if (ozjVar == null) {
                    return false;
                }
                this.b.c(ozjVar.b, "Promotion blocked: Dasher account on device", new Object[0]);
                return false;
            }
        }
        return true;
    }
}
