package j$.time;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* loaded from: classes4.dex */
public final class w extends ZoneId {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 8386373296231747096L;
    public final String a;
    public final transient j$.time.zone.e b;

    public w(String str, j$.time.zone.e eVar) {
        this.a = str;
        this.b = eVar;
    }

    public static w P(String str) {
        j$.time.zone.e eVarA;
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
        } catch (j$.time.zone.f unused) {
            eVarA = null;
        }
        return new w(str, eVarA);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 7, this);
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.e L() {
        j$.time.zone.e eVar = this.b;
        return eVar != null ? eVar : j$.time.zone.h.a(this.a);
    }

    @Override // j$.time.ZoneId
    public final void O(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.a);
    }

    @Override // j$.time.ZoneId
    public final String h() {
        return this.a;
    }
}
