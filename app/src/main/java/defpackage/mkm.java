package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.katniss.R;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.concurrent.Callable;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mkm extends dxv {

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oaa a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oal b;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    String c;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oco d;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq e;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq f;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ndh r;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    mlm s;

    public mkm() {
        super("AnimatedType");
    }

    @Override // defpackage.drq
    protected final Object A(Context context) {
        return new LottieAnimationView(context);
    }

    @Override // defpackage.drq
    protected final void D(dxe dxeVar, dxe dxeVar2) {
        ((mkk) dxeVar).a = ((mkk) dxeVar2).a;
    }

    @Override // defpackage.drq
    protected final void L(dru druVar, Object obj, duv duvVar) {
        Object obj2;
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        cqj cqjVar = ((mkk) dxoVar.d).a;
        final oaa oaaVar = this.a;
        final oal oalVar = this.b;
        final oco ocoVar = this.d;
        mlm mlmVar = this.s;
        ndh ndhVar = this.r;
        final ogq ogqVar = this.e;
        final ogq ogqVar2 = this.f;
        if (ndhVar.q()) {
            if (ndhVar.k().j() || ndhVar.k().l() || ndhVar.k().k()) {
                lottieAnimationView.b = new cqf() { // from class: mkr
                    @Override // defpackage.cqf
                    public final void a(Object obj3) {
                        ocoVar.d(acsw.LOG_TYPE_PROPERTY_RESOLUTION_ERROR, oalVar, (Throwable) obj3, "Unable to parse Lottie animation", new Object[0]);
                    }
                };
                lottieAnimationView.e = !ndhVar.n();
                if (cqjVar != null && (obj2 = cqjVar.a) != null) {
                    lottieAnimationView.f((cph) obj2);
                    lottieAnimationView.setTag(R.id.elements_lottie_animation_view_tag_id, null);
                } else if (ndhVar.k().l()) {
                    String strI = ndhVar.k().i();
                    if (!Objects.equals((String) lottieAnimationView.getTag(R.id.elements_lottie_animation_view_tag_id), strI)) {
                        lottieAnimationView.e(strI);
                        lottieAnimationView.setTag(R.id.elements_lottie_animation_view_tag_id, strI);
                    }
                } else if (ndhVar.k().j()) {
                    String strH = ndhVar.k().h();
                    final String strA = mkv.a(ndhVar);
                    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(strH.getBytes());
                    Map map = cpp.a;
                    lottieAnimationView.g(cpp.e(strA, new Callable() { // from class: cpk
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return cpp.k(byteArrayInputStream, strA);
                        }
                    }));
                    lottieAnimationView.setTag(R.id.elements_lottie_animation_view_tag_id, null);
                } else if (ndhVar.k().k()) {
                    lottieAnimationView.setAnimation(nxy.a(druVar.a.getApplicationContext(), "raw", ndhVar.k().g().h()));
                    lottieAnimationView.setTag(R.id.elements_lottie_animation_view_tag_id, null);
                }
                int iW = ndhVar.w() - 1;
                ImageView.ScaleType scaleType = iW != 1 ? iW != 3 ? iW != 4 ? ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_XY;
                lottieAnimationView.setScaleType(scaleType);
                if (scaleType.equals(ImageView.ScaleType.FIT_XY)) {
                    cqd cqdVar = lottieAnimationView.d;
                }
                lottieAnimationView.setSpeed(ndhVar.h());
                boolean zP = ndhVar.p();
                cqd cqdVar2 = lottieAnimationView.d;
                int i = true != zP ? 0 : -1;
                cws cwsVar = cqdVar2.b;
                cwsVar.setRepeatCount(i);
                lottieAnimationView.setProgress(ndhVar.g());
                lottieAnimationView.f.add(cpg.PLAY_OPTION);
                cqdVar2.i();
                if (ndhVar.r()) {
                    nda ndaVarI = ndhVar.i();
                    if (ndaVarI.h() <= ndaVarI.g()) {
                        cqdVar2.m(ndaVarI.h(), ndaVarI.g());
                        if (ogqVar != null && ndaVarI.h() != ndaVarI.g()) {
                            cwsVar.addListener(new mkw(new Runnable() { // from class: mks
                                @Override // java.lang.Runnable
                                public final void run() {
                                    CommandOuterClass$Command commandOuterClass$CommandA = ogqVar.a();
                                    nzv nzvVarP = nzx.p();
                                    nyu nyuVar = (nyu) nzvVarP;
                                    nyuVar.c = mkx.b(null, mkx.a(lottieAnimationView));
                                    nyuVar.e = ((nyx) oalVar).q;
                                    oaaVar.a(commandOuterClass$CommandA, nzvVarP.e()).k();
                                }
                            }));
                        }
                    }
                } else if (ndhVar.u()) {
                    ndb ndbVarJ = ndhVar.j();
                    if (ndbVarJ.h() <= ndbVarJ.g()) {
                        cqdVar2.n(ndbVarJ.h(), ndbVarJ.g());
                        if (ogqVar2 != null && ndbVarJ.h() != ndbVarJ.g()) {
                            cwsVar.addListener(new mkw(new Runnable() { // from class: mkt
                                @Override // java.lang.Runnable
                                public final void run() {
                                    CommandOuterClass$Command commandOuterClass$CommandA = ogqVar2.a();
                                    nzv nzvVarP = nzx.p();
                                    nyu nyuVar = (nyu) nzvVarP;
                                    nyuVar.c = mkx.b(null, mkx.a(lottieAnimationView));
                                    nyuVar.e = ((nyx) oalVar).q;
                                    oaaVar.a(commandOuterClass$CommandA, nzvVarP.e()).k();
                                }
                            }));
                        }
                    }
                }
                if (ndhVar.v() == 2) {
                    lottieAnimationView.c();
                } else {
                    lottieAnimationView.b();
                }
                if (ndhVar.o() && druVar.a.getResources().getConfiguration().getLayoutDirection() == 1) {
                    final PointF pointF = new PointF();
                    lottieAnimationView.h(new cqh() { // from class: mko
                        @Override // defpackage.cqh
                        public final void a(cph cphVar) {
                            pointF.x = cphVar.h.width();
                        }
                    });
                    css cssVar = css.a;
                    lottieAnimationView.a(cssVar, cqi.f, new cxd() { // from class: mkp
                        @Override // defpackage.cxd
                        public final Object a() {
                            return pointF;
                        }
                    });
                    lottieAnimationView.a(cssVar, cqi.o, new cxd() { // from class: mkq
                        @Override // defpackage.cxd
                        public final Object a() {
                            return mkv.a;
                        }
                    });
                }
                if (mlmVar != null) {
                    mlmVar.b(lottieAnimationView, new nzw() { // from class: mku
                        @Override // defpackage.nzw
                        public final nzv a(nzv nzvVar) {
                            acrs acrsVarA = mkx.a(lottieAnimationView);
                            nzx nzxVarE = nzvVar.e();
                            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = ((nyv) nzxVarE).e;
                            nzv nzvVarQ = nzxVarE.q();
                            ((nyu) nzvVarQ).c = mkx.b(senderStateOuterClass$SenderState, acrsVarA);
                            return nzvVarQ;
                        }
                    });
                }
            }
        }
    }

    @Override // defpackage.drq
    protected final void M(dru druVar) {
        dwz dwzVar = new dwz();
        ndh ndhVar = this.r;
        if (ndhVar.q()) {
            if (ndhVar.k().j()) {
                String strH = ndhVar.k().h();
                String strA = mkv.a(ndhVar);
                Map map = cpp.a;
                ahxk ahxkVar = new ahxk(ahxd.b(new ByteArrayInputStream(strH.getBytes())));
                String[] strArr = cwm.a;
                dwzVar.a = cpp.b(new cwn(ahxkVar), strA, true);
            } else if (ndhVar.k().l()) {
                if (!ndhVar.n()) {
                    cpp.h(druVar.a.getApplicationContext(), ndhVar.k().i());
                }
            } else if (ndhVar.k().k()) {
                Context context = druVar.a;
                int iA = nxy.a(context.getApplicationContext(), "raw", ndhVar.k().g().h());
                Context applicationContext = context.getApplicationContext();
                cpp.g(applicationContext, iA, cpp.j(applicationContext, iA));
            }
        }
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        ((mkk) dxoVar.d).a = (cqj) dwzVar.a;
    }

    @Override // defpackage.drq
    public final boolean X() {
        return true;
    }

    @Override // defpackage.drq
    public final boolean ad() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean ag(drq drqVar, dxx dxxVar, drq drqVar2, dxx dxxVar2) {
        mkm mkmVar = (mkm) drqVar;
        mkm mkmVar2 = (mkm) drqVar2;
        dtd dtdVar = new dtd(mkmVar == null ? null : mkmVar.r, mkmVar2 == null ? null : mkmVar2.r);
        dtd dtdVar2 = new dtd(mkmVar == null ? null : mkmVar.c, mkmVar2 != null ? mkmVar2.c : null);
        boolean zEquals = Objects.equals(dtdVar.a, dtdVar.b);
        Object obj = dtdVar2.a;
        Object obj2 = dtdVar2.b;
        return (zEquals && ((obj != null || obj2 != null) ? (obj == null || obj2 == null) ? false : obj.equals(obj2) : true)) ? false : true;
    }

    @Override // defpackage.drq
    public final int ah() {
        return 3;
    }

    @Override // defpackage.drq
    protected final void as(dru druVar, Object obj) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
        mlm mlmVar = this.s;
        lottieAnimationView.clearAnimation();
        lottieAnimationView.setProgress(0.0f);
        lottieAnimationView.b();
        lottieAnimationView.d.b.removeAllListeners();
        if (mlmVar != null) {
            mlmVar.a.remove(lottieAnimationView);
        }
    }

    @Override // defpackage.drq
    public final boolean g(drq drqVar) {
        if (this == drqVar) {
            return true;
        }
        if (drqVar == null || getClass() != drqVar.getClass()) {
            return false;
        }
        mkm mkmVar = (mkm) drqVar;
        oaa oaaVar = this.a;
        if (oaaVar == null ? mkmVar.a != null : !oaaVar.equals(mkmVar.a)) {
            return false;
        }
        oal oalVar = this.b;
        if (oalVar == null ? mkmVar.b != null : !oalVar.equals(mkmVar.b)) {
            return false;
        }
        mlm mlmVar = this.s;
        if (mlmVar == null ? mkmVar.s != null : !mlmVar.equals(mkmVar.s)) {
            return false;
        }
        String str = this.c;
        if (str == null ? mkmVar.c != null : !str.equals(mkmVar.c)) {
            return false;
        }
        oco ocoVar = this.d;
        if (ocoVar == null ? mkmVar.d != null : !ocoVar.equals(mkmVar.d)) {
            return false;
        }
        ogq ogqVar = this.e;
        if (ogqVar == null ? mkmVar.e != null : !ogqVar.equals(mkmVar.e)) {
            return false;
        }
        ogq ogqVar2 = this.f;
        if (ogqVar2 == null ? mkmVar.f != null : !ogqVar2.equals(mkmVar.f)) {
            return false;
        }
        ndh ndhVar = this.r;
        return ndhVar == null ? mkmVar.r == null : ndhVar.equals(mkmVar.r);
    }

    @Override // defpackage.drq
    protected final int h() {
        return 3;
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxe t() {
        return new mkk();
    }
}
