package defpackage;

import android.view.View;
import com.google.android.apps.play.movies.mobile.usecase.gtvsetup.ManageServicesActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mqg implements cvq {
    private final /* synthetic */ int a;

    public /* synthetic */ mqg(int i) {
        this.a = i;
    }

    @Override // defpackage.cvq
    public final cyh onApplyWindowInsets(View view, cyh cyhVar) {
        int i = this.a;
        if (i == 0) {
            csr csrVarF = cyhVar.f(519);
            view.setPadding(csrVarF.b, view.getPaddingTop(), csrVarF.d, csrVarF.e);
            return cyh.a;
        }
        if (i == 1) {
            return ManageServicesActivity.m127$r8$lambda$xWNmYme7cZ2yXkfH7XqIGHWDK4(view, cyhVar);
        }
        if (i != 2) {
            return yyh.h(view, cyhVar);
        }
        csr csrVarF2 = cyhVar.f(519);
        view.setPadding(csrVarF2.b, csrVarF2.c, csrVarF2.d, 0);
        return cyh.a;
    }
}
