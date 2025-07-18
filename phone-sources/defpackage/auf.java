package defpackage;

import android.graphics.Typeface;
import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class auf implements yka {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ auf(clx clxVar, mr mrVar, int i) {
        this.c = i;
        this.a = clxVar;
        this.b = mrVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [clx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, ykb] */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.text.Spannable, java.lang.Object] */
    @Override // defpackage.yka
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        if (i == 0) {
            float fFloatValue = aun.a * (1.0f - ((Number) ((mr) this.b).d()).floatValue());
            long j = ((bna) obj2).a;
            float fCr = this.a.cr(fFloatValue);
            bnj.t((bni) obj, d.u(d.q(j), (Float.floatToRawIntBits(fCr) << 32) | (Float.floatToRawIntBits(fCr) & 4294967295L)));
            return ygi.a;
        }
        if (i != 1) {
            cgs cgsVar = (cgs) obj;
            int iIntValue = ((Integer) obj2).intValue();
            int iIntValue2 = ((Integer) obj3).intValue();
            ciy ciyVar = cgsVar.f;
            cji cjiVar = cgsVar.c;
            if (cjiVar == null) {
                cjiVar = cji.e;
            }
            cje cjeVar = cgsVar.d;
            int i2 = cjeVar != null ? cjeVar.a : 0;
            ?? r4 = this.a;
            ?? r5 = this.b;
            cje cjeVar2 = new cje(i2);
            cjf cjfVar = cgsVar.e;
            r5.setSpan(new cij((Typeface) r4.a(ciyVar, cjiVar, cjeVar2, new cjf())), iIntValue, iIntValue2, 33);
            return ygi.a;
        }
        Object obj4 = this.b;
        bsz bszVar = (bsz) obj;
        bsz bszVar2 = (bsz) obj2;
        bmx bmxVar = (bmx) obj3;
        ty tyVar = (ty) obj4;
        tyVar.f = 0L;
        if (((Boolean) tyVar.b.a(bszVar)).booleanValue()) {
            if (!tyVar.e) {
                if (tyVar.d == null) {
                    tyVar.d = vyf.R(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0, 6);
                }
                tyVar.e = true;
                ykr.q(((bko) obj4).F(), null, 0, new gat(tyVar, (yih) null, 1), 3);
            }
            bty.f((btv) this.a, bszVar);
            long jAt = a.at(bszVar2.c, bmxVar.a);
            yrz yrzVar = tyVar.d;
            if (yrzVar != null) {
                yrzVar.b(new tm(jAt));
            }
        }
        return ygi.a;
    }

    public /* synthetic */ auf(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
