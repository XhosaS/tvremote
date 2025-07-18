package defpackage;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aiq extends aip {
    public aiq(View view) {
        super(view);
    }

    @Override // defpackage.aip
    public final void d(KeyEvent keyEvent) {
        a().dispatchKeyEventFromInputMethod(this.a, keyEvent);
    }
}
