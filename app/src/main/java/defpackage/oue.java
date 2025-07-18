package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oue extends bcx {
    public final AtomicBoolean j = new AtomicBoolean(false);

    @Override // defpackage.bcw
    public final void c(bcl bclVar, final bcy bcyVar) {
        super.c(bclVar, new oud(new agux() { // from class: ouc
            @Override // defpackage.agux
            public final Object a(Object obj) {
                if (this.a.j.compareAndSet(true, false)) {
                    bcyVar.a(obj);
                }
                return agpu.a;
            }
        }));
    }

    @Override // defpackage.bcx, defpackage.bcw
    public final void g(Object obj) {
        this.j.set(true);
        super.g(obj);
    }
}
