package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kro extends ksg {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ ksp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kro(ksp kspVar, String str, String str2, Bundle bundle) {
        super(kspVar, true);
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = kspVar;
    }

    @Override // defpackage.ksg
    public final void a() {
        kqz kqzVar = this.d.f;
        kkk.k(kqzVar);
        kqzVar.clearConditionalUserProperty(this.a, this.b, this.c);
    }
}
