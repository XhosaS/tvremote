package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
class adx implements Runnable {
    final /* synthetic */ aeo a;
    final /* synthetic */ Typeface b;

    public adx(aeo aeoVar, Typeface typeface) {
        this.a = aeoVar;
        this.b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acm acmVar = ((acx) this.a).a;
        if (acmVar != null) {
            acmVar.a(this.b);
        }
    }
}
