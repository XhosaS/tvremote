package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlu extends ixi {
    public boolean d;
    public boolean e;
    private final Context f;

    /* JADX WARN: Illegal instructions before constructor call */
    public jlu(Context context, wkx wkxVar) {
        vvd vvdVar = wvd.j;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.f = context;
        this.d = false;
        this.e = false;
    }

    @Override // defpackage.ixi, defpackage.sbt
    protected final void e() {
        if (jwq.X(this.f)) {
            this.e = true;
        } else {
            y(jlt.class, new ale(this, (yih) null, 11));
        }
    }
}
