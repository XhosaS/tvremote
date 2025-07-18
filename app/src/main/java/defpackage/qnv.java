package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qnv extends qog {
    private final kfc a;
    private final Status b;

    public qnv(kfc kfcVar, Status status) {
        if (kfcVar == null) {
            throw new NullPointerException("Null result");
        }
        this.a = kfcVar;
        if (status == null) {
            throw new NullPointerException("Null status");
        }
        this.b = status;
    }

    @Override // defpackage.qog
    public final kfc a() {
        return this.a;
    }

    @Override // defpackage.qog
    public final Status b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qog) {
            qog qogVar = (qog) obj;
            if (this.a.equals(qogVar.a()) && this.b.equals(qogVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
