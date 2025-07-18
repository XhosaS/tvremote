package j$.time;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* loaded from: classes2.dex */
public final class z extends w {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 8386373296231747096L;
    public final String a;
    public final transient j$.time.zone.e b;

    public z(String str, j$.time.zone.e eVar) {
        this.a = str;
        this.b = eVar;
    }

    public static z H(String str) {
        j$.time.zone.e eVarA;
        int length = str.length();
        if (length < 2) {
            throw new C0003b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i == 0) && ((cCharAt < '0' || cCharAt > '9' || i == 0) && ((cCharAt != '~' || i == 0) && ((cCharAt != '.' || i == 0) && ((cCharAt != '_' || i == 0) && ((cCharAt != '+' || i == 0) && (cCharAt != '-' || i == 0))))))))) {
                throw new C0003b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
            }
        }
        try {
            eVarA = j$.time.zone.h.a(str);
        } catch (j$.time.zone.f unused) {
            eVarA = null;
        }
        return new z(str, eVarA);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 7, this);
    }

    @Override // j$.time.w
    public final j$.time.zone.e D() {
        j$.time.zone.e eVar = this.b;
        return eVar != null ? eVar : j$.time.zone.h.a(this.a);
    }

    @Override // j$.time.w
    public final void G(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.a);
    }

    @Override // j$.time.w
    public final String h() {
        return this.a;
    }
}
