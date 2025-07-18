package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface m extends Comparable {
    int B(n nVar, int i);

    InterfaceC0048b G(j$.time.temporal.k kVar);

    InterfaceC0051e K(j$.time.temporal.k kVar);

    InterfaceC0048b N(int i, int i2, int i3);

    InterfaceC0048b P(Map map, j$.time.format.E e);

    InterfaceC0056j Q(Instant instant, ZoneId zoneId);

    boolean T(long j);

    boolean equals(Object obj);

    String getId();

    InterfaceC0048b h(long j);

    int hashCode();

    String o();

    InterfaceC0056j q(j$.time.temporal.k kVar);

    InterfaceC0048b r(int i, int i2);

    String toString();

    j$.time.temporal.q w(j$.time.temporal.a aVar);

    List y();

    n z(int i);
}
