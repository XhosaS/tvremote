package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;

/* renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0048b extends Temporal, j$.time.temporal.l, Comparable {
    /* renamed from: D */
    InterfaceC0048b l(j$.time.temporal.l lVar);

    long I();

    InterfaceC0051e J(LocalTime localTime);

    n L();

    InterfaceC0048b O(TemporalAmount temporalAmount);

    int R();

    /* renamed from: S */
    int compareTo(InterfaceC0048b interfaceC0048b);

    @Override // j$.time.temporal.Temporal
    InterfaceC0048b a(long j, j$.time.temporal.n nVar);

    @Override // j$.time.temporal.Temporal
    InterfaceC0048b b(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.k
    boolean d(j$.time.temporal.n nVar);

    @Override // j$.time.temporal.Temporal
    long e(Temporal temporal, TemporalUnit temporalUnit);

    boolean equals(Object obj);

    m getChronology();

    int hashCode();

    String toString();

    boolean v();

    InterfaceC0048b x(long j, TemporalUnit temporalUnit);
}
