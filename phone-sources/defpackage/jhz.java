package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jhz implements sch {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jhz(Object obj, Object obj2, boolean z, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    @Override // defpackage.sch
    public final void a(Object obj, View view) {
        kiw kiwVarG;
        kiw kiwVarG2;
        kiw kiwVarG3;
        kiw kiwVarG4;
        kiw kiwVarG5;
        kiw kiwVarG6;
        int i = this.d;
        int i2 = R.string.user_feedback_remove_wishlist_toast;
        final int i3 = 1;
        switch (i) {
            case 0:
                Object obj2 = this.b;
                jhx jhxVar = (jhx) obj2;
                if (!jhxVar.j()) {
                    Object obj3 = this.c;
                    boolean z = this.a;
                    jhxVar.i(!z);
                    Object parent = view.getParent();
                    parent.getClass();
                    ((jia) obj3).a.f((View) parent, z);
                    if (!z && (kiwVarG = jbr.g(view)) != null) {
                        kiwVarG.M(jhxVar.d, jhxVar.e, new izk(obj2, 17));
                        break;
                    }
                } else {
                    kiw kiwVarG7 = jbr.g(view);
                    if (kiwVarG7 != null) {
                        wkk wkkVar = ((wuo) ((ixi) obj2).b).e;
                        if (wkkVar == null) {
                            wkkVar = wkk.a;
                        }
                        String str = (wkkVar.b == 2 ? (wki) wkkVar.c : wki.a).b;
                        str.getClass();
                        kiwVarG7.L(str);
                        break;
                    }
                }
                break;
            case 1:
                wkg wkgVar = ((wrv) this.c).h;
                if (wkgVar == null) {
                    wkgVar = wkg.a;
                }
                Object obj4 = this.b;
                boolean z2 = this.a;
                wkgVar.getClass();
                pjw pjwVarB = pjw.b();
                jfj jfjVar = (jfj) obj4;
                irc ircVar = jfjVar.b;
                if (ircVar.h(wkgVar)) {
                    String str2 = true != z2 ? "" : "tpfy-channel";
                    ((pjx) ircVar.a).a(pjwVarB, view);
                    Context context = view.getContext();
                    context.getClass();
                    ircVar.e(wkgVar, context, str2);
                }
                jfjVar.a.c(view);
                break;
            case 2:
                Object obj5 = this.b;
                jiy jiyVar = (jiy) obj5;
                if (!jiyVar.j()) {
                    boolean z3 = this.a;
                    Object obj6 = this.c;
                    Object parent2 = view.getParent();
                    parent2.getClass();
                    ((jja) obj6).a.f((View) parent2, z3);
                    jiyVar.i(!z3);
                    if (!z3 && (kiwVarG2 = jbr.g(view)) != null) {
                        kiwVarG2.M(jiyVar.d, jiyVar.e, new izk(obj5, 18));
                        break;
                    }
                } else {
                    kiw kiwVarG8 = jbr.g(view);
                    if (kiwVarG8 != null) {
                        wkk wkkVar2 = ((wuq) ((ixi) obj5).b).e;
                        if (wkkVar2 == null) {
                            wkkVar2 = wkk.a;
                        }
                        String str3 = (wkkVar2.b == 2 ? (wki) wkkVar2.c : wki.a).b;
                        str3.getClass();
                        kiwVarG8.L(str3);
                        break;
                    }
                }
                break;
            case 3:
                Object obj7 = this.b;
                jmk jmkVar = (jmk) obj7;
                if (!jmkVar.i()) {
                    boolean z4 = this.a;
                    Object obj8 = this.c;
                    Object parent3 = view.getParent();
                    parent3.getClass();
                    ((jmn) obj8).a.f((View) parent3, z4);
                    isr isrVar = jmkVar.e;
                    wll wllVar = ((wvf) ((ixi) obj7).b).b;
                    if (wllVar == null) {
                        wllVar = wll.a;
                    }
                    wllVar.getClass();
                    isrVar.r(wllVar, !z4);
                    if (!z4 && (kiwVarG3 = jbr.g(view)) != null) {
                        kiwVarG3.K(jmkVar.d);
                        break;
                    }
                } else {
                    kiw kiwVarG9 = jbr.g(view);
                    if (kiwVarG9 != null) {
                        wkk wkkVar3 = ((wvf) ((ixi) obj7).b).e;
                        if (wkkVar3 == null) {
                            wkkVar3 = wkk.a;
                        }
                        String str4 = (wkkVar3.b == 2 ? (wki) wkkVar3.c : wki.a).b;
                        str4.getClass();
                        kiwVarG9.L(str4);
                        break;
                    }
                }
                break;
            case 4:
                Object obj9 = this.b;
                jui juiVar = (jui) obj9;
                if (!juiVar.j()) {
                    final boolean z5 = this.a;
                    Object obj10 = this.c;
                    Object parent4 = view.getParent();
                    parent4.getClass();
                    ((jna) obj10).a.f((View) parent4, z5);
                    juiVar.i(!z5);
                    kiw kiwVarG10 = jbr.g(view);
                    if (kiwVarG10 != null) {
                        if (true == juiVar.k()) {
                            i2 = R.string.user_feedback_add_wishlist_toast;
                        }
                        final ixi ixiVar = (ixi) obj9;
                        kiwVarG10.M(i2, R.string.undo_dismissal, new View.OnClickListener() { // from class: jnv
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                if (i3 != 0) {
                                    ((jui) ixiVar).i(z5);
                                } else {
                                    ((jtz) ixiVar).i(z5);
                                }
                            }
                        });
                        break;
                    }
                } else {
                    kiw kiwVarG11 = jbr.g(view);
                    if (kiwVarG11 != null) {
                        wkk wkkVar4 = ((wvg) ((ixi) obj9).b).f;
                        if (wkkVar4 == null) {
                            wkkVar4 = wkk.a;
                        }
                        String str5 = (wkkVar4.b == 2 ? (wki) wkkVar4.c : wki.a).b;
                        str5.getClass();
                        kiwVarG11.L(str5);
                        break;
                    }
                }
                break;
            case 5:
                jaf jafVar = ((jne) this.c).a;
                boolean z6 = this.a;
                jafVar.f(view, z6);
                Object obj11 = this.b;
                ((jry) obj11).m(!z6);
                bl blVarL = ihz.L(view);
                if (blVarL != null) {
                    blVarL.dismiss();
                }
                if (!z6 && (kiwVarG4 = jbr.g(view)) != null) {
                    kiwVarG4.M(R.string.user_feedback_thumbdown_toast, R.string.undo_dismissal, new izk(obj11, 19));
                    break;
                }
                break;
            case 6:
                Object parent5 = view.getParent();
                parent5.getClass();
                jaf jafVar2 = ((jni) this.c).a;
                boolean z7 = this.a;
                jafVar2.f((View) parent5, z7);
                Object obj12 = this.b;
                ((jry) obj12).k(!z7);
                bl blVarL2 = ihz.L(view);
                if (blVarL2 != null) {
                    blVarL2.dismiss();
                }
                if (!z7 && (kiwVarG5 = jbr.g(view)) != null) {
                    kiwVarG5.M(R.string.user_feedback_thumbup_toast, R.string.undo_dismissal, new izk(obj12, 20));
                    break;
                }
                break;
            case 7:
                ((jnr) this.c).a.c(view);
                Object obj13 = this.b;
                wll wllVar2 = ((wuu) ((ixi) obj13).b).b;
                if (wllVar2 == null) {
                    wllVar2 = wll.a;
                }
                boolean z8 = this.a;
                Object obj14 = ((jry) obj13).d;
                wllVar2.getClass();
                ((isr) obj14).r(wllVar2, !z8);
                bl blVarL3 = ihz.L(view);
                if (blVarL3 != null) {
                    blVarL3.dismiss();
                }
                if (!z8 && (kiwVarG6 = jbr.g(view)) != null) {
                    kiwVarG6.K(R.string.user_feedback_marked_as_watched);
                    break;
                }
                break;
            case 8:
                jaf jafVar3 = ((jnw) this.c).a;
                final boolean z9 = this.a;
                jafVar3.f(view, z9);
                Object obj15 = this.b;
                jtz jtzVar = (jtz) obj15;
                jtzVar.i(!z9);
                bl blVarL4 = ihz.L(view);
                if (blVarL4 != null) {
                    blVarL4.dismiss();
                }
                kiw kiwVarG12 = jbr.g(view);
                if (kiwVarG12 != null) {
                    if (true == jtzVar.j()) {
                        i2 = R.string.user_feedback_add_wishlist_toast;
                    }
                    final ixi ixiVar2 = (ixi) obj15;
                    final int i4 = 0;
                    kiwVarG12.M(i2, R.string.undo_dismissal, new View.OnClickListener() { // from class: jnv
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            if (i4 != 0) {
                                ((jui) ixiVar2).i(z9);
                            } else {
                                ((jtz) ixiVar2).i(z9);
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                jaf jafVar4 = ((jwa) this.c).a;
                boolean z10 = this.a;
                jafVar4.f(view, z10);
                Object obj16 = this.b;
                jvw jvwVar = (jvw) obj16;
                jvwVar.j(!z10);
                kiw kiwVarG13 = jbr.g(view);
                if (kiwVarG13 != null) {
                    if (true == jvwVar.k()) {
                        i2 = R.string.user_feedback_add_wishlist_toast;
                    }
                    kiwVarG13.M(i2, R.string.undo_dismissal, new jyr(obj16, 1));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jhz(jhx jhxVar, boolean z, jia jiaVar, int i) {
        this.d = i;
        this.b = jhxVar;
        this.a = z;
        this.c = jiaVar;
    }

    public /* synthetic */ jhz(jnr jnrVar, jry jryVar, boolean z, int i) {
        this.d = i;
        this.c = jnrVar;
        this.b = jryVar;
        this.a = z;
    }

    public /* synthetic */ jhz(sbx sbxVar, boolean z, ixi ixiVar, int i) {
        this.d = i;
        this.c = sbxVar;
        this.a = z;
        this.b = ixiVar;
    }
}
