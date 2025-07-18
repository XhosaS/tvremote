package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sli extends sme {
    public static final sme a = new sli();

    private sli() {
    }

    @Override // defpackage.sme
    public final String a() {
        return "multiproc";
    }

    @Override // defpackage.sme
    public final /* synthetic */ smd b(slo sloVar, String str, Executor executor, aafi aafiVar) {
        vtp vtpVarA;
        a.H(sloVar.e instanceof slg);
        if (sloVar.f) {
            vtpVarA = vtp.a();
        } else {
            vtp vtpVar = vtp.a;
            vvs vvsVar = vvs.a;
            vtpVarA = vtp.a;
        }
        smg smgVar = new smg(sloVar.b, vtpVarA);
        Uri uri = sloVar.a;
        return new slk(str, sfy.C(uri), smgVar, executor, aafiVar, sloVar.c);
    }
}
