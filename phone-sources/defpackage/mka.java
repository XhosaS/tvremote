package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mka implements mjm {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mka(mjl mjlVar, int i) {
        this.b = i;
        this.a = mjlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mjx] */
    @Override // defpackage.mjm
    public final void a(mjw mjwVar) {
        if (this.b != 0) {
            ((mjl) this.a).R(mjwVar);
            return;
        }
        ?? r0 = this.a;
        mkc mkcVar = (mkc) r0;
        mjw mjwVar2 = mkcVar.d;
        if (mjwVar2 != 0) {
            mjwVar2.m(r0);
            mkcVar.k();
            mkcVar.j(true);
        }
        mkcVar.d = mjwVar;
        mjw mjwVar3 = mkcVar.d;
        if (mjwVar3 != 0) {
            mjwVar3.i(r0);
        }
        krf.b();
        Iterator it = mkcVar.c.iterator();
        while (it.hasNext()) {
            ((mkf) it.next()).e();
        }
        mkcVar.p();
        mkcVar.s();
        mkcVar.t();
    }

    public mka(mkc mkcVar, int i) {
        this.b = i;
        this.a = mkcVar;
    }
}
