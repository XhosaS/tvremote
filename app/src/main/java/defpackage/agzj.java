package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agzj implements agxs {
    final /* synthetic */ CharSequence a;

    public agzj(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.agxs
    public final Iterator a() {
        return new agyr(this.a);
    }
}
