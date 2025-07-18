package defpackage;

import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbw implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;

    public jbw(xcq xcqVar, int i) {
        this.b = i;
        this.a = xcqVar;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        ouc oucVar;
        int i = 0;
        switch (this.b) {
            case 0:
                Boolean bool = (Boolean) xkf.a.e(2, "KinetoscopeLibIntegrationFeature__dts_hd_enabled", false).et(((xkg) this.a).b().b);
                bool.booleanValue();
                return bool;
            case 1:
                ConnectivityManager connectivityManager = (ConnectivityManager) this.a.b();
                connectivityManager.getClass();
                return new jbo(connectivityManager);
            case 2:
                Boolean bool2 = (Boolean) xkf.a.e(4, "KinetoscopeLibIntegrationFeature__hdr_enabled", false).et(((xkg) this.a).b().b);
                bool2.booleanValue();
                return bool2;
            case 3:
                Boolean bool3 = (Boolean) xkf.a.e(5, "KinetoscopeLibIntegrationFeature__multi_period_enabled", false).et(((xkg) this.a).b().b);
                bool3.booleanValue();
                return bool3;
            case 4:
                Boolean bool4 = (Boolean) xkf.a.e(1, "KinetoscopeLibIntegrationFeature__dash_thumbnails_enabled", false).et(((xkg) this.a).b().b);
                bool4.booleanValue();
                return bool4;
            case 5:
                lfn lfnVar = (lfn) this.a.b();
                lfnVar.getClass();
                String strBn = lfnVar.bn();
                ouc[] oucVarArrValues = ouc.values();
                int length = oucVarArrValues.length;
                while (true) {
                    if (i < length) {
                        oucVar = oucVarArrValues[i];
                        if (!yks.e(oucVar.g, strBn)) {
                            i++;
                        }
                    } else {
                        oucVar = null;
                    }
                }
                if (oucVar == null) {
                    oucVar = (ouc) yfm.aT(ouc.values());
                }
                oucVar.getClass();
                return oucVar;
            case 6:
                return new kw((Object) ((rgq) this.a).a());
            case 7:
                lfn lfnVar2 = (lfn) this.a.b();
                lfnVar2.getClass();
                return Boolean.valueOf(lfnVar2.cs());
            case 8:
                lfn lfnVar3 = (lfn) this.a.b();
                lfnVar3.getClass();
                return Integer.valueOf(lfnVar3.E());
            case 9:
                vuj vujVar = ((vxh) xlh.a.et(((xli) this.a).b().b)).b;
                vujVar.getClass();
                ArrayList arrayList = new ArrayList(yfm.z(vujVar, 10));
                Iterator<E> it = vujVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((Integer) it.next()).intValue()));
                }
                return arrayList;
            case 10:
                return new jcc((ovq) this.a.b());
            case 11:
                return new jcn((ovs) this.a.b());
            case 12:
                return new jdf(((jwl) this.a).b());
            case 13:
                return new crv(((rgq) this.a).a());
            case 14:
                return new kuw((oum) this.a.b());
            case 15:
                return ((jem) this.a).b();
            case 16:
                return ((jeo) this.a).b();
            case 17:
                return ((jeq) this.a).b();
            case 18:
                return new jer(((jwl) this.a).b());
            case 19:
                return ((jex) this.a).b();
            default:
                return new jez(((jwl) this.a).b());
        }
    }
}
