package defpackage;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpq implements View.OnKeyListener {
    private final jpr a;

    public jpq(jpr jprVar) {
        this.a = jprVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean z;
        jpr jprVar;
        view.getClass();
        keyEvent.getClass();
        if (i == 21) {
            z = true;
        } else if (i == 1) {
            z = true;
            i = 1;
        } else {
            z = false;
        }
        if (!z || (jprVar = this.a) == null) {
            return z;
        }
        jprVar.aD(i);
        return true;
    }
}
