package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iw implements jw {
    protected final Context a;
    public Context b;
    public jj c;
    public final LayoutInflater d;
    public jv e;
    public jy f;

    public iw(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    public View a(jm jmVar, View view, ViewGroup viewGroup) {
        throw null;
    }

    public abstract void b(jm jmVar, jx jxVar);

    @Override // defpackage.jw
    public void c(Context context, jj jjVar) {
        throw null;
    }

    @Override // defpackage.jw
    public void d(jj jjVar, boolean z) {
        throw null;
    }

    @Override // defpackage.jw
    public final void e(jv jvVar) {
        throw null;
    }

    protected boolean f(ViewGroup viewGroup, int i) {
        throw null;
    }

    @Override // defpackage.jw
    public boolean g() {
        throw null;
    }

    @Override // defpackage.jw
    public boolean h(ke keVar) {
        throw null;
    }

    @Override // defpackage.jw
    public final boolean i(jm jmVar) {
        return false;
    }

    @Override // defpackage.jw
    public final boolean j(jm jmVar) {
        return false;
    }

    public boolean k(jm jmVar) {
        throw null;
    }

    @Override // defpackage.jw
    public void l() {
        throw null;
    }
}
