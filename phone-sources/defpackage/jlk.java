package defpackage;

import android.content.Context;
import android.support.v7.widget.ActivityChooserView;
import com.google.android.videos.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlk extends sbx {
    public final jaf a;
    private final Context b;
    private final dhq c;

    public jlk(dhq dhqVar, jaf jafVar, Context context, lfn lfnVar) {
        jafVar.getClass();
        lfnVar.getClass();
        this.c = dhqVar;
        this.a = jafVar;
        this.b = context;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jli jliVar = (jli) obj;
        jlp jlpVar = new jlp(this.c.a);
        jlpVar.a = new jeu(this, jliVar, 19);
        jlpVar.b = new jev(this, jliVar, 16);
        return jlpVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        jli jliVar = (jli) obj;
        String str = ((ixi) jliVar).a;
        jlp jlpVar = (jlp) obj2;
        ulp ulpVarR = r();
        boolean z = false;
        jlpVar.F(str, new String[0]);
        wvc wvcVar = (wvc) jliVar.b;
        wls wlsVar = wvcVar.b;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        wls wlsVar2 = wls.a;
        boolean z2 = !yks.e(wlsVar, wlsVar2);
        if (jlpVar.q != z2) {
            jlpVar.q = z2;
            Iterator it = jlpVar.r.iterator();
            while (it.hasNext()) {
                ((sdd) it.next()).a();
            }
        }
        wls wlsVar3 = wvcVar.b;
        if (wlsVar3 == null) {
            wlsVar3 = wlsVar2;
        }
        if (!yks.e(jlpVar.c, wlsVar3)) {
            jlpVar.c = wlsVar3;
            jlpVar.G(0);
        }
        int integer = jliVar.d ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : this.b.getResources().getInteger(R.integer.synopsis_compressed_line_count);
        if (!a.r(jlpVar.j, integer)) {
            jlpVar.j = integer;
            jlpVar.G(7);
        }
        wls wlsVar4 = wvcVar.c;
        if (wlsVar4 == null) {
            wlsVar4 = wlsVar2;
        }
        if (!yks.e(jlpVar.d, wlsVar4)) {
            jlpVar.d = wlsVar4;
            jlpVar.G(1);
        }
        wls wlsVar5 = wvcVar.d;
        if (wlsVar5 == null) {
            wlsVar5 = wlsVar2;
        }
        if (!yks.e(jlpVar.e, wlsVar5)) {
            jlpVar.e = wlsVar5;
            jlpVar.G(2);
        }
        wls wlsVar6 = wvcVar.e;
        if (wlsVar6 == null) {
            wlsVar6 = wlsVar2;
        }
        if (!yks.e(jlpVar.f, wlsVar6)) {
            jlpVar.f = wlsVar6;
            jlpVar.G(3);
        }
        wls wlsVar7 = wvcVar.f;
        if (wlsVar7 != null) {
            wlsVar2 = wlsVar7;
        }
        if (!yks.e(jlpVar.g, wlsVar2)) {
            jlpVar.g = wlsVar2;
            jlpVar.G(4);
        }
        boolean z3 = (jliVar.d || jliVar.i()) ? false : true;
        if (!yks.e(Boolean.valueOf(jlpVar.h), Boolean.valueOf(z3))) {
            jlpVar.h = z3;
            jlpVar.G(5);
        }
        ius iusVar = new ius(ulpVarR, 18);
        if (true == jliVar.d) {
            iusVar = null;
        }
        if (iusVar == null) {
            jlpVar.o = null;
        } else {
            jlpVar.o = new scc("R.id.read_more", jlpVar, iusVar);
        }
        jlpVar.G(13);
        if (jliVar.d && !jliVar.i()) {
            z = true;
        }
        if (!yks.e(Boolean.valueOf(jlpVar.i), Boolean.valueOf(z))) {
            jlpVar.i = z;
            jlpVar.G(6);
        }
        ius iusVar2 = new ius(ulpVarR, 19);
        if (true != jliVar.d) {
            iusVar2 = null;
        }
        if (iusVar2 == null) {
            jlpVar.p = null;
        } else {
            jlpVar.p = new scc("R.id.read_less", jlpVar, iusVar2);
        }
        jlpVar.G(14);
        boolean z4 = jliVar.d;
        if (!yks.e(Boolean.valueOf(jlpVar.k), Boolean.valueOf(z4))) {
            jlpVar.k = z4;
            jlpVar.G(9);
        }
        boolean z5 = jliVar.d;
        if (!yks.e(Boolean.valueOf(jlpVar.l), Boolean.valueOf(z5))) {
            jlpVar.l = z5;
            jlpVar.G(10);
        }
        boolean z6 = jliVar.d;
        if (!yks.e(Boolean.valueOf(jlpVar.m), Boolean.valueOf(z6))) {
            jlpVar.m = z6;
            jlpVar.G(11);
        }
        boolean z7 = jliVar.d;
        if (yks.e(Boolean.valueOf(jlpVar.n), Boolean.valueOf(z7))) {
            return;
        }
        jlpVar.n = z7;
        jlpVar.G(12);
    }
}
