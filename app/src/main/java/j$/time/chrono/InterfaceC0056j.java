package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.Temporal;

/* renamed from: j$.time.chrono.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0056j extends Temporal, Comparable {
    InterfaceC0056j C(ZoneId zoneId);

    InterfaceC0056j g(ZoneId zoneId);

    m getChronology();

    ZoneOffset getOffset();

    ZoneId getZone();

    long toEpochSecond();

    InterfaceC0048b toLocalDate();

    InterfaceC0051e toLocalDateTime();

    LocalTime toLocalTime();
}
