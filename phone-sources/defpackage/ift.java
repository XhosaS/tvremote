package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.googletv.app.presentation.pages.entity.EntityPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.search.SearchResultsPageActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ift implements ixf {
    private final jan a;

    public ift(jan janVar) {
        janVar.getClass();
        this.a = janVar;
    }

    @Override // defpackage.ixf
    public final void a(wkg wkgVar, Context context, String str, String str2) {
        vvd vvdVar = wqg.i;
        wkgVar.i(vvdVar);
        Object objK = wkgVar.l.k((vub) vvdVar.c);
        if (objK == null) {
            objK = vvdVar.b;
        } else {
            vvdVar.c(objK);
        }
        wqg wqgVar = (wqg) objK;
        int i = wqgVar.c;
        if (i == 1) {
            jan janVar = this.a;
            wll wllVar = (wll) wqgVar.d;
            wllVar.getClass();
            wpd wpdVar = wqgVar.e;
            if (wpdVar == null) {
                wpdVar = wpd.a;
            }
            wpdVar.getClass();
            woi woiVar = wqgVar.g;
            if (woiVar == null) {
                woiVar = woi.a;
            }
            woiVar.getClass();
            boolean z = wqgVar.h;
            if (str2 == null || str2.length() == 0 || yks.e(((ksn) ((ldy) janVar.a).a().g()).a, str2)) {
                Intent intent = new Intent().setClass(context, EntityPageActivity.class);
                intent.getClass();
                hju.B(intent, context);
                if (z) {
                    intent.addFlags(268468224);
                }
                hju.A(intent, "entity_id", wllVar);
                hju.A(intent, "entity_page_parameters", wpdVar);
                hju.A(intent, "sharing_info", woiVar);
                intent.putExtra("referrer", str);
                context.startActivity(intent);
                return;
            }
            Intent intent2 = new Intent().setClass(context, EntityPageActivity.class);
            intent2.getClass();
            hju.B(intent2, context);
            if (z) {
                intent2.addFlags(268468224);
            }
            hju.A(intent2, "entity_id", wllVar);
            hju.A(intent2, "entity_page_parameters", wpdVar);
            hju.A(intent2, "sharing_info", woiVar);
            intent2.putExtra("referrer", str);
            janVar.b.q(ksn.b(str2), intent2);
            return;
        }
        if (i == 4) {
            if (!wqgVar.f) {
                jan janVar2 = this.a;
                wni wniVar = (wni) wqgVar.d;
                wniVar.getClass();
                wpd wpdVar2 = wqgVar.e;
                if (wpdVar2 == null) {
                    wpdVar2 = wpd.a;
                }
                wpd wpdVar3 = wpdVar2;
                wpdVar3.getClass();
                woi woiVar2 = wqgVar.g;
                if (woiVar2 == null) {
                    woiVar2 = woi.a;
                }
                woi woiVar3 = woiVar2;
                woiVar3.getClass();
                if (str2 == null || str2.length() == 0 || yks.e(((ksn) ((ldy) janVar2.a).a().g()).a, str2)) {
                    jbr.v(context, wniVar, wpdVar3, woiVar3, str, 32);
                    return;
                }
                ksy ksyVarR = hju.r(wniVar);
                if (ksyVarR != null) {
                    Intent intent3 = new Intent().setClass(context, EntityPageActivity.class);
                    intent3.putExtra("asset_id", ksyVarR);
                    intent3.getClass();
                    hju.B(intent3, context);
                    hju.A(intent3, "entity_page_parameters", wpdVar3);
                    hju.A(intent3, "sharing_info", woiVar3);
                    intent3.putExtra("referrer", str);
                    janVar2.b.q(ksn.b(str2), intent3);
                    return;
                }
                return;
            }
            jan janVar3 = this.a;
            wni wniVar2 = (wni) wqgVar.d;
            wniVar2.getClass();
            Intent intentAb = null;
            if (str2 == null || str2.length() == 0 || yks.e(((ksn) ((ldy) janVar3.a).a().g()).a, str2)) {
                ksy ksyVarR2 = hju.r(wniVar2);
                if (ksyVarR2 == null) {
                    return;
                }
                Intent intent4 = new Intent().setClass(context, SearchResultsPageActivity.class);
                intent4.getClass();
                hju.B(intent4, context);
                if (ksy.v(ksyVarR2)) {
                    kvf kvfVarU = kvf.U(ksyVarR2);
                    String name = SearchResultsPageActivity.class.getName();
                    name.getClass();
                    intentAb = jbr.Z(context, kvfVarU, name, intent4);
                } else if (ksy.y(ksyVarR2)) {
                    kwn kwnVarD = kwn.d(ksyVarR2);
                    String name2 = SearchResultsPageActivity.class.getName();
                    name2.getClass();
                    intentAb = jbr.ab(context, kwnVarD, name2, intent4);
                }
                if (intentAb != null) {
                    context.startActivity(intentAb);
                    return;
                }
                return;
            }
            ksy ksyVarR3 = hju.r(wniVar2);
            if (ksyVarR3 != null) {
                Intent intent5 = new Intent().setClass(context, SearchResultsPageActivity.class);
                intent5.getClass();
                hju.B(intent5, context);
                if (ksy.v(ksyVarR3)) {
                    kvf kvfVarU2 = kvf.U(ksyVarR3);
                    String name3 = SearchResultsPageActivity.class.getName();
                    name3.getClass();
                    intentAb = jbr.Z(context, kvfVarU2, name3, intent5);
                } else if (ksy.y(ksyVarR3)) {
                    kwn kwnVarD2 = kwn.d(ksyVarR3);
                    String name4 = SearchResultsPageActivity.class.getName();
                    name4.getClass();
                    intentAb = jbr.ab(context, kwnVarD2, name4, intent5);
                }
                if (intentAb != null) {
                    janVar3.b.q(ksn.b(str2), intentAb);
                }
            }
        }
    }

    @Override // defpackage.ixf
    public final /* synthetic */ void b() {
    }
}
