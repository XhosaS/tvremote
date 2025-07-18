package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class toh {
    public final zyg a;
    public final agpc b;

    public toh(zyg zygVar, Context context) {
        zygVar.getClass();
        context.getClass();
        this.a = zygVar;
        this.b = new agpn(new agum() { // from class: tof
            @Override // defpackage.agum
            public final Object a() {
                return this.a.a.eN(wyo.i(new Callable() { // from class: tog
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return (String) afdv.b.eV();
                    }
                }));
            }
        });
    }
}
