package j$.time.chrono;

import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;

/* renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC0083b extends Temporal, j$.time.temporal.l, Comparable {
    long D();

    InterfaceC0086e E(j$.time.i iVar);

    /* renamed from: I */
    int compareTo(InterfaceC0083b interfaceC0083b);

    @Override // j$.time.temporal.Temporal
    InterfaceC0083b a(long j, j$.time.temporal.n nVar);

    @Override // j$.time.temporal.Temporal
    InterfaceC0083b b(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.k
    boolean d(j$.time.temporal.n nVar);

    @Override // j$.time.temporal.Temporal
    long e(Temporal temporal, TemporalUnit temporalUnit);

    m getChronology();

    int hashCode();

    String toString();

    InterfaceC0083b w(long j, TemporalUnit temporalUnit);
}
