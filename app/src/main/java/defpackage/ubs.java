package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ubs implements ucm {
    final /* synthetic */ Bundle a;
    final /* synthetic */ ubv b;

    public ubs(ubv ubvVar, Bundle bundle) {
        this.a = bundle;
        this.b = ubvVar;
    }

    @Override // defpackage.ucm
    public final void a(ude udeVar) {
        if (udeVar instanceof ubl) {
            this.b.d(udeVar, this.a).getClass();
            ((ubl) udeVar).a();
        }
    }
}
