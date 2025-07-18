package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvk extends sbx {
    public final jaf a;
    private final hfw b;

    public jvk(hfw hfwVar, jaf jafVar) {
        jafVar.getClass();
        this.b = hfwVar;
        this.a = jafVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        wow wowVar = ((wud) ixiVar.b).d;
        if (wowVar == null) {
            wowVar = wow.a;
        }
        int iAU = a.aU(wowVar.b);
        if (iAU == 0) {
            iAU = 1;
        }
        int i = iAU - 2;
        jvn jvnVar = new jvn(this.b.a, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.layout.spanning_text_layout : R.layout.spanning_text_heading_start_layout_vertical_spacing : R.layout.spanning_text_body_center_layout : R.layout.spanning_text_body_start_layout : R.layout.spanning_text_heading_start_layout : R.layout.spanning_text_title_center_layout);
        jvnVar.a = new jsi(this, ixiVar, 11);
        jvnVar.b = new jtt(this, ixiVar, 7);
        return jvnVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ixi ixiVar = (ixi) obj;
        jvn jvnVar = (jvn) obj2;
        jvnVar.F(ixiVar.a, new String[0]);
        wls wlsVar = ((wud) ixiVar.b).c;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        wlsVar.getClass();
        if (yks.e(jvnVar.c, wlsVar)) {
            return;
        }
        jvnVar.c = wlsVar;
        jvnVar.G(0);
    }
}
