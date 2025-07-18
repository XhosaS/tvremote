package j$.time.format;

import j$.time.y;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.function.BiFunction$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.InterfaceC0025k;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Predicate, BinaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    public Object a(j$.time.temporal.m mVar) {
        switch (this.a) {
            case 0:
                j$.time.w wVar = (j$.time.w) mVar.l(j$.time.temporal.q.a);
                if (wVar == null || (wVar instanceof y)) {
                    return null;
                }
                return wVar;
            case 1:
                return (j$.time.w) mVar.l(j$.time.temporal.q.a);
            case 2:
                return (j$.time.chrono.m) mVar.l(j$.time.temporal.q.b);
            case 3:
                return (j$.time.temporal.r) mVar.l(j$.time.temporal.q.c);
            case 4:
                j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                if (mVar.e(aVar)) {
                    return y.J(mVar.i(aVar));
                }
                return null;
            case 5:
                j$.time.w wVar2 = (j$.time.w) mVar.l(j$.time.temporal.q.a);
                return wVar2 != null ? wVar2 : (j$.time.w) mVar.l(j$.time.temporal.q.d);
            case 6:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.EPOCH_DAY;
                if (mVar.e(aVar2)) {
                    return j$.time.f.M(mVar.x(aVar2));
                }
                return null;
            default:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_DAY;
                if (mVar.e(aVar3)) {
                    return j$.time.j.H(mVar.x(aVar3));
                }
                return null;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new j$.util.stream.o((InterfaceC0025k) obj, (InterfaceC0025k) obj2);
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 8:
                j$.com.android.tools.r8.b bVar = ConcurrentLinkedQueue.a;
                break;
            default:
                if (obj == null) {
                }
                break;
        }
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
