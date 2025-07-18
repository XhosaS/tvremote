package defpackage;

import androidx.window.sidecar.SidecarDisplayFeature;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fyh implements yjv {
    private final /* synthetic */ int a;

    public /* synthetic */ fyh(int i) {
        this.a = i;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                return new fxw(dwn.a((dxj) obj));
            case 1:
                fxi fxiVar = (fxi) obj;
                fxiVar.getClass();
                fxiVar.b = true;
                return ygi.a;
            case 2:
                fxb fxbVar = ((fwr) ((lj) obj).b()).a;
                fxbVar.getClass();
                Iterator itA = fus.h((fyb) fxbVar).a();
                while (itA.hasNext()) {
                    fxb fxbVar2 = (fxb) itA.next();
                    if (fxbVar2 instanceof fyb) {
                    } else if (fxbVar2 instanceof fxz) {
                    }
                }
                return null;
            case 3:
                return ((fwr) obj).d;
            case 4:
                fxb fxbVar3 = (fxb) obj;
                fxbVar3.getClass();
                fxd fxdVar = fxbVar3.c;
                if (fxdVar == null || fxdVar.h() != fxbVar3.b()) {
                    return null;
                }
                return fxbVar3.c;
            case 5:
                fxb fxbVar4 = (fxb) obj;
                fxbVar4.getClass();
                fxd fxdVar2 = fxbVar4.c;
                if (fxdVar2 == null || fxdVar2.h() != fxbVar4.b()) {
                    return null;
                }
                return fxbVar4.c;
            case 6:
                fxb fxbVar5 = (fxb) obj;
                fxbVar5.getClass();
                return Integer.valueOf(fxbVar5.b());
            case 7:
                fxi fxiVar2 = (fxi) obj;
                fxiVar2.getClass();
                fxiVar2.c = true;
                return ygi.a;
            case 8:
                fzh fzhVar = (fzh) obj;
                fzhVar.getClass();
                fzhVar.a();
                return ygi.a;
            case 9:
                WeakReference weakReference = (WeakReference) obj;
                weakReference.getClass();
                return Boolean.valueOf(weakReference.get() == null);
            case 10:
                return Boolean.valueOf(((WeakReference) obj).get() == null);
            case 11:
                yjk yjkVar = (yjk) obj;
                yjkVar.getClass();
                yjkVar.a();
                return ygi.a;
            case 12:
                ((gef) obj).getClass();
                throw new yfv((byte[]) null);
            case 13:
                ghi ghiVar = (ghi) obj;
                ghiVar.getClass();
                return Boolean.valueOf(ghiVar.l());
            case 14:
                ghi ghiVar2 = (ghi) obj;
                int i = gft.f;
                ghiVar2.getClass();
                yia yiaVar = new yia();
                while (ghiVar2.l()) {
                    yiaVar.add(Integer.valueOf((int) ghiVar2.b(0)));
                }
                return wcq.ai(yiaVar);
            case 15:
                SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) obj;
                int i2 = goa.a;
                sidecarDisplayFeature.getClass();
                return Boolean.valueOf(sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2);
            case 16:
                SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) obj;
                int i3 = goa.a;
                sidecarDisplayFeature2.getClass();
                return Boolean.valueOf((sidecarDisplayFeature2.getRect().width() == 0 && sidecarDisplayFeature2.getRect().height() == 0) ? false : true);
            case 17:
                SidecarDisplayFeature sidecarDisplayFeature3 = (SidecarDisplayFeature) obj;
                int i4 = goa.a;
                sidecarDisplayFeature3.getClass();
                return Boolean.valueOf(sidecarDisplayFeature3.getType() != 1 || sidecarDisplayFeature3.getRect().width() == 0 || sidecarDisplayFeature3.getRect().height() == 0);
            case 18:
                SidecarDisplayFeature sidecarDisplayFeature4 = (SidecarDisplayFeature) obj;
                int i5 = goa.a;
                sidecarDisplayFeature4.getClass();
                return Boolean.valueOf(sidecarDisplayFeature4.getRect().left == 0 || sidecarDisplayFeature4.getRect().top == 0);
            case 19:
                Map.Entry entry = (Map.Entry) obj;
                gox goxVar = gox.a;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                sb.append(value);
                return sb.toString();
            default:
                guw guwVar = (guw) obj;
                guwVar.getClass();
                return true != guwVar.e() ? "OneTime" : "Periodic";
        }
    }
}
