package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scd implements View.OnLongClickListener {
    private final String a;
    private final scf b;
    private final scj c;

    public scd(String str, scf scfVar, scj scjVar) {
        this.a = str;
        this.b = scfVar;
        this.c = scjVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        view.getClass();
        try {
            return this.c.a(this.b, view);
        } catch (Exception e) {
            throw new IllegalStateException("OnLongClick error on " + this.a + " in " + this.b.g(), e);
        }
    }
}
