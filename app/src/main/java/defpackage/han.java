package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class han extends gf implements aeja {
    private aeiq m;
    private volatile aeia n;
    private final Object o = new Object();
    public boolean l = false;

    public han() {
        this.f.a(new ham(this));
    }

    protected aeia C() {
        throw null;
    }

    @Override // defpackage.aeja
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final aeia cO() {
        if (this.n == null) {
            synchronized (this.o) {
                if (this.n == null) {
                    this.n = C();
                }
            }
        }
        return this.n;
    }

    @Override // defpackage.tt, defpackage.bbz
    public final beg dM() {
        return aehs.a(this, super.dM());
    }

    @Override // defpackage.aeiz
    public final Object dN() {
        return cO().dN();
    }

    @Override // defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof aeiz) {
            aeiq aeiqVarC = cO().c();
            this.m = aeiqVarC;
            if (aeiqVarC.a()) {
                this.m.a = em();
            }
        }
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        aeiq aeiqVar = this.m;
        if (aeiqVar != null) {
            aeiqVar.a = null;
        }
    }
}
