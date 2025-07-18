package defpackage;

import androidx.compose.foundation.selection.SelectableElement;
import androidx.compose.foundation.selection.ToggleableElement;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aef implements yka {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public aef(List list, boolean z, klm klmVar, List list2, boolean z2, int i) {
        this.f = i;
        this.d = list;
        this.a = z;
        this.c = klmVar;
        this.e = list2;
        this.b = z2;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, rn] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, rn] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        if (i == 0) {
            bao baoVar = (bao) obj2;
            ((Number) obj3).intValue();
            baoVar.x(-1525724089);
            Object objG = baoVar.g();
            if (objG == ban.a) {
                objG = new kw((byte[]) null, (byte[]) null);
                baoVar.A(objG);
            }
            kw kwVar = (kw) objG;
            bkp bkpVarA = rp.a(bkp.g, kwVar, this.c).a(new ToggleableElement(this.a, kwVar, null, this.b, (cez) this.d, this.e));
            baoVar.p();
            return bkpVarA;
        }
        if (i == 1) {
            bao baoVar2 = (bao) obj2;
            ((Number) obj3).intValue();
            baoVar2.x(-1525724089);
            Object objG2 = baoVar2.g();
            if (objG2 == ban.a) {
                objG2 = new kw((byte[]) null, (byte[]) null);
                baoVar2.A(objG2);
            }
            kw kwVar2 = (kw) objG2;
            bkp bkpVarA2 = rp.a(bkp.g, kwVar2, this.c).a(new SelectableElement(this.a, kwVar2, null, false, this.b, (cez) this.d, this.e));
            baoVar2.p();
            return bkpVarA2;
        }
        bao baoVar3 = (bao) obj2;
        ((Number) obj3).intValue();
        ((dse) obj).getClass();
        int i2 = 0;
        for (Object obj4 : this.d) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                yfm.w();
            }
            woy woyVar = (woy) obj4;
            djh djhVarA = this.a ? dse.a(cyf.k(djh.b, 8.0f, 0.0f, 8.0f, 8.0f, 2)) : dse.a(cyf.l(djh.b));
            boolean z = this.b;
            ?? r5 = this.e;
            ((klm) this.c).m(woyVar, djhVarA, (djl) r5.get(i2), z, baoVar3, 0);
            i2 = i3;
        }
        return ygi.a;
    }

    public aef(rn rnVar, boolean z, boolean z2, cez cezVar, Object obj, int i) {
        this.f = i;
        this.c = rnVar;
        this.a = z;
        this.b = z2;
        this.d = cezVar;
        this.e = obj;
    }
}
