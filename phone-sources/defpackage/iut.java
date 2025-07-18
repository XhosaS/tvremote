package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class iut implements sch {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ iut(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.sch
    public final void a(Object obj, View view) {
        String string;
        String string2;
        View view2;
        String str = "";
        switch (this.c) {
            case 0:
                if (((iuq) this.a).c) {
                    by byVarN = ihz.N(view);
                    if (byVarN != null) {
                        byVarN.finishAndRemoveTask();
                        break;
                    }
                } else {
                    ((ivd) this.b).f.e.c(false);
                    break;
                }
                break;
            case 1:
                ivd ivdVar = (ivd) this.b;
                ivdVar.d.c(view);
                if (((iuq) this.a).c) {
                    by byVarN2 = ihz.N(view);
                    if (byVarN2 != null) {
                        byVarN2.finishAndRemoveTask();
                        break;
                    }
                } else {
                    ivdVar.f.e.c(false);
                    break;
                }
                break;
            case 2:
                Object obj2 = this.a;
                if (obj2 != null) {
                    Context context = view.getContext();
                    context.getClass();
                    by byVarF = hju.F(context);
                    if (byVarF != null) {
                        Object obj3 = this.b;
                        cr supportFragmentManager = byVarF.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        ill illVar = new ill(obj3, 5);
                        cuc cucVarA = cuc.a();
                        ArrayList arrayList = new ArrayList();
                        ity ityVar = (ity) obj2;
                        ?? r6 = ityVar.d;
                        boolean zIsEmpty = r6.isEmpty();
                        ivd ivdVar2 = (ivd) obj3;
                        Context context2 = ivdVar2.b;
                        if (!zIsEmpty) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Map.Entry entry : r6.entrySet()) {
                                arrayList2.add(new mvg(String.valueOf(((Number) entry.getKey()).longValue()), cucVarA.b(krh.x(context2.getResources(), (kzo) entry.getValue()))));
                            }
                            nag nagVarB = mvl.b();
                            nagVarB.j(context2.getString(R.string.audio_dialog_audio_heading));
                            nagVarB.d = "audio_options";
                            nagVarB.i(arrayList2);
                            Object obj4 = ityVar.b;
                            if (obj4 != null && (string2 = ((Long) obj4).toString()) != null) {
                                str = string2;
                            }
                            nagVarB.h(str);
                            arrayList.add(nagVarB.g());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Map.Entry entry2 : ityVar.e.entrySet()) {
                            arrayList3.add(new mvg(String.valueOf(((Number) entry2.getKey()).longValue()), cucVarA.b(krh.v((kwx) entry2.getValue(), context2.getResources()))));
                        }
                        String str2 = "DUMMY_OPTION_ID_FOR_NO_SUBTITLE";
                        arrayList3.add(0, new mvg("DUMMY_OPTION_ID_FOR_NO_SUBTITLE", cucVarA.b(context2.getResources().getString(R.string.audio_dialog_turn_off_caption))));
                        nag nagVarB2 = mvl.b();
                        nagVarB2.j(context2.getString(R.string.audio_dialog_caption_heading));
                        nagVarB2.d = "subtitle_option";
                        nagVarB2.i(arrayList3);
                        Object obj5 = ityVar.c;
                        if (obj5 != null && (string = ((Long) obj5).toString()) != null) {
                            str2 = string;
                        }
                        nxb nxbVar = ivdVar2.e;
                        nagVarB2.h(str2);
                        arrayList.add(nagVarB2.g());
                        nxbVar.a = mvk.a(arrayList, "audio_subtitle_dialog_key");
                        Object obj6 = nxbVar.a;
                        if (obj6 != null) {
                            ((mvk) obj6).e = new juv(illVar, 1);
                        }
                        if (obj6 != null) {
                            ((bl) obj6).show(supportFragmentManager, "AudioSubtitleDialog");
                            break;
                        }
                    }
                }
                break;
            case 3:
                ixt ixtVar = (ixt) this.b;
                kmo kmoVar = ixtVar.b;
                Object obj7 = this.a;
                if (!kmoVar.e() || kmoVar.d()) {
                    ((ixp) obj7).b.a();
                    break;
                } else {
                    by byVarN3 = ihz.N(view);
                    byVarN3.getClass();
                    ssn ssnVar = new ssn(byVarN3);
                    ssnVar.o(R.string.turn_on_logging);
                    ssnVar.d(R.string.turn_on_logging_and_retry);
                    ssnVar.l(R.string.proceed, new ixq(view, ixtVar, ssnVar, (ixp) obj7, 1));
                    ssnVar.g(R.string.not_now, new gcu(obj7, 2, null));
                    ssnVar.show();
                    break;
                }
                break;
            case 4:
                Object obj8 = this.b;
                ixt ixtVar2 = (ixt) obj8;
                kmo kmoVar2 = ixtVar2.b;
                Object obj9 = this.a;
                if (kmoVar2.e()) {
                    if (kmoVar2.d()) {
                        by byVarN4 = ihz.N(view);
                        byVarN4.getClass();
                        ssn ssnVar2 = new ssn(byVarN4);
                        ssnVar2.o(R.string.submit_feedback);
                        ssnVar2.d(R.string.submit_feedback_with_logs);
                        ssnVar2.l(R.string.proceed, new ixq(view, ixtVar2, ssnVar2, (ixp) obj9, 2));
                        ssnVar2.g(R.string.cancel, new ixr(0));
                        ssnVar2.show();
                        break;
                    } else {
                        by byVarN5 = ihz.N(view);
                        byVarN5.getClass();
                        ssn ssnVar3 = new ssn(byVarN5);
                        ssnVar3.o(R.string.turn_on_logging);
                        ssnVar3.d(R.string.turn_on_logging_and_retry);
                        ssnVar3.l(R.string.proceed, new ixq(view, ixtVar2, ssnVar3, (ixp) obj9, 0));
                        ssnVar3.g(R.string.not_now, new ifx(obj8, view, obj9, 3));
                        ssnVar3.show();
                        break;
                    }
                } else {
                    lhr lhrVar = ixtVar2.a;
                    by byVarN6 = ihz.N(view);
                    byVarN6.getClass();
                    lhrVar.d(byVarN6, lhp.a(((ixp) obj9).a));
                    break;
                }
            case 5:
                wkg wkgVar = ((wqs) ((ixi) this.a).b).d;
                if (wkgVar == null) {
                    wkgVar = wkg.a;
                }
                Object obj10 = this.b;
                wkgVar.getClass();
                jep jepVar = (jep) obj10;
                jepVar.b.f(wkgVar, view, pjw.b());
                jepVar.a.c(view);
                break;
            case 6:
                wkg wkgVar2 = ((wrc) ((ixi) this.a).b).e;
                if (wkgVar2 == null) {
                    wkgVar2 = wkg.a;
                }
                Object obj11 = this.b;
                wkgVar2.getClass();
                jew jewVar = (jew) obj11;
                jewVar.b.f(wkgVar2, view, pjw.b());
                jewVar.a.c(view);
                break;
            case 7:
                wrx wrxVar = (wrx) ((ixi) this.a).b;
                wls wlsVar = wrxVar.c;
                if (wlsVar == null) {
                    wlsVar = wls.a;
                }
                String str3 = wlsVar.b;
                str3.getClass();
                wlx wlxVar = wrxVar.b;
                if (wlxVar == null) {
                    wlxVar = wlx.a;
                }
                Object obj12 = this.b;
                wlxVar.getClass();
                jfv jfvVar = (jfv) obj12;
                jfvVar.b.l(str3, wlxVar);
                wkg wkgVar3 = wrxVar.g;
                if (wkgVar3 == null) {
                    wkgVar3 = wkg.a;
                }
                irc ircVar = jfvVar.d;
                wkgVar3.getClass();
                ircVar.f(wkgVar3, view, pjw.b());
                break;
            case 8:
                wkg wkgVar4 = ((wrx) ((ixi) this.a).b).h;
                if (wkgVar4 == null) {
                    wkgVar4 = wkg.a;
                }
                Object obj13 = this.b;
                wkgVar4.getClass();
                ((jfv) obj13).d.f(wkgVar4, view, pjw.b());
                break;
            case 9:
                jgb jgbVar = (jgb) this.b;
                jgbVar.a.c(view);
                wkg wkgVar5 = ((wry) ((ixi) this.a).b).f;
                if (wkgVar5 == null) {
                    wkgVar5 = wkg.a;
                }
                irc ircVar2 = jgbVar.b;
                wkgVar5.getClass();
                ircVar2.f(wkgVar5, view, pjw.b());
                bl blVarL = ihz.L(view);
                if (blVarL != null) {
                    blVarL.dismiss();
                    break;
                }
                break;
            case 10:
                wkg wkgVar6 = ((wsa) ((ixi) this.a).b).f;
                if (wkgVar6 == null) {
                    wkgVar6 = wkg.a;
                }
                Object obj14 = this.b;
                wkgVar6.getClass();
                jgm jgmVar = (jgm) obj14;
                jgmVar.b.f(wkgVar6, view, pjw.b());
                jgmVar.a.c(view);
                break;
            case 11:
                joz jozVar = (joz) this.a;
                jgv.j((jgv) this.b, view, jozVar, jgv.h(jozVar), false, 8);
                break;
            case 12:
                lid lidVarA = lid.a();
                Object parent = view.getParent();
                view2 = parent instanceof View ? (View) parent : null;
                Object obj15 = this.a;
                if (view2 != null) {
                    ((jgv) obj15).b.d(view2, hju.x(lidVarA));
                }
                Object obj16 = this.b;
                jgv jgvVar = (jgv) obj15;
                long jD = jgvVar.d(jgvVar.g);
                Context contextAj = a.aj(view);
                wql wqlVar = ((wul) obj16).c;
                if (wqlVar == null) {
                    wqlVar = wql.a;
                }
                wqlVar.getClass();
                jan.e(contextAj, wqlVar, jD);
                break;
            case 13:
                ((jgv) this.a).b.c(view);
                jan.f(a.aj(view), (wni) this.b);
                break;
            case 14:
                lid lidVarA2 = lid.a();
                Object parent2 = view.getParent();
                view2 = parent2 instanceof View ? (View) parent2 : null;
                Object obj17 = this.b;
                if (view2 != null) {
                    ((jgv) obj17).b.d(view2, hju.x(lidVarA2));
                }
                Object obj18 = this.a;
                irc ircVar3 = ((jgv) obj17).l;
                wkg wkgVar7 = ((wum) ((ixi) obj18).b).f;
                if (wkgVar7 == null) {
                    wkgVar7 = wkg.a;
                }
                wkgVar7.getClass();
                ircVar3.f(wkgVar7, view, pjw.b());
                break;
            case 15:
                jgv jgvVar2 = (jgv) this.b;
                jgvVar2.b.c(view);
                jgv.j(jgvVar2, view, (joz) this.a, null, true, 4);
                break;
            case 16:
                jgv.j((jgv) this.b, view, (joz) this.a, null, false, 12);
                break;
            case 17:
                lid lidVarA3 = lid.a();
                Object parent3 = view.getParent();
                view2 = parent3 instanceof View ? (View) parent3 : null;
                Object obj19 = this.b;
                if (view2 != null) {
                    ((jgv) obj19).b.d(view2, hju.x(lidVarA3));
                }
                Object obj20 = this.a;
                Context contextAj2 = a.aj(view);
                Object obj21 = ((ixi) obj20).b;
                wll wllVarG = jgv.g((joz) obj20);
                String str4 = ((wum) obj21).g;
                str4.getClass();
                jan.r(contextAj2, wllVarG, str4);
                break;
            case 18:
                jgv jgvVar3 = (jgv) this.b;
                jgvVar3.b.c(view);
                jgv.j(jgvVar3, view, (joz) this.a, null, false, 12);
                break;
            case 19:
                ((jjq) this.b).a.c(view);
                Context context3 = view.getContext();
                context3.getClass();
                vun<wth> vunVar = ((wti) ((ixi) this.a).b).c;
                vunVar.getClass();
                ArrayList arrayList4 = new ArrayList(yfm.z(vunVar, 10));
                for (wth wthVar : vunVar) {
                    String str5 = wthVar.d;
                    str5.getClass();
                    wni wniVar = wthVar.c;
                    if (wniVar == null) {
                        wniVar = wni.a;
                    }
                    arrayList4.add(new kfr(str5, "", wniVar.b));
                }
                jan.k(context3, new ArrayList(arrayList4));
                break;
            default:
                ((jjw) this.b).a.c(view);
                Context context4 = view.getContext();
                context4.getClass();
                wuy wuyVar = (wuy) ((ixi) this.a).b;
                wll wllVar = wuyVar.b;
                if (wllVar == null) {
                    wllVar = wll.a;
                }
                wllVar.getClass();
                String str6 = wuyVar.c;
                str6.getClass();
                jan.r(context4, wllVar, str6);
                break;
        }
    }

    public /* synthetic */ iut(sbx sbxVar, Object obj, int i) {
        this.c = i;
        this.b = sbxVar;
        this.a = obj;
    }
}
