package defpackage;

import j$.util.function.BiPredicate$CC;
import java.util.function.BiPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozz implements ozh {
    private final oyi a;
    private final /* synthetic */ int b;

    public ozz(oyi oyiVar, int i) {
        this.b = i;
        this.a = oyiVar;
    }

    @Override // defpackage.ozh
    public final ozg a() {
        return this.b != 0 ? ozg.DISPLAY_WITHOUT_NEW_SYNC : ozg.MINOR_FILTER;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return this.b != 0 ? BiPredicate$CC.$default$and(this, biPredicate) : BiPredicate$CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        return this.b != 0 ? BiPredicate$CC.$default$negate(this) : BiPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return this.b != 0 ? BiPredicate$CC.$default$or(this, biPredicate) : BiPredicate$CC.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final /* synthetic */ boolean test(Object obj, Object obj2) {
        if (this.b == 0) {
            ozj ozjVar = (ozj) obj2;
            if (!xet.a.get().c()) {
                return true;
            }
            if (ozjVar != null) {
                this.a.c(ozjVar.b, "Promotion blocked: Minor account on device", new Object[0]);
            }
            return false;
        }
        uzd uzdVar = (uzd) obj;
        ozj ozjVar2 = (ozj) obj2;
        if (ozjVar2 != null && !ozjVar2.c) {
            return true;
        }
        boolean z = (uzdVar.b & 32) != 0 ? uzdVar.g : false;
        if (z || ozjVar2 == null) {
            return z;
        }
        this.a.c(ozjVar2.b, "Promotion needs sync to display.", new Object[0]);
        return false;
    }
}
