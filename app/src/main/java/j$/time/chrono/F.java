package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes3.dex */
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
        Object objO;
        byte b = objectInput.readByte();
        this.a = b;
        switch (b) {
            case 1:
                ConcurrentHashMap concurrentHashMap = AbstractC0047a.a;
                objO = j$.desugar.sun.nio.fs.g.O(objectInput.readUTF());
                break;
            case 2:
                objO = ((InterfaceC0048b) objectInput.readObject()).J((LocalTime) objectInput.readObject());
                break;
            case 3:
                objO = ((InterfaceC0051e) objectInput.readObject()).F((ZoneOffset) objectInput.readObject()).C((ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.h hVar = y.d;
                int i = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                w.c.getClass();
                objO = new y(j$.time.h.h0(i, b2, b3));
                break;
            case 5:
                z zVar = z.d;
                objO = z.h(objectInput.readByte());
                break;
            case 6:
                p pVar = (p) objectInput.readObject();
                int i2 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                pVar.getClass();
                objO = new r(pVar, i2, b4, b5);
                break;
            case 7:
                int i3 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                B.c.getClass();
                objO = new D(j$.time.h.h0(i3 + 1911, b6, b7));
                break;
            case 8:
                int i4 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                H.c.getClass();
                objO = new J(j$.time.h.h0(i4 - 543, b8, b9));
                break;
            case 9:
                int i5 = C0054h.e;
                objO = new C0054h(j$.desugar.sun.nio.fs.g.O(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = objO;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((AbstractC0047a) obj).getId());
                return;
            case 2:
                C0053g c0053g = (C0053g) obj;
                objectOutput.writeObject(c0053g.a);
                objectOutput.writeObject(c0053g.b);
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
                C0054h c0054h = (C0054h) obj;
                objectOutput.writeUTF(c0054h.a.getId());
                objectOutput.writeInt(c0054h.b);
                objectOutput.writeInt(c0054h.c);
                objectOutput.writeInt(c0054h.d);
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
