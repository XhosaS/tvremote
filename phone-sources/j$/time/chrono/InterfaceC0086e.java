package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.time.temporal.Temporal;

/* renamed from: j$.time.chrono.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC0086e extends Temporal, j$.time.temporal.l, Comparable {
    /* renamed from: G */
    int compareTo(InterfaceC0086e interfaceC0086e);

    m getChronology();

    InterfaceC0091j n(ZoneOffset zoneOffset);

    InterfaceC0083b toLocalDate();

    j$.time.i toLocalTime();
}
