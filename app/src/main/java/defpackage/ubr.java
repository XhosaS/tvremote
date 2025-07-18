package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ubr implements ucm {
    final /* synthetic */ Bundle a;
    final /* synthetic */ ubv b;

    public ubr(ubv ubvVar, Bundle bundle) {
        this.a = bundle;
        this.b = ubvVar;
    }

    @Override // defpackage.ucm
    public final void a(ude udeVar) {
        if (udeVar instanceof ubh) {
            this.b.d(udeVar, this.a);
            ((ubh) udeVar).a();
        }
    }
}
