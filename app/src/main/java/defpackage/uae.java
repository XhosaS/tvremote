package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uae extends udg implements aeja {
    private aeiq n;
    private volatile aeia o;
    private final Object p = new Object();
    public boolean l = false;

    public uae() {
        this.f.a(new uad(this));
    }

    @Override // defpackage.aeja
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final aeia cO() {
        if (this.o == null) {
            synchronized (this.p) {
                if (this.o == null) {
                    this.o = D();
                }
            }
        }
        return this.o;
    }

    protected aeia D() {
        throw null;
    }

    @Override // defpackage.tt, defpackage.bbz
    public final beg dM() {
        return aehs.a(this, super.dM());
    }

    @Override // defpackage.aeiz
    public final Object dN() {
        return cO().dN();
    }

    @Override // defpackage.udg, defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof aeiz) {
            aeiq aeiqVarC = cO().c();
            this.n = aeiqVarC;
            if (aeiqVarC.a()) {
                this.n.a = em();
            }
        }
    }

    @Override // defpackage.udg, defpackage.gf, defpackage.bw, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        aeiq aeiqVar = this.n;
        if (aeiqVar != null) {
            aeiqVar.a = null;
        }
    }
}
