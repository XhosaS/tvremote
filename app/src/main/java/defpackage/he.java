package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class he implements jv {
    final /* synthetic */ hf a;

    public he(hf hfVar) {
        this.a = hfVar;
    }

    @Override // defpackage.jv
    public final void a(jj jjVar, boolean z) {
        jj jjVarA = jjVar.a();
        jj jjVar2 = jjVarA != jjVar ? jjVarA : jjVar;
        hf hfVar = this.a;
        hd hdVarT = hfVar.t(jjVar2);
        if (hdVarT != null) {
            if (jjVarA == jjVar) {
                hfVar.x(hdVarT, z);
            } else {
                hfVar.v(hdVarT.a, hdVarT, jjVarA);
                hfVar.x(hdVarT, true);
            }
        }
    }

    @Override // defpackage.jv
    public final boolean b(jj jjVar) {
        Window.Callback callback;
        if (jjVar != jjVar.a()) {
            return true;
        }
        hf hfVar = this.a;
        if (!hfVar.y || (callback = hfVar.l.getCallback()) == null || hfVar.F) {
            return true;
        }
        callback.onMenuOpened(108, jjVar);
        return true;
    }
}
