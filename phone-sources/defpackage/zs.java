package defpackage;

import android.view.View;
import com.google.android.videos.R;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zs {
    public static final WeakHashMap a = new WeakHashMap();
    public final wz b;
    public final wz c;
    public final wz d;
    public final wz e;
    public final zr f;
    public final boolean g;
    public int h;
    public final yl i;
    private final wz j = new wz(4, "captionBar");
    private final wz k;
    private final wz l;
    private final wz m;
    private final wz n;
    private final zp o;
    private final zp p;
    private final zp q;
    private final zp r;
    private final zp s;
    private final zp t;
    private final zp u;
    private final zp v;

    public zs(View view) {
        wz wzVar = new wz(128, "displayCutout");
        this.b = wzVar;
        wz wzVar2 = new wz(8, "ime");
        this.c = wzVar2;
        this.k = new wz(32, "mandatorySystemGestures");
        this.l = new wz(2, "navigationBars");
        this.d = new wz(1, "statusBars");
        wz wzVar3 = new wz(519, "systemBars");
        this.e = wzVar3;
        this.m = new wz(16, "systemGestures");
        this.n = new wz(64, "tappableElement");
        this.o = zy.g(csr.a, "waterfall");
        this.f = new zl(new zl(wzVar3, wzVar2), wzVar);
        this.p = zy.g(csr.a, "captionBarIgnoringVisibility");
        this.q = zy.g(csr.a, "navigationBarsIgnoringVisibility");
        this.r = zy.g(csr.a, "statusBarsIgnoringVisibility");
        this.s = zy.g(csr.a, "systemBarsIgnoringVisibility");
        this.t = zy.g(csr.a, "tappableElementIgnoringVisibility");
        this.u = zy.g(csr.a, "imeAnimationTarget");
        this.v = zy.g(csr.a, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.g = bool != null ? bool.booleanValue() : false;
        this.i = new yl(this);
    }

    public static /* synthetic */ void c(zs zsVar, cyh cyhVar) {
        zsVar.j.f(cyhVar);
        zsVar.c.f(cyhVar);
        zsVar.b.f(cyhVar);
        zsVar.l.f(cyhVar);
        zsVar.d.f(cyhVar);
        zsVar.e.f(cyhVar);
        zsVar.m.f(cyhVar);
        zsVar.n.f(cyhVar);
        zsVar.k.f(cyhVar);
        zsVar.p.f(zy.f(cyhVar.g(4)));
        zsVar.q.f(zy.f(cyhVar.g(2)));
        zsVar.r.f(zy.f(cyhVar.g(1)));
        zsVar.s.f(zy.f(cyhVar.g(519)));
        zsVar.t.f(zy.f(cyhVar.g(64)));
        cvb cvbVarJ = cyhVar.j();
        if (cvbVarJ != null) {
            zsVar.o.f(zy.f(cvbVarJ.e()));
        }
        bcm.A();
    }

    public final void a(cyh cyhVar) {
        this.v.f(zy.f(cyhVar.f(8)));
    }

    public final void b(cyh cyhVar) {
        this.u.f(zy.f(cyhVar.f(8)));
    }
}
