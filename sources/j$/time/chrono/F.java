package j$.time.chrono;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
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
        Object objJ;
        byte b = objectInput.readByte();
        this.a = b;
        switch (b) {
            case 1:
                ConcurrentHashMap concurrentHashMap = AbstractC0004a.a;
                objJ = j$.nio.file.attribute.a.J(objectInput.readUTF());
                break;
            case 2:
                objJ = ((InterfaceC0005b) objectInput.readObject()).z((j$.time.j) objectInput.readObject());
                break;
            case 3:
                objJ = ((InterfaceC0008e) objectInput.readObject()).m((j$.time.y) objectInput.readObject()).s((j$.time.w) objectInput.readObject());
                break;
            case 4:
                j$.time.f fVar = y.d;
                int i = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                w.c.getClass();
                objJ = new y(j$.time.f.L(i, b2, b3));
                break;
            case 5:
                z zVar = z.d;
                objJ = z.q(objectInput.readByte());
                break;
            case 6:
                p pVar = (p) objectInput.readObject();
                int i2 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                pVar.getClass();
                objJ = new r(pVar, i2, b4, b5);
                break;
            case 7:
                int i3 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                B.c.getClass();
                objJ = new D(j$.time.f.L(i3 + 1911, b6, b7));
                break;
            case 8:
                int i4 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                H.c.getClass();
                objJ = new J(j$.time.f.L(i4 - 543, b8, b9));
                break;
            case 9:
                int i5 = C0011h.e;
                objJ = new C0011h(j$.nio.file.attribute.a.J(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = objJ;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((AbstractC0004a) obj).h());
                return;
            case 2:
                C0010g c0010g = (C0010g) obj;
                objectOutput.writeObject(c0010g.a);
                objectOutput.writeObject(c0010g.b);
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
                objectOutput.writeInt(j$.time.temporal.q.a(yVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(yVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(yVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((z) obj).a);
                return;
            case 6:
                r rVar = (r) obj;
                objectOutput.writeObject(rVar.a);
                objectOutput.writeInt(j$.time.temporal.q.a(rVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(rVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(rVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                D d = (D) obj;
                d.getClass();
                objectOutput.writeInt(j$.time.temporal.q.a(d, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(d, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(d, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                J j = (J) obj;
                j.getClass();
                objectOutput.writeInt(j$.time.temporal.q.a(j, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(j, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(j, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                C0011h c0011h = (C0011h) obj;
                objectOutput.writeUTF(c0011h.a.h());
                objectOutput.writeInt(c0011h.b);
                objectOutput.writeInt(c0011h.c);
                objectOutput.writeInt(c0011h.d);
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
