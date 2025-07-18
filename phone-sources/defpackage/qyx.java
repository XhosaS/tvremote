package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qyx implements yjv {
    private final /* synthetic */ int a;

    public /* synthetic */ qyx(int i) {
        this.a = i;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Tap not set");
            case 1:
                ((View) obj).getClass();
                return vrr.b;
            case 2:
                return a.bf(obj);
            case 3:
                return a.bf(obj);
            case 4:
                return a.bf(obj);
            case 5:
                return a.bf(obj);
            case 6:
                return a.bf(obj);
            case 7:
                return a.bf(obj);
            case 8:
                return a.bf(obj);
            case 9:
                obj.getClass();
                return gt.c();
            case 10:
                return Boolean.valueOf(obj == null);
            case 11:
                String str = (String) obj;
                str.getClass();
                return str;
            case 12:
                yij yijVar = (yij) obj;
                if (yijVar instanceof yot) {
                    return (yot) yijVar;
                }
                return null;
            case 13:
                yij yijVar2 = (yij) obj;
                if (yijVar2 instanceof ypw) {
                    return (ypw) yijVar2;
                }
                return null;
            case 14:
                return obj;
            default:
                zhx zhxVar = (zhx) obj;
                zhe zheVar = zhw.b;
                zhxVar.getClass();
                return Boolean.valueOf(wcq.av(zhxVar.a));
        }
    }
}
