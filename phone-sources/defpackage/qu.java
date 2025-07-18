package defpackage;

import androidx.compose.foundation.ClickableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qu implements yka {
    final /* synthetic */ rn a;
    final /* synthetic */ boolean b;
    final /* synthetic */ cez c;
    final /* synthetic */ yjk d;

    public qu(rn rnVar, boolean z, cez cezVar, yjk yjkVar) {
        this.a = rnVar;
        this.b = z;
        this.c = cezVar;
        this.d = yjkVar;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bao baoVar = (bao) obj2;
        ((Number) obj3).intValue();
        baoVar.x(-1525724089);
        Object objG = baoVar.g();
        if (objG == ban.a) {
            objG = new kw((byte[]) null, (byte[]) null);
            baoVar.A(objG);
        }
        kw kwVar = (kw) objG;
        bkp bkpVarA = rp.a(bkp.g, kwVar, this.a).a(new ClickableElement(kwVar, null, false, this.b, null, this.c, this.d));
        baoVar.p();
        return bkpVarA;
    }
}
