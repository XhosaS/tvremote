package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jli extends ixi {
    public boolean d;
    private final Context e;

    /* JADX WARN: Illegal instructions before constructor call */
    public jli(Context context, wkx wkxVar) {
        vvd vvdVar = wvc.g;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.e = context;
        this.d = false;
    }

    @Override // defpackage.ixi, defpackage.sbt
    protected final void e() {
        if (i()) {
            this.d = true;
        } else {
            y(jlh.class, new ale(this, (yih) null, 10));
        }
    }

    public final boolean i() {
        return jwq.X(this.e);
    }
}
