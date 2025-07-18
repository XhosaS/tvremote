package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ui {
    public bhc a;
    private final Runnable b;

    public ui() {
        this(null);
    }

    public static final agpu a(ui uiVar) {
        Runnable runnable = uiVar.b;
        if (runnable != null) {
            runnable.run();
        }
        return agpu.a;
    }

    public final void b(bcl bclVar, ue ueVar) {
        bclVar.getClass();
        ueVar.getClass();
        bcg bcgVarEk = bclVar.ek();
        if (bcgVarEk.a() == bcf.a) {
            return;
        }
        uh uhVar = new uh(ueVar, this, bcgVarEk);
        bcgVarEk.b(uhVar);
        ueVar.d.add(uhVar);
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        final bhh bhhVar = new bhh(this.a);
        bhhVar.b = onBackInvokedDispatcher;
        bhhVar.a.e = new agum() { // from class: bhf
            @Override // defpackage.agum
            public final Object a() {
                bhhVar.a();
                return agpu.a;
            }
        };
        bhhVar.a();
    }

    public ui(Runnable runnable) {
        this.b = runnable;
        this.a = new bhc(new uf(this), new agux() { // from class: ug
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ((Boolean) obj).booleanValue();
                return agpu.a;
            }
        });
    }
}
