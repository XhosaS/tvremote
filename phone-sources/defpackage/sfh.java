package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sfh {
    protected final Context a;
    private final sft b;

    public sfh(sfg sfgVar) {
        Context context = sfgVar.getContext();
        context.getClass();
        this.a = context;
        this.b = sfgVar.shownAsCenteredDialog() ? new sfn(context) : new sfm(context);
    }

    public View a() {
        return (View) this.b;
    }

    public final void b(View view) {
        this.b.a(view);
    }

    public final void c(sfj sfjVar) {
        this.b.b(sfjVar);
    }

    public final void d(sfj sfjVar) {
        this.b.c(sfjVar);
    }

    public final void e(sfj sfjVar) {
        this.b.d(sfjVar);
    }
}
