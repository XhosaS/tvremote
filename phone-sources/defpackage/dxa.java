package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxa {
    public static final dxi a = new dwm();
    public final iom b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dxa(dxc dxcVar, dwx dwxVar) {
        this(dxcVar, dwxVar, dxh.a);
        dxcVar.getClass();
    }

    public final dwt a(Class cls) {
        return b(wef.q(cls));
    }

    public final dwt b(ymh ymhVar) {
        String strG = dhf.g(ymhVar);
        if (strG != null) {
            return this.b.F(ymhVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strG));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public dxa(dxc dxcVar, dwx dwxVar, dxj dxjVar) {
        dxcVar.getClass();
        dwxVar.getClass();
        dxjVar.getClass();
        this.b = new iom(dxcVar, dwxVar, dxjVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public dxa(dxd dxdVar) {
        dwx defaultViewModelProviderFactory;
        dxdVar.getClass();
        dxc viewModelStore = dxdVar.getViewModelStore();
        if (dxdVar instanceof duz) {
            defaultViewModelProviderFactory = ((duz) dxdVar).getDefaultViewModelProviderFactory();
        } else {
            defaultViewModelProviderFactory = dxo.a;
        }
        this(viewModelStore, defaultViewModelProviderFactory, dhf.e(dxdVar));
    }

    public dxa(dxd dxdVar, dwx dwxVar) {
        this(dxdVar.getViewModelStore(), dwxVar, dhf.e(dxdVar));
    }
}
