package j$.time;

import j$.util.Objects;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import org.chromium.net.UrlRequest;

/* loaded from: classes3.dex */
public final class r implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public r() {
    }

    public static Serializable a(byte b, ObjectInput objectInput) throws IOException {
        switch (b) {
            case 1:
                Duration duration = Duration.ZERO;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.EPOCH;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                h hVar = h.d;
                return h.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.g0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.c;
                h hVar2 = h.d;
                return LocalDateTime.Y(h.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.g0(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.c;
                h hVar3 = h.d;
                LocalDateTime localDateTimeY = LocalDateTime.Y(h.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.g0(objectInput));
                ZoneOffset zoneOffsetG0 = ZoneOffset.g0(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.a(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || zoneOffsetG0.equals(zoneId)) {
                    return new ZonedDateTime(localDateTimeY, zoneId, zoneOffsetG0);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = w.d;
                return ZoneId.X(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.g0(objectInput);
            case 9:
                int i2 = p.c;
                return new p(LocalTime.g0(objectInput), ZoneOffset.g0(objectInput));
            case 10:
                int i3 = OffsetDateTime.c;
                h hVar4 = h.d;
                return new OffsetDateTime(LocalDateTime.Y(h.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.g0(objectInput)), ZoneOffset.g0(objectInput));
            case 11:
                int i4 = t.b;
                return t.V(objectInput.readInt());
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                int i5 = v.c;
                int i6 = objectInput.readInt();
                byte b2 = objectInput.readByte();
                j$.time.temporal.a.YEAR.H(i6);
                j$.time.temporal.a.MONTH_OF_YEAR.H(b2);
                return new v(i6, b2);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int i7 = m.c;
                byte b3 = objectInput.readByte();
                byte b4 = objectInput.readByte();
                k kVarY = k.Y(b3);
                Objects.a(kVarY, "month");
                j$.time.temporal.a.DAY_OF_MONTH.H(b4);
                if (b4 <= kVarY.X()) {
                    return new m(kVarY.getValue(), b4);
                }
                throw new b("Illegal value for DayOfMonth field, value " + ((int) b4) + " is not valid for month " + kVarY.name());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                q qVar = q.d;
                return q.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        this.a = b;
        this.b = a(b, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.a);
                objectOutput.writeInt(duration.b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.a);
                objectOutput.writeInt(instant.b);
                return;
            case 3:
                h hVar = (h) obj;
                objectOutput.writeInt(hVar.a);
                objectOutput.writeByte(hVar.b);
                objectOutput.writeByte(hVar.c);
                return;
            case 4:
                ((LocalTime) obj).k0(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                h hVar2 = localDateTime.a;
                objectOutput.writeInt(hVar2.a);
                objectOutput.writeByte(hVar2.b);
                objectOutput.writeByte(hVar2.c);
                localDateTime.b.k0(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.a;
                h hVar3 = localDateTime2.a;
                objectOutput.writeInt(hVar3.a);
                objectOutput.writeByte(hVar3.b);
                objectOutput.writeByte(hVar3.c);
                localDateTime2.b.k0(objectOutput);
                zonedDateTime.b.h0(objectOutput);
                zonedDateTime.c.a0(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((w) obj).b);
                return;
            case 8:
                ((ZoneOffset) obj).h0(objectOutput);
                return;
            case 9:
                p pVar = (p) obj;
                pVar.a.k0(objectOutput);
                pVar.b.h0(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.a;
                h hVar4 = localDateTime3.a;
                objectOutput.writeInt(hVar4.a);
                objectOutput.writeByte(hVar4.b);
                objectOutput.writeByte(hVar4.c);
                localDateTime3.b.k0(objectOutput);
                offsetDateTime.b.h0(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((t) obj).a);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                v vVar = (v) obj;
                objectOutput.writeInt(vVar.a);
                objectOutput.writeByte(vVar.b);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                m mVar = (m) obj;
                objectOutput.writeByte(mVar.a);
                objectOutput.writeByte(mVar.b);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                q qVar = (q) obj;
                objectOutput.writeInt(qVar.a);
                objectOutput.writeInt(qVar.b);
                objectOutput.writeInt(qVar.c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public r(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }
}
