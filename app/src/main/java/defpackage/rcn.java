package defpackage;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rcn extends rci implements quz, rcc {
    public final qux a;
    public final aehf b;
    public final aehf c;
    public final rcu d;
    public final rcv e;
    public final AtomicReference f;
    private final zyh g;

    public rcn(quy quyVar, zyh zyhVar, final aehf aehfVar, aehf aehfVar2, agow agowVar, rcu rcuVar, rcy rcyVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.f = atomicReference;
        this.g = zyhVar;
        this.b = aehfVar;
        this.c = aehfVar2;
        this.d = rcuVar;
        this.a = quyVar.a(zyhVar, new aehf() { // from class: rcj
            @Override // defpackage.aehf
            public final Object a() {
                rcd rcdVarF = rce.f();
                ((rbv) rcdVarF).c = 3;
                return rcdVarF.b();
            }
        }, agowVar);
        this.e = rcyVar.a(new agow() { // from class: rck
            @Override // defpackage.agow
            public final Object a() {
                return 10;
            }
        });
        atomicReference.set(rcuVar.a(1.0f));
    }

    @Override // defpackage.rcc
    public final zyd a(String str, String str2) {
        if (true != TextUtils.isEmpty(str2)) {
            str = str2;
        }
        int i = rco.a;
        yqw.L(!TextUtils.isEmpty(str));
        final rch rchVar = (rch) rco.c.getAndSet(null);
        if (rchVar != null) {
            rchVar.b.b = str;
        }
        return rchVar == null ? zxy.a : zxn.l(new zvh() { // from class: rcm
            /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
            @Override // defpackage.zvh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.zyd a() {
                /*
                    Method dump skipped, instructions count: 321
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rcm.a():zyd");
            }
        }, this.g);
    }

    @Override // defpackage.rcc
    public final void b() {
        rch rchVar = (rch) rco.c.getAndSet(null);
        if (rchVar != null) {
            String str = rchVar.b.b;
        }
    }

    @Override // defpackage.rcc
    public final void c(String str, long j, long j2) {
        rch rchVar;
        if (TextUtils.isEmpty(str) || j2 <= 0 || (rchVar = (rch) rco.c.get()) == null || rchVar.b.c > j) {
            return;
        }
        rby rbyVar = new rby(str, j, j + j2, Thread.currentThread().getId(), 4);
        List list = rchVar.d;
        synchronized (list) {
            list.add(rbyVar);
        }
        rchVar.a.incrementAndGet();
    }

    @Override // defpackage.rcc
    public final boolean d(String str) {
        if (!((rct) this.f.get()).a()) {
            return false;
        }
        int i = rco.a;
        str.getClass();
        AtomicReference atomicReference = rco.c;
        if (atomicReference.get() == null) {
            rch rchVar = new rch(str);
            while (!atomicReference.compareAndSet(null, rchVar)) {
                if (atomicReference.get() != null) {
                }
            }
            rco.a = 5;
            rco.b = 1000;
            return true;
        }
        return false;
    }

    @Override // defpackage.quz
    public final void k() {
        this.g.execute(new Runnable() { // from class: rcl
            @Override // java.lang.Runnable
            public final void run() {
                rcn rcnVar = this.a;
                try {
                    AtomicReference atomicReference = rcnVar.f;
                    rcu rcuVar = rcnVar.d;
                    aehf aehfVar = rcnVar.c;
                    atomicReference.set(rcuVar.a(((rce) aehfVar.a()).c() ? ((rce) aehfVar.a()).d() : 0.0f));
                } catch (Throwable unused) {
                    rcnVar.f.set(rcnVar.d.a(0.0f));
                }
            }
        });
    }
}
