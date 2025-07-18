package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    public byte a;
    public Serializable b;

    public a() {
    }

    public static long a(ObjectInput objectInput) {
        if ((objectInput.readByte() & 255) == 255) {
            return objectInput.readLong();
        }
        return ((((r0 << 16) + ((objectInput.readByte() & 255) << 8)) + (objectInput.readByte() & 255)) * 900) - 4575744000L;
    }

    public static ZoneOffset b(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        return b == Byte.MAX_VALUE ? ZoneOffset.e0(objectInput.readInt()) : ZoneOffset.e0(b * 900);
    }

    public static void c(long j, ObjectOutput objectOutput) throws IOException {
        if (j < -4575744000L || j >= 10413792000L || j % 900 != 0) {
            objectOutput.writeByte(255);
            objectOutput.writeLong(j);
        } else {
            int i = (int) ((j + 4575744000L) / 900);
            objectOutput.writeByte((i >>> 16) & 255);
            objectOutput.writeByte((i >>> 8) & 255);
            objectOutput.writeByte(i & 255);
        }
    }

    public static void d(ZoneOffset zoneOffset, ObjectOutput objectOutput) throws IOException {
        int i = zoneOffset.b;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        objectOutput.writeByte(i2);
        if (i2 == 127) {
            objectOutput.writeInt(i);
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Serializable eVar;
        byte b = objectInput.readByte();
        this.a = b;
        if (b == 1) {
            int i = objectInput.readInt();
            long[] jArr = e.i;
            long[] jArr2 = i == 0 ? jArr : new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr2[i2] = a(objectInput);
            }
            int i3 = i + 1;
            ZoneOffset[] zoneOffsetArr = new ZoneOffset[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                zoneOffsetArr[i4] = b(objectInput);
            }
            int i5 = objectInput.readInt();
            if (i5 != 0) {
                jArr = new long[i5];
            }
            long[] jArr3 = jArr;
            for (int i6 = 0; i6 < i5; i6++) {
                jArr3[i6] = a(objectInput);
            }
            int i7 = i5 + 1;
            ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                zoneOffsetArr2[i8] = b(objectInput);
            }
            int i9 = objectInput.readByte();
            d[] dVarArr = i9 == 0 ? e.j : new d[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                dVarArr[i10] = d.a(objectInput);
            }
            eVar = new e(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, dVarArr);
        } else if (b == 2) {
            long jA = a(objectInput);
            ZoneOffset zoneOffsetB = b(objectInput);
            ZoneOffset zoneOffsetB2 = b(objectInput);
            if (zoneOffsetB.equals(zoneOffsetB2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            eVar = new b(jA, zoneOffsetB, zoneOffsetB2);
        } else if (b == 3) {
            eVar = d.a(objectInput);
        } else {
            if (b != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            eVar = new e(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.b = eVar;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Serializable serializable = this.b;
        objectOutput.writeByte(b);
        if (b != 1) {
            if (b == 2) {
                b bVar = (b) serializable;
                c(bVar.a, objectOutput);
                d(bVar.c, objectOutput);
                d(bVar.d, objectOutput);
                return;
            }
            if (b == 3) {
                ((d) serializable).writeExternal(objectOutput);
                return;
            } else {
                if (b != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((e) serializable).g.getID());
                return;
            }
        }
        e eVar = (e) serializable;
        d[] dVarArr = eVar.f;
        long[] jArr = eVar.c;
        long[] jArr2 = eVar.a;
        objectOutput.writeInt(jArr2.length);
        for (long j : jArr2) {
            c(j, objectOutput);
        }
        for (ZoneOffset zoneOffset : eVar.b) {
            d(zoneOffset, objectOutput);
        }
        objectOutput.writeInt(jArr.length);
        for (long j2 : jArr) {
            c(j2, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : eVar.e) {
            d(zoneOffset2, objectOutput);
        }
        objectOutput.writeByte(dVarArr.length);
        for (d dVar : dVarArr) {
            dVar.writeExternal(objectOutput);
        }
    }

    public a(byte b, Serializable serializable) {
        this.a = b;
        this.b = serializable;
    }
}
