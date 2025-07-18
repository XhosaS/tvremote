package defpackage;

import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mpt extends dxv {

    @eau(a = eav.NONE)
    @eat(a = 6)
    List a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oaa b;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oal c;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    String d;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean e;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq f;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq r;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq s;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    nmd t;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public int u;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public int v;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public int w;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public int x;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    int y;

    public mpt() {
        super("ScrollableContainerComponent");
    }

    private final mps aA(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (mps) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        aA(druVar).a = (nzw) new dxz().a;
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        ((mps) dxxVar2).a = ((mps) dxxVar).a;
    }

    @Override // defpackage.drq
    protected final boolean U() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019e  */
    @Override // defpackage.dxv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final defpackage.drq ay(defpackage.dru r28) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpt.ay(dru):drq");
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new mps();
    }

    @Override // defpackage.drq
    protected final Object y(dtu dtuVar, Object obj) {
        int i = dtuVar.c;
        if (i == -1048037474) {
            dsq.b((dru) dtuVar.d[0], (dto) obj);
            return null;
        }
        if (i == 1803022739) {
            dui duiVar = dtuVar.b;
            dru druVar = (dru) dtuVar.d[0];
            View view = ((dzl) obj).b;
            mpt mptVar = (mpt) duiVar;
            ogq ogqVar = mptVar.r;
            oaa oaaVar = mptVar.b;
            oal oalVar = mptVar.c;
            float f = druVar.a.getResources().getDisplayMetrics().density;
            if (ogqVar != null) {
                nyx nyxVar = (nyx) oalVar;
                ocj ocjVar = nyxVar.q;
                obj objVar = nyxVar.m;
                CommandOuterClass$Command commandOuterClass$CommandA = ogqVar.a();
                acyb acybVar = acyb.a;
                acya acyaVar = new acya();
                float fA = mpy.a(druVar, view.getX());
                if ((acyaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acyaVar.y();
                }
                acyb acybVar2 = (acyb) acyaVar.b;
                acybVar2.b |= 1;
                acybVar2.c = fA;
                float fA2 = mpy.a(druVar, view.getY());
                if ((acyaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acyaVar.y();
                }
                acyb acybVar3 = (acyb) acyaVar.b;
                acybVar3.b |= 2;
                acybVar3.d = fA2;
                acyb acybVar4 = (acyb) acyaVar.v();
                acys acysVar = acys.a;
                acyr acyrVar = new acyr();
                float fA3 = mpy.a(druVar, view.getMeasuredHeight());
                if ((acyrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acyrVar.y();
                }
                acys acysVar2 = (acys) acyrVar.b;
                acysVar2.b |= 2;
                acysVar2.d = fA3;
                float fA4 = mpy.a(druVar, view.getMeasuredWidth());
                if ((acyrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acyrVar.y();
                }
                acys acysVar3 = (acys) acyrVar.b;
                acysVar3.b |= 1;
                acysVar3.c = fA4;
                mpy.c(view, oaaVar, commandOuterClass$CommandA, ocjVar, objVar, acybVar4, (acys) acyrVar.v(), f);
            }
        }
        return null;
    }
}
