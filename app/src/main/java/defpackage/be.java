package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class be extends ca {
    final /* synthetic */ ca a;
    final /* synthetic */ bf b;

    public be(bf bfVar, ca caVar) {
        this.b = bfVar;
        this.a = caVar;
    }

    @Override // defpackage.ca
    public final View a(int i) {
        ca caVar = this.a;
        if (caVar.b()) {
            return caVar.a(i);
        }
        Dialog dialog = this.b.c;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.ca
    public final boolean b() {
        return this.a.b() || this.b.f;
    }
}
