package j$.nio.file.attribute;

import j$.time.C0003b;
import j$.time.chrono.AbstractC0004a;
import j$.time.chrono.AbstractC0012i;
import j$.time.chrono.B;
import j$.time.chrono.H;
import j$.time.chrono.InterfaceC0005b;
import j$.time.chrono.InterfaceC0008e;
import j$.time.chrono.InterfaceC0013j;
import j$.time.chrono.m;
import j$.time.chrono.n;
import j$.time.chrono.p;
import j$.time.chrono.t;
import j$.time.chrono.w;
import j$.time.format.b;
import j$.time.temporal.l;
import j$.time.temporal.q;
import j$.time.temporal.s;
import j$.time.y;
import j$.util.Map;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.C0026l;
import j$.util.stream.E;
import j$.util.stream.F;
import j$.util.stream.InterfaceC0024j;
import j$.util.stream.InterfaceC0025k;
import j$.util.stream.K;
import j$.util.stream.N;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a implements N {
    public static m A(j$.time.temporal.m mVar) {
        Objects.a(mVar, "temporal");
        m mVar2 = (m) mVar.l(q.b);
        t tVar = t.c;
        if (mVar2 != null) {
            return mVar2;
        }
        Objects.a(tVar, "defaultObj");
        return tVar;
    }

    public static Object B(Map map, Object obj, Object obj2) {
        if (map instanceof j$.util.Map) {
            return ((j$.util.Map) map).getOrDefault(obj, obj2);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$getOrDefault(map, obj, obj2);
        }
        Object obj3 = ((ConcurrentMap) map).get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public static /* synthetic */ long C(long j, int i) {
        long j2 = i;
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j2 != Long.MIN_VALUE) | (j >= 0)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long D(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ long E(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long F(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long G(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static String I(Object obj, Object obj2) {
        String string;
        String string2;
        String str = "null";
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static m J(String str) {
        ConcurrentHashMap concurrentHashMap = AbstractC0004a.a;
        Objects.a(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = AbstractC0004a.a;
            m mVar = (m) concurrentHashMap2.get(str);
            if (mVar == null) {
                mVar = (m) AbstractC0004a.b.get(str);
            }
            if (mVar != null) {
                return mVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                Iterator it = ServiceLoader.load(m.class).iterator();
                while (it.hasNext()) {
                    m mVar2 = (m) it.next();
                    if (str.equals(mVar2.h()) || str.equals(mVar2.n())) {
                        return mVar2;
                    }
                }
                throw new C0003b("Unknown chronology: ".concat(str));
            }
            p pVar = p.l;
            pVar.getClass();
            AbstractC0004a.i(pVar, "Hijrah-umalqura");
            w wVar = w.c;
            wVar.getClass();
            AbstractC0004a.i(wVar, "Japanese");
            B b = B.c;
            b.getClass();
            AbstractC0004a.i(b, "Minguo");
            H h = H.c;
            h.getClass();
            AbstractC0004a.i(h, "ThaiBuddhist");
            try {
                for (AbstractC0004a abstractC0004a : Arrays.asList(new AbstractC0004a[0])) {
                    if (!abstractC0004a.h().equals("ISO")) {
                        AbstractC0004a.i(abstractC0004a, abstractC0004a.h());
                    }
                }
                t tVar = t.c;
                tVar.getClass();
                AbstractC0004a.i(tVar, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static /* synthetic */ Object K(java.util.Map map, Object obj, Object obj2) {
        return map instanceof j$.util.Map ? ((j$.util.Map) map).putIfAbsent(obj, obj2) : Map.CC.$default$putIfAbsent(map, obj, obj2);
    }

    public static E L(Spliterator spliterator, boolean z) {
        spliterator.getClass();
        int i = K.f;
        int iCharacteristics = spliterator.characteristics();
        return new E(spliterator, ((iCharacteristics & 4) == 0 || spliterator.getComparator() == null) ? i & iCharacteristics : i & iCharacteristics & (-5), z);
    }

    public static l c(InterfaceC0005b interfaceC0005b, l lVar) {
        return lVar.c(interfaceC0005b.y(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static int e(InterfaceC0005b interfaceC0005b, InterfaceC0005b interfaceC0005b2) {
        int iCompare = Long.compare(interfaceC0005b.y(), interfaceC0005b2.y());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC0004a) interfaceC0005b.a()).h().compareTo(interfaceC0005b2.a().h());
    }

    public static int g(InterfaceC0008e interfaceC0008e, InterfaceC0008e interfaceC0008e2) {
        int iB = interfaceC0008e.f().compareTo(interfaceC0008e2.f());
        return (iB == 0 && (iB = interfaceC0008e.b().compareTo(interfaceC0008e2.b())) == 0) ? ((AbstractC0004a) interfaceC0008e.a()).h().compareTo(interfaceC0008e2.a().h()) : iB;
    }

    public static int h(InterfaceC0013j interfaceC0013j, InterfaceC0013j interfaceC0013j2) {
        int iCompare = Long.compare(interfaceC0013j.C(), interfaceC0013j2.C());
        return (iCompare == 0 && (iCompare = interfaceC0013j.b().d - interfaceC0013j2.b().d) == 0 && (iCompare = interfaceC0013j.p().compareTo(interfaceC0013j2.p())) == 0 && (iCompare = interfaceC0013j.w().h().compareTo(interfaceC0013j2.w().h())) == 0) ? ((AbstractC0004a) interfaceC0013j.a()).h().compareTo(interfaceC0013j2.a().h()) : iCompare;
    }

    public static void i(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        biConsumer.getClass();
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static int j(InterfaceC0013j interfaceC0013j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return q.a(interfaceC0013j, pVar);
        }
        int i = AbstractC0012i.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? interfaceC0013j.p().i(pVar) : interfaceC0013j.g().a;
        }
        throw new s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int k(n nVar, j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.ERA ? nVar.getValue() : q.a(nVar, pVar);
    }

    public static long l(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static long m(n nVar, j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new s("Unsupported field: ".concat(String.valueOf(pVar)));
        }
        return pVar.l(nVar);
    }

    public static boolean n(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static boolean o(InterfaceC0005b interfaceC0005b, j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).isDateBased() : pVar != null && pVar.i(interfaceC0005b);
    }

    public static boolean p(n nVar, j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.ERA : pVar != null && pVar.i(nVar);
    }

    public static Object q(InterfaceC0005b interfaceC0005b, b bVar) {
        if (bVar == q.a || bVar == q.e || bVar == q.d || bVar == q.g) {
            return null;
        }
        return bVar == q.b ? interfaceC0005b.a() : bVar == q.c ? j$.time.temporal.b.DAYS : bVar.a(interfaceC0005b);
    }

    public static Object r(InterfaceC0008e interfaceC0008e, b bVar) {
        if (bVar == q.a || bVar == q.e || bVar == q.d) {
            return null;
        }
        return bVar == q.g ? interfaceC0008e.b() : bVar == q.b ? interfaceC0008e.a() : bVar == q.c ? j$.time.temporal.b.NANOS : bVar.a(interfaceC0008e);
    }

    public static Object s(InterfaceC0013j interfaceC0013j, b bVar) {
        return (bVar == q.e || bVar == q.a) ? interfaceC0013j.w() : bVar == q.d ? interfaceC0013j.g() : bVar == q.g ? interfaceC0013j.b() : bVar == q.b ? interfaceC0013j.a() : bVar == q.c ? j$.time.temporal.b.NANOS : bVar.a(interfaceC0013j);
    }

    public static Object t(n nVar, b bVar) {
        return bVar == q.c ? j$.time.temporal.b.ERAS : q.c(nVar, bVar);
    }

    public static long u(InterfaceC0008e interfaceC0008e, y yVar) {
        Objects.a(yVar, "offset");
        return ((interfaceC0008e.f().y() * 86400) + interfaceC0008e.b().P()) - yVar.a;
    }

    public static long v(InterfaceC0013j interfaceC0013j) {
        return ((interfaceC0013j.f().y() * 86400) + interfaceC0013j.b().P()) - interfaceC0013j.g().a;
    }

    public static InterfaceC0024j w(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new j$.util.stream.s() : new j$.util.stream.p(j, intFunction);
    }

    public static InterfaceC0025k x(InterfaceC0025k interfaceC0025k, IntFunction intFunction) {
        if (interfaceC0025k.g() <= 0) {
            return interfaceC0025k;
        }
        long jCount = interfaceC0025k.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new j$.util.stream.t(interfaceC0025k, objArr).invoke();
        return new C0026l(objArr);
    }

    public static /* synthetic */ void y(java.util.Map map, BiConsumer biConsumer) {
        if (map instanceof j$.util.Map) {
            ((j$.util.Map) map).forEach(biConsumer);
        } else if (map instanceof ConcurrentMap) {
            i((ConcurrentMap) map, biConsumer);
        } else {
            Map.CC.$default$forEach(map, biConsumer);
        }
    }

    public static void z(Iterator it, Consumer consumer) {
        if (it instanceof j$.util.q) {
            ((j$.util.q) it).forEachRemaining(consumer);
            return;
        }
        consumer.getClass();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public abstract j$.util.stream.y H();

    @Override // j$.util.stream.N
    public Object a(F f, Spliterator spliterator) {
        j$.util.stream.y yVarH = H();
        f.g(yVarH, spliterator);
        return yVarH.get();
    }

    public int characteristics() {
        return 16448;
    }

    @Override // j$.util.stream.N
    public Object d(F f, Spliterator spliterator) {
        return ((j$.util.stream.y) new j$.util.stream.B(this, f, spliterator).invoke()).get();
    }

    public long estimateSize() {
        return 0L;
    }

    public Spliterator trySplit() {
        return null;
    }
}
