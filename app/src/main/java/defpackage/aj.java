package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aj extends am {
    private final boolean b;
    private boolean c;
    private bx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(en enVar, boolean z) {
        super(enVar);
        enVar.getClass();
        this.b = z;
    }

    public final bx a(Context context) throws Resources.NotFoundException {
        if (this.c) {
            return this.d;
        }
        en enVar = this.a;
        bx bxVarA = bz.a(context, enVar.a, enVar.h == 2, this.b);
        this.d = bxVarA;
        this.c = true;
        return bxVarA;
    }
}
