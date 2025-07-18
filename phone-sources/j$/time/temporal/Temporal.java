package j$.time.temporal;

import j$.time.LocalDate;

/* loaded from: classes4.dex */
public interface Temporal extends k {
    Temporal A(long j, ChronoUnit chronoUnit);

    Temporal a(long j, n nVar);

    Temporal b(long j, TemporalUnit temporalUnit);

    long e(Temporal temporal, TemporalUnit temporalUnit);

    Temporal l(LocalDate localDate);
}
