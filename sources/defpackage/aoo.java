package defpackage;

import android.os.PatternMatcher;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aoo implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aoo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        Instant instantBp;
        int i = this.b;
        if (i == 0) {
            return ((PatternMatcher) obj).match((String) this.a);
        }
        if (i == 1) {
            return Collection.EL.stream(this.a).anyMatch(new aoo((String) obj, 0));
        }
        if (i != 2) {
            return btc.i((buy) obj, ((bsy) this.a).e);
        }
        cyq cyqVar = (cyq) obj;
        int i2 = cyqVar.c;
        if (i2 == 1) {
            cnv cnvVar = ((cxl) cyqVar.d).b;
            if (cnvVar == null) {
                cnvVar = cnv.a;
            }
            instantBp = dnx.bp(cnvVar);
        } else {
            cnv cnvVar2 = (i2 == 3 ? (cyt) cyqVar.d : cyt.a).c;
            if (cnvVar2 == null) {
                cnvVar2 = cnv.a;
            }
            instantBp = dnx.bp(cnvVar2);
        }
        return instantBp.isAfter((Instant) this.a);
    }
}
