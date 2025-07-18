package j$.desugar.sun.nio.fs;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalUnit;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.C0126h0;
import j$.util.stream.C0128i0;
import j$.util.stream.C0133l;
import j$.util.stream.Collectors;
import j$.util.stream.D;
import j$.util.stream.E;
import j$.util.stream.N;
import j$.util.stream.O;
import j$.util.stream.U;
import j$.util.stream.V;
import j$.util.stream.Y;
import j$.util.stream.Z;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Predicate, Function, IntFunction, Supplier, BiConsumer, BinaryOperator, DoubleFunction, LongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i) {
        this.a = i;
    }

    public Object a(j$.time.temporal.k kVar) {
        switch (this.a) {
            case 1:
                ZoneId zoneId = (ZoneId) kVar.J(j$.time.temporal.o.a);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 2:
                return (ZoneId) kVar.J(j$.time.temporal.o.a);
            case 3:
                return (j$.time.chrono.m) kVar.J(j$.time.temporal.o.b);
            case 4:
                return (TemporalUnit) kVar.J(j$.time.temporal.o.c);
            case 5:
                j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                if (kVar.d(aVar)) {
                    return ZoneOffset.S(kVar.i(aVar));
                }
                return null;
            case 6:
                ZoneId zoneId2 = (ZoneId) kVar.J(j$.time.temporal.o.a);
                return zoneId2 != null ? zoneId2 : (ZoneId) kVar.J(j$.time.temporal.o.d);
            case 7:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.EPOCH_DAY;
                if (kVar.d(aVar2)) {
                    return LocalDate.V(kVar.C(aVar2));
                }
                return null;
            default:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_DAY;
                if (kVar.d(aVar3)) {
                    return j$.time.i.O(kVar.C(aVar3));
                }
                return null;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        ((List) obj).add(obj2);
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
            case 9:
                break;
            case 11:
                break;
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        return Double.valueOf(d);
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 10:
                break;
            case 16:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 13:
                return new ArrayList();
            default:
                return new C0133l();
        }
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public /* synthetic */ Predicate mo438negate() {
        switch (this.a) {
            case 0:
                break;
            case 9:
                break;
            case 11:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
            case 9:
                break;
            case 11:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return !((String) obj).isEmpty();
            case 9:
                j$.com.android.tools.r8.b bVar = ConcurrentLinkedQueue.a;
                return true;
            case 11:
                return obj == null;
            default:
                return ((Optional) obj).isPresent();
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "ZoneId";
            case 3:
                return "Chronology";
            case 4:
                return "Precision";
            case 5:
                return "ZoneOffset";
            case 6:
                return "Zone";
            case 7:
                return "LocalDate";
            case 8:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 15:
                break;
            case 26:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 12:
                return new Object[i];
            case 21:
                return new Object[i];
            case 22:
                return new Integer[i];
            default:
                return Integer.valueOf(i);
        }
    }

    @Override // java.util.function.Function
    /* renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function mo439andThen(Function function) {
        switch (this.a) {
            case 10:
                break;
            case 16:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 10:
                return obj;
            case 16:
                Set set = Collectors.a;
                return g.B(((List) obj).toArray());
            default:
                Set set2 = Collectors.a;
                return obj;
        }
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 24:
                return Long.valueOf(j);
            case 25:
                if (j >= 0 && j < 2147483639) {
                    return new U(j);
                }
                return new V();
            case 26:
            default:
                if (j >= 0 && j < 2147483639) {
                    return new C0126h0(j);
                }
                return new C0128i0();
            case 27:
                if (j >= 0 && j < 2147483639) {
                    return new Y(j);
                }
                return new Z();
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 15:
                List list = (List) obj;
                Set set = Collectors.a;
                list.addAll((List) obj2);
                return list;
            case 26:
                return new N((D) obj, (D) obj2);
            default:
                return new O((E) obj, (E) obj2);
        }
    }
}
