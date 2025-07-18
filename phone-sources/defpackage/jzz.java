package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.videos.R;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jzz extends kar {
    public pke a;
    public pkg b;
    public xhg c;
    public jzs d;
    public jwq e;
    private final yft f;

    public jzz() {
        int i = ylg.a;
        this.f = new jej(new ykl(jzy.class), new bck(this, 9), this);
    }

    public final jzy a() {
        return (jzy) this.f.a();
    }

    @Override // defpackage.kar
    public final boolean dS() throws vuq {
        int i;
        View view = getView();
        View viewFindViewById = view != null ? view.findViewById(R.id.component_view) : null;
        ViewStub viewStub = viewFindViewById instanceof ViewStub ? (ViewStub) viewFindViewById : null;
        int i2 = 0;
        if (viewStub == null) {
            return false;
        }
        wmc wmcVar = a().b().i;
        if (wmcVar == null) {
            wmcVar = wmc.a;
        }
        if (wmcVar.c != 0) {
            wmc wmcVar2 = a().b().i;
            if (wmcVar2 == null) {
                wmcVar2 = wmc.a;
            }
            i = wmcVar2.c;
        } else {
            i = 129676;
        }
        pke pkeVar = this.a;
        if (pkeVar == null) {
            yks.c("viewVisualElements");
            pkeVar = null;
        }
        View view2 = getView();
        pkg pkgVar = this.b;
        if (pkgVar == null) {
            yks.c("visualElements");
            pkgVar = null;
        }
        pjr pjrVarA = pkgVar.a(i);
        vvd vvdVar = nbu.b;
        vtw vtwVarM = nbs.a.m();
        vtwVarM.getClass();
        wmc wmcVar3 = a().b().i;
        if (wmcVar3 == null) {
            wmcVar3 = wmc.a;
        }
        wmcVar3.getClass();
        vsz vszVarQ = kys.b(wmcVar3.b) ? vsz.q(kys.a(wmcVar3.b).b) : null;
        if (vszVarQ != null) {
            jys.Z(vszVarQ, vtwVarM);
        }
        vtw vtwVarM2 = ubz.a.m();
        vtwVarM2.getClass();
        vtw vtwVarM3 = uca.a.m();
        vtwVarM3.getClass();
        wmc wmcVar4 = a().b().i;
        if (wmcVar4 == null) {
            wmcVar4 = wmc.a;
        }
        ubt ubtVar = wmcVar4.d;
        if (ubtVar == null) {
            ubtVar = ubt.a;
        }
        ubtVar.getClass();
        tyq.f(ubtVar, vtwVarM3);
        if (vszVarQ != null) {
            wjc wjcVar = wjc.a;
            vtp vtpVar = vtp.a;
            vvs vvsVar = vvs.a;
            vtp vtpVar2 = vtp.a;
            vte vteVarK = vszVarQ.k();
            vuc vucVarO = wjcVar.o();
            try {
                vvy vvyVarB = vvs.a.b(vucVarO);
                vvyVarB.l(vucVarO, vtf.p(vteVarK), vtpVar2);
                vvyVarB.g(vucVarO);
                vteVarK.z(0);
                vuc.B(vucVarO);
                vuc.B(vucVarO);
                wjc wjcVar2 = (wjc) vucVarO;
                wjcVar2.getClass();
                tyq.e(wjcVar2, vtwVarM3);
            } catch (IOException e) {
                if (e.getCause() instanceof vuq) {
                    throw ((vuq) e.getCause());
                }
                throw new vuq(e);
            } catch (vwf e2) {
                throw e2.a();
            } catch (RuntimeException e3) {
                if (e3.getCause() instanceof vuq) {
                    throw ((vuq) e3.getCause());
                }
                throw e3;
            } catch (vuq e4) {
                if (e4.a) {
                    throw new vuq(e4);
                }
                throw e4;
            }
        }
        tyq.i(tyq.d(vtwVarM3), vtwVarM2);
        jys.Y(tyq.g(vtwVarM2), vtwVarM);
        pjrVarA.d(new pjs(vvdVar, jys.X(vtwVarM)));
        pkeVar.e(view2, pjrVarA);
        sfy.q(this, new jzx(this, viewStub, i2));
        return true;
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.destination_fragment, viewGroup, false);
    }
}
