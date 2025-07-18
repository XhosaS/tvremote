package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.Temporal;

/* renamed from: j$.time.chrono.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC0091j extends Temporal, Comparable {
    InterfaceC0091j g(ZoneId zoneId);

    m getChronology();

    ZoneOffset getOffset();

    ZoneId getZone();

    long toEpochSecond();

    InterfaceC0083b toLocalDate();

    InterfaceC0086e toLocalDateTime();

    j$.time.i toLocalTime();

    InterfaceC0091j z(ZoneId zoneId);
}
