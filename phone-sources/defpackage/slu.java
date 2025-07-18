package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slu extends sme {
    public static final sme a = new slu();

    private slu() {
    }

    @Override // defpackage.sme
    public final String a() {
        return "signal";
    }

    @Override // defpackage.sme
    public final /* synthetic */ smd b(slo sloVar, String str, Executor executor, aafi aafiVar) {
        vtp vtpVarA;
        sma smaVar = sloVar.e;
        a.H(smaVar instanceof slr);
        if (sloVar.f) {
            vtpVarA = vtp.a();
        } else {
            vtp vtpVar = vtp.a;
            vvs vvsVar = vvs.a;
            vtpVarA = vtp.a;
        }
        smg smgVar = new smg(sloVar.b, vtpVarA);
        Uri uri = sloVar.a;
        return new slw(str, sfy.C(uri), smgVar, executor, aafiVar, ((slr) smaVar).a, sloVar.c);
    }
}
