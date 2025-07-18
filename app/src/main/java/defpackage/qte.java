package defpackage;

import com.google.common.collect.Lists;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qte extends qtk {
    private final boolean a;
    private final yyk b;

    public qte(boolean z, yyk yykVar) {
        this.a = z;
        if (yykVar == null) {
            throw new NullPointerException("Null runningAppProcessInfosInternal");
        }
        this.b = yykVar;
    }

    @Override // defpackage.qtk
    public final yyk a() {
        return this.b;
    }

    @Override // defpackage.qtk
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qtk) {
            qtk qtkVar = (qtk) obj;
            if (this.a == qtkVar.b() && Lists.d(this.b, qtkVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RunningAppProcessInfoResponse{getStatus=" + this.a + ", runningAppProcessInfosInternal=" + this.b.toString() + "}";
    }
}
