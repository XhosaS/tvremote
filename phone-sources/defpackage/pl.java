package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class pl implements yjv {
    private final /* synthetic */ int a;

    public /* synthetic */ pl(int i) {
        this.a = i;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                return Float.valueOf(((na) obj).a);
            case 1:
                nd ndVar = (nd) obj;
                return new bmy(ndVar.a, ndVar.b, ndVar.c, ndVar.d);
            case 2:
                ((byu) obj).r();
                return ygi.a;
            case 3:
                return ygi.a;
            case 4:
                ((Long) obj).longValue();
                return ygi.a;
            case 5:
                bhu bhuVar = (bhu) obj;
                int i = ql.a;
                Context context = (Context) bcm.h(bhuVar, AndroidCompositionLocals_androidKt.b);
                clx clxVar = (clx) bcm.h(bhuVar, ccq.d);
                sa saVar = (sa) bcm.h(bhuVar, sb.a);
                if (saVar == null) {
                    return null;
                }
                return new qk(context, clxVar, saVar.a, saVar.b);
            case 6:
                cfk.j((cfc) obj, cey.a);
                return ygi.a;
            case 7:
                return new sj(((Integer) obj).intValue());
            case 8:
                return !((Context) bcm.h((bhu) obj, AndroidCompositionLocals_androidKt.b)).getPackageManager().hasSystemFeature("android.software.leanback") ? ta.b : td.b;
            case 9:
                return true;
            case 10:
                ((Long) obj).longValue();
                return ygi.a;
            case 11:
                return Boolean.valueOf(!a.r(((bsz) obj).i, 2));
            case 12:
                return ygi.a;
            case 13:
                return ygi.a;
            case 14:
                return ygi.a;
            case 15:
                ((Integer) obj).intValue();
                return null;
            case 16:
                return ygi.a;
            case 17:
                List list = (List) obj;
                return new aan(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 18:
                return ygi.a;
            case 19:
                return ygi.a;
            default:
                List list2 = (List) obj;
                return new abw(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
        }
    }
}
