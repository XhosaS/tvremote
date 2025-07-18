package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bha extends pe {
    @Override // defpackage.pe
    public final void b(View view, sm smVar) {
        super.b(view, smVar);
        smVar.h(ScrollView.class.getName());
        throw null;
    }

    @Override // defpackage.pe
    public final boolean h(View view, int i, Bundle bundle) {
        if (i == 4096) {
            throw null;
        }
        if (i == 8192) {
            return false;
        }
        return super.h(view, i, bundle);
    }
}
