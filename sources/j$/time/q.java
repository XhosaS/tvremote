package j$.time;

import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class q implements TemporalAmount, Serializable {
    public static final q d = new q(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        Object[] objArr = {j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            obj.getClass();
            arrayList.add(obj);
        }
        Collections.unmodifiableList(arrayList);
    }

    public q(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 14, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.a == qVar.a && this.b == qVar.b && this.c == qVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final j$.time.temporal.l i(Instant instant) {
        j$.time.chrono.m mVar = (j$.time.chrono.m) instant.l(j$.time.temporal.q.b);
        if (mVar != null && !j$.time.chrono.t.c.equals(mVar)) {
            throw new C0003b("Chronology mismatch, expected: ISO, actual: " + mVar.h());
        }
        int i = this.a;
        int i2 = this.b;
        if (i2 != 0) {
            long j = (i * 12) + i2;
            if (j != 0) {
                instant = instant.d(j, j$.time.temporal.b.MONTHS);
            }
        } else if (i != 0) {
            instant = instant.d(i, j$.time.temporal.b.YEARS);
        }
        int i3 = this.c;
        return i3 != 0 ? instant.d(i3, j$.time.temporal.b.DAYS) : instant;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
