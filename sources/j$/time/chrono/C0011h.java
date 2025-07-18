package j$.time.chrono;

import j$.time.C0003b;
import j$.time.Instant;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0011h implements TemporalAmount, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final m a;
    public final int b;
    public final int c;
    public final int d;

    static {
        Object[] objArr = {j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            obj.getClass();
            arrayList.add(obj);
        }
        Collections.unmodifiableList(arrayList);
    }

    public C0011h(m mVar, int i, int i2, int i3) {
        this.a = mVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0011h) {
            C0011h c0011h = (C0011h) obj;
            if (this.b == c0011h.b && this.c == c0011h.c && this.d == c0011h.d && this.a.equals(c0011h.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    @Override // j$.time.temporal.TemporalAmount
    public final j$.time.temporal.l i(Instant instant) {
        m mVar = (m) instant.l(j$.time.temporal.q.b);
        m mVar2 = this.a;
        if (mVar != null && !mVar2.equals(mVar)) {
            throw new C0003b("Chronology mismatch, expected: " + mVar2.h() + ", actual: " + mVar.h());
        }
        int i = this.b;
        int i2 = this.c;
        if (i2 != 0) {
            j$.time.temporal.t tVarQ = mVar2.q(j$.time.temporal.a.MONTH_OF_YEAR);
            long j = tVarQ.a;
            long j2 = tVarQ.d;
            long j3 = (j == tVarQ.b && tVarQ.c == j2 && tVarQ.d()) ? (j2 - tVarQ.a) + 1 : -1L;
            if (j3 > 0) {
                instant = instant.d((i * j3) + i2, j$.time.temporal.b.MONTHS);
            } else {
                if (i != 0) {
                    instant = instant.d(i, j$.time.temporal.b.YEARS);
                }
                instant = instant.d(i2, j$.time.temporal.b.MONTHS);
            }
        } else if (i != 0) {
            instant = instant.d(i, j$.time.temporal.b.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? instant.d(i3, j$.time.temporal.b.DAYS) : instant;
    }

    public final String toString() {
        m mVar = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 == 0 && i2 == 0 && i == 0) {
            return mVar.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mVar.toString());
        sb.append(" P");
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('D');
        }
        return sb.toString();
    }

    public Object writeReplace() {
        return new F((byte) 9, this);
    }
}
