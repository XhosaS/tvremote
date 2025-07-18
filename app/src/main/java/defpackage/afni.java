package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afni extends afhk {
    private final Status a;

    public afni(Status status) {
        this.a = status;
    }

    @Override // defpackage.afhk
    public final afhg a(afhh afhhVar) {
        return afhg.b(this.a);
    }
}
