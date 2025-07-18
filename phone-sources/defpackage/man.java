package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class man {
    private static final lfd e = new mam();
    private static final lfd f = new mal();
    public final idf c;
    public final Context d;
    public final lzh b = new lzh(e, new lxt(this, 15));
    public final lzh a = new lzh(f, new lxt(this, 16));

    public man(Context context, idf idfVar, mfa mfaVar) {
        this.d = context;
        idh idhVarD = idh.d();
        idhVarD.e(new ltu(20));
        idhVarD.e(kzj.i);
        idhVarD.e(idfVar);
        this.c = idhVarD.b(new jxt(new lvw(mfaVar), 8));
    }

    public final idf a() {
        return new lqs(this.b, this.c, 7, null);
    }
}
