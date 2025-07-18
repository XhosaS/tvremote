package defpackage;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.widget.Toast;
import com.google.android.videos.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jgu implements sch {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jgu(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ith, java.lang.Object] */
    @Override // defpackage.sch
    public final void a(Object obj, final View view) {
        vun vunVar;
        Object obj2;
        Object obj3;
        Object obj4 = null;
        wpmVar = null;
        wpm wpmVar = null;
        switch (this.d) {
            case 0:
                lid lidVarA = lid.a();
                ViewParent parent = view.getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                Object obj5 = this.a;
                if (view2 != null) {
                    ((jgv) obj5).b.d(view2, hju.x(lidVarA));
                }
                by byVarN = ihz.N(view);
                if (byVarN != null) {
                    ((jgv) obj5).c.a(byVarN, (ksy) this.b, ((wum) ((ixi) this.c).b).e);
                    break;
                }
                break;
            case 1:
                final PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
                final ivd ivdVar = (ivd) this.a;
                ivdVar.d.c(view);
                popupMenu.getMenuInflater().inflate(R.menu.companion_bar_remote_menu, popupMenu.getMenu());
                Object obj6 = this.b;
                final ?? r5 = this.c;
                final ivh ivhVar = (ivh) obj6;
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: iuw
                    @Override // android.support.v7.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        Integer numValueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
                        PopupMenu popupMenu2 = popupMenu;
                        ivd ivdVar2 = ivdVar;
                        ivh ivhVar2 = ivhVar;
                        if (numValueOf != null && numValueOf.intValue() == R.id.swipe_pad_mode) {
                            ivhVar2.d.w(true);
                            ivdVar2.d(true);
                            ivdVar2.b(popupMenu2);
                        } else if (numValueOf != null && numValueOf.intValue() == R.id.dpad_mode) {
                            ivhVar2.d.w(false);
                            ivdVar2.d(false);
                            ivdVar2.b(popupMenu2);
                        } else if (numValueOf != null && numValueOf.intValue() == R.id.fmr_mode) {
                            View actionView = popupMenu2.getMenu().findItem(R.id.fmr_mode).getActionView();
                            if (actionView != null) {
                                ivdVar2.d.c(actionView);
                            }
                            ith ithVar = r5;
                            ((tug) ivd.a.e().j("com/google/android/apps/googletv/app/device/presentation/companionbar/CompanionBarPresenter", "renderToolbar$lambda$30$lambda$29", 497, "CompanionBarPresenter.kt")).s("FMR option clicked");
                            if (ithVar != null) {
                                View view3 = view;
                                jbr jbrVar = ivdVar2.g;
                                Context context = view3.getContext();
                                ssn ssnVar = new ssn(context, R.style.ThemeOverlay_Material3_MaterialAlertDialog_Centered);
                                ssnVar.b(context.getDrawable(R.drawable.gs_missing_controller_vd_theme_24));
                                ssnVar.p(context.getResources().getString(R.string.fmr_alert_dialog_title));
                                ssnVar.e(context.getResources().getString(R.string.fmr_alert_dialog_description));
                                ssnVar.m(context.getResources().getString(R.string.fmr_alert_dialog_positive), new ifx(jbrVar, view3, ithVar, 2));
                                ssnVar.h(context.getResources().getString(R.string.fmr_alert_dialog_negative), new ixr(1));
                                ssnVar.create().show();
                            }
                        }
                        return true;
                    }
                });
                MenuItem menuItemFindItem = popupMenu.getMenu().findItem(R.id.fmr_mode);
                menuItemFindItem.setVisible(ivdVar.e(r5));
                ((tug) ivd.a.e().j("com/google/android/apps/googletv/app/device/presentation/companionbar/CompanionBarPresenter", "renderToolbar$lambda$30", 508, "CompanionBarPresenter.kt")).v("FMR option visibility: %s", Boolean.valueOf(menuItemFindItem.isVisible()));
                MenuItem menuItemFindItem2 = popupMenu.getMenu().findItem(R.id.dpad_mode);
                MenuItem menuItemFindItem3 = popupMenu.getMenu().findItem(R.id.swipe_pad_mode);
                Context context = ivdVar.b;
                menuItemFindItem2.setVisible(!jwq.X(context));
                menuItemFindItem3.setVisible(!jwq.X(context));
                Menu menu = popupMenu.getMenu();
                Menu menu2 = true == (menu instanceof fb) ? menu : null;
                if (menu2 != null) {
                    ((fb) menu2).i = true;
                }
                ivdVar.b(popupMenu);
                popupMenu.show();
                break;
            case 2:
                jgv jgvVar = (jgv) this.a;
                jgvVar.b.d(view, pjw.b());
                Object obj7 = this.b;
                if (obj7 != null) {
                    Object obj8 = this.c;
                    if (jgvVar.d.d()) {
                        Toast.makeText(view.getContext(), R.string.preorder_canceling_toast, 1).show();
                        yow yowVarO = ihz.O(view);
                        if (yowVarO != null) {
                            ykr.q(yowVarO, null, 0, new ixs(jgvVar, (wni) obj7, (joz) obj8, (yih) null, 9), 3);
                            break;
                        }
                    } else {
                        joz jozVar = (joz) obj8;
                        wnp wnpVarI = jozVar.i();
                        if (wnpVarI != null && (vunVar = wnpVarI.c) != null) {
                            Iterator<E> it = vunVar.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    wpm wpmVar2 = (wpm) next;
                                    vun<wnt> vunVar2 = (wpmVar2.c == 4 ? (woz) wpmVar2.d : woz.a).c;
                                    vunVar2.getClass();
                                    if (!vunVar2.isEmpty()) {
                                        for (wnt wntVar : vunVar2) {
                                            if (wntVar.c == 2 && (((wnr) wntVar.d).b & 1) != 0) {
                                                obj4 = next;
                                            }
                                        }
                                    }
                                }
                            }
                            wpmVar = (wpm) obj4;
                        }
                        jgv.j(jgvVar, view, jozVar, wpmVar, false, 8);
                        break;
                    }
                }
                break;
            case 3:
                pjw pjwVarX = hju.x(lid.a());
                jgv jgvVar2 = (jgv) this.a;
                jgvVar2.b.d(view, pjwVarX);
                joz jozVar2 = (joz) this.c;
                if (jozVar2.i() != null) {
                    Object obj9 = this.b;
                    jan janVar = jgvVar2.i;
                    Context contextAj = a.aj(view);
                    wll wllVarG = jgv.g(jozVar2);
                    wnp wnpVarI2 = jozVar2.i();
                    wnpVarI2.getClass();
                    janVar.s(contextAj, wllVarG, wnpVarI2, (wpm) obj9, false);
                    break;
                }
                break;
            case 4:
                jif jifVar = (jif) this.a;
                jifVar.b.c(view);
                by byVarN2 = ihz.N(view);
                if (byVarN2 != null && (obj2 = this.b) != null) {
                    jifVar.a.a(byVarN2, (ksy) obj2, ((wuh) ((ixi) this.c).b).e);
                    break;
                }
                break;
            case 5:
                jts jtsVar = (jts) this.a;
                wkn wknVar = jtsVar.d.ordinal() != 3 ? wkn.CHECKED : wkn.UNCHECKED;
                ?? r3 = this.c;
                Object obj10 = this.b;
                wknVar.getClass();
                jtsVar.d = wknVar;
                ((jtx) obj10).r(kir.c(jtsVar.d));
                if (r3 != 0) {
                    r3.c(jtsVar.d);
                    break;
                }
                break;
            case 6:
                jwa jwaVar = (jwa) this.a;
                jwaVar.a.c(view);
                by byVarN3 = ihz.N(view);
                if (byVarN3 != null && (obj3 = this.b) != null) {
                    Object obj11 = this.c;
                    ixb ixbVar = jwaVar.b;
                    wls wlsVar = ((wun) ((ixi) obj11).b).c;
                    if (wlsVar == null) {
                        wlsVar = wls.a;
                    }
                    ixbVar.a(byVarN3, (ksy) obj3, wlsVar.b);
                    break;
                }
                break;
            default:
                wun wunVar = (wun) ((ixi) this.c).b;
                wls wlsVar2 = wunVar.c;
                if (wlsVar2 == null) {
                    wlsVar2 = wls.a;
                }
                String str = wlsVar2.b;
                str.getClass();
                wlx wlxVar = wunVar.b;
                if (wlxVar == null) {
                    wlxVar = wlx.a;
                }
                Object obj12 = this.b;
                Object obj13 = this.a;
                wlxVar.getClass();
                jwa jwaVar2 = (jwa) obj12;
                jwaVar2.c.l(str, wlxVar);
                wkg wkgVar = ((wun) ((ixi) obj13).b).i;
                if (wkgVar == null) {
                    wkgVar = wkg.a;
                }
                irc ircVar = jwaVar2.d;
                wkgVar.getClass();
                ircVar.f(wkgVar, view, pjw.b());
                break;
        }
    }

    public /* synthetic */ jgu(jwa jwaVar, jvw jvwVar, jvw jvwVar2, int i) {
        this.d = i;
        this.b = jwaVar;
        this.c = jvwVar;
        this.a = jvwVar2;
    }

    public /* synthetic */ jgu(sbx sbxVar, Object obj, Object obj2, int i) {
        this.d = i;
        this.a = sbxVar;
        this.c = obj;
        this.b = obj2;
    }
}
