package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.notifications.platform.entrypoints.job.GnpWorker;
import java.security.KeyManagementException;
import javax.net.ssl.SSLContext;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class puz implements xcm {
    private final /* synthetic */ int a;

    public puz(int i) {
        this.a = i;
    }

    public static final Boolean a() {
        return true;
    }

    public static final cb c() {
        return new cb(new rdd(), (byte[]) null);
    }

    public static final cb d() {
        return new cb(new rdd(), (byte[]) null);
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() throws KeyManagementException {
        switch (this.a) {
            case 0:
                return (String) xdj.a.get();
            case 1:
                return new ptk();
            case 2:
                return a();
            case 3:
                return new yyk();
            case 4:
                vtw vtwVarM = vmg.a.m();
                if (xga.b()) {
                    vtw vtwVarM2 = vmf.a.m();
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    vmf vmfVar = (vmf) vtwVarM2.b;
                    vmfVar.b |= 2;
                    vmfVar.c = true;
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    vmg vmgVar = (vmg) vtwVarM.b;
                    vmf vmfVar2 = (vmf) vtwVarM2.r();
                    vmfVar2.getClass();
                    vmgVar.c = vmfVar2;
                    vmgVar.b |= 1;
                }
                vmg vmgVar2 = (vmg) vtwVarM.r();
                vmgVar2.getClass();
                return vmgVar2;
            case 5:
                vtw vtwVarM3 = vmg.a.m();
                vtwVarM3.getClass();
                if (xgs.c()) {
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    vuc vucVar = vtwVarM3.b;
                    vmg vmgVar3 = (vmg) vucVar;
                    vmgVar3.b |= 64;
                    vmgVar3.e = true;
                    if (!vucVar.A()) {
                        vtwVarM3.u();
                    }
                    vmg vmgVar4 = (vmg) vtwVarM3.b;
                    vmgVar4.b |= 128;
                    vmgVar4.f = true;
                }
                return ves.q(vtwVarM3);
            case 6:
                return GnpWorker.class;
            case 7:
                vtw vtwVarM4 = vmg.a.m();
                vtwVarM4.getClass();
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                vmg vmgVar5 = (vmg) vtwVarM4.b;
                vmgVar5.b |= 256;
                vmgVar5.g = true;
                return ves.q(vtwVarM4);
            case 8:
                return (String) xes.a.get();
            case 9:
                SSLContext sSLContextA = qhh.a("TLSv1.2");
                if (sSLContextA == null) {
                    sSLContextA = qhh.a(null);
                }
                sSLContextA.getClass();
                return sSLContextA;
            case 10:
                return new qht();
            case 11:
                vtw vtwVarM5 = vmg.a.m();
                vtwVarM5.getClass();
                if (!vtwVarM5.b.A()) {
                    vtwVarM5.u();
                }
                vmg vmgVar6 = (vmg) vtwVarM5.b;
                vmgVar6.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
                vmgVar6.i = true;
                return ves.q(vtwVarM5);
            case 12:
                return new qps();
            case 13:
                return new qzu(null);
            case 14:
                throw null;
            case 15:
                throw null;
            case 16:
                return new rgk(0);
            case 17:
                return new pmi(8);
            case 18:
                return new pmi(7);
            case 19:
                return new rne();
            default:
                return true;
        }
    }
}
