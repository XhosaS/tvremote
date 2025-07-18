package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lhg extends ksw {
    public Handler a;
    public boolean b;
    protected final lhf c;
    protected final lhe d;
    protected final lhc e;

    public lhg(lbk lbkVar) {
        super(lbkVar);
        this.b = true;
        this.c = new lhf(this);
        this.d = new lhe(this);
        this.e = new lhc(this);
    }

    @Override // defpackage.ksw
    protected final boolean f() {
        return false;
    }

    public final void i() {
        g();
        if (this.a == null) {
            this.a = new kos(Looper.getMainLooper());
        }
    }
}
