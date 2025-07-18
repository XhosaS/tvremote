package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scc implements View.OnClickListener {
    private final String a;
    private final scf b;
    private final sch c;

    public scc(String str, scf scfVar, sch schVar) {
        this.a = str;
        this.b = scfVar;
        this.c = schVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        try {
            this.c.a(this.b, view);
        } catch (Exception e) {
            throw new IllegalStateException("OnClick error on " + this.a + " in " + this.b.g(), e);
        }
    }
}
