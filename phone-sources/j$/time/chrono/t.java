package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class t extends AbstractC0082a implements Serializable {
    public static final t c = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    private t() {
    }

    public static boolean l(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0083b B(j$.time.temporal.k kVar) {
        return LocalDate.M(kVar);
    }

    @Override // j$.time.chrono.AbstractC0082a, j$.time.chrono.m
    public final InterfaceC0086e F(j$.time.temporal.k kVar) {
        return LocalDateTime.L(kVar);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0091j H(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        return ZonedDateTime.t(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    @Override // j$.time.chrono.m
    public final String h() {
        return "ISO";
    }

    @Override // j$.time.chrono.m
    public final String p() {
        return "iso8601";
    }

    @Override // j$.time.chrono.AbstractC0082a, j$.time.chrono.m
    public final InterfaceC0091j r(j$.time.temporal.k kVar) {
        return ZonedDateTime.K(kVar);
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.q v(j$.time.temporal.a aVar) {
        return aVar.d;
    }

    public Object writeReplace() {
        return new F((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final n x(int i) {
        if (i == 0) {
            return u.BCE;
        }
        if (i == 1) {
            return u.CE;
        }
        throw new j$.time.b("Invalid era: " + i);
    }
}
