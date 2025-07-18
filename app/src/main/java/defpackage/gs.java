package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gs implements jv {
    final /* synthetic */ hf a;

    public gs(hf hfVar) {
        this.a = hfVar;
    }

    @Override // defpackage.jv
    public final void a(jj jjVar, boolean z) {
        this.a.w(jjVar);
    }

    @Override // defpackage.jv
    public final boolean b(jj jjVar) {
        Window.Callback callback = this.a.l.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, jjVar);
        return true;
    }
}
