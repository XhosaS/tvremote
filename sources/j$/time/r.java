package j$.time;

import j$.util.Objects;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
public final class r implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public r() {
    }

    public static Serializable a(byte b, ObjectInput objectInput) throws IOException {
        switch (b) {
            case 1:
                Duration duration = Duration.c;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.EPOCH;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                f fVar = f.d;
                return f.L(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return j.N(objectInput);
            case 5:
                h hVar = h.c;
                f fVar2 = f.d;
                return h.G(f.L(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.N(objectInput));
            case 6:
                h hVar2 = h.c;
                f fVar3 = f.d;
                h hVarG = h.G(f.L(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.N(objectInput));
                y yVarL = y.L(objectInput);
                w wVar = (w) a(objectInput.readByte(), objectInput);
                Objects.a(wVar, "zone");
                if (!(wVar instanceof y) || yVarL.equals(wVar)) {
                    return new B(hVarG, wVar, yVarL);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = z.c;
                String utf = objectInput.readUTF();
                Objects.a(utf, "zoneId");
                return (utf.length() <= 1 || utf.startsWith("+") || utf.startsWith("-")) ? y.H(utf) : (utf.startsWith("UTC") || utf.startsWith("GMT")) ? w.F(utf, 3) : utf.startsWith("UT") ? w.F(utf, 2) : z.H(utf);
            case 8:
                return y.L(objectInput);
            case 9:
                int i2 = p.c;
                return new p(j.N(objectInput), y.L(objectInput));
            case 10:
                int i3 = o.c;
                f fVar4 = f.d;
                return new o(h.G(f.L(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.N(objectInput)), y.L(objectInput));
            case 11:
                int i4 = t.b;
                return t.D(objectInput.readInt());
            case 12:
                int i5 = v.c;
                int i6 = objectInput.readInt();
                byte b2 = objectInput.readByte();
                j$.time.temporal.a.YEAR.t(i6);
                j$.time.temporal.a.MONTH_OF_YEAR.t(b2);
                return new v(i6, b2);
            case 13:
                int i7 = m.c;
                byte b3 = objectInput.readByte();
                byte b4 = objectInput.readByte();
                k kVarG = k.G(b3);
                Objects.a(kVarG, "month");
                j$.time.temporal.a.DAY_OF_MONTH.t(b4);
                if (b4 <= kVarG.F()) {
                    return new m(kVarG.getValue(), b4);
                }
                throw new C0003b("Illegal value for DayOfMonth field, value " + ((int) b4) + " is not valid for month " + kVarG.name());
            case 14:
                q qVar = q.d;
                int i8 = objectInput.readInt();
                int i9 = objectInput.readInt();
                int i10 = objectInput.readInt();
                return ((i8 | i9) | i10) == 0 ? q.d : new q(i8, i9, i10);
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
                f fVar = (f) obj;
                objectOutput.writeInt(fVar.a);
                objectOutput.writeByte(fVar.b);
                objectOutput.writeByte(fVar.c);
                return;
            case 4:
                ((j) obj).S(objectOutput);
                return;
            case 5:
                h hVar = (h) obj;
                f fVar2 = hVar.a;
                objectOutput.writeInt(fVar2.a);
                objectOutput.writeByte(fVar2.b);
                objectOutput.writeByte(fVar2.c);
                hVar.b.S(objectOutput);
                return;
            case 6:
                B b2 = (B) obj;
                h hVar2 = b2.a;
                f fVar3 = hVar2.a;
                objectOutput.writeInt(fVar3.a);
                objectOutput.writeByte(fVar3.b);
                objectOutput.writeByte(fVar3.c);
                hVar2.b.S(objectOutput);
                b2.b.M(objectOutput);
                b2.c.G(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((z) obj).a);
                return;
            case 8:
                ((y) obj).M(objectOutput);
                return;
            case 9:
                p pVar = (p) obj;
                pVar.a.S(objectOutput);
                pVar.b.M(objectOutput);
                return;
            case 10:
                o oVar = (o) obj;
                h hVar3 = oVar.a;
                f fVar4 = hVar3.a;
                objectOutput.writeInt(fVar4.a);
                objectOutput.writeByte(fVar4.b);
                objectOutput.writeByte(fVar4.c);
                hVar3.b.S(objectOutput);
                oVar.b.M(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((t) obj).a);
                return;
            case 12:
                v vVar = (v) obj;
                objectOutput.writeInt(vVar.a);
                objectOutput.writeByte(vVar.b);
                return;
            case 13:
                m mVar = (m) obj;
                objectOutput.writeByte(mVar.a);
                objectOutput.writeByte(mVar.b);
                return;
            case 14:
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
