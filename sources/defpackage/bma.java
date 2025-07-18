package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bma implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ bma(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return this.a != 0 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        return this.a != 0 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        return this.a != 0 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        if (this.a == 0) {
            return !((String) obj).contains("_CBC_");
        }
        return true;
    }
}
