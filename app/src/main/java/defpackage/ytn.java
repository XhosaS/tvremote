package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ytn extends SoftReference implements ytv {
    final yuh a;

    public ytn(ReferenceQueue referenceQueue, Object obj, yuh yuhVar) {
        super(obj, referenceQueue);
        this.a = yuhVar;
    }

    @Override // defpackage.ytv
    public final int a() {
        return 1;
    }

    @Override // defpackage.ytv
    public final ytv b(ReferenceQueue referenceQueue, Object obj, yuh yuhVar) {
        return new ytn(referenceQueue, obj, yuhVar);
    }

    @Override // defpackage.ytv
    public final yuh c() {
        return this.a;
    }

    @Override // defpackage.ytv
    public final Object d() {
        return get();
    }

    @Override // defpackage.ytv
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ytv
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ytv
    public final void e(Object obj) {
    }
}
