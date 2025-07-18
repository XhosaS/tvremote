package j$.time.zone;

import j$.time.ZoneOffset;
import j$.time.i;
import j$.time.j;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class d implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    public final j a;
    public final byte b;
    public final j$.time.c c;
    public final i d;
    public final boolean e;
    public final c f;
    public final ZoneOffset g;
    public final ZoneOffset h;
    public final ZoneOffset i;

    public d(j jVar, int i, j$.time.c cVar, i iVar, boolean z, c cVar2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = jVar;
        this.b = (byte) i;
        this.c = cVar;
        this.d = iVar;
        this.e = z;
        this.f = cVar2;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    public static d a(ObjectInput objectInput) {
        c cVar;
        i iVarL;
        int i = objectInput.readInt();
        j jVarN = j.N(i >>> 28);
        int i2 = ((264241152 & i) >>> 22) - 32;
        int i3 = (3670016 & i) >>> 19;
        j$.time.c cVarK = i3 == 0 ? null : j$.time.c.K(i3);
        int i4 = (507904 & i) >>> 14;
        c cVar2 = c.values()[(i & 12288) >>> 12];
        int i5 = (i & 4080) >>> 4;
        int i6 = (i & 12) >>> 2;
        int i7 = i & 3;
        if (i4 == 31) {
            long j = objectInput.readInt();
            i iVar = i.e;
            j$.time.temporal.a.SECOND_OF_DAY.A(j);
            int i8 = (int) (j / 3600);
            cVar = cVar2;
            long j2 = j - (i8 * 3600);
            iVarL = i.L(i8, (int) (j2 / 60), (int) (j2 - (r8 * 60)), 0);
        } else {
            cVar = cVar2;
            int i9 = i4 % 24;
            i iVar2 = i.e;
            j$.time.temporal.a.HOUR_OF_DAY.A(i9);
            iVarL = i.h[i9];
        }
        ZoneOffset zoneOffsetS = ZoneOffset.S(i5 == 255 ? objectInput.readInt() : (i5 - 128) * 900);
        int i10 = zoneOffsetS.a;
        ZoneOffset zoneOffsetS2 = ZoneOffset.S(i6 == 3 ? objectInput.readInt() : (i6 * 1800) + i10);
        ZoneOffset zoneOffsetS3 = ZoneOffset.S(i7 == 3 ? objectInput.readInt() : (i7 * 1800) + i10);
        boolean z = i4 == 24;
        Objects.a(jVarN, "month");
        Objects.a(iVarL, "time");
        Objects.a(cVar, "timeDefnition");
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !iVarL.equals(i.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (iVarL.d == 0) {
            return new d(jVarN, i2, cVarK, iVarL, z, cVar, zoneOffsetS, zoneOffsetS2, zoneOffsetS3);
        }
        throw new IllegalArgumentException("Time's nano-of-second must be zero");
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.f == dVar.f && this.d.equals(dVar.d) && this.e == dVar.e && this.g.equals(dVar.g) && this.h.equals(dVar.h) && this.i.equals(dVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iW = ((this.d.W() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        j$.time.c cVar = this.c;
        return ((this.g.a ^ (this.f.ordinal() + (iW + ((cVar == null ? 7 : cVar.ordinal()) << 2)))) ^ this.h.a) ^ this.i.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.i;
        int i = zoneOffset.a;
        ZoneOffset zoneOffset2 = this.h;
        sb.append(i - zoneOffset2.a > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset2);
        sb.append(" to ");
        sb.append(zoneOffset);
        sb.append(", ");
        j jVar = this.a;
        byte b = this.b;
        j$.time.c cVar = this.c;
        if (cVar == null) {
            sb.append(jVar.name());
            sb.append(' ');
            sb.append((int) b);
        } else if (b == -1) {
            sb.append(cVar.name());
            sb.append(" on or before last day of ");
            sb.append(jVar.name());
        } else if (b < 0) {
            sb.append(cVar.name());
            sb.append(" on or before last day minus ");
            sb.append((-b) - 1);
            sb.append(" of ");
            sb.append(jVar.name());
        } else {
            sb.append(cVar.name());
            sb.append(" on or after ");
            sb.append(jVar.name());
            sb.append(' ');
            sb.append((int) b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        int i = this.i.a;
        int i2 = this.h.a;
        i iVar = this.d;
        boolean z = this.e;
        int iW = z ? 86400 : iVar.W();
        int i3 = this.g.a;
        int i4 = i2 - i3;
        int i5 = i - i3;
        byte b = iW % 3600 == 0 ? z ? (byte) 24 : iVar.a : (byte) 31;
        int i6 = i3 % 900 == 0 ? (i3 / 900) + 128 : 255;
        int i7 = (i4 == 0 || i4 == 1800 || i4 == 3600) ? i4 / 1800 : 3;
        int i8 = (i5 == 0 || i5 == 1800 || i5 == 3600) ? i5 / 1800 : 3;
        j$.time.c cVar = this.c;
        objectOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((cVar == null ? 0 : cVar.getValue()) << 19) + (b << 14) + (this.f.ordinal() << 12) + (i6 << 4) + (i7 << 2) + i8);
        if (b == 31) {
            objectOutput.writeInt(iW);
        }
        if (i6 == 255) {
            objectOutput.writeInt(i3);
        }
        if (i7 == 3) {
            objectOutput.writeInt(i2);
        }
        if (i8 == 3) {
            objectOutput.writeInt(i);
        }
    }
}
