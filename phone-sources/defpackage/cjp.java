package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Parcel;
import java.io.File;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cjp implements yjv {
    private final /* synthetic */ int a;

    public /* synthetic */ cjp(int i) {
        this.a = i;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                cjg cjgVar = (cjg) obj;
                ThreadLocal threadLocal = cjq.a;
                return "'" + cjgVar.a + "' " + cjgVar.b;
            case 1:
                cgj cgjVar = (cgj) obj;
                return "[" + cgjVar.a + ", " + cgjVar.b + ')';
            case 2:
                Parcel parcel = (Parcel) obj;
                parcel.getClass();
                return new daa(parcel);
            case 3:
                Parcel parcel2 = (Parcel) obj;
                parcel2.getClass();
                return new obk(parcel2);
            case 4:
                ((Context) obj).getClass();
                return yhb.a;
            case 5:
                File file = (File) obj;
                Set set = dcd.a;
                file.getClass();
                file.getCanonicalFile().getAbsolutePath().getClass();
                return new cvi((byte[]) null, (byte[]) null);
            case 6:
                ((Context) obj).getClass();
                return yhb.a;
            case 7:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                return "  " + ((dde) entry.getKey()).a + " = " + (value instanceof byte[] ? yfm.bs((byte[]) value, ", ", "[", "]", null, 56) : String.valueOf(entry.getValue()));
            case 8:
                long j = ((cmc) obj).a;
                return Float.valueOf(cmc.b(j) * cmc.a(j));
            case 9:
                return Float.valueOf(cmc.b(((cmc) obj).a));
            case 10:
                int i = dmf.a;
                return Boolean.valueOf(!(((djg) obj) instanceof djy));
            case 11:
                djg djgVar = (djg) obj;
                return Boolean.valueOf((djgVar instanceof dsf) || (djgVar instanceof dry) || (djgVar instanceof dks) || (djgVar instanceof djy));
            case 12:
                return Boolean.valueOf(((djg) obj) instanceof dmn);
            case 13:
                ((Integer) obj).intValue();
                return Long.MIN_VALUE;
            case 14:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 15:
                fwb fwbVar = (fwb) obj;
                fwbVar.getClass();
                fwbVar.a = 0;
                fwbVar.b = 0;
                return ygi.a;
            case 16:
                fxr fxrVar = (fxr) obj;
                fxrVar.getClass();
                fxrVar.a = true;
                return ygi.a;
            case 17:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 18:
                dwx dwxVar = fwx.a;
                ((dxj) obj).getClass();
                return new fww();
            case 19:
                fxb fxbVar = (fxb) obj;
                fxbVar.getClass();
                return fxbVar.c;
            default:
                fxb fxbVar2 = (fxb) obj;
                fxbVar2.getClass();
                if (!(fxbVar2 instanceof fxd)) {
                    return null;
                }
                fxd fxdVar = (fxd) fxbVar2;
                return fxdVar.j(fxdVar.h());
        }
    }
}
