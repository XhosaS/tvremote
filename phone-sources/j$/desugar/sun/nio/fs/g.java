package j$.desugar.sun.nio.fs;

import j$.nio.file.AbstractC0040a;
import j$.nio.file.C0065c;
import j$.nio.file.C0066d;
import j$.nio.file.LinkOption;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.AbstractC0060u;
import j$.nio.file.attribute.C0056p;
import j$.nio.file.attribute.C0057q;
import j$.nio.file.attribute.C0059t;
import j$.nio.file.attribute.V;
import j$.nio.file.attribute.r;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC0082a;
import j$.time.chrono.AbstractC0090i;
import j$.time.chrono.B;
import j$.time.chrono.H;
import j$.time.chrono.InterfaceC0083b;
import j$.time.chrono.InterfaceC0086e;
import j$.time.chrono.InterfaceC0091j;
import j$.time.chrono.t;
import j$.time.chrono.w;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.C0165w;
import j$.util.C0166x;
import j$.util.C0167y;
import j$.util.InterfaceC0164v;
import j$.util.List;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Z;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.file.CopyOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes4.dex */
public abstract class g {
    public static /* synthetic */ String A(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "/");
            }
        }
        return sb.toString();
    }

    public static List B(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Set C(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ r[] D(FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        r[] rVarArr = new r[length];
        for (int i = 0; i < length; i++) {
            rVarArr[i] = AbstractC0060u.a(fileAttributeArr[i]);
        }
        return rVarArr;
    }

    public static /* synthetic */ CopyOption[] E(j$.nio.file.CopyOption[] copyOptionArr) {
        if (copyOptionArr == null) {
            return null;
        }
        int length = copyOptionArr.length;
        CopyOption[] copyOptionArr2 = new CopyOption[length];
        for (int i = 0; i < length; i++) {
            j$.nio.file.CopyOption copyOption = copyOptionArr[i];
            copyOptionArr2[i] = copyOption == null ? null : copyOption instanceof C0065c ? ((C0065c) copyOption).a : copyOption instanceof LinkOption ? AbstractC0040a.c((LinkOption) copyOption) : copyOption instanceof StandardCopyOption ? AbstractC0040a.d((StandardCopyOption) copyOption) : new C0066d(copyOption);
        }
        return copyOptionArr2;
    }

    public static FileAttribute[] F(r[] rVarArr) {
        if (rVarArr == null) {
            return null;
        }
        int length = rVarArr.length;
        FileAttribute[] fileAttributeArr = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            r rVar = rVarArr[i];
            fileAttributeArr[i] = rVar == null ? null : AbstractC0060u.d(rVar.value()) ? new C0059t(rVar) : rVar instanceof C0056p ? ((C0056p) rVar).a : new C0057q(rVar);
        }
        return fileAttributeArr;
    }

    public static /* synthetic */ long G(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long H(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long I(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j >= 0) | (j2 != Long.MIN_VALUE)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long J(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static String K(Object obj, Object obj2) {
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

    public static char L(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    public static j$.time.chrono.m M(String str) {
        ConcurrentHashMap concurrentHashMap = AbstractC0082a.a;
        Objects.a(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = AbstractC0082a.a;
            j$.time.chrono.m mVar = (j$.time.chrono.m) concurrentHashMap2.get(str);
            if (mVar == null) {
                mVar = (j$.time.chrono.m) AbstractC0082a.b.get(str);
            }
            if (mVar != null) {
                return mVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                Iterator it = ServiceLoader.load(j$.time.chrono.m.class).iterator();
                while (it.hasNext()) {
                    j$.time.chrono.m mVar2 = (j$.time.chrono.m) it.next();
                    if (str.equals(mVar2.h()) || str.equals(mVar2.p())) {
                        return mVar2;
                    }
                }
                throw new j$.time.b("Unknown chronology: ".concat(str));
            }
            j$.time.chrono.p pVar = j$.time.chrono.p.l;
            pVar.getClass();
            AbstractC0082a.i(pVar, "Hijrah-umalqura");
            w wVar = w.c;
            wVar.getClass();
            AbstractC0082a.i(wVar, "Japanese");
            B b = B.c;
            b.getClass();
            AbstractC0082a.i(b, "Minguo");
            H h = H.c;
            h.getClass();
            AbstractC0082a.i(h, "ThaiBuddhist");
            try {
                for (AbstractC0082a abstractC0082a : Arrays.asList(new AbstractC0082a[0])) {
                    if (!abstractC0082a.h().equals("ISO")) {
                        AbstractC0082a.i(abstractC0082a, abstractC0082a.h());
                    }
                }
                t tVar = t.c;
                tVar.getClass();
                AbstractC0082a.i(tVar, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static /* synthetic */ void N(List list, Comparator comparator) {
        if (list instanceof j$.util.List) {
            ((j$.util.List) list).sort(comparator);
        } else {
            List.CC.$default$sort(list, comparator);
        }
    }

    public static Temporal a(InterfaceC0083b interfaceC0083b, Temporal temporal) {
        return temporal.a(interfaceC0083b.D(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static int b(InterfaceC0083b interfaceC0083b, InterfaceC0083b interfaceC0083b2) {
        int iCompare = Long.compare(interfaceC0083b.D(), interfaceC0083b2.D());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC0082a) interfaceC0083b.getChronology()).h().compareTo(interfaceC0083b2.getChronology().h());
    }

    public static int c(InterfaceC0086e interfaceC0086e, InterfaceC0086e interfaceC0086e2) {
        int I = interfaceC0086e.toLocalDate().compareTo(interfaceC0086e2.toLocalDate());
        return (I == 0 && (I = interfaceC0086e.toLocalTime().compareTo(interfaceC0086e2.toLocalTime())) == 0) ? ((AbstractC0082a) interfaceC0086e.getChronology()).h().compareTo(interfaceC0086e2.getChronology().h()) : I;
    }

    public static int d(InterfaceC0091j interfaceC0091j, InterfaceC0091j interfaceC0091j2) {
        int iCompare = Long.compare(interfaceC0091j.toEpochSecond(), interfaceC0091j2.toEpochSecond());
        return (iCompare == 0 && (iCompare = interfaceC0091j.toLocalTime().d - interfaceC0091j2.toLocalTime().d) == 0 && (iCompare = interfaceC0091j.toLocalDateTime().compareTo(interfaceC0091j2.toLocalDateTime())) == 0 && (iCompare = interfaceC0091j.getZone().h().compareTo(interfaceC0091j2.getZone().h())) == 0) ? ((AbstractC0082a) interfaceC0091j.getChronology()).h().compareTo(interfaceC0091j2.getChronology().h()) : iCompare;
    }

    public static void e(Spliterator.OfDouble ofDouble, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            ofDouble.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (Z.a) {
                Z.a(ofDouble.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            ofDouble.forEachRemaining((DoubleConsumer) new C0165w(consumer, 0));
        }
    }

    public static void f(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            ofInt.forEachRemaining((IntConsumer) consumer);
        } else {
            if (Z.a) {
                Z.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            ofInt.forEachRemaining((IntConsumer) new C0166x(consumer, 0));
        }
    }

    public static void g(Spliterator.OfLong ofLong, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            ofLong.forEachRemaining((LongConsumer) consumer);
        } else {
            if (Z.a) {
                Z.a(ofLong.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            ofLong.forEachRemaining((LongConsumer) new C0167y(consumer, 0));
        }
    }

    public static int h(InterfaceC0091j interfaceC0091j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.o.a(interfaceC0091j, nVar);
        }
        int i = AbstractC0090i.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? interfaceC0091j.toLocalDateTime().i(nVar) : interfaceC0091j.getOffset().a;
        }
        throw new j$.time.temporal.p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int i(j$.time.chrono.n nVar, j$.time.temporal.n nVar2) {
        return nVar2 == j$.time.temporal.a.ERA ? nVar.getValue() : j$.time.temporal.o.a(nVar, nVar2);
    }

    public static long j(j$.time.chrono.n nVar, j$.time.temporal.n nVar2) {
        if (nVar2 == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        if (nVar2 instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar2)));
        }
        return nVar2.m(nVar);
    }

    public static boolean k(InterfaceC0083b interfaceC0083b, j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).isDateBased() : nVar != null && nVar.i(interfaceC0083b);
    }

    public static boolean l(j$.time.chrono.n nVar, j$.time.temporal.n nVar2) {
        return nVar2 instanceof j$.time.temporal.a ? nVar2 == j$.time.temporal.a.ERA : nVar2 != null && nVar2.i(nVar);
    }

    public static Object m(InterfaceC0083b interfaceC0083b, n nVar) {
        if (nVar == j$.time.temporal.o.a || nVar == j$.time.temporal.o.e || nVar == j$.time.temporal.o.d || nVar == j$.time.temporal.o.g) {
            return null;
        }
        return nVar == j$.time.temporal.o.b ? interfaceC0083b.getChronology() : nVar == j$.time.temporal.o.c ? ChronoUnit.DAYS : nVar.a(interfaceC0083b);
    }

    public static Object n(InterfaceC0086e interfaceC0086e, n nVar) {
        if (nVar == j$.time.temporal.o.a || nVar == j$.time.temporal.o.e || nVar == j$.time.temporal.o.d) {
            return null;
        }
        return nVar == j$.time.temporal.o.g ? interfaceC0086e.toLocalTime() : nVar == j$.time.temporal.o.b ? interfaceC0086e.getChronology() : nVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : nVar.a(interfaceC0086e);
    }

    public static Object o(InterfaceC0091j interfaceC0091j, n nVar) {
        return (nVar == j$.time.temporal.o.e || nVar == j$.time.temporal.o.a) ? interfaceC0091j.getZone() : nVar == j$.time.temporal.o.d ? interfaceC0091j.getOffset() : nVar == j$.time.temporal.o.g ? interfaceC0091j.toLocalTime() : nVar == j$.time.temporal.o.b ? interfaceC0091j.getChronology() : nVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : nVar.a(interfaceC0091j);
    }

    public static Object p(j$.time.chrono.n nVar, n nVar2) {
        return nVar2 == j$.time.temporal.o.c ? ChronoUnit.ERAS : j$.time.temporal.o.c(nVar, nVar2);
    }

    public static long q(InterfaceC0086e interfaceC0086e, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        return ((interfaceC0086e.toLocalDate().D() * 86400) + interfaceC0086e.toLocalTime().W()) - zoneOffset.a;
    }

    public static long r(InterfaceC0091j interfaceC0091j) {
        return ((interfaceC0091j.toLocalDate().D() * 86400) + interfaceC0091j.toLocalTime().W()) - interfaceC0091j.getOffset().a;
    }

    public static boolean s(Spliterator.OfDouble ofDouble, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return ofDouble.tryAdvance((DoubleConsumer) consumer);
        }
        if (Z.a) {
            Z.a(ofDouble.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return ofDouble.tryAdvance((DoubleConsumer) new C0165w(consumer, 0));
    }

    public static boolean t(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return ofInt.tryAdvance((IntConsumer) consumer);
        }
        if (Z.a) {
            Z.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return ofInt.tryAdvance((IntConsumer) new C0166x(consumer, 0));
    }

    public static boolean u(Spliterator.OfLong ofLong, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return ofLong.tryAdvance((LongConsumer) consumer);
        }
        if (Z.a) {
            Z.a(ofLong.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return ofLong.tryAdvance((LongConsumer) new C0167y(consumer, 0));
    }

    public static void v(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC0164v) {
            ((InterfaceC0164v) it).forEachRemaining(consumer);
            return;
        }
        consumer.getClass();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static j$.time.chrono.m w(j$.time.temporal.k kVar) {
        Objects.a(kVar, "temporal");
        j$.time.chrono.m mVar = (j$.time.chrono.m) kVar.J(j$.time.temporal.o.b);
        t tVar = t.c;
        if (mVar != null) {
            return mVar;
        }
        Objects.a(tVar, "defaultObj");
        return tVar;
    }

    public static /* synthetic */ long z(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }

    public abstract j$.nio.file.attribute.H x(String str);

    public abstract V y(String str);
}
