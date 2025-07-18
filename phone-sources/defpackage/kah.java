package defpackage;

import android.content.Context;
import com.google.android.apps.googletv.app.presentation.pages.search.v2.SearchQueryPageActivity;
import com.google.android.videos.R;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kah implements yjv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kah(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v42, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r13v54, types: [java.lang.Object, yjk] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        wkg wkgVarA;
        irc ircVar = null;
        switch (this.b) {
            case 0:
                vtw vtwVar = (vtw) obj;
                wle wleVar = ((wlf) this.a).h;
                if (wleVar == null) {
                    wleVar = wle.a;
                }
                String str = wleVar.b;
                str.getClass();
                if (!DesugarCollections.unmodifiableList(((iod) vtwVar.b).h).contains(str)) {
                    vtwVar.z(str);
                }
                break;
            case 1:
                break;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue >= 0) {
                    gag gagVar = (gag) this.a;
                    if (iIntValue < gagVar.d()) {
                        break;
                    }
                }
                break;
            case 3:
                cb cbVar = (cb) obj;
                cbVar.getClass();
                kaz.d(this.a, cbVar);
                break;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.a.b(bool);
                break;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                if (!ylh.L(str2)) {
                    this.a.a(str2);
                }
                break;
            case 6:
                cfc cfcVar = (cfc) obj;
                cfcVar.getClass();
                cfk.f(cfcVar, new cet(1, this.a.size()));
                break;
            case 7:
                String str3 = (String) obj;
                str3.getClass();
                this.a.a(str3);
                break;
            case 8:
                kem kemVar = (kem) obj;
                kemVar.getClass();
                this.a.a(kemVar.a);
                break;
            case 9:
                String str4 = (String) obj;
                str4.getClass();
                Object obj2 = this.a;
                kfh kfhVar = (kfh) obj2;
                kfhVar.g.e(str4);
                jto jtoVarB = kfhVar.b();
                int iA = kfhVar.a();
                ykr.q(jtoVarB.c, null, 0, new jtn(jtoVarB, new kah(obj2, 16), str4, iA, (yih) null, 0), 3);
                break;
            case 10:
                String str5 = (String) obj;
                str5.getClass();
                SearchQueryPageActivity.submitSearchQuery$default((SearchQueryPageActivity) this.a, str5, false, 2, null);
                break;
            case 11:
                String str6 = (String) obj;
                str6.getClass();
                SearchQueryPageActivity.submitSearchQuery$default((SearchQueryPageActivity) this.a, str6, false, 2, null);
                break;
            case 12:
                String str7 = (String) obj;
                str7.getClass();
                Object obj3 = this.a;
                ykr.q(dwu.a((dwt) obj3), null, 0, new kbl((kfh) obj3, str7, (yih) null, 7), 3);
                break;
            case 13:
                String str8 = (String) obj;
                str8.getClass();
                ((SearchQueryPageActivity) this.a).c(str8, false);
                break;
            case 14:
                kdh kdhVar = (kdh) obj;
                kdhVar.getClass();
                wkf wkfVarB = wkf.b(kdhVar.a().c);
                if (wkfVarB == null) {
                    wkfVarB = wkf.TYPE_UNSPECIFIED;
                }
                if (wkfVarB == wkf.TVM_ENTITY_PAGE_ACTION) {
                    wkg wkgVarA2 = kdhVar.a();
                    vtw vtwVar2 = (vtw) wkgVarA2.a(5, null);
                    vtwVar2.x(wkgVarA2);
                    vty vtyVar = (vty) vtwVar2;
                    vtyVar.getClass();
                    vvd vvdVar = wqg.i;
                    vvdVar.getClass();
                    vvdVar.getClass();
                    Object objR = wae.r(vvdVar, vtyVar);
                    objR.getClass();
                    wqg wqgVar = (wqg) objR;
                    vtw vtwVar3 = (vtw) wqgVar.a(5, null);
                    vtwVar3.x(wqgVar);
                    vtwVar3.getClass();
                    wxe.l(vtwVar3);
                    vtyVar.bL(vvdVar, wxe.i(vtwVar3));
                    wkgVarA = wae.m(vtyVar);
                } else {
                    wkgVarA = kdhVar.a();
                }
                Object obj4 = this.a;
                SearchQueryPageActivity searchQueryPageActivity = (SearchQueryPageActivity) obj4;
                kfh kfhVarB = searchQueryPageActivity.b();
                String str9 = kdhVar.b().b;
                str9.getClass();
                kfhVarB.c(str9);
                irc ircVar2 = searchQueryPageActivity.c;
                if (ircVar2 == null) {
                    yks.c("searchSuggestionActionManager");
                } else {
                    ircVar = ircVar2;
                }
                ircVar.e(wkgVarA, (Context) obj4, "");
                searchQueryPageActivity.finish();
                break;
            case 15:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    wls wlsVar = ((wtv) it.next()).d;
                    if (wlsVar == null) {
                        wlsVar = wls.a;
                    }
                    String str10 = wlsVar.b;
                    str10.getClass();
                    arrayList.add(new kem(str10));
                }
                ((kfh) this.a).i.e(arrayList);
                break;
            case 16:
                List list2 = (List) obj;
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new kdh((wtv) it2.next()));
                }
                ((kfh) this.a).h.e(arrayList2);
                break;
            case 17:
                boi boiVar = (boi) obj;
                boiVar.getClass();
                boiVar.s(((Number) this.a.a()).floatValue());
                break;
            case 18:
                ((Boolean) obj).booleanValue();
                this.a.a();
                break;
            case 19:
                cfc cfcVar2 = (cfc) obj;
                cfcVar2.getClass();
                String string = ((Context) this.a).getString(R.string.content_description_seekbar_to_change_playback_position);
                string.getClass();
                cfk.g(cfcVar2, string);
                break;
            default:
                Float f = (Float) obj;
                f.floatValue();
                this.a.a(f);
                break;
        }
        return ygi.a;
    }
}
