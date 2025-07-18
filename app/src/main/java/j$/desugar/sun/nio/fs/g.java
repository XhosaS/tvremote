package j$.desugar.sun.nio.fs;

import j$.desugar.sun.nio.fs.g;
import j$.nio.file.AbstractC0002a;
import j$.nio.file.C0029c;
import j$.nio.file.C0030d;
import j$.nio.file.EnumC0038l;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.AbstractC0023v;
import j$.nio.file.attribute.C0019q;
import j$.nio.file.attribute.C0022u;
import j$.nio.file.attribute.InterfaceC0020s;
import j$.nio.file.attribute.J;
import j$.nio.file.attribute.X;
import j$.nio.file.attribute.r;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC0047a;
import j$.time.chrono.AbstractC0055i;
import j$.time.chrono.B;
import j$.time.chrono.H;
import j$.time.chrono.InterfaceC0048b;
import j$.time.chrono.InterfaceC0051e;
import j$.time.chrono.InterfaceC0056j;
import j$.time.chrono.t;
import j$.time.chrono.w;
import j$.time.temporal.ChronoUnit;
import j$.util.Objects;
import j$.util.Q;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.s;
import java.nio.file.CopyOption;
import java.nio.file.attribute.FileAttribute;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public abstract class g {
    public static /* synthetic */ long A(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ String B(Collection collection) {
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

    public static List C(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Set D(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ boolean E(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ InterfaceC0020s[] F(FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        InterfaceC0020s[] interfaceC0020sArr = new InterfaceC0020s[length];
        for (int i = 0; i < length; i++) {
            interfaceC0020sArr[i] = AbstractC0023v.a(fileAttributeArr[i]);
        }
        return interfaceC0020sArr;
    }

    public static /* synthetic */ CopyOption[] G(j$.nio.file.CopyOption[] copyOptionArr) {
        if (copyOptionArr == null) {
            return null;
        }
        int length = copyOptionArr.length;
        CopyOption[] copyOptionArr2 = new CopyOption[length];
        for (int i = 0; i < length; i++) {
            j$.nio.file.CopyOption copyOption = copyOptionArr[i];
            copyOptionArr2[i] = copyOption == null ? null : copyOption instanceof C0029c ? ((C0029c) copyOption).a : copyOption instanceof EnumC0038l ? AbstractC0002a.c((EnumC0038l) copyOption) : copyOption instanceof StandardCopyOption ? AbstractC0002a.d((StandardCopyOption) copyOption) : new C0030d(copyOption);
        }
        return copyOptionArr2;
    }

    public static FileAttribute[] H(InterfaceC0020s[] interfaceC0020sArr) {
        if (interfaceC0020sArr == null) {
            return null;
        }
        int length = interfaceC0020sArr.length;
        FileAttribute[] fileAttributeArr = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            InterfaceC0020s interfaceC0020s = interfaceC0020sArr[i];
            fileAttributeArr[i] = interfaceC0020s == null ? null : AbstractC0023v.d(interfaceC0020s.value()) ? new C0022u(interfaceC0020s) : interfaceC0020s instanceof C0019q ? ((C0019q) interfaceC0020s).a : new r(interfaceC0020s);
        }
        return fileAttributeArr;
    }

    public static /* synthetic */ long I(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long J(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long K(long j, long j2) {
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

    public static /* synthetic */ long L(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static String M(Object obj, Object obj2) {
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

    public static char N(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    public static j$.time.chrono.m O(String str) {
        ConcurrentHashMap concurrentHashMap = AbstractC0047a.a;
        Objects.a(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = AbstractC0047a.a;
            j$.time.chrono.m mVar = (j$.time.chrono.m) concurrentHashMap2.get(str);
            if (mVar == null) {
                mVar = (j$.time.chrono.m) AbstractC0047a.b.get(str);
            }
            if (mVar != null) {
                return mVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                Iterator it = ServiceLoader.load(j$.time.chrono.m.class).iterator();
                while (it.hasNext()) {
                    j$.time.chrono.m mVar2 = (j$.time.chrono.m) it.next();
                    if (str.equals(mVar2.getId()) || str.equals(mVar2.o())) {
                        return mVar2;
                    }
                }
                throw new j$.time.b("Unknown chronology: ".concat(str));
            }
            j$.time.chrono.p pVar = j$.time.chrono.p.l;
            pVar.getClass();
            AbstractC0047a.m(pVar, "Hijrah-umalqura");
            w wVar = w.c;
            wVar.getClass();
            AbstractC0047a.m(wVar, "Japanese");
            B b = B.c;
            b.getClass();
            AbstractC0047a.m(b, "Minguo");
            H h = H.c;
            h.getClass();
            AbstractC0047a.m(h, "ThaiBuddhist");
            try {
                for (AbstractC0047a abstractC0047a : Arrays.asList(new AbstractC0047a[0])) {
                    if (!abstractC0047a.getId().equals("ISO")) {
                        AbstractC0047a.m(abstractC0047a, abstractC0047a.getId());
                    }
                }
                t tVar = t.c;
                tVar.getClass();
                AbstractC0047a.m(tVar, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static j$.util.function.b a(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        intConsumer2.getClass();
        return new IntConsumer() { // from class: j$.util.function.b
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                intConsumer.accept(i);
                intConsumer2.accept(i);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return g.a(this, intConsumer3);
            }
        };
    }

    public static int b(InterfaceC0048b interfaceC0048b, InterfaceC0048b interfaceC0048b2) {
        int iCompare = Long.compare(interfaceC0048b.I(), interfaceC0048b2.I());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC0047a) interfaceC0048b.getChronology()).getId().compareTo(interfaceC0048b2.getChronology().getId());
    }

    public static int c(InterfaceC0051e interfaceC0051e, InterfaceC0051e interfaceC0051e2) {
        int iS = interfaceC0051e.toLocalDate().S(interfaceC0051e2.toLocalDate());
        return (iS == 0 && (iS = interfaceC0051e.toLocalTime().compareTo(interfaceC0051e2.toLocalTime())) == 0) ? ((AbstractC0047a) interfaceC0051e.getChronology()).getId().compareTo(interfaceC0051e2.getChronology().getId()) : iS;
    }

    public static int d(InterfaceC0056j interfaceC0056j, InterfaceC0056j interfaceC0056j2) {
        int iCompare = Long.compare(interfaceC0056j.toEpochSecond(), interfaceC0056j2.toEpochSecond());
        return (iCompare == 0 && (iCompare = interfaceC0056j.toLocalTime().d - interfaceC0056j2.toLocalTime().d) == 0 && (iCompare = interfaceC0056j.toLocalDateTime().M(interfaceC0056j2.toLocalDateTime())) == 0 && (iCompare = interfaceC0056j.getZone().getId().compareTo(interfaceC0056j2.getZone().getId())) == 0) ? ((AbstractC0047a) interfaceC0056j.getChronology()).getId().compareTo(interfaceC0056j2.getChronology().getId()) : iCompare;
    }

    public static void e(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            ofInt.forEachRemaining((IntConsumer) consumer);
        } else {
            if (Q.a) {
                Q.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            ofInt.forEachRemaining((IntConsumer) new j$.util.t(consumer, 0));
        }
    }

    public static int f(InterfaceC0056j interfaceC0056j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.o.a(interfaceC0056j, nVar);
        }
        int i = AbstractC0055i.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? interfaceC0056j.toLocalDateTime().i(nVar) : interfaceC0056j.getOffset().b;
        }
        throw new j$.time.temporal.p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int g(j$.time.chrono.n nVar, j$.time.temporal.n nVar2) {
        return nVar2 == j$.time.temporal.a.ERA ? nVar.getValue() : j$.time.temporal.o.a(nVar, nVar2);
    }

    public static long h(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static long i(j$.time.chrono.n nVar, j$.time.temporal.n nVar2) {
        if (nVar2 == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        if (nVar2 instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar2)));
        }
        return nVar2.t(nVar);
    }

    public static boolean j(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static boolean k(InterfaceC0048b interfaceC0048b, j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).isDateBased() : nVar != null && nVar.i(interfaceC0048b);
    }

    public static boolean l(j$.time.chrono.n nVar, j$.time.temporal.n nVar2) {
        return nVar2 instanceof j$.time.temporal.a ? nVar2 == j$.time.temporal.a.ERA : nVar2 != null && nVar2.i(nVar);
    }

    public static Object m(InterfaceC0048b interfaceC0048b, n nVar) {
        if (nVar == j$.time.temporal.o.a || nVar == j$.time.temporal.o.e || nVar == j$.time.temporal.o.d || nVar == j$.time.temporal.o.g) {
            return null;
        }
        return nVar == j$.time.temporal.o.b ? interfaceC0048b.getChronology() : nVar == j$.time.temporal.o.c ? ChronoUnit.DAYS : nVar.c(interfaceC0048b);
    }

    public static Object n(InterfaceC0051e interfaceC0051e, n nVar) {
        if (nVar == j$.time.temporal.o.a || nVar == j$.time.temporal.o.e || nVar == j$.time.temporal.o.d) {
            return null;
        }
        return nVar == j$.time.temporal.o.g ? interfaceC0051e.toLocalTime() : nVar == j$.time.temporal.o.b ? interfaceC0051e.getChronology() : nVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : nVar.c(interfaceC0051e);
    }

    public static Object o(InterfaceC0056j interfaceC0056j, n nVar) {
        return (nVar == j$.time.temporal.o.e || nVar == j$.time.temporal.o.a) ? interfaceC0056j.getZone() : nVar == j$.time.temporal.o.d ? interfaceC0056j.getOffset() : nVar == j$.time.temporal.o.g ? interfaceC0056j.toLocalTime() : nVar == j$.time.temporal.o.b ? interfaceC0056j.getChronology() : nVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : nVar.c(interfaceC0056j);
    }

    public static Object p(j$.time.chrono.n nVar, n nVar2) {
        return nVar2 == j$.time.temporal.o.c ? ChronoUnit.ERAS : j$.time.temporal.o.c(nVar, nVar2);
    }

    public static long q(InterfaceC0051e interfaceC0051e, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        return ((interfaceC0051e.toLocalDate().I() * 86400) + interfaceC0051e.toLocalTime().h0()) - zoneOffset.b;
    }

    public static long r(InterfaceC0056j interfaceC0056j) {
        return ((interfaceC0056j.toLocalDate().I() * 86400) + interfaceC0056j.toLocalTime().h0()) - interfaceC0056j.getOffset().b;
    }

    public static boolean s(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return ofInt.tryAdvance((IntConsumer) consumer);
        }
        if (Q.a) {
            Q.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return ofInt.tryAdvance((IntConsumer) new j$.util.t(consumer, 0));
    }

    public static String t(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static String u(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static void v(Iterator it, Consumer consumer) {
        if (it instanceof s) {
            ((s) it).forEachRemaining(consumer);
            return;
        }
        consumer.getClass();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static j$.time.chrono.m w(j$.time.temporal.k kVar) {
        Objects.a(kVar, "temporal");
        j$.time.chrono.m mVar = (j$.time.chrono.m) kVar.U(j$.time.temporal.o.b);
        t tVar = t.c;
        if (mVar != null) {
            return mVar;
        }
        Objects.a(tVar, "defaultObj");
        return tVar;
    }

    public static /* synthetic */ int z(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
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

    public abstract J x(String str);

    public abstract X y(String str);
}
