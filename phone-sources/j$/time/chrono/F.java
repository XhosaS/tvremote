package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes4.dex */
public final class F implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public F() {
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objM;
        byte b = objectInput.readByte();
        this.a = b;
        switch (b) {
            case 1:
                ConcurrentHashMap concurrentHashMap = AbstractC0082a.a;
                objM = j$.desugar.sun.nio.fs.g.M(objectInput.readUTF());
                break;
            case 2:
                objM = ((InterfaceC0083b) objectInput.readObject()).E((j$.time.i) objectInput.readObject());
                break;
            case 3:
                objM = ((InterfaceC0086e) objectInput.readObject()).n((ZoneOffset) objectInput.readObject()).z((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = y.d;
                int i = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                w.c.getClass();
                objM = new y(LocalDate.of(i, b2, b3));
                break;
            case 5:
                z zVar = z.d;
                objM = z.h(objectInput.readByte());
                break;
            case 6:
                p pVar = (p) objectInput.readObject();
                int i2 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                pVar.getClass();
                objM = new r(pVar, i2, b4, b5);
                break;
            case 7:
                int i3 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                B.c.getClass();
                objM = new D(LocalDate.of(i3 + 1911, b6, b7));
                break;
            case 8:
                int i4 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                H.c.getClass();
                objM = new J(LocalDate.of(i4 - 543, b8, b9));
                break;
            case 9:
                int i5 = C0089h.e;
                objM = new C0089h(j$.desugar.sun.nio.fs.g.M(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = objM;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((AbstractC0082a) obj).h());
                return;
            case 2:
                C0088g c0088g = (C0088g) obj;
                objectOutput.writeObject(c0088g.a);
                objectOutput.writeObject(c0088g.b);
                return;
            case 3:
                l lVar = (l) obj;
                objectOutput.writeObject(lVar.a);
                objectOutput.writeObject(lVar.b);
                objectOutput.writeObject(lVar.c);
                return;
            case 4:
                y yVar = (y) obj;
                yVar.getClass();
                objectOutput.writeInt(j$.time.temporal.o.a(yVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(yVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(yVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((z) obj).a);
                return;
            case 6:
                r rVar = (r) obj;
                objectOutput.writeObject(rVar.a);
                objectOutput.writeInt(j$.time.temporal.o.a(rVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(rVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(rVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                D d = (D) obj;
                d.getClass();
                objectOutput.writeInt(j$.time.temporal.o.a(d, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(d, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(d, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                J j = (J) obj;
                j.getClass();
                objectOutput.writeInt(j$.time.temporal.o.a(j, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(j, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(j, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                C0089h c0089h = (C0089h) obj;
                objectOutput.writeUTF(c0089h.a.h());
                objectOutput.writeInt(c0089h.b);
                objectOutput.writeInt(c0089h.c);
                objectOutput.writeInt(c0089h.d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public F(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }
}
