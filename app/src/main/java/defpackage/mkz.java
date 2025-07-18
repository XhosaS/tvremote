package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mkz implements oeb {
    @Override // defpackage.oeb
    public final abwk a() {
        return acyq.c;
    }

    @Override // defpackage.oee
    public final /* bridge */ /* synthetic */ void b(dru druVar, oal oalVar, String str, Object obj, obz obzVar, nzw nzwVar) {
        acyq acyqVar = (acyq) obj;
        if (obzVar.a() instanceof mme) {
            mme mmeVar = (mme) obzVar.a();
            float f = acyqVar.f;
            mmf mmfVar = mmeVar.a;
            dxl dxlVar = mmeVar.b;
            mmfVar.v = dxlVar.a(f);
            if ((acyqVar.d & 4) != 0) {
                mmfVar.t = Float.valueOf(dxlVar.a(acyqVar.g));
            }
            if ((acyqVar.d & 8) != 0) {
                mmfVar.u = Float.valueOf(dxlVar.a(acyqVar.h));
            }
            if ((acyqVar.d & 1) != 0) {
                mmfVar.w = Integer.valueOf(acyqVar.e);
            }
        }
        if (obzVar.a() instanceof myk) {
            myk mykVar = (myk) obzVar.a();
            float f2 = acyqVar.f;
            mym mymVar = mykVar.a;
            dxl dxlVar2 = mykVar.b;
            mymVar.w = dxlVar2.a(f2);
            mymVar.u = dxlVar2.a(acyqVar.g);
            mymVar.v = dxlVar2.a(acyqVar.h);
            if ((acyqVar.d & 1) != 0) {
                mymVar.t = Integer.valueOf(acyqVar.e);
                return;
            }
            return;
        }
        if (obzVar.a() instanceof mys) {
            mys mysVar = (mys) obzVar.a();
            float fA = ogm.a(acyqVar.f, druVar.a.getResources().getDisplayMetrics());
            myv myvVar = mysVar.a;
            myvVar.w = fA;
            myvVar.u = ogm.a(acyqVar.g, r1.getResources().getDisplayMetrics());
            myvVar.v = ogm.a(acyqVar.h, r1.getResources().getDisplayMetrics());
            if ((acyqVar.d & 1) != 0) {
                myvVar.t = Integer.valueOf(acyqVar.e);
            }
        }
    }

    @Override // defpackage.oee
    public final /* synthetic */ void c(dru druVar, oal oalVar, String str, niv nivVar, Object obj, obz obzVar, nzw nzwVar) {
        throw null;
    }
}
