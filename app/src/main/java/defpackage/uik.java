package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uik implements zxe {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Set b;
    final /* synthetic */ yrn c;
    final /* synthetic */ uin d;
    final /* synthetic */ Integer e;
    final /* synthetic */ uio f;

    public uik(uio uioVar, AtomicBoolean atomicBoolean, Set set, yrn yrnVar, uin uinVar, Integer num) {
        this.a = atomicBoolean;
        this.b = set;
        this.c = yrnVar;
        this.d = uinVar;
        this.e = num;
        this.f = uioVar;
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (this.a.get()) {
            this.b.size();
            this.c.a(uio.a);
            return;
        }
        this.b.size();
        uin uinVar = this.d;
        synchronized (uinVar.c) {
            yzq.o(uinVar.b);
        }
        uio.a.convert(this.e.intValue(), this.f.g);
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
    }
}
