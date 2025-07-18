package defpackage;

import android.app.Dialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.View;
import com.google.android.apps.googletv.app.presentation.pages.entitymenu.EntityMenuFragment;
import com.google.android.apps.googletv.app.presentation.pages.genericstreamdialog.GenericStreamDialogFragment;
import com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.ProviderSelectionMenuFragment;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jzo implements pnq {
    public final /* synthetic */ AppCompatDialogFragment a;
    private final /* synthetic */ int b;

    public /* synthetic */ jzo(AppCompatDialogFragment appCompatDialogFragment, int i) {
        this.b = i;
        this.a = appCompatDialogFragment;
    }

    @Override // defpackage.pnq
    public final void a(Dialog dialog, View view) {
        int i = this.b;
        if (i == 0) {
            GenericStreamDialogFragment.onCreateReplayDialogView$lambda$1((GenericStreamDialogFragment) this.a, dialog, view);
            return;
        }
        if (i == 1) {
            EntityMenuFragment.onCreateDialogView$lambda$0((EntityMenuFragment) this.a, dialog, view);
            return;
        }
        if (i == 2) {
            ProviderSelectionMenuFragment.onCreateReplayDialogView$lambda$1((ProviderSelectionMenuFragment) this.a, dialog, view);
            return;
        }
        kfz kfzVar = (kfz) this.a;
        pke pkeVar = kfzVar.g;
        pkg pkgVar = null;
        if (pkeVar == null) {
            yks.c("viewVisualElements");
            pkeVar = null;
        }
        pkg pkgVar2 = kfzVar.f;
        if (pkgVar2 == null) {
            yks.c("visualElements");
        } else {
            pkgVar = pkgVar2;
        }
        pkeVar.e(view, pkgVar.a(168183));
    }

    @Override // defpackage.pnq
    public final /* synthetic */ void b(bl blVar) {
        int i = this.b;
        if (i == 0) {
            qtl.ae(blVar);
            return;
        }
        if (i == 1) {
            qtl.ae(blVar);
        } else if (i != 2) {
            qtl.ae(blVar);
        } else {
            qtl.ae(blVar);
        }
    }
}
