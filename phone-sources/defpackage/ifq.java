package defpackage;

import android.content.Context;
import android.widget.Toast;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifq implements ixf {
    public final isw a;
    private final yow b;

    public ifq(yow yowVar, isw iswVar) {
        iswVar.getClass();
        this.b = yowVar;
        this.a = iswVar;
    }

    public static final void c(Context context, int i) {
        Toast.makeText(context, i, 0).show();
    }

    @Override // defpackage.ixf
    public final void a(wkg wkgVar, Context context, String str, String str2) {
        ykr.q(this.b, null, 0, new ifp(wkgVar, this, str2, context, null), 3);
    }

    @Override // defpackage.ixf
    public final /* synthetic */ void b() {
    }
}
