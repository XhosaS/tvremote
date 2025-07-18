package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mqy implements View.OnClickListener {
    private final /* synthetic */ int a;
    private final Object b;

    public mqy(View view, int i) {
        this.a = i;
        this.b = view;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [idy, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a == 0) {
            this.b.c(ieg.a);
            return;
        }
        Object obj = this.b;
        if (obj != null) {
            jwq.W((View) obj);
        }
    }

    public mqy(idy idyVar, int i) {
        this.a = i;
        this.b = idyVar;
    }
}
