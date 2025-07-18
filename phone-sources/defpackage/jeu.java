package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import android.util.TypedValue;
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.videos.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jeu implements scg {
    public final /* synthetic */ ixi a;
    public final /* synthetic */ sbx b;
    private final /* synthetic */ int c;

    public /* synthetic */ jeu(sbx sbxVar, ixi ixiVar, int i) {
        this.c = i;
        this.b = sbxVar;
        this.a = ixiVar;
    }

    @Override // defpackage.scg
    public final void a(Object obj, View view) throws Resources.NotFoundException {
        int i = 3;
        switch (this.c) {
            case 0:
                view.getClass();
                ((jew) this.b).a.b(view, this.a, (jfa) obj, yhc.a);
                break;
            case 1:
                view.getClass();
                ((jep) this.b).a.b(view, this.a, (jes) obj, yhc.a);
                break;
            case 2:
                jfr jfrVar = (jfr) obj;
                view.getClass();
                Map mapF = yfm.f(new yfw(Integer.valueOf(R.id.channel_header_view), 109517));
                jaf jafVar = ((jfj) this.b).a;
                ixi ixiVar = this.a;
                jafVar.b(view, ixiVar, jfrVar, mapF);
                wru wruVar = (wru) ixiVar.b;
                if (wruVar.b == 12) {
                    TypedValue typedValue = new TypedValue();
                    view.getResources().getValue(jfj.d(wruVar, false), typedValue, true);
                    int i2 = (int) typedValue.getFloat();
                    wly wlyVar = wruVar.e;
                    if (wlyVar == null) {
                        wlyVar = wly.a;
                    }
                    int i3 = (wlyVar.b == 1 ? (wom) wlyVar.c : wom.a).c.size() / 2 < i2 ? 1 : 2;
                    if (!a.r(jfrVar.i, i3)) {
                        jfrVar.i = i3;
                        jfrVar.G(6);
                        break;
                    }
                }
                break;
            case 3:
                view.getClass();
                ixi ixiVar2 = this.a;
                jad jadVarD = jbr.D(107517, ixiVar2, (jfy) obj);
                Object obj2 = ixiVar2.b;
                yfw[] yfwVarArr = new yfw[2];
                Integer numValueOf = Integer.valueOf(R.id.image);
                wrx wrxVar = (wrx) obj2;
                String str = wrxVar.j;
                str.getClass();
                wll wllVar = wrxVar.e;
                if (wllVar == null) {
                    wllVar = wll.a;
                }
                sbx sbxVar = this.b;
                yfwVarArr[0] = new yfw(numValueOf, jbr.K(110034, str, wllVar, null, 8));
                yfwVarArr[1] = new yfw(Integer.valueOf(R.id.info_section), new jad(128483, 0L, 0, null, null, null, 62));
                ((jfv) sbxVar).a.a(view, jadVarD, yfm.h(yfwVarArr));
                break;
            case 4:
                view.getClass();
                ((jgb) this.b).a.b(view, this.a, (jge) obj, yhc.a);
                break;
            case 5:
                view.getClass();
                ((jgg) this.b).a.b(view, this.a, (jgj) obj, yhc.a);
                break;
            case 6:
                view.getClass();
                ((jgm) this.b).a.b(view, this.a, (jgp) obj, yhc.a);
                break;
            case 7:
                view.getClass();
                ixi ixiVar3 = this.a;
                jad jadVarD2 = jbr.D(156069, ixiVar3, (jgy) obj);
                yfw[] yfwVarArr2 = new yfw[12];
                joz jozVar = (joz) ixiVar3;
                yfwVarArr2[0] = new yfw(Integer.valueOf(R.id.rent_cta_layout), jbr.M(jgv.i(jozVar), jgv.k(jozVar), jgv.g(jozVar), null, 113889, 8));
                yfwVarArr2[1] = new yfw(Integer.valueOf(R.id.rent_provider_cta_layout), jbr.M(jgv.i(jozVar), jgv.k(jozVar), jgv.g(jozVar), null, 113889, 8));
                yfwVarArr2[2] = new yfw(Integer.valueOf(R.id.purchase_cta_layout), jbr.M(jgv.h(jozVar), jgv.k(jozVar), jgv.g(jozVar), null, 155979, 8));
                ubt ubtVar = null;
                yfwVarArr2[3] = new yfw(Integer.valueOf(R.id.purchase_provider_cta_layout), jbr.M(jgv.h(jozVar), jgv.k(jozVar), jgv.g(jozVar), null, 155979, 8));
                jgv jgvVar = (jgv) this.b;
                yfwVarArr2[4] = new yfw(Integer.valueOf(R.id.local_button), jbr.M(jgvVar.e(jozVar), jgv.k(jozVar), jgv.g(jozVar), null, 171506, 8));
                yfwVarArr2[5] = new yfw(Integer.valueOf(R.id.remote_button), jbr.M(jgvVar.e(jozVar), jgv.k(jozVar), jgv.g(jozVar), null, 171507, 8));
                yfwVarArr2[6] = new yfw(Integer.valueOf(R.id.show_episodes_cta_layout), jbr.M(jgvVar.e(jozVar), jgv.k(jozVar), jgv.g(jozVar), null, null, 24));
                yfwVarArr2[7] = new yfw(Integer.valueOf(R.id.cancel_preorder_cta_layout), jbr.M(jgvVar.e(jozVar), jgv.k(jozVar), jgv.g(jozVar), null, null, 24));
                vsz vszVar = null;
                int i4 = 62;
                long j = 0;
                int i5 = 0;
                uby ubyVar = null;
                yfwVarArr2[8] = new yfw(Integer.valueOf(R.id.download_cta_layout), new jad(109943, j, i5, ubyVar, ubtVar, vszVar, i4));
                yfwVarArr2[9] = new yfw(Integer.valueOf(R.id.more_providers_cta_layout), new jad(178574, j, i5, ubyVar, ubtVar, vszVar, i4));
                yfwVarArr2[10] = new yfw(Integer.valueOf(R.id.my_episodes_cta_layout), new jad(178580, j, i5, ubyVar, ubtVar, vszVar, i4));
                Integer numValueOf2 = Integer.valueOf(R.id.ai_overview_cta_layout);
                int i6 = 239738;
                if (jgvVar.f(jozVar)) {
                    wum wumVar = (wum) ixiVar3.b;
                    wul wulVar = wumVar.h;
                    if (wulVar == null) {
                        wulVar = wul.a;
                    }
                    if ((wulVar.b & 8) != 0) {
                        wul wulVar2 = wumVar.h;
                        if (wulVar2 == null) {
                            wulVar2 = wul.a;
                        }
                        wmc wmcVar = wulVar2.f;
                        if (wmcVar == null) {
                            wmcVar = wmc.a;
                        }
                        i6 = wmcVar.c;
                    }
                }
                jaf jafVar2 = jgvVar.b;
                yfwVarArr2[11] = new yfw(numValueOf2, new jad(i6, 0L, 0, null, null, null, 62));
                jafVar2.a(view, jadVarD2, yfm.h(yfwVarArr2));
                break;
            case 8:
                view.getClass();
                ((jia) this.b).a.a(view, jbr.D(141582, this.a, (kle) obj), yhc.a);
                break;
            case 9:
                view.getClass();
                ixi ixiVar4 = this.a;
                jad jadVarD3 = jbr.D(124804, ixiVar4, (jij) obj);
                yfw[] yfwVarArr3 = new yfw[3];
                yfwVarArr3[0] = new yfw(Integer.valueOf(R.id.purchase_button_container), new jad(155979, 0L, 0, null, null, null, 62));
                Integer numValueOf3 = Integer.valueOf(R.id.thumbnail_frame);
                jui juiVar = (jui) ixiVar4;
                String strN = juiVar.n();
                wll wllVar2 = ((wuh) ixiVar4.b).b;
                if (wllVar2 == null) {
                    wllVar2 = wll.a;
                }
                sbx sbxVar2 = this.b;
                yfwVarArr3[1] = new yfw(numValueOf3, jbr.F(110034, strN, wllVar2, juiVar.l()));
                yfwVarArr3[2] = new yfw(Integer.valueOf(R.id.download_view), new jad(109943, 0L, 0, null, null, null, 62));
                ((jif) sbxVar2).b.a(view, jadVarD3, yfm.h(yfwVarArr3));
                break;
            case 10:
                view.getClass();
                ((jir) this.b).a.b(view, this.a, (jiv) obj, yhc.a);
                break;
            case 11:
                view.getClass();
                ((jja) this.b).a.a(view, jbr.D(141583, this.a, (kle) obj), yhc.a);
                break;
            case 12:
                view.getClass();
                ((jji) this.b).a.b(view, this.a, (jjz) obj, yhc.a);
                break;
            case 13:
                view.getClass();
                ((jjq) this.b).a.a(view, jbr.D(109944, this.a, null), yhc.a);
                break;
            case 14:
                view.getClass();
                ((jjw) this.b).a.a(view, jbr.D(178574, this.a, (jjz) obj), yhc.a);
                break;
            case 15:
                view.getClass();
                ((jkc) this.b).a.a(view, jbr.D(195873, this.a, (jjz) obj), yhc.a);
                break;
            case 16:
                view.getClass();
                ((jkj) this.b).a.b(view, this.a, (jkn) obj, yhc.a);
                break;
            case 17:
                view.getClass();
                ((jks) this.b).a.b(view, this.a, (jkw) obj, yfm.f(new yfw(Integer.valueOf(R.id.cta), 113887)));
                break;
            case 18:
                view.getClass();
                ixi ixiVar5 = this.a;
                sbx sbxVar3 = this.b;
                jad jadVarD4 = jbr.D(109944, ixiVar5, null);
                Integer numValueOf4 = Integer.valueOf(R.id.ai_quick_recap_button);
                jlb jlbVar = (jlb) sbxVar3;
                int i7 = 239740;
                if (jlbVar.d((jky) ixiVar5)) {
                    wuk wukVar = (wuk) ixiVar5.b;
                    wul wulVar3 = wukVar.e;
                    if (wulVar3 == null) {
                        wulVar3 = wul.a;
                    }
                    if ((wulVar3.b & 8) != 0) {
                        wul wulVar4 = wukVar.e;
                        if (wulVar4 == null) {
                            wulVar4 = wul.a;
                        }
                        wmc wmcVar2 = wulVar4.f;
                        if (wmcVar2 == null) {
                            wmcVar2 = wmc.a;
                        }
                        i7 = wmcVar2.c;
                    }
                }
                jlbVar.a.a(view, jadVarD4, yfm.f(new yfw(numValueOf4, new jad(i7, 0L, 0, null, null, null, 62))));
                break;
            case 19:
                view.getClass();
                ((jlk) this.b).a.b(view, this.a, (jlp) obj, yhc.a);
                break;
            default:
                jma jmaVar = (jma) obj;
                sbx sbxVar4 = this.b;
                jlw jlwVar = (jlw) sbxVar4;
                if (jlwVar.p) {
                    ExoPlayer exoPlayer = jlwVar.h;
                    long jD = exoPlayer != null ? exoPlayer.D() : 0L;
                    jlwVar.o = jD;
                    if (jD > 0) {
                        long j2 = jlwVar.n;
                        if (jD < j2) {
                            Handler handler = jlwVar.l;
                            handler.removeCallbacksAndMessages(null);
                            ExoPlayer exoPlayer2 = jlwVar.h;
                            if (exoPlayer2 != null) {
                                exoPlayer2.ab(true);
                            }
                            handler.postDelayed(new jlr(sbxVar4, i), j2 - jlwVar.o);
                        }
                    }
                }
                ixi ixiVar6 = this.a;
                jaf jafVar3 = jlwVar.c;
                view.getClass();
                jad jadVarD5 = jbr.D(155985, ixiVar6, jmaVar);
                Object obj3 = ixiVar6.b;
                Integer numValueOf5 = Integer.valueOf(R.id.trailer_button);
                wni wniVar = ((wvd) obj3).b;
                if (wniVar == null) {
                    wniVar = wni.a;
                }
                jafVar3.a(view, jadVarD5, yfm.f(new yfw(numValueOf5, jbr.K(109826, "play-movies", null, wniVar, 4))));
                break;
        }
    }
}
