package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import com.google.android.videos.R;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jir extends sbx {
    public final jaf a;
    public final ino b;
    public final Context c;
    public final isi d;
    private final ihi e;
    private final iof f;
    private final idf g;
    private final cxe h;

    public jir(cxe cxeVar, ihi ihiVar, jaf jafVar, iof iofVar, isi isiVar, idf idfVar, ino inoVar, Context context) {
        jafVar.getClass();
        iofVar.getClass();
        isiVar.getClass();
        inoVar.getClass();
        this.h = cxeVar;
        this.e = ihiVar;
        this.a = jafVar;
        this.f = iofVar;
        this.d = isiVar;
        this.g = idfVar;
        this.b = inoVar;
        this.c = context;
    }

    public static final void e(Context context, int i) {
        Toast.makeText(context, i, 0).show();
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jil jilVar = (jil) obj;
        jiv jivVar = new jiv();
        jivVar.a = new jeu(this, jilVar, 10);
        jivVar.b = new jev(this, jilVar, 8);
        return jivVar;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        final wni wniVar;
        ieg iegVar;
        boolean z;
        final jil jilVar = (jil) obj;
        final jiv jivVar = (jiv) obj2;
        wni wniVar2 = (wni) p(jef.f);
        wll wllVarI = jilVar.i();
        iof iofVar = this.f;
        wni wniVarP = ihz.p(iofVar.e(wllVarI));
        if (wniVar2 != null) {
            wniVar = wniVar2;
        } else if (wniVarP == null) {
            wniVar2 = wni.a;
            wniVar2.getClass();
            wniVar = wniVar2;
        } else {
            wniVar = wniVarP;
        }
        int iAU = a.aU(wniVar.c);
        if (iAU != 0 && iAU == 3) {
            idf idfVar = this.g;
            ksy ksyVarR = hju.r(wniVar);
            ksyVarR.getClass();
            Object objB = idfVar.b(ksyVarR);
            objB.getClass();
            iegVar = (ieg) objB;
        } else {
            iegVar = ieg.a;
            iegVar.getClass();
        }
        Collection<ksy> collectionT = iegVar.m() ? ((kvf) iegVar.g()).t() : yhb.a;
        final ylb ylbVar = new ylb();
        boolean zE = false;
        if (collectionT.isEmpty()) {
            z = false;
        } else {
            for (ksy ksyVar : collectionT) {
                ksyVar.getClass();
                if (jilVar.j(hju.t(ksyVar))) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        ylbVar.a = z;
        if (this.e.d()) {
            ylbVar.a = this.b.c(wniVar) != null;
        }
        m(iofVar.a(jilVar.i()));
        wniVar.getClass();
        boolean z2 = jilVar.f;
        m(z2 ? jilVar.e.b(wniVar) : jilVar.g);
        jivVar.F(((ixi) jilVar).a, new String[0]);
        jivVar.t(jilVar.j(wniVar));
        wniVar.getClass();
        jivVar.s(hju.v(wniVar) ? false : z2 ? jilVar.e.G(wniVar) : jilVar.g.g(((ldy) jilVar.d).a(), hju.r(wniVar)).d());
        boolean zJ = jilVar.j(wniVar);
        if (jivVar.g != zJ) {
            jivVar.g = zJ;
            Iterator it = jivVar.h.iterator();
            while (it.hasNext()) {
                ((sdd) it.next()).a();
            }
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: jip
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(final CompoundButton compoundButton, final boolean z3) {
                cr supportFragmentManager;
                int iAU2;
                cr supportFragmentManager2;
                compoundButton.getClass();
                final jir jirVar = this.a;
                Context context = jirVar.c;
                if (jwq.X(context) || compoundButton.isPressed()) {
                    if (!jwq.X(context) || compoundButton.isAccessibilityFocused()) {
                        final jiv jivVar2 = jivVar;
                        final jil jilVar2 = jilVar;
                        final wni wniVar3 = wniVar;
                        if (z3 && (iAU2 = a.aU(wniVar3.c)) != 0 && iAU2 == 4 && !jirVar.d.i.j) {
                            by byVarN = ihz.N(compoundButton);
                            if (byVarN == null || (supportFragmentManager2 = byVarN.getSupportFragmentManager()) == null) {
                                return;
                            }
                            jzl jzlVar = new jzl();
                            jzlVar.a = new jin(jirVar, compoundButton, wniVar3, jilVar2, jivVar2, 0);
                            jzlVar.b = new izc(jivVar2, 10);
                            jzlVar.show(supportFragmentManager2, "family_sharing_dialog_tag");
                            return;
                        }
                        if (!ylbVar.a || jirVar.d.i.o) {
                            jirVar.d(compoundButton, wniVar3, z3, jilVar2, jivVar2);
                            return;
                        }
                        by byVarN2 = ihz.N(compoundButton);
                        if (byVarN2 == null || (supportFragmentManager = byVarN2.getSupportFragmentManager()) == null) {
                            return;
                        }
                        jzk jzkVar = new jzk();
                        jzkVar.a = new yjk() { // from class: jio
                            @Override // defpackage.yjk
                            public final Object a() {
                                jirVar.d(compoundButton, wniVar3, z3, jilVar2, jivVar2);
                                return ygi.a;
                            }
                        };
                        jzkVar.b = new aew(jivVar2, z3, 2);
                        Bundle bundle = new Bundle();
                        inm inmVarC = jirVar.b.c(wniVar3);
                        bundle.putString("dialog_bundle_title", inmVarC != null ? inmVarC.b : null);
                        bundle.putBoolean("dialog_bundle_share", z3);
                        jzkVar.setArguments(bundle);
                        jzkVar.show(supportFragmentManager, "family_sharing_bundle_dialog_tag");
                    }
                }
            }
        };
        if (!yks.e(jivVar.d, onCheckedChangeListener)) {
            jivVar.d = onCheckedChangeListener;
            jivVar.G(2);
        }
        wniVar.getClass();
        if (!hju.v(wniVar) && z2) {
            zE = jilVar.e.E(wniVar);
        }
        jivVar.r(zE);
        jivVar.e = new scc("R.id.show_sharing_add_button", jivVar, new jiq(this, wniVar, jilVar, jivVar, 1));
        jivVar.G(4);
        jivVar.f = new scc("R.id.show_sharing_remove_all_button", jivVar, new jiq(this, wniVar, jilVar, jivVar, 0));
        jivVar.G(5);
    }

    public final void d(View view, wni wniVar, boolean z, jil jilVar, jiv jivVar) {
        if (z != jivVar.c) {
            jivVar.t(false);
            jivVar.s(z);
            if (this.e.b()) {
                Context context = view.getContext();
                context.getClass();
                e(context, z ? R.string.menu_sharing_asset : R.string.menu_unsharing_asset);
            }
            ykr.q(yoz.m(), null, 0, new avp(jilVar, wniVar, z, this, (yih) null, 2), 3);
        }
    }
}
