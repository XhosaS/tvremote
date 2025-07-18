package defpackage;

import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rgu implements rmd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rgu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.rmd
    public final void a(View view) {
        if (this.b == 0) {
            rhd rhdVar = (rhd) this.a;
            qwn qwnVar = rhdVar.a;
            rfg rfgVar = qwnVar.e;
            qwnVar.m.a(view, true != rfgVar.f.e() ? 90575 : 90576);
            rhdVar.d(37);
            tst tstVar = rfgVar.m;
            return;
        }
        String str = qwu.a;
        rhp rhpVar = (rhp) view.findViewById(R.id.og_has_selected_content);
        if (rhpVar != null) {
            sjl.c();
            sij.x(true, "View can be expanded only if account switching is enabled");
            if (rhpVar.m.e()) {
                rhpVar.a(false);
            }
        }
        ((rme) this.a).e(null);
    }
}
