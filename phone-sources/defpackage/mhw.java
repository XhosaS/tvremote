package defpackage;

import com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.ProviderSelectionMenuFragment;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mhw implements xby {
    final xcq a;
    final xcq b;
    final xcq c;
    private final mif d;

    public mhw(mif mifVar) {
        this.d = mifVar;
        this.a = new imr(mifVar.bj, mifVar.pU, mifVar.tA, 13, (float[]) null);
        xcq xcqVar = mifVar.sS;
        this.b = new jvy(xcqVar, 7);
        this.c = new jvy(xcqVar, 8);
    }

    @Override // defpackage.xby
    public final /* synthetic */ void a(Object obj) {
        ProviderSelectionMenuFragment providerSelectionMenuFragment = (ProviderSelectionMenuFragment) obj;
        mif mifVar = this.d;
        providerSelectionMenuFragment.childFragmentInjector = mifVar.F();
        providerSelectionMenuFragment.providerSelectionMenuModelFactory = new kdj(mifVar.bj, mifVar.pU, mifVar.tA);
        providerSelectionMenuFragment.pageViewModelFactoryFactory = new kdh(this.a);
        kdh kdhVar = new kdh(kdn.a);
        kdh kdhVar2 = new kdh(this.b);
        jan janVar = (jan) mifVar.gw.b();
        jaf jafVar = (jaf) mifVar.tj.b();
        rgq.c(mifVar.a);
        providerSelectionMenuFragment.providerSelectionMenuPresenter = new kdk(kdhVar, new kdp(kdhVar2, janVar, jafVar, mifVar.i(), (kja) mifVar.ua.b()), new kdt(new kdh(this.c)), mifVar.i(), (kja) mifVar.ua.b());
        providerSelectionMenuFragment.viewVisualElements = (pke) mifVar.tg.b();
        providerSelectionMenuFragment.visualElements = (pkg) mifVar.tf.b();
        providerSelectionMenuFragment.dialogVisualElement = mif.aj();
    }
}
