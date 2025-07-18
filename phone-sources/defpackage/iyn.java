package defpackage;

import com.google.android.videos.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyn extends sbx {
    private final iyh a;
    private final mjb b;
    private final kmo c;
    private final gag d;
    private final kw e;

    public iyn(kw kwVar, iyh iyhVar, mjb mjbVar, gag gagVar, kmo kmoVar) {
        mjbVar.getClass();
        gagVar.getClass();
        kmoVar.getClass();
        this.e = kwVar;
        this.a = iyhVar;
        this.b = mjbVar;
        this.d = gagVar;
        this.c = kmoVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int i;
        int i2;
        int i3 = ((iym) obj).c;
        if (i3 == 0) {
            throw null;
        }
        if (i3 - 1 != 0) {
            i = R.layout.stream_page_layout_no_swipe;
            i2 = R.layout.stream_page_layout;
        } else {
            i = R.layout.stream_page_layout_model_aware_no_swipe;
            i2 = R.layout.stream_page_layout_model_aware;
        }
        if (true == this.c.d()) {
            i = i2;
        }
        return new iyq(i);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ids, java.lang.Object] */
    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        iym iymVar = (iym) obj;
        iyq iyqVar = (iyq) obj2;
        m(this.b.a);
        iye iyeVar = iymVar.a;
        n(iyeVar);
        kmo kmoVar = this.c;
        m(kmoVar);
        gag gagVar = this.d;
        m(gagVar.b);
        for (Map.Entry entry : iymVar.b.entrySet()) {
            q((rrx) entry.getKey(), entry.getValue());
        }
        iyk iykVar = (iyk) this.a.l(iyeVar);
        boolean z = false;
        if (!yks.e(iyqVar.a, iykVar)) {
            iyqVar.a = iykVar;
            iyqVar.G(0);
        }
        int iL = gagVar.l();
        if (!a.r(iyqVar.e, iL)) {
            iyqVar.e = iL;
            iyqVar.G(4);
        }
        if (kmoVar.d() && iyeVar.f()) {
            z = true;
        }
        if (!yks.e(Boolean.valueOf(iyqVar.c), Boolean.valueOf(z))) {
            iyqVar.c = z;
            iyqVar.G(2);
        }
        if (iyqVar.d) {
            iyqVar.b(iyeVar.i());
        }
        jom jomVar = new jom(iyqVar, iymVar, 1);
        if (yks.e(iyqVar.b, jomVar)) {
            return;
        }
        iyqVar.b = jomVar;
        iyqVar.G(1);
    }
}
