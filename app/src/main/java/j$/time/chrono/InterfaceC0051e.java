package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;

/* renamed from: j$.time.chrono.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0051e extends Temporal, j$.time.temporal.l, Comparable {
    InterfaceC0056j F(ZoneId zoneId);

    /* renamed from: M */
    int compareTo(InterfaceC0051e interfaceC0051e);

    m getChronology();

    InterfaceC0048b toLocalDate();

    LocalTime toLocalTime();
}
