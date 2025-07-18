package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oup extends tt implements aeja {
    private aeiq a;
    private volatile aeia c;
    private final Object d = new Object();
    public boolean b = false;

    public oup() {
        this.f.a(new ouo(this));
    }

    @Override // defpackage.aeiz
    public final Object dN() {
        return cO().dN();
    }

    @Override // defpackage.aeja
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final aeia cO() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new aeia(this);
                }
            }
        }
        return this.c;
    }

    @Override // defpackage.tt, defpackage.eq, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof aeiz) {
            aeiq aeiqVarC = cO().c();
            this.a = aeiqVarC;
            if (aeiqVarC.a()) {
                this.a.a = em();
            }
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        aeiq aeiqVar = this.a;
        if (aeiqVar != null) {
            aeiqVar.a = null;
        }
    }
}
