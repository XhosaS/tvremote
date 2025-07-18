package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eq extends Activity implements bcl, aga {
    private final bco a;

    public eq() {
        new wx(0);
        this.a = new bco(this);
    }

    @Override // defpackage.aga
    public final boolean cL(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int[] iArr = ahj.a;
        return agb.a(this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int[] iArr = ahj.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public bcg ek() {
        return this.a;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bdj.a.b(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        this.a.f(bcf.c);
        super.onSaveInstanceState(bundle);
    }
}
