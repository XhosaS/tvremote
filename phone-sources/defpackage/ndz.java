package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ndz implements ndx {
    private final Context a;

    public ndz(Context context) {
        this.a = context;
    }

    @Override // defpackage.ndx
    public final pkg a(String str, ndt ndtVar, ndw ndwVar) {
        if (new ndt().equals(ndtVar)) {
            return new pkg(this.a, str, ndwVar);
        }
        throw new IllegalArgumentException("Only \"proto\" encoding is supported by firelog1p. Got: ".concat(ndtVar.toString()));
    }
}
