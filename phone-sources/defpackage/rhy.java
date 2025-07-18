package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhy implements View.OnClickListener {
    public boolean a;
    final /* synthetic */ rhz b;

    public rhy(rhz rhzVar) {
        this.b = rhzVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void a() {
        ?? r0 = this.b.e;
        if (r0 != 0) {
            r0.run();
        }
        sjl.e(new qxp(this, 13));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a) {
            return;
        }
        this.a = true;
        rhz rhzVar = this.b;
        ?? r2 = rhzVar.d;
        if (r2 != 0) {
            r2.run();
        }
        ?? r1 = rhzVar.c;
        if (r1 != 0) {
            r1.run();
        }
        view.getContext();
        sfy.K(sfy.C(true), new rhx(this, view, 0), czi.e(view.getContext()));
    }
}
