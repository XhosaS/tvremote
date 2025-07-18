package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class krn extends ksg {
    final /* synthetic */ Bundle a;
    final /* synthetic */ ksp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krn(ksp kspVar, Bundle bundle) {
        super(kspVar, true);
        this.a = bundle;
        this.b = kspVar;
    }

    @Override // defpackage.ksg
    public final void a() {
        kqz kqzVar = this.b.f;
        kkk.k(kqzVar);
        kqzVar.setConditionalUserProperty(this.a, this.f);
    }
}
