package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mde implements mcy {
    public final kuw a;
    private final lie b;
    private final Executor c;
    private final kuw d;

    public mde(kuw kuwVar, lie lieVar, kuw kuwVar2, Executor executor) {
        kuwVar.getClass();
        lieVar.getClass();
        executor.getClass();
        this.d = kuwVar;
        this.b = lieVar;
        this.a = kuwVar2;
        this.c = executor;
    }

    @Override // defpackage.mcy
    public final void a(ksn ksnVar, ksy ksyVar, boolean z, int i, String str) throws Throwable {
        str.getClass();
        xay xayVarN = ksyVar.n();
        xayVarN.getClass();
        String str2 = ksyVar.b;
        krf.c(str2);
        this.b.ao(str2, xayVarN, z, i, str);
        ylb ylbVar = new ylb();
        ykr.n(yim.a, new mdt((mdw) this.d.b, str2, xayVarN.s, z, ksnVar.a, ylbVar, null));
        if (ylbVar.a) {
            this.c.execute(new ljl(this, 14, null));
            krd.e("Wishlist upload was triggered.");
        }
    }
}
