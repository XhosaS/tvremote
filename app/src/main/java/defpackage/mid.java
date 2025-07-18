package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.litho.ComponentTree;
import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mid extends FrameLayout {
    public final dvz a;
    public dvn b;
    public oct c;
    private final ocj d;
    private byte[] e;
    private mpc f;
    private aggh g;
    private boolean h;
    private final AtomicReference i;
    private final AtomicReference j;
    private mia k;

    public mid(Context context, ocj ocjVar) {
        super(context);
        this.i = new AtomicReference();
        this.j = new AtomicReference();
        context.getClass();
        this.d = ocjVar;
        oct octVar = ((nza) ocjVar).d;
        this.c = octVar;
        if (octVar == null) {
            this.c = oct.a;
        }
        this.c.a(0);
        dvz dvzVar = new dvz(context);
        this.a = dvzVar;
        super.addView(dvzVar, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void c() {
        aggh agghVar = this.g;
        if (agghVar != null) {
            agghVar.dispose();
            this.g = null;
        }
        dvz dvzVar = this.a;
        dvzVar.y();
        ComponentTree componentTree = dvzVar.getComponentTree();
        if (componentTree != null) {
            componentTree.r();
            dvzVar.v((ComponentTree) null, true);
        }
        dvzVar.w = null;
        dvzVar.v = null;
    }

    private final void d() {
        mpc mpcVar = this.f;
        if (mpcVar != null) {
            mpcVar.dispose();
            this.f = null;
        }
    }

    private final void e() {
        byte[] bArr = this.e;
        if (!this.h || bArr == null) {
            return;
        }
        dvz dvzVar = this.a;
        dvzVar.w = this.k;
        aggh agghVar = new aggh();
        this.g = agghVar;
        ocj ocjVar = this.d;
        nza nzaVar = (nza) ocjVar;
        oce oceVar = nzaVar.c;
        int iA = oceVar.a();
        ofl oflVarC = oceVar.c(iA);
        dzh dzhVar = new dzh();
        dzhVar.d(ocd.class, new ocd(String.valueOf(iA)));
        mpc mpcVar = this.f;
        if (mpcVar != null) {
            dzhVar.d(mpc.class, mpcVar);
        }
        dru druVar = new dru(getContext(), nzaVar.b, new ohv(oceVar.b()), dzhVar);
        oak oakVarO = oal.O();
        nyw nywVar = (nyw) oakVarO;
        nywVar.o = ocjVar;
        nywVar.a = new WeakReference(dvzVar);
        nywVar.e = oflVarC;
        nywVar.t = (String) this.i.get();
        BlockRegistryProvider blockRegistryProvider = (BlockRegistryProvider) this.j.get();
        nywVar.u = blockRegistryProvider == null ? null : new mqm(blockRegistryProvider);
        oal oalVarG = oakVarO.g();
        mic micVar = new mic((oca) nzaVar.a.a(), bArr, agghVar);
        ogs ogsVarAA = ogu.aA(druVar);
        ogsVarAA.d(oalVarG);
        ogsVarAA.c(micVar);
        ogsVarAA.a.a = false;
        dsi dsiVarC = ComponentTree.c(druVar, ogsVarAA.a(), this.b);
        dsiVarC.d = nzaVar.f;
        dsiVarC.j = false;
        tln tlnVar = nzaVar.i;
        if (tlnVar != null) {
            dsiVarC.f = new ogx(tlnVar);
        }
        dvzVar.v(dsiVarC.a(), true);
        if (this.c.b()) {
            dvzVar.v = new mib(this);
        }
    }

    public final void a(hhs hhsVar) {
        mia miaVar = hhsVar == null ? null : new mia(hhsVar);
        this.k = miaVar;
        if (this.h) {
            this.a.w = miaVar;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        throw new UnsupportedOperationException("ElementsView does not support addView");
    }

    public final void b(byte[] bArr) {
        c();
        this.c.a(1);
        d();
        this.e = bArr;
        this.f = null;
        e();
    }

    public ocj getConfig() {
        return this.d;
    }

    public byte[] getElementBytes() {
        return this.e;
    }

    public mpc getElementsViewState() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        c();
        super.onAttachedToWindow();
        this.h = true;
        if (this.f == null) {
            this.f = new mpc();
        }
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.h = false;
        c();
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.view.View
    public void setAccessibilityLiveRegion(int i) {
        this.a.setAccessibilityLiveRegion(i);
    }
}
