package defpackage;

import io.grpc.Status;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afra implements afoh {
    final Status a;
    private final afof b;

    public afra(Status status, afof afofVar) {
        yqw.B(!status.e(), "error must not be OK");
        this.a = status;
        this.b = afofVar;
    }

    @Override // defpackage.afoh
    public final afoe b(afil afilVar, afih afihVar, afem afemVar, afev[] afevVarArr) {
        return new afqz(this.a, this.b, afevVarArr);
    }

    @Override // defpackage.afgx
    public final afgr c() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // defpackage.afoh
    public final void i(afta aftaVar, Executor executor) {
        throw null;
    }
}
