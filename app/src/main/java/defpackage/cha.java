package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cha implements chv, coa {
    public static final String a = cbx.d("DelayMetCommandHandler");
    public final Context b;
    public final int c;
    public final ckp d;
    public final chf e;
    public final cic f;
    public int g;
    public final Executor h;
    public final Executor i;
    public PowerManager.WakeLock j;
    public boolean k;
    public final cee l;
    public final ahbm m;
    public volatile ahdl n;
    private final Object o;

    public cha(Context context, int i, chf chfVar, cee ceeVar) {
        this.b = context;
        this.c = i;
        this.e = chfVar;
        this.d = ceeVar.a;
        this.l = ceeVar;
        cjh cjhVar = chfVar.e.l;
        coe coeVar = chfVar.j;
        this.h = coeVar.a;
        this.i = coeVar.d;
        this.m = coeVar.b;
        this.f = new cic(cjhVar);
        this.k = false;
        this.g = 0;
        this.o = new Object();
    }

    public final void a() {
        synchronized (this.o) {
            if (this.n != null) {
                this.n.s(null);
            }
            coc cocVar = this.e.c;
            ckp ckpVar = this.d;
            cocVar.a(ckpVar);
            PowerManager.WakeLock wakeLock = this.j;
            if (wakeLock != null && wakeLock.isHeld()) {
                cbx.c().a(a, "Releasing wakelock " + this.j + "for WorkSpec " + ckpVar);
                this.j.release();
            }
        }
    }

    @Override // defpackage.coa
    public final void b(ckp ckpVar) {
        cbx cbxVarC = cbx.c();
        String str = a;
        Objects.toString(ckpVar);
        cbxVarC.a(str, "Exceeded time limits on execution for ".concat(ckpVar.toString()));
        this.h.execute(new cgy(this));
    }

    @Override // defpackage.chv
    public final void e(cld cldVar, chl chlVar) {
        if (chlVar instanceof chj) {
            this.h.execute(new cgz(this));
        } else {
            this.h.execute(new cgy(this));
        }
    }
}
