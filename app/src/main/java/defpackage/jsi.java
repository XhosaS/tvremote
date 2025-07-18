package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jsi implements jsf {
    private final Context a;

    public jsi(Context context) {
        this.a = context;
    }

    @Override // defpackage.jsf
    public final jsh a(jsc jscVar) {
        if (new jsc().equals(jscVar)) {
            return new jsh(this.a);
        }
        throw new IllegalArgumentException("Only \"proto\" encoding is supported by firelog1p. Got: ".concat(jscVar.toString()));
    }
}
