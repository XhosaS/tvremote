package defpackage;

import com.google.common.collect.Lists;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rre extends rrh {
    private final yyk a;
    private final int b;

    public rre(yyk yykVar, int i) {
        this.a = yykVar;
        this.b = i;
    }

    @Override // defpackage.rrh
    public final yyk a() {
        return this.a;
    }

    @Override // defpackage.rrh
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rrh) {
            rrh rrhVar = (rrh) obj;
            if (Lists.d(this.a, rrhVar.a()) && this.b == rrhVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.b - 1;
        return "FlowRecordsData{records=" + this.a.toString() + ", status=" + Integer.toString(i) + "}";
    }
}
