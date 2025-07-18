package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzy {
    public final long a;
    public final tzz b;
    private final int c = 0;
    private final int d;

    public tzy(long j, tzz tzzVar) {
        this.a = j;
        tzzVar.getClass();
        this.b = tzzVar;
        this.d = 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tzy) {
            tzy tzyVar = (tzy) obj;
            if (this.a == tzyVar.a) {
                int i = tzyVar.d;
                int i2 = tzyVar.c;
                if (a.Q(null, null) && a.Q(this.b, tzyVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), 2, null, this.b});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.a;
        sb.append(j);
        sb.append(' ');
        tzz tzzVar = this.b;
        if (tzzVar != tzz.UNIT) {
            sb.append(tzzVar.name().toLowerCase());
        }
        sb.append("BYTE".toLowerCase());
        if (j != -1) {
            sb.append('s');
        }
        return sb.toString();
    }
}
