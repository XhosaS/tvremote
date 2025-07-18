package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zhh extends zhw {
    public static final zhh a = new zhh(zhy.a);
    public final AtomicReference b;

    public zhh(zhw zhwVar) {
        this.b = new AtomicReference(zhwVar);
    }

    @Override // defpackage.zhw
    public final zfx a() {
        return ((zhw) this.b.get()).a();
    }

    @Override // defpackage.zhw
    public final zih b() {
        return ((zhw) this.b.get()).b();
    }

    @Override // defpackage.zhw
    public final void c(String str, Level level, boolean z) {
        ((zhw) this.b.get()).c(str, level, z);
    }
}
