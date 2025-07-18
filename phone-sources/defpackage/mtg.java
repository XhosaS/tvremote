package defpackage;

import android.app.ActivityManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtg implements idb {
    private final /* synthetic */ int a;
    private final Object b;

    public mtg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, msx] */
    @Override // defpackage.idb
    public final boolean a() {
        return this.a != 0 ? ((ActivityManager) this.b).isInLockTaskMode() : this.b.b();
    }
}
