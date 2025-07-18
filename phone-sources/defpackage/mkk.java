package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mkk implements nxd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mkk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.nxd
    public final void a(nxc nxcVar) {
        switch (this.b) {
            case 0:
                nly nlyVar = (nly) nxcVar;
                boolean zB = nlyVar.e().b();
                Object obj = this.a;
                if (!zB) {
                    ((mkr) obj).D("seekTo", nlyVar.e());
                    break;
                } else {
                    ((mjw) obj).o();
                    break;
                }
            case 1:
                ((nwu) this.a).e();
                break;
            case 2:
                Status status = (Status) nxcVar;
                krd.b("stop app ".concat(status.toString()));
                boolean zB2 = status.b();
                Object obj2 = this.a;
                if (zB2) {
                    ((mkr) obj2).B();
                }
                nwu nwuVar = ((mkr) obj2).h;
                if (nwuVar.g()) {
                    nwuVar.e();
                    break;
                }
                break;
            case 3:
                nkb nkbVar = (nkb) nxcVar;
                krd.b("sessionRestore result: ".concat(String.valueOf(String.valueOf(nkbVar.e()))));
                boolean zB3 = nkbVar.e().b();
                Object obj3 = this.a;
                if (!zB3) {
                    mkr mkrVar = (mkr) obj3;
                    if (mkrVar.h.g()) {
                        krd.b("sessionRestore different session disconnect:".concat(String.valueOf(nkbVar.c())));
                        mkrVar.B();
                        mkrVar.C(false);
                        break;
                    }
                } else {
                    mkr mkrVar2 = (mkr) obj3;
                    krd.b("sessionRestore restored select route: ".concat(String.valueOf(mkrVar2.k.d)));
                    mkrVar2.E(nkbVar.c());
                    break;
                }
                break;
            case 4:
                nkb nkbVar2 = (nkb) nxcVar;
                krd.e("Connection result ".concat(String.valueOf(String.valueOf(nkbVar2.e()))));
                njz njzVarA = nkbVar2.a();
                Object obj4 = this.a;
                if (njzVarA != null) {
                    mkr mkrVar3 = (mkr) obj4;
                    if (mkrVar3.j.equals(nkbVar2.a().a)) {
                        if (!nkbVar2.e().b()) {
                            krd.f("Launch receiver app failed. Disconnecting.");
                            mkrVar3.C(false);
                            break;
                        } else {
                            mkrVar3.E(nkbVar2.c());
                            break;
                        }
                    }
                }
                krd.f("Remote device is now running a different application. Disconnecting.");
                ((mkr) obj4).C(false);
                break;
            case 5:
                ((mjw) ((nzx) this.a).e).o();
                ((nly) nxcVar).e().b();
                break;
            case 6:
                Status statusE = ((nqd) nxcVar).e();
                int i = statusE.f;
                Object obj5 = this.a;
                if (i != 0) {
                    ((nph) obj5).a.d(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", Integer.valueOf(i), statusE.g), new Object[0]);
                }
                nph nphVar = (nph) obj5;
                nphVar.j = null;
                if (!nphVar.h.isEmpty()) {
                    nphVar.e();
                    break;
                }
                break;
            default:
                Status statusE2 = ((nqd) nxcVar).e();
                int i2 = statusE2.f;
                Object obj6 = this.a;
                if (i2 != 0) {
                    ((nph) obj6).a.d(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", Integer.valueOf(i2), statusE2.g), new Object[0]);
                }
                nph nphVar2 = (nph) obj6;
                nphVar2.i = null;
                if (!nphVar2.h.isEmpty()) {
                    nphVar2.e();
                    break;
                }
                break;
        }
    }
}
