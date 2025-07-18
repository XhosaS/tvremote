package defpackage;

import android.app.AlertDialog;
import android.os.Bundle;
import com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity;
import com.google.common.collect.UnmodifiableIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kad implements lhg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kad(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v32, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, lio] */
    /* JADX WARN: Type inference failed for: r5v41, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r5v58, types: [iea, java.lang.Object] */
    @Override // defpackage.lhg
    public final void a(lhf lhfVar) {
        switch (this.b) {
            case 0:
                GtvHomePageActivity.m120$r8$lambda$gti0KXPSZtQw9mCL2uTIwOK6To((GtvHomePageActivity) this.a, (mos) lhfVar);
                return;
            case 1:
                this.a.a((mvn) lhfVar);
                return;
            case 2:
                GtvHomePageActivity.$r8$lambda$qPTCPOBrel_c45fiuhjYARodMKg((GtvHomePageActivity) this.a, (mot) lhfVar);
                return;
            case 3:
                this.a.q(false);
                return;
            case 4:
                this.a.c(Boolean.valueOf(((mzt) lhfVar).a));
                return;
            case 5:
                this.a.c(ieg.f(((mzr) lhfVar).a));
                return;
            case 6:
                Object obj = this.a;
                new AlertDialog.Builder(((bv) obj).getContext()).setCancelable(true).setTitle("Movie AssetId: ".concat(((mmk) obj).f.o().b)).setPositiveButton("Ok", new ixr(9)).create().show();
                return;
            case 7:
                nai naiVar = (nai) lhfVar;
                nqq.d(naiVar.b);
                ((mmk) this.a).b(ksy.m(naiVar.a));
                return;
            case 8:
                myp mypVar = (myp) lhfVar;
                nqq.d(mypVar.b);
                ((mmk) this.a).b(mypVar.a);
                return;
            case 9:
                this.a.c(Boolean.valueOf(((mzt) lhfVar).a));
                return;
            case 10:
                this.a.c(Boolean.valueOf(((mzt) lhfVar).a));
                return;
            case 11:
                this.a.c(ieg.f(((mzr) lhfVar).a));
                return;
            case 12:
                mxo mxoVar = ((mxh) lhfVar).a;
                mxe mxeVar = mxoVar.c;
                ?? A = this.a.a();
                A.d(mnu.d(mxeVar));
                UnmodifiableIterator it = mxoVar.b.iterator();
                while (it.hasNext()) {
                    A.d(mnu.d((mxe) it.next()));
                }
                return;
            case 13:
                this.a.c(Boolean.valueOf(!((Boolean) r5.a()).booleanValue()));
                return;
            case 14:
                ?? r0 = this.a;
                mxw mxwVar = (mxw) lhfVar;
                if (((ieg) r0.a()).m() && ((Integer) ((ieg) r0.a()).g()).intValue() == mxwVar.a) {
                    r0.c(ieg.a);
                    return;
                } else {
                    r0.c(ieg.f(Integer.valueOf(mxwVar.a)));
                    return;
                }
            case 15:
                myj myjVar = ((myf) lhfVar).a;
                ((lhm) this.a).d(myjVar.a, myjVar.b, myjVar.c, myjVar.d);
                return;
            case 16:
                this.a.edit().putBoolean(krh.SHOW_FAMILY_SHARING_CONFIRMATION_DIALOG_FOR_SHOWS, !((myg) lhfVar).a).apply();
                return;
            case 17:
                mzl mzlVar = ((mzj) lhfVar).a;
                Bundle bundle = new Bundle();
                bundle.putParcelable("season_picker_viewmodel", mzlVar);
                mzi mziVar = new mzi();
                mziVar.setArguments(bundle);
                mziVar.show((cr) this.a.a(), "season picker dialog");
                return;
            default:
                ?? r5 = this.a;
                if (((ieg) r5.a()).m()) {
                    throw null;
                }
                return;
        }
    }
}
