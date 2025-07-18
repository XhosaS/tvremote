package j$.time;

import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* loaded from: classes3.dex */
public final class w extends ZoneId {
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = 8386373296231747096L;
    public final String b;
    public final transient j$.time.zone.e c;

    public w(String str, j$.time.zone.e eVar) {
        this.b = str;
        this.c = eVar;
    }

    public static w b0(String str, boolean z) {
        j$.time.zone.e eVarA;
        Objects.a(str, "zoneId");
        int length = str.length();
        if (length < 2) {
            throw new b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i == 0) && ((cCharAt < '0' || cCharAt > '9' || i == 0) && ((cCharAt != '~' || i == 0) && ((cCharAt != '.' || i == 0) && ((cCharAt != '_' || i == 0) && ((cCharAt != '+' || i == 0) && (cCharAt != '-' || i == 0))))))))) {
                throw new b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
            }
        }
        try {
            eVarA = j$.time.zone.h.a(str);
        } catch (j$.time.zone.f e) {
            if (z) {
                throw e;
            }
            eVarA = null;
        }
        return new w(str, eVarA);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 7, this);
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.e W() {
        j$.time.zone.e eVar = this.c;
        return eVar != null ? eVar : j$.time.zone.h.a(this.b);
    }

    @Override // j$.time.ZoneId
    public final void a0(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.b);
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.b;
    }
}
