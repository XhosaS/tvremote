package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvp extends fus {
    final /* synthetic */ fvq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvp(fvq fvqVar) {
        super((byte[]) null);
        this.a = fvqVar;
    }

    @Override // defpackage.fus
    public final void a(String str, Bundle bundle) {
        Objects.toString(bundle);
    }

    @Override // defpackage.fus
    public final void b(Bundle bundle) {
        fvq fvqVar = this.a;
        fvqVar.a = bundle.getString("groupableTitle");
        fvqVar.b = bundle.getString("transferableTitle");
    }
}
