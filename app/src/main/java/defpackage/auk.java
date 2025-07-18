package defpackage;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class auk implements View.OnKeyListener {
    final /* synthetic */ aul a;

    public auk(aul aulVar) {
        this.a = aulVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i == 4) {
            return this.a.eg().Y();
        }
        return false;
    }
}
