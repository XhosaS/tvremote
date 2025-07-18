package defpackage;

import com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jze implements ysy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jze(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v19, types: [bcb, java.lang.Object] */
    @Override // defpackage.ysy
    public final /* synthetic */ Object emit(Object obj, yih yihVar) {
        switch (this.b) {
            case 0:
                ((iyd) this.a).i((ihz) obj);
                break;
            case 1:
                ((iyd) this.a).i((ihz) obj);
                break;
            case 2:
                ((iyd) this.a).i((ihz) obj);
                break;
            case 3:
                GtvHomePageActivity.access$processResponse((GtvHomePageActivity) this.a, (ihz) obj);
                break;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                jxo jxoVar = obj2 instanceof jxo ? (jxo) obj2 : null;
                if (jxoVar != null) {
                    jxoVar.i(zBooleanValue);
                }
                break;
            case 5:
                ((iyd) this.a).i((ihz) obj);
                break;
            case 6:
                ((iyd) this.a).i((ihz) obj);
                break;
            case 7:
                if (((Boolean) obj).booleanValue()) {
                    ((bml) this.a).a(new lo(10));
                }
                break;
            case 8:
                if (((Boolean) obj).booleanValue()) {
                    ((bml) this.a).a(new lo(10));
                }
                break;
            case 9:
                if (((Boolean) obj).booleanValue()) {
                    ((kiq) this.a).c(kgp.a);
                } else {
                    ((kiq) this.a).c(kgn.a);
                }
                break;
            case 10:
                this.a.b(Boolean.valueOf(((Boolean) obj).booleanValue()));
                break;
            case 11:
                Map map = (Map) obj;
                qxh qxhVar = (qxh) this.a;
                qxhVar.c = map;
                qxh.a(qxhVar, null, null, null, null, null, map, null, 191);
                break;
            case 12:
                List list = (List) obj;
                qxh qxhVar2 = (qxh) this.a;
                qxhVar2.d = list;
                qxh.a(qxhVar2, null, null, null, list, null, null, null, 247);
                break;
            case 13:
                qxh.a((qxh) this.a, null, null, (vqp) obj, null, null, null, null, 251);
                break;
            case 14:
                qxh qxhVar3 = (qxh) this.a;
                qyc qycVar = qxhVar3.a;
                Object objB = qycVar.a.q.B((voy) obj, qycVar.d, qycVar.b, qycVar.c, qxhVar3.i, yihVar);
                if (objB != yio.a) {
                    break;
                }
                break;
            case 15:
                qxh qxhVar4 = (qxh) this.a;
                qxhVar4.h = (List) obj;
                qxh.a(qxhVar4, null, null, null, null, null, null, qxhVar4.h, 127);
                break;
            default:
                vqs vqsVar = (vqs) obj;
                qxh qxhVar5 = (qxh) this.a;
                qxhVar5.e = vqsVar;
                qxh.a(qxhVar5, null, null, null, null, vqsVar, null, null, 223);
                break;
        }
        return ygi.a;
    }
}
