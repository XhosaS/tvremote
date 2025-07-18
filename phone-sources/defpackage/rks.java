package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rks extends rkz {
    private final nxc a;
    private final Status b;

    public rks(nxc nxcVar, Status status) {
        if (nxcVar == null) {
            throw new NullPointerException("Null result");
        }
        this.a = nxcVar;
        if (status == null) {
            throw new NullPointerException("Null status");
        }
        this.b = status;
    }

    @Override // defpackage.rkz
    public final nxc a() {
        return this.a;
    }

    @Override // defpackage.rkz
    public final Status b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rkz) {
            rkz rkzVar = (rkz) obj;
            if (this.a.equals(rkzVar.a()) && this.b.equals(rkzVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
