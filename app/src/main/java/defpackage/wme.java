package defpackage;

import io.grpc.Status;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wme implements aauv {
    private zyd a;

    static {
        afib afibVar = afih.b;
        int i = afid.c;
        new afia("Authorization", afibVar);
        new afia("X-Auth-Time", afih.b);
    }

    @Override // defpackage.aauv
    public final aawa a(aaut aautVar) {
        afem afemVar = aautVar.b;
        zyd zydVar = (zyd) afemVar.h(wly.a);
        afem afemVarF = afemVar.f(aata.a, new aata());
        if (zydVar == null) {
            return new aawa(1, null, null, afemVarF);
        }
        this.a = zydVar;
        zydVar.getClass();
        return new aawa(4, null, zydVar, afemVarF);
    }

    @Override // defpackage.aauv
    public final /* synthetic */ aawa b() {
        return aawa.a;
    }

    @Override // defpackage.aauv
    public final aawa c() {
        try {
            throw null;
        } catch (ExecutionException e) {
            Status.Code code = Status.Code.UNKNOWN;
            List list = Status.a;
            Status statusWithDescription = code.a().c(e.getCause()).withDescription("Could not obtain auth token");
            afih afihVar = new afih();
            yqw.M(!statusWithDescription.e(), "Error status must not be ok");
            return new aawa(2, new aavw(statusWithDescription, afihVar), null, null);
        }
    }

    @Override // defpackage.aauv
    public final /* synthetic */ aawa e() {
        return aawa.a;
    }

    @Override // defpackage.aauv
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.aauv
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.aauv
    public final /* synthetic */ void d(aaus aausVar) {
    }
}
