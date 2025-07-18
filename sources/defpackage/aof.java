package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aof implements anw {
    private final /* synthetic */ int a;

    public aof(int i) {
        this.a = i;
    }

    @Override // defpackage.anw
    public final void a(acn acnVar) {
        if (this.a != 0) {
            int iZ = qm.z(acnVar.f);
            if ((iZ != 0 && iZ == 6 && Log.isLoggable("AppDoctorLogger", 6)) || Log.isLoggable("AppDoctorLogger", 4)) {
                StringBuilder sb = new StringBuilder("AppDoctorEvent<");
                if ((acnVar.b & 1) != 0) {
                    sb.append("package_name='");
                    sb.append(acnVar.c);
                    sb.append("' ");
                }
                if ((acnVar.b & 2) != 0) {
                    sb.append("process_name='");
                    sb.append(acnVar.d);
                    sb.append("' ");
                }
                sb.append("fix='");
                aco acoVarB = aco.b(acnVar.e);
                if (acoVarB == null) {
                    acoVarB = aco.UNRECOGNIZED;
                }
                sb.append(acoVarB.a());
                sb.append("' status='");
                int iZ2 = qm.z(acnVar.f);
                if (iZ2 == 0) {
                    iZ2 = 1;
                }
                int i = iZ2 - 2;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Integer.toString(qm.y(iZ2)) : "IN_PROGRESS" : "FAILED" : "SKIPPED" : "COMPLETED" : "PROPOSED" : "UNSPECIFIED");
                sb.append("' entryPoint='");
                int i2 = acnVar.g;
                acm acmVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : acm.TELEDOCTOR : acm.STARTUP : acm.UNKNOWN;
                if (acmVar == null) {
                    acmVar = acm.UNRECOGNIZED;
                }
                sb.append(acmVar.a());
                sb.append("'>");
                int iZ3 = qm.z(acnVar.f);
                if (iZ3 != 0 && iZ3 == 6) {
                    Log.e("AppDoctorLogger", sb.toString());
                } else {
                    Log.i("AppDoctorLogger", sb.toString());
                }
            }
        }
    }
}
