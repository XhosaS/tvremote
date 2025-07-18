package j$.util.function;

import java.util.function.IntPredicate;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements IntPredicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntPredicate b;
    public final /* synthetic */ IntPredicate c;

    public /* synthetic */ f(IntPredicate intPredicate, IntPredicate intPredicate2, int i) {
        this.a = i;
        this.b = intPredicate;
        this.c = intPredicate2;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        switch (this.a) {
        }
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        switch (this.a) {
        }
        return IntPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        switch (this.a) {
        }
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        switch (this.a) {
            case 0:
                return this.b.test(i) || this.c.test(i);
            default:
                return this.b.test(i) && this.c.test(i);
        }
    }
}
