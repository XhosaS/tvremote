package defpackage;

import android.graphics.Rect;
import android.support.v7.app.AlertDialog;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ait implements ysy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ait(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v120, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r7v127, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r7v130, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r7v137, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r7v22, types: [bxu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r8v81, types: [java.lang.Object, yrz] */
    /* JADX WARN: Type inference failed for: r8v84, types: [bcb, java.lang.Object] */
    @Override // defpackage.ysy
    public final /* synthetic */ Object emit(Object obj, yih yihVar) throws Throwable {
        ahi ahiVar;
        yqe yqeVar;
        aho ahoVar;
        Object next;
        Object next2;
        Object obj2 = null;
        wlxVar = null;
        wlx wlxVar = null;
        wlxVar = null;
        wlx wlxVar2 = null;
        ksy ksyVar = null;
        Object obj3 = null;
        switch (this.b) {
            case 0:
                ((aiu) this.a).g.c((CursorAnchorInfo) obj);
                return ygi.a;
            case 1:
                ((aip) this.a).b();
                return ygi.a;
            case 2:
                ((ajq) this.a).r(false);
                return ygi.a;
            case 3:
                alg algVar = (alg) this.a;
                algVar.C(false);
                algVar.E(alh.a);
                return ygi.a;
            case 4:
                if (((bmy) obj) == null) {
                    ((alg) this.a).x();
                    return ygi.a;
                }
                ?? r7 = ((alg) this.a).p.a;
                if (r7 == 0) {
                    wv.b("ToolbarRequester is not initialized.");
                    throw new yfs();
                }
                bko bkoVar = (bko) r7;
                if (bkoVar.A && (((yqeVar = (ahiVar = (ahi) r7).c) == null || !yqeVar.u()) && (ahoVar = (aho) fh.P(r7, ahp.b)) != null)) {
                    ahiVar.c = ykr.q(bkoVar.F(), null, 4, new ito(ahiVar, ahoVar, (yih) null, 1), 1);
                }
                ygi ygiVar = ygi.a;
                yio yioVar = yio.a;
                return ygiVar;
            case 5:
                wq wqVar = (wq) obj;
                if (wqVar instanceof wn) {
                    ((bje) this.a).add(wqVar);
                } else if (wqVar instanceof wo) {
                    ((bje) this.a).remove(((wo) wqVar).a);
                } else if (wqVar instanceof wl) {
                    ((bje) this.a).add(wqVar);
                } else if (wqVar instanceof wm) {
                    ((bje) this.a).remove(((wm) wqVar).a);
                } else if (wqVar instanceof ws) {
                    ((bje) this.a).add(wqVar);
                } else if (wqVar instanceof wt) {
                    ((bje) this.a).remove(((wt) wqVar).a);
                } else if (wqVar instanceof wr) {
                    ((bje) this.a).remove(((wr) wqVar).a);
                }
                return ygi.a;
            case 6:
                wq wqVar2 = (wq) obj;
                if (wqVar2 instanceof wn) {
                    ((bje) this.a).add(wqVar2);
                } else if (wqVar2 instanceof wo) {
                    ((bje) this.a).remove(((wo) wqVar2).a);
                } else if (wqVar2 instanceof wl) {
                    ((bje) this.a).add(wqVar2);
                } else if (wqVar2 instanceof wm) {
                    ((bje) this.a).remove(((wm) wqVar2).a);
                } else if (wqVar2 instanceof ws) {
                    ((bje) this.a).add(wqVar2);
                } else if (wqVar2 instanceof wt) {
                    ((bje) this.a).remove(((wt) wqVar2).a);
                } else if (wqVar2 instanceof wr) {
                    ((bje) this.a).remove(((wr) wqVar2).a);
                } else if (wqVar2 instanceof wj) {
                    ((bje) this.a).add(wqVar2);
                } else if (wqVar2 instanceof wk) {
                    ((bje) this.a).remove(((wk) wqVar2).a);
                } else if (wqVar2 instanceof wi) {
                    ((bje) this.a).remove(((wi) wqVar2).a);
                }
                return ygi.a;
            case 7:
                if (((wq) obj) instanceof wt) {
                    this.a.a();
                }
                return ygi.a;
            case 8:
                wq wqVar3 = (wq) obj;
                if (wqVar3 instanceof ws) {
                    ((bje) this.a).add(wqVar3);
                } else if (wqVar3 instanceof wt) {
                    ((bje) this.a).remove(((wt) wqVar3).a);
                } else if (wqVar3 instanceof wr) {
                    ((bje) this.a).remove(((wr) wqVar3).a);
                } else if (wqVar3 instanceof wj) {
                    ((bje) this.a).add(wqVar3);
                } else if (wqVar3 instanceof wk) {
                    ((bje) this.a).remove(((wk) wqVar3).a);
                } else if (wqVar3 instanceof wi) {
                    ((bje) this.a).remove(((wi) wqVar3).a);
                }
                return ygi.a;
            case 9:
                ((cdg) this.a).b(((Number) obj).floatValue());
                return ygi.a;
            case 10:
                dbz dbzVar = (dbz) this.a;
                if (dbzVar.g.E() instanceof dcj) {
                    return ygi.a;
                }
                Object objF = dbzVar.f(true, yihVar);
                return objF != yio.a ? ygi.a : objF;
            case 11:
                this.a.b((ygi) obj);
                return ygi.a;
            case 12:
                ((gag) this.a).e.b((fzd) obj);
                return ygi.a;
            case 13:
                ihz ihzVar = (ihz) obj;
                if (ihzVar instanceof iht) {
                    ((yql) this.a).S(((iht) ihzVar).a);
                } else if (ihzVar instanceof ihu) {
                    ((yol) this.a).d(((ihu) ihzVar).a);
                }
                return ygi.a;
            case 14:
                for (ilj iljVar : (List) obj) {
                    Object obj4 = this.a;
                    isk iskVar = (isk) ((isl) obj4).c.get(iljVar.a);
                    if (iskVar != null) {
                        Long l = new Long(iljVar.b);
                        synchronized (iskVar) {
                            if (!yks.e(l, iskVar.h)) {
                                iskVar.h = l;
                                iskVar.a();
                            }
                        }
                    }
                }
                return ygi.a;
            case 15:
                ((iyd) this.a).i((ihz) obj);
                return ygi.a;
            case 16:
                gns gnsVar = (gns) obj;
                ((tug) jcm.a.b().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TrailerPlayerFragment$onCreateView$2$1$1", "emit", 357, "TrailerPlayerFragment.kt")).s("pip lifecycle updating");
                jcm jcmVar = (jcm) this.a;
                jcmVar.k();
                if (jcmVar.e().d()) {
                    List list = gnsVar.a;
                    if (list.isEmpty()) {
                        jcmVar.h();
                    } else {
                        Iterator it = yfm.N(list, gnm.class).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next3 = it.next();
                                jcmVar.o();
                                if (kgu.f((gnm) next3)) {
                                    obj2 = next3;
                                }
                            }
                        }
                        gnm gnmVar = (gnm) obj2;
                        if (gnmVar == null) {
                            jcmVar.h();
                        } else {
                            Rect rectA = gnmVar.a();
                            PlayerView playerView = jcmVar.u;
                            if (playerView != null) {
                                playerView.j(false);
                            }
                            cqn cqnVar = new cqn();
                            cqnVar.e(jcmVar.o);
                            jcmVar.o();
                            kgu.e(cqnVar, rectA);
                            jcmVar.o();
                            kgu.h(cqnVar);
                            cqnVar.c(jcmVar.o);
                            ConstraintLayout constraintLayout = jcmVar.o;
                            constraintLayout.getClass();
                            gjy.b(constraintLayout);
                            PlayerControlView playerControlView = jcmVar.p;
                            if (playerControlView != null) {
                                jcmVar.j(playerControlView);
                            }
                        }
                    }
                }
                return ygi.a;
            case 17:
                gns gnsVar2 = (gns) obj;
                jdd jddVar = (jdd) this.a;
                jddVar.H();
                if (jddVar.l().d()) {
                    List list2 = gnsVar2.a;
                    if (list2.isEmpty()) {
                        jddVar.q();
                        jddVar.V = false;
                    } else {
                        Iterator it2 = yfm.N(list2, gnm.class).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next4 = it2.next();
                                jddVar.P();
                                if (kgu.f((gnm) next4)) {
                                    obj3 = next4;
                                }
                            }
                        }
                        gnm gnmVar2 = (gnm) obj3;
                        if (gnmVar2 == null) {
                            jddVar.q();
                            jddVar.V = false;
                        } else {
                            jddVar.V = true;
                            Rect rectA2 = gnmVar2.a();
                            PlayerView playerView2 = jddVar.ac;
                            if (playerView2 != null) {
                                playerView2.j(false);
                            }
                            cqn cqnVar2 = new cqn();
                            cqnVar2.e(jddVar.Q);
                            jddVar.P();
                            kgu.e(cqnVar2, rectA2);
                            jddVar.P();
                            kgu.h(cqnVar2);
                            cqnVar2.c(jddVar.Q);
                            ConstraintLayout constraintLayout2 = jddVar.Q;
                            constraintLayout2.getClass();
                            gjy.b(constraintLayout2);
                            PlayerControlView playerControlView2 = jddVar.R;
                            if (playerControlView2 != null) {
                                jddVar.F(playerControlView2);
                                jddVar.E(playerControlView2);
                            }
                        }
                    }
                }
                return ygi.a;
            case 18:
                jbm jbmVar = (jbm) obj;
                jdd jddVar2 = (jdd) this.a;
                kuk kukVar = (kuk) jddVar2.f().a();
                ksy ksyVar2 = jddVar2.L;
                if (ksyVar2 == null) {
                    yks.c("assetId");
                } else {
                    ksyVar = ksyVar2;
                }
                if (!kukVar.a(ksyVar).f() && jddVar2.d().getBoolean(krh.WARNING_STREAMING_BANDWIDTH, true) && !jddVar2.Y) {
                    if (jbmVar == jbm.b) {
                        AlertDialog alertDialog = jddVar2.W;
                        if (alertDialog != null) {
                            alertDialog.show();
                        }
                        jddVar2.j().a.L();
                        jddVar2.Y = true;
                    } else {
                        AlertDialog alertDialog2 = jddVar2.W;
                        if (alertDialog2 != null && alertDialog2.isShowing()) {
                            AlertDialog alertDialog3 = jddVar2.W;
                            if (alertDialog3 != null) {
                                alertDialog3.dismiss();
                            }
                            if (jbmVar == jbm.a) {
                                jddVar2.j().a.Q();
                            }
                        }
                    }
                }
                return ygi.a;
            case 19:
                ihz ihzVar2 = (ihz) obj;
                if (ihzVar2 instanceof iht) {
                    vun vunVar = ((wom) ((iht) ihzVar2).a).c;
                    vunVar.getClass();
                    Iterator<E> it3 = vunVar.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            wkw wkwVarB = wkw.b(((wkx) next).d);
                            if (wkwVarB == null) {
                                wkwVarB = wkw.TYPE_UNSPECIFIED;
                            }
                            if (wkwVarB == wkw.TVM_ENTITY_TITLE) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    ?? r72 = this.a;
                    wkx wkxVar = (wkx) next;
                    if (wkxVar != null) {
                        vvd vvdVar = wvd.j;
                        wkxVar.i(vvdVar);
                        Object objK = wkxVar.l.k((vub) vvdVar.c);
                        if (objK == null) {
                            objK = vvdVar.b;
                        } else {
                            vvdVar.c(objK);
                        }
                        wvd wvdVar = (wvd) objK;
                        if (wvdVar != null && (wlxVar2 = wvdVar.e) == null) {
                            wlxVar2 = wlx.a;
                        }
                    }
                    r72.a(wlxVar2);
                } else if (ihzVar2 instanceof ihw) {
                    this.a.a(null);
                }
                return ygi.a;
            default:
                ihz ihzVar3 = (ihz) obj;
                if (ihzVar3 instanceof iht) {
                    vun vunVar2 = ((wom) ((iht) ihzVar3).a).c;
                    vunVar2.getClass();
                    Iterator<E> it4 = vunVar2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next2 = it4.next();
                            wkw wkwVarB2 = wkw.b(((wkx) next2).d);
                            if (wkwVarB2 == null) {
                                wkwVarB2 = wkw.TYPE_UNSPECIFIED;
                            }
                            if (wkwVarB2 == wkw.TVM_ENTITY_TITLE) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    ?? r73 = this.a;
                    wkx wkxVar2 = (wkx) next2;
                    if (wkxVar2 != null) {
                        vvd vvdVar2 = wvd.j;
                        wkxVar2.i(vvdVar2);
                        Object objK2 = wkxVar2.l.k((vub) vvdVar2.c);
                        if (objK2 == null) {
                            objK2 = vvdVar2.b;
                        } else {
                            vvdVar2.c(objK2);
                        }
                        wvd wvdVar2 = (wvd) objK2;
                        if (wvdVar2 != null && (wlxVar = wvdVar2.e) == null) {
                            wlxVar = wlx.a;
                        }
                    }
                    r73.a(wlxVar);
                } else if (ihzVar3 instanceof ihw) {
                    this.a.a(null);
                }
                return ygi.a;
        }
    }
}
