package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqr implements oqj {
    private final /* synthetic */ int a;

    public oqr(int i) {
        this.a = i;
    }

    @Override // defpackage.oqj
    public final void a(ngk ngkVar) {
        int iAU;
        if (this.a == 0 || (iAU = a.aU(ngkVar.f)) == 0 || iAU != 6 || !Log.isLoggable("AppDoctorLogger", 6)) {
            return;
        }
        StringBuilder sb = new StringBuilder("AppDoctorEvent<");
        if ((ngkVar.b & 1) != 0) {
            sb.append("package_name='");
            sb.append(ngkVar.c);
            sb.append("' ");
        }
        if ((ngkVar.b & 2) != 0) {
            sb.append("process_name='");
            sb.append(ngkVar.d);
            sb.append("' ");
        }
        sb.append("fix='");
        ngl nglVarB = ngl.b(ngkVar.e);
        if (nglVarB == null) {
            nglVarB = ngl.UNRECOGNIZED;
        }
        sb.append(nglVarB.a());
        sb.append("' status='");
        int iAU2 = a.aU(ngkVar.f);
        if (iAU2 == 0) {
            iAU2 = 1;
        }
        int i = iAU2 - 2;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Integer.toString(a.aJ(iAU2)) : "IN_PROGRESS" : "FAILED" : "SKIPPED" : "COMPLETED" : "PROPOSED" : "UNSPECIFIED");
        sb.append("' entryPoint='");
        int i2 = ngkVar.g;
        ngj ngjVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : ngj.TELEDOCTOR : ngj.STARTUP : ngj.UNKNOWN;
        if (ngjVar == null) {
            ngjVar = ngj.UNRECOGNIZED;
        }
        sb.append(ngjVar.a());
        sb.append("'>");
        int iAU3 = a.aU(ngkVar.f);
        if (iAU3 == 0 || iAU3 != 6) {
            return;
        }
        Log.e("AppDoctorLogger", sb.toString());
    }
}
