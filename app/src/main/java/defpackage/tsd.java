package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsd extends trx {
    private final int a;
    private final int b;
    private final ArrayList c;

    public tsd(int i, int i2, ArrayList arrayList) {
        this.a = i;
        this.b = i2;
        this.c = arrayList;
    }

    @Override // defpackage.trx
    public final int a() {
        return this.b;
    }

    @Override // defpackage.trx
    public final int b() {
        return this.a;
    }

    @Override // defpackage.trx
    public final ArrayList c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof trx) {
            trx trxVar = (trx) obj;
            if (this.a == trxVar.b() && this.b == trxVar.a() && this.c.equals(trxVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "AlternativeSpan{start=" + this.a + ", end=" + this.b + ", alternatives=" + this.c.toString() + "}";
    }
}
