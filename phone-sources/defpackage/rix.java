package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rix extends rdd {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    public final /* synthetic */ riy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rix(riy riyVar, View view, int i) {
        super(null, null, null);
        this.a = view;
        this.b = i;
        this.c = riyVar;
    }

    @Override // defpackage.rdd
    public final void b(Object obj) {
        View view = this.a;
        view.post(new fqc(this, view, this.b, obj, 3));
    }
}
