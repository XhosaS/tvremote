package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brz extends bko implements bry {
    public yjv a;
    public yjv b;

    public brz(yjv yjvVar, yjv yjvVar2) {
        this.a = yjvVar;
        this.b = yjvVar2;
    }

    @Override // defpackage.bry
    public final boolean s(KeyEvent keyEvent) {
        yjv yjvVar = this.a;
        if (yjvVar != null) {
            return ((Boolean) yjvVar.a(new brw(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.bry
    public final boolean t(KeyEvent keyEvent) {
        yjv yjvVar = this.b;
        if (yjvVar != null) {
            return ((Boolean) yjvVar.a(new brw(keyEvent))).booleanValue();
        }
        return false;
    }
}
