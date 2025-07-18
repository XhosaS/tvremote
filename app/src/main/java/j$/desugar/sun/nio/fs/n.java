package j$.desugar.sun.nio.fs;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.C;
import j$.util.stream.C0105x;
import j$.util.stream.C0107z;
import j$.util.stream.Collectors;
import j$.util.stream.D;
import j$.util.stream.InterfaceC0099q;
import j$.util.stream.InterfaceC0100s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.chromium.net.UrlRequest;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Predicate, j$.time.temporal.l, BiConsumer, BinaryOperator, Supplier, Function, IntFunction, IntBinaryOperator, LongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((Collection) obj).add(obj2);
                break;
            default:
                ((List) obj).add(obj2);
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 17:
                Set set = Collectors.a;
                return g.C(((List) obj).toArray());
            default:
                Set set2 = Collectors.a;
                return obj;
        }
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i, int i2) {
        return i + i2;
    }

    public Object c(j$.time.temporal.k kVar) {
        switch (this.a) {
            case 1:
                return Instant.W(kVar);
            case 2:
                ZoneId zoneId = (ZoneId) kVar.U(j$.time.temporal.o.a);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 3:
            default:
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_DAY;
                if (kVar.d(aVar)) {
                    return LocalTime.a0(kVar.H(aVar));
                }
                return null;
            case 4:
                return (ZoneId) kVar.U(j$.time.temporal.o.a);
            case 5:
                return (j$.time.chrono.m) kVar.U(j$.time.temporal.o.b);
            case 6:
                return (TemporalUnit) kVar.U(j$.time.temporal.o.c);
            case 7:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                if (kVar.d(aVar2)) {
                    return ZoneOffset.e0(kVar.i(aVar2));
                }
                return null;
            case 8:
                ZoneId zoneId2 = (ZoneId) kVar.U(j$.time.temporal.o.a);
                return zoneId2 != null ? zoneId2 : (ZoneId) kVar.U(j$.time.temporal.o.d);
            case 9:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.EPOCH_DAY;
                if (kVar.d(aVar3)) {
                    return j$.time.h.i0(kVar.H(aVar3));
                }
                return null;
        }
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new ArrayList();
    }

    public /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // j$.time.temporal.l
    public Temporal t(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporal.a(temporal.m(aVar).d, aVar);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return !((String) obj).isEmpty();
            default:
                j$.com.android.tools.r8.b bVar = ConcurrentLinkedQueue.a;
                return true;
        }
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "ZoneId";
            case 5:
                return "Chronology";
            case 6:
                return "Precision";
            case 7:
                return "ZoneOffset";
            case 8:
                return "Zone";
            case 9:
                return "LocalDate";
            case 10:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            case 16:
                break;
            case 23:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        if (j >= 0 && j < 2147483639) {
            return new C(j);
        }
        return new D();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function mo116andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 19:
                return new Integer[i];
            case 20:
                return Integer.valueOf(i);
            default:
                return new Object[i];
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Collection collection = (Collection) obj;
                Set set = Collectors.a;
                collection.addAll((Collection) obj2);
                return collection;
            case 16:
                List list = (List) obj;
                Set set2 = Collectors.a;
                list.addAll((List) obj2);
                return list;
            case 23:
                return new C0105x((InterfaceC0099q) obj, (InterfaceC0099q) obj2);
            default:
                return new C0107z((InterfaceC0100s) obj, (InterfaceC0100s) obj2);
        }
    }
}
