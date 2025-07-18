package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.protobuf.ExtensionRegistryLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mmd {
    public static final mpp a;

    static {
        aart aartVar = new aart(1024);
        aart aartVar2 = new aart(1024);
        aartVar2.o(1);
        aartVar2.u(aartVar2.d());
        aartVar2.k();
        aartVar.u(aefm.h(aartVar, aefs.j(aartVar, 158796327, aartVar.b(aartVar2.a.array()), 1), 0, 0, 0));
        aartVar.k();
        a = new mlb(new nbd(aefm.j(aartVar.a)), null, null);
        new Handler(Looper.getMainLooper());
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
        abza abzaVar = abza.a;
        ExtensionRegistryLite extensionRegistryLite2 = new ExtensionRegistryLite();
        extensionRegistryLite2.b(aczj.b);
        extensionRegistryLite2.b(acuj.b);
        yyk.o("Failed to lookup loading progress of resource");
    }

    public static void a(mos mosVar, dru druVar, final oal oalVar, mmc mmcVar, agfo agfoVar, final oco ocoVar) {
        agky agkyVar = new agky(agfoVar, new aggz() { // from class: mmb
            @Override // defpackage.aggz
            public final Object a(Object obj) {
                Throwable th = (Throwable) obj;
                mpp mppVar = mmd.a;
                ocoVar.d(acsw.LOG_TYPE_INTERNAL_TEMPLATE_RESOLUTION_ERROR, oalVar, th, "Error materializing Component", new Object[0]);
                return mmd.a;
            }
        });
        aggz aggzVar = agoh.k;
        mosVar.g(agfoVar, agkyVar, oalVar, druVar, mmcVar);
        mosVar.b();
    }
}
