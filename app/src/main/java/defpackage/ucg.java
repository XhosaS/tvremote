package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ucg extends ucn {
    public ucm a;
    public ucm b;
    public ucm c;
    public ucm d;

    @Override // defpackage.ucn
    public final void a() {
        super.a();
        ucm ucmVar = this.b;
        if (ucmVar != null) {
            l(ucmVar);
            this.b = null;
        }
        ucm ucmVar2 = this.d;
        if (ucmVar2 != null) {
            l(ucmVar2);
            this.d = null;
        }
    }

    public final void c(Bundle bundle) {
        ucf ucfVar = new ucf(this, bundle);
        m(ucfVar);
        this.c = ucfVar;
    }
}
