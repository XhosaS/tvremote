package defpackage;

import j$.util.function.IntPredicate$CC;
import java.util.function.IntPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lvc implements IntPredicate {
    private final /* synthetic */ int a;

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return this.a != 0 ? IntPredicate$CC.$default$and(this, intPredicate) : IntPredicate$CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        return this.a != 0 ? IntPredicate$CC.$default$negate(this) : IntPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return this.a != 0 ? IntPredicate$CC.$default$or(this, intPredicate) : IntPredicate$CC.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        return this.a != 0 ? i == 2 : i == 1;
    }
}
