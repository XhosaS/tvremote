package defpackage;

import android.app.Service;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class pmo extends Service implements aeja {
    private volatile aeis a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.aeja
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aeis cO() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new aeis(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.aeiz
    public final Object dN() {
        return cO().dN();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            ((pmn) this).a = (pjn) ((etn) cO().dN()).b.jM.a();
        }
        super.onCreate();
    }
}
