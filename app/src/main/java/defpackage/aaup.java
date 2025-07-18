package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaup extends afen {
    private final vrf a;
    private final String b;
    private final Executor c;

    public aaup(final aasv aasvVar, final aasu aasuVar) {
        aasf aasfVar = (aasf) aasuVar;
        this.b = aasfVar.b.getAuthority();
        this.c = aasfVar.d;
        this.a = new vrf(new zvh() { // from class: aaug
            @Override // defpackage.zvh
            public final zyd a() {
                wvx wvxVarF = wzg.f("FrameworkChannel#getTransportChannel", wwb.a, true);
                try {
                    zyd zydVarH = zxn.h(aasvVar.a(aasuVar));
                    wvxVarF.close();
                    return zydVarH;
                } catch (Throwable th) {
                    try {
                        wvxVarF.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, aasfVar.c);
    }

    @Override // defpackage.afen
    public final afeq a(final afil afilVar, final afem afemVar) {
        otp.a();
        zyd zydVarB = this.a.b();
        yqi yqiVar = new yqi() { // from class: aauf
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return ((afen) obj).a(afilVar, afemVar);
            }
        };
        Executor executor = afemVar.c;
        if (executor == null) {
            executor = this.c;
        }
        return new aauo(zuz.g(zydVarB, wyo.a(yqiVar), executor));
    }

    @Override // defpackage.afen
    public final String b() {
        return this.b;
    }
}
