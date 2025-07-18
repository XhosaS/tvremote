package defpackage;

import android.content.res.Resources;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abb implements yjz {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public abb(int i, bdy bdyVar, int i2) {
        this.c = i2;
        this.a = i;
        this.b = bdyVar;
    }

    /* JADX WARN: Type inference failed for: r13v9, types: [bdy, java.lang.Object] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        long j;
        int i = this.c;
        if (i == 0) {
            bao baoVar = (bao) obj;
            int iIntValue = ((Number) obj2).intValue();
            int i2 = iIntValue & 3;
            if (baoVar.L(i2 != 2, iIntValue & 1)) {
                Object obj3 = this.b;
                int i3 = this.a;
                gb gbVarP = ((abc) obj3).a.b.p(i3);
                ((aay) gbVarP.c).b.a(abe.a, Integer.valueOf(i3 - gbVarP.a), baoVar, 6);
            } else {
                baoVar.t();
            }
            return ygi.a;
        }
        if (i == 1) {
            bao baoVar2 = (bao) obj;
            int iIntValue2 = ((Number) obj2).intValue();
            if (baoVar2.L((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                Object obj4 = this.b;
                int i4 = this.a;
                aae aaeVar = (aae) obj4;
                gb gbVarP2 = aaeVar.a.a.p(i4);
                ((aab) gbVarP2.c).a.a(aaeVar.c, Integer.valueOf(i4 - gbVarP2.a), baoVar2, 0);
            } else {
                baoVar2.t();
            }
            return ygi.a;
        }
        bao baoVar3 = (bao) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && baoVar3.K()) {
            baoVar3.t();
        } else {
            bkp bkpVarA = bkp.g.a(zi.c);
            bqh bqhVarY = ccf.y(this.a, baoVar3, 0);
            if (((Boolean) this.b.a()).booleanValue()) {
                baoVar3.x(226883967);
                j = wv.K(baoVar3).s;
                baoVar3.p();
            } else {
                baoVar3.x(226957313);
                j = wv.K(baoVar3).r;
                baoVar3.p();
            }
            rdd.z(bqhVarY, null, bkpVarA, j, baoVar3, 384, 0);
        }
        return ygi.a;
    }

    public abb(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }
}
