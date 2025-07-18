package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bw implements cuh {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cuh
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((by) this.a).m82lambda$init$2$androidsupportv4appFragmentActivity((Intent) obj);
                return;
            case 1:
                ((by) this.a).m81lambda$init$1$androidsupportv4appFragmentActivity((Configuration) obj);
                return;
            case 2:
                Configuration configuration = (Configuration) obj;
                cr crVar = (cr) this.a;
                if (crVar.Z()) {
                    crVar.r(configuration, false);
                    return;
                }
                return;
            case 3:
                Integer num = (Integer) obj;
                cr crVar2 = (cr) this.a;
                if (crVar2.Z() && num.intValue() == 80) {
                    crVar2.u(false);
                    return;
                }
                return;
            case 4:
                shy shyVar = (shy) obj;
                cr crVar3 = (cr) this.a;
                if (crVar3.Z()) {
                    crVar3.v(shyVar.a, false);
                    return;
                }
                return;
            case 5:
                shy shyVar2 = (shy) obj;
                cr crVar4 = (cr) this.a;
                if (crVar4.Z()) {
                    crVar4.A(shyVar2.a, false);
                    return;
                }
                return;
            case 6:
                ((ysa) this.a).b((gns) obj);
                return;
            case 7:
                ((ysa) this.a).b((gns) obj);
                return;
            case 8:
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                hfw hfwVar = new hfw(arrayList);
                ((kmf) this.a).c((hij) obj, hfwVar);
                return;
            case 9:
                ((hif) this.a).z((hij) obj);
                return;
            case 10:
                tst tstVarI = tst.i((Integer) obj);
                qut qutVar = (qut) this.a;
                qutVar.f = tstVarI;
                qutVar.b(qutVar.e);
                return;
            case 11:
                vrj vrjVar = (vrj) obj;
                vrjVar.getClass();
                qxv qxvVar = new qxv();
                if (qxvVar.isAdded()) {
                    throw new IllegalArgumentException("setData should not be called after onAttach");
                }
                Object obj2 = this.a;
                qxvVar.a = vrjVar;
                qxvVar.show(((bv) obj2).getChildFragmentManager(), qxr.a);
                return;
            default:
                ((rfh) this.a).k = (String) obj;
                return;
        }
    }
}
