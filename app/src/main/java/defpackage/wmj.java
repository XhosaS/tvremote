package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wmj extends afgc {
    private final zyu a;

    public wmj(afep afepVar, zyu zyuVar) {
        super(afepVar);
        this.a = zyuVar;
    }

    @Override // defpackage.afep
    public final void a(Status status, afih afihVar) {
        try {
            this.g.a(status, afihVar);
        } finally {
            this.a.p(null);
        }
    }
}
