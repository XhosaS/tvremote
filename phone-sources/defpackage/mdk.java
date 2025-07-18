package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mdk implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;

    public mdk(xcq xcqVar, int i) {
        this.b = i;
        this.a = xcqVar;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.b) {
            case 0:
                return new hfx((lor) this.a.b());
            case 1:
                return new hfx((lor) this.a.b(), (byte[]) null);
            case 2:
                return new oyn(((rgq) this.a).a(), 1);
            case 3:
                return new ljl(((rgq) this.a).a(), 19, null);
            case 4:
                return new mkt((lfn) this.a.b());
            case 5:
                return new ntp((Object) this.a);
            case 6:
                return new ntp((Object) this.a);
            case 7:
                return new oxe((iea) this.a.b());
            case 8:
                return new nhl(((rgq) this.a).a());
            case 9:
                Context contextA = ((rgq) this.a).a();
                int i = owx.a;
                try {
                    return tst.h(Integer.valueOf(contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0).versionCode));
                } catch (PackageManager.NameNotFoundException e) {
                    ((tvk) ((tvk) oww.a.g()).i(e)).s("Did not find own package, this should be impossible.");
                    return trk.a;
                }
            case 10:
                Context contextA2 = ((rgq) this.a).a();
                int i2 = owx.a;
                try {
                    return tst.h(contextA2.getPackageManager().getPackageInfo(contextA2.getPackageName(), 0).versionName);
                } catch (PackageManager.NameNotFoundException e2) {
                    ((tvk) ((tvk) oww.a.g()).i(e2)).s("Did not find own package, this should be impossible.");
                    return trk.a;
                }
            case 11:
                Context contextA3 = ((rgq) this.a).a();
                int i3 = owx.a;
                String packageName = contextA3.getPackageName();
                packageName.getClass();
                return packageName;
            case 12:
                return ((oxb) this.a).b();
            case 13:
                ntp ntpVar = (ntp) this.a.b();
                ntpVar.getClass();
                return new rbi(new peq(ntpVar, 1));
            case 14:
                return new kdh(((mhi) this.a).b().a);
            case 15:
                return new ozp((oyi) this.a.b());
            case 16:
                return new ozu((oyi) this.a.b());
            case 17:
                return new ozz((oyi) this.a.b(), 1);
            case 18:
                return new ozz((oyi) this.a.b(), 0);
            case 19:
                paw pawVar = (paw) this.a.b();
                pawVar.getClass();
                return pawVar;
            default:
                return new pea(((smi) this.a).b());
        }
    }
}
