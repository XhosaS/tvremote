package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pic implements pfr {
    private static final tvn b = tvn.n("GnpSdk");
    public final pfn a;
    private final Context c;
    private final yow d;
    private final oxp e;

    public pic(Context context, pfn pfnVar, yow yowVar, oxp oxpVar) {
        pfnVar.getClass();
        oxpVar.getClass();
        this.c = context;
        this.a = pfnVar;
        this.d = yowVar;
        this.e = oxpVar;
    }

    private final void d(oyd oydVar, pfq pfqVar) {
        ykr.q(this.d, null, 0, new pfo(this, oydVar, pfqVar, (yih) null, 5), 3);
    }

    @Override // defpackage.pfr
    public final View a(by byVar, uyr uyrVar) {
        uyrVar.getClass();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pfr
    public final void b(by byVar, View view, oyd oydVar, uyv uyvVar) {
        tvn tvnVar = b;
        tvnVar.l().s("rendering a permission prompt.");
        uyr uyrVar = oydVar.c.f;
        if (uyrVar == null) {
            uyrVar = uyr.a;
        }
        uyrVar.getClass();
        uyo uyoVar = uyrVar.c == 6 ? (uyo) uyrVar.d : uyo.a;
        uyoVar.getClass();
        uyn uynVar = uyoVar.e;
        if (uynVar == null) {
            uynVar = uyn.b;
        }
        vul vulVar = new vul(uynVar.c, uyn.a);
        if (vulVar.isEmpty()) {
            tvnVar.l().s("must set a permission type.");
            d(oydVar, pfq.FAILED_INVALID_PROMOTION);
            return;
        }
        if (vulVar.size() > 1) {
            tvnVar.l().s("GrowthKit only supports a single permission type, ignoring the rest.");
        }
        T t = vulVar.get(0);
        t.getClass();
        String strA = osk.A((uvu) t);
        if (qtl.C(this.c, strA)) {
            ((tvk) tvnVar.g()).v("Permissions for %s are already granted.", strA);
            d(oydVar, pfq.NOT_NEEDED_PERMISSION_GRANTED);
            return;
        }
        boolean zShouldShowRequestPermissionRationale = byVar.shouldShowRequestPermissionRationale(strA);
        tvnVar.l().D("shouldShowRequestPermissionRationale returned %s for %s.", zShouldShowRequestPermissionRationale, strA);
        if (!zShouldShowRequestPermissionRationale || uyoVar.c) {
            if (uyrVar.f) {
                d(oydVar, pfq.SUCCESS);
                return;
            }
            this.e.i(oydVar);
            tvn tvnVar2 = pie.a;
            pie pieVarAf = rdd.af(oydVar);
            at atVar = new at(byVar.getSupportFragmentManager());
            atVar.r(pieVarAf, "PermissionRequestFrag");
            atVar.l();
            ykr.q(this.d, null, 0, new pfd(this, oydVar, (yih) null, 7), 3);
            return;
        }
        try {
            uyc uycVar = uyoVar.d;
            if (uycVar == null) {
                uycVar = uyc.a;
            }
            uyv uyvVarAi = rdd.ai(uyvVar, uycVar);
            if (uyrVar.f) {
                d(oydVar, pfq.SUCCESS);
            } else {
                this.e.i(oydVar);
                pgw.a(oydVar, uyvVarAi).show(byVar.getSupportFragmentManager(), "PromoUiDialogFragment");
            }
        } catch (pgf unused) {
            d(oydVar, pfq.FAILED_THEME_NOT_FOUND);
        }
    }

    @Override // defpackage.pfr
    public final boolean c(uyq uyqVar) {
        uyqVar.getClass();
        return uyqVar == uyq.UITYPE_PERMISSION;
    }
}
