package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaux implements afer {
    private final agow a;
    private final Class b;
    private final Class c;

    public aaux(agow agowVar, Class cls, Class cls2) {
        this.a = agowVar;
        this.b = cls;
        this.c = cls2;
    }

    @Override // defpackage.afer
    public final afeq a(afil afilVar, afem afemVar, afen afenVar) {
        try {
            yyk yykVarO = yyk.o((yyk) ((aauw) this.a).a.a());
            aauy.c(afilVar, this.b, true);
            aauy.c(afilVar, this.c, false);
            return new aavz(new aavt(afenVar, afilVar, afemVar, yykVarO));
        } catch (StatusException e) {
            return new aawp(Status.b(e));
        }
    }
}
