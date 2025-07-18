package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
final class az extends bc {
    private final boolean b;
    private boolean c;
    private bhi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(C0038do c0038do, boolean z) {
        super(c0038do);
        c0038do.getClass();
        this.b = z;
    }

    public final bhi a(Context context) throws Resources.NotFoundException {
        if (this.c) {
            return this.d;
        }
        C0038do c0038do = this.a;
        bhi bhiVarAa = d.aa(context, c0038do.a, c0038do.h == 2, this.b);
        this.d = bhiVarAa;
        this.c = true;
        return bhiVarAa;
    }
}
