package j$.time.chrono;

import j$.time.C0003b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class t extends AbstractC0004a implements Serializable {
    public static final t c = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    private t() {
    }

    public static boolean j(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final String h() {
        return "ISO";
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "iso8601";
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.t q(j$.time.temporal.a aVar) {
        return aVar.b;
    }

    @Override // j$.time.chrono.m
    public final n r(int i) {
        if (i == 0) {
            return u.BCE;
        }
        if (i == 1) {
            return u.CE;
        }
        throw new C0003b("Invalid era: " + i);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0005b u(j$.time.temporal.m mVar) {
        return j$.time.f.F(mVar);
    }

    @Override // j$.time.chrono.AbstractC0004a, j$.time.chrono.m
    public final InterfaceC0008e v(j$.time.h hVar) {
        return j$.time.h.E(hVar);
    }

    public Object writeReplace() {
        return new F((byte) 1, this);
    }
}
