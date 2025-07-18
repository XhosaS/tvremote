package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpl implements vhi {
    public final Context a;
    public final zyg b;
    private final zyg c;

    public vpl(Context context, zyg zygVar, zyg zygVar2) {
        this.a = context;
        this.c = zygVar;
        this.b = zygVar2;
    }

    @Override // defpackage.vhi
    public final zyd a(vhj vhjVar) {
        return zxn.l(new zvh() { // from class: vpk
            @Override // defpackage.zvh
            public final zyd a() throws Throwable {
                vpl vplVar = this.a;
                final cyg cygVarA = cyg.a(vplVar.a);
                if (!dqm.h()) {
                    throw new IllegalArgumentException("You must call this method on a background thread");
                }
                cygVarA.a.d.a().b();
                zyg zygVar = vplVar.b;
                cygVarA.getClass();
                return zygVar.submit(new Runnable() { // from class: vpj
                    @Override // java.lang.Runnable
                    public final void run() {
                        cygVarA.d();
                    }
                });
            }
        }, this.c);
    }
}
