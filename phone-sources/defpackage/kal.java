package defpackage;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.google.android.apps.googletv.app.presentation.pages.myepisodes.MyEpisodesActivity;
import com.google.android.apps.googletv.app.presentation.pages.preferences.NotificationPreferencesActivity;
import com.google.android.apps.googletv.app.presentation.pages.search.SearchQueryPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.search.SearchResultsPageActivity;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kal implements yjk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kal(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, yfo] */
    @Override // defpackage.yjk
    public final Object a() {
        int i = 6;
        boolean z = false;
        z = false;
        jzs jzsVar = null;
        kuw kuwVar = null;
        kuw kuwVar2 = null;
        kuw kuwVar3 = null;
        kdh kdhVar = null;
        kuw kuwVar4 = null;
        switch (this.b) {
            case 0:
                kam kamVar = (kam) this.a;
                jzs jzsVar2 = kamVar.c;
                if (jzsVar2 == null) {
                    yks.c("componentManager");
                } else {
                    jzsVar = jzsVar2;
                }
                wkx wkxVar = kamVar.a().e;
                if (wkxVar == null) {
                    wkxVar = wkx.a;
                }
                wkxVar.getClass();
                return jzsVar.b(wkxVar);
            case 1:
                wop wopVar = wop.a;
                wopVar.getClass();
                vvj vvjVarAn = jbr.an(((kam) this.a).a, "tab", wopVar);
                vvjVarAn.getClass();
                return (wop) vvjVarAn;
            case 2:
                kbc kbcVar = (kbc) this.a;
                kbcVar.j.e(-1);
                ovq ovqVar = kbcVar.h;
                if (ovqVar.b) {
                    ovqVar.d();
                }
                return ygi.a;
            case 3:
                abj abjVarF = ((abw) this.a).f();
                List list = abjVarF.i;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    abk abkVar = (abk) obj;
                    long j = abkVar.k;
                    if (cmf.b(j) >= abjVarF.j) {
                        if (cmf.b(j) + ((int) (abkVar.j & 4294967295L)) <= abjVarF.k) {
                            arrayList.add(obj);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((abk) it.next()).a));
                }
                return arrayList2;
            case 4:
                abw abwVar = (abw) this.a;
                if (abwVar.b() == 0 && abwVar.c() == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                kbm kbmVar = (kbm) this.a;
                wkg wkgVar = kbmVar.e.h;
                if (wkgVar == null) {
                    wkgVar = wkg.a;
                }
                irc ircVar = kbmVar.o;
                wkgVar.getClass();
                ircVar.e(wkgVar, kbmVar.b, "hot_and_new_page");
                return ygi.a;
            case 6:
                return MyEpisodesActivity.$r8$lambda$5EWduzaU6alFg8rKOYfQOiw47E8((MyEpisodesActivity) this.a);
            case 7:
                wll wllVar = wll.a;
                wllVar.getClass();
                vvj vvjVarAn2 = jbr.an(((kcw) this.a).a, "show_entity_id", wllVar);
                vvjVarAn2.getClass();
                return (wll) vvjVarAn2;
            case 8:
                wni wniVar = wni.a;
                wniVar.getClass();
                vvj vvjVarAn3 = jbr.an(((kcw) this.a).a, "show_play_id", wniVar);
                vvjVarAn3.getClass();
                return (wni) vvjVarAn3;
            case 9:
                kcw kcwVar = (kcw) this.a;
                kuw kuwVar5 = kcwVar.f;
                if (kuwVar5 == null) {
                    yks.c("myEpisodesPageModelV2Factory");
                } else {
                    kuwVar4 = kuwVar5;
                }
                wni wniVarB = kcwVar.b();
                Object objB = kuwVar4.a.b();
                Object obj2 = kuwVar4.b;
                wniVarB.getClass();
                gag gagVar = (gag) objB;
                jzs jzsVar3 = (jzs) gagVar.e.b();
                jzsVar3.getClass();
                irc ircVar2 = (irc) gagVar.c.b();
                ircVar2.getClass();
                kw kwVar = (kw) gagVar.b.b();
                kwVar.getClass();
                isf isfVar = (isf) gagVar.d.b();
                isfVar.getClass();
                ino inoVar = (ino) gagVar.a.b();
                inoVar.getClass();
                iym iymVar = new iym(jbr.ad(new kcy(jzsVar3, ircVar2, kwVar, isfVar, inoVar, wniVarB)), false ? 1 : 0, i);
                iymVar.f(jef.b, kcwVar.e);
                return iymVar;
            case 10:
                Object obj3 = this.a;
                kdh kdhVar2 = ((NotificationPreferencesActivity) obj3).d;
                if (kdhVar2 == null) {
                    yks.c("errorViewModelFactory");
                } else {
                    kdhVar = kdhVar2;
                }
                kjh kjhVarH = kdhVar.h();
                kjhVarH.b(new jub(obj3, 5));
                View viewFindViewById = ((AppCompatActivity) obj3).findViewById(R.id.error_overlay);
                viewFindViewById.getClass();
                sfy.m((by) obj3, viewFindViewById).a(kjhVarH);
                return ygi.a;
            case 11:
                wnp wnpVar = wnp.a;
                wnpVar.getClass();
                vvj vvjVarAn4 = jbr.an((dwi) this.a, "watch_actions", wnpVar);
                vvjVarAn4.getClass();
                return (wnp) vvjVarAn4;
            case 12:
                wll wllVar2 = wll.a;
                wllVar2.getClass();
                vvj vvjVarAn5 = jbr.an((dwi) this.a, "entity_id", wllVar2);
                vvjVarAn5.getClass();
                return (wll) vvjVarAn5;
            case 13:
                kdx kdxVar = (kdx) this.a;
                kuw kuwVar6 = kdxVar.e;
                if (kuwVar6 == null) {
                    yks.c("prePurchaseBottomSheetModelFactory");
                } else {
                    kuwVar3 = kuwVar6;
                }
                wnp wnpVar2 = (wnp) kdxVar.a.a();
                kmc kmcVar = kdxVar.b;
                wll wllVar3 = (wll) kdxVar.c.a();
                Object objB2 = kuwVar3.a.b();
                Object obj4 = kuwVar3.b;
                wnpVar2.getClass();
                kmcVar.getClass();
                wllVar3.getClass();
                iom iomVar = (iom) objB2;
                jzs jzsVar4 = (jzs) iomVar.d.b();
                jzsVar4.getClass();
                irc ircVar3 = (irc) iomVar.c.b();
                ircVar3.getClass();
                kw kwVar2 = (kw) iomVar.b.b();
                kwVar2.getClass();
                isf isfVar2 = (isf) iomVar.a.b();
                isfVar2.getClass();
                return new iym(jbr.ad(new kdy(jzsVar4, ircVar3, kwVar2, isfVar2, wnpVar2, kmcVar, wllVar3)), false ? 1 : 0, i);
            case 14:
                return SearchQueryPageActivity.m123$r8$lambda$6kugsa3yByJB1MEmL6PraFzuKY((SearchQueryPageActivity) this.a);
            case 15:
                return SearchQueryPageActivity.$r8$lambda$EkqdsYarMiZVEkLImqPboXelELE((SearchQueryPageActivity) this.a);
            case 16:
                keg kegVar = (keg) this.a;
                kuw kuwVar7 = kegVar.d;
                if (kuwVar7 == null) {
                    yks.c("searchSuggestionsModelFactory");
                } else {
                    kuwVar2 = kuwVar7;
                }
                String str = kegVar.a;
                Object objB3 = kuwVar2.a.b();
                Object obj5 = kuwVar2.b;
                return new jth((lkt) objB3, str);
            case 17:
                return a.al((dwi) this.a);
            case 18:
                return SearchResultsPageActivity.$r8$lambda$gKccfTflLOlwEDhMjWRy2PotV1Q((SearchResultsPageActivity) this.a);
            case 19:
                SearchResultsPageActivity searchResultsPageActivity = (SearchResultsPageActivity) this.a;
                return Float.valueOf(-searchResultsPageActivity.E().l());
            default:
                keh kehVar = (keh) this.a;
                kuw kuwVar8 = kehVar.e;
                if (kuwVar8 == null) {
                    yks.c("searchResultsPageModelFactory");
                } else {
                    kuwVar = kuwVar8;
                }
                String str2 = kehVar.a;
                Object objB4 = kuwVar.a.b();
                Object obj6 = kuwVar.b;
                iom iomVar2 = (iom) objB4;
                jzs jzsVar5 = (jzs) iomVar2.c.b();
                jzsVar5.getClass();
                irc ircVar4 = (irc) iomVar2.a.b();
                ircVar4.getClass();
                kw kwVar3 = (kw) iomVar2.d.b();
                kwVar3.getClass();
                isf isfVar3 = (isf) iomVar2.b.b();
                isfVar3.getClass();
                return new iym(jbr.ad(new kei(jzsVar5, ircVar4, kwVar3, isfVar3, str2)), false ? 1 : 0, i);
        }
    }
}
