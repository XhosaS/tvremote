package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.google.common.collect.ImmutableList;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgw extends bl {
    public static final tvn a = tvn.n("GnpSdk");
    public Map c;
    public pfs d;
    public Context e;
    public qoj f;
    public pgv g;
    public oyd h;
    public pkg j;
    public ntp k;
    private Handler l;
    private uyv m;
    boolean b = false;
    public Boolean i = false;

    public static pgw a(oyd oydVar, uyv uyvVar) {
        pgw pgwVar = new pgw();
        Bundle bundle = new Bundle();
        bundle.putParcelable("promo_context", oydVar);
        bundle.putInt("theme", uyvVar.d);
        pgwVar.setArguments(bundle);
        return pgwVar;
    }

    private final ydl b(oyd oydVar) {
        uyr uyrVar = oydVar.c.f;
        if (uyrVar == null) {
            uyrVar = uyr.a;
        }
        Map map = this.c;
        uyq uyqVarB = uyq.b(uyrVar.e);
        if (uyqVarB == null) {
            uyqVarB = uyq.UITYPE_NONE;
        }
        yfo yfoVar = (yfo) map.get(uyqVarB);
        if (yfoVar != null) {
            return (ydl) yfoVar.b();
        }
        ((tvk) ((tvk) a.f()).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/dialogs/PromoUiDialogFragment", "getDialogBuilder", 224, "PromoUiDialogFragment.java")).v("DialogBuilder called with a non-dialog uiType: %s", uyrVar);
        this.j.j(oydVar, pfq.FAILED_UNSUPPORTED_UI);
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    private final void c(final nsf nsfVar, final by byVar, final oyd oydVar) {
        ?? r0 = nsfVar.b;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            ((View) r0.get(i)).setOnClickListener(new View.OnClickListener() { // from class: pgu
                /* JADX WARN: Removed duplicated region for block: B:71:0x022d  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onClick(android.view.View r13) {
                    /*
                        Method dump skipped, instructions count: 619
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.pgu.onClick(android.view.View):void");
                }
            });
        }
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            ((owv) ((yfo) qhj.a(context).ab().get(pgw.class)).b()).a(this);
            this.b = true;
        } catch (Exception e) {
            ((tvk) ((tvk) ((tvk) a.g()).i(e)).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/dialogs/PromoUiDialogFragment", "onAttach", '}', "PromoUiDialogFragment.java")).s("Failed to inject members.");
        }
    }

    @Override // defpackage.bl, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.j.i(this.h, uxd.DISMISSED);
    }

    @Override // defpackage.bv, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        ArrayList arrayList;
        uyc uycVarK;
        View viewG;
        super.onConfigurationChanged(configuration);
        ydl ydlVarB = b(this.h);
        if (ydlVarB == null) {
            return;
        }
        by activity = getActivity();
        Dialog dialog = getDialog();
        uyr uyrVar = this.h.c.f;
        if (uyrVar == null) {
            uyrVar = uyr.a;
        }
        uyv uyvVar = this.m;
        nsf nsfVar = null;
        if (activity != null && dialog != null && (viewG = ydlVarB.g(activity, uyrVar, uyvVar, (uycVarK = ydl.k(uyrVar)), (arrayList = new ArrayList()))) != null) {
            if (dialog instanceof sqg) {
                dialog.setContentView(ydl.l(viewG));
            } else {
                dialog.setContentView(viewG);
            }
            ydlVarB.i(activity, dialog, configuration, uycVarK, viewG);
            nsfVar = new nsf(dialog, arrayList);
        }
        if (nsfVar != null) {
            c(nsfVar, getActivity(), this.h);
        } else {
            ((tvk) ((tvk) a.f()).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/dialogs/PromoUiDialogFragment", "onConfigurationChanged", 142, "PromoUiDialogFragment.java")).s("Failed to build dialog.");
            this.j.j(this.h, pfq.FAILED_UNKNOWN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, xcq] */
    @Override // defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        this.l = new Handler();
        this.i = Boolean.valueOf(bundle != null && bundle.getBoolean("IS_IMPRESSION_REPORTED"));
        if (this.b) {
            Bundle arguments = getArguments();
            arguments.setClassLoader(oyd.class.getClassLoader());
            this.h = (oyd) arguments.getParcelable("promo_context");
            this.m = uyv.b(arguments.getInt("theme", uyv.UNSPECIFIED.d));
        }
        uyr uyrVar = this.h.c.f;
        if (uyrVar == null) {
            uyrVar = uyr.a;
        }
        if (Collection.EL.stream((uyrVar.c == 2 ? (uyc) uyrVar.d : uyc.a).i).anyMatch(new pbd(2))) {
            pgv pgvVar = (pgv) new dxa(this).a(pgv.class);
            this.g = pgvVar;
            oyd oydVar = this.h;
            ntp ntpVar = this.k;
            if (pgvVar.a != null || (str = oydVar.b) == null) {
                return;
            }
            uyr uyrVar2 = oydVar.c.f;
            if (uyrVar2 == null) {
                uyrVar2 = uyr.a;
            }
            ImmutableList immutableList = (ImmutableList) Collection.EL.stream((uyrVar2.c == 2 ? (uyc) uyrVar2.d : uyc.a).i).filter(new pbd(3)).collect(ImmutableList.toImmutableList());
            if (immutableList.size() > 1) {
                ((tvk) ((tvk) a.f()).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/dialogs/PromoUiDialogFragment$AuthCustomTabsViewModel", "initializeAndPrefetchAuthToken", 359, "PromoUiDialogFragment.java")).s("Found more than one action with in-app browser redirect, using the first one.");
            }
            uxw uxwVar = (uxw) immutableList.get(0);
            uxs uxsVar = uxwVar.c == 14 ? (uxs) uxwVar.d : uxs.a;
            uyf uyfVar = uxsVar.b == 3 ? (uyf) uxsVar.c : uyf.a;
            vvd vvdVar = (vvd) ntpVar.a;
            pgvVar.a = new qij(((rgq) vvdVar.b).a(), ((qib) vvdVar.a).a(), (qja) vvdVar.c.b(), (qoj) vvdVar.d.b(), str, uyfVar.c);
            uxs uxsVar2 = uxwVar.c == 14 ? (uxs) uxwVar.d : uxs.a;
            if ((uxsVar2.b == 3 ? (uyf) uxsVar2.c : uyf.a).d) {
                qii qiiVar = pgvVar.a;
                tvn tvnVar = qij.a;
                qij qijVar = (qij) qiiVar;
                ((tvk) tvnVar.e()).B("Prefetching auth token for account: %s, url: %s", qijVar.f, qijVar.g);
                if (qijVar.h != null) {
                    ((tvk) tvnVar.e()).s("Auth token job was already started, skipping prefetch");
                } else if (qijVar.a()) {
                    qijVar.h = ykr.o(qijVar.c, null, new oza(qijVar, (yih) null, 11), 3);
                } else {
                    ((tvk) tvnVar.e()).s("Device does not support eCCT, skipping prefetch");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    @Override // defpackage.bl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.app.Dialog onCreateDialog(android.os.Bundle r13) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgw.onCreateDialog(android.os.Bundle):android.app.Dialog");
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("IS_IMPRESSION_REPORTED", this.i.booleanValue());
    }
}
