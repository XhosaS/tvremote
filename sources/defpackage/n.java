package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class n extends v {
    final /* synthetic */ q a;

    public n(q qVar) {
        this.a = qVar;
    }

    @Override // defpackage.v
    public final View a(int i) {
        q qVar = this.a;
        View view = qVar.L;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException(b.b(qVar, "Fragment ", " does not have a view"));
    }

    @Override // defpackage.v
    public final boolean b() {
        return this.a.L != null;
    }
}
