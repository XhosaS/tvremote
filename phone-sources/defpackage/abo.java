package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abo implements yjv {
    private final /* synthetic */ int n;
    public static final abo m = new abo(12);
    public static final abo l = new abo(11);
    public static final abo k = new abo(10);
    public static final abo j = new abo(9);
    public static final abo i = new abo(8);
    public static final abo h = new abo(7);
    public static final abo g = new abo(6);
    public static final abo f = new abo(5);
    public static final abo e = new abo(4);
    public static final abo d = new abo(3);
    public static final abo c = new abo(2);
    public static final abo b = new abo(1);
    public static final abo a = new abo(0);

    public abo(int i2) {
        this.n = i2;
    }

    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        switch (this.n) {
            case 0:
                ((Number) obj).intValue();
                return null;
            case 1:
                ((Number) obj).intValue();
                return null;
            case 2:
                View view = (View) obj;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    return new cxb(viewGroup, 1).a();
                }
                return null;
            case 3:
                return Boolean.valueOf(((djg) obj) instanceof djp);
            case 4:
                return Boolean.valueOf(((djg) obj) instanceof diq);
            case 5:
                return Boolean.valueOf(((djg) obj) instanceof diq);
            case 6:
                return Boolean.valueOf(((djg) obj) instanceof dir);
            case 7:
                return Boolean.valueOf(((djg) obj) instanceof djp);
            case 8:
                Exception exc = (Exception) obj;
                exc.getClass();
                return Boolean.valueOf(exc instanceof xtl);
            case 9:
                return Boolean.valueOf(obj instanceof otv);
            default:
            case 10:
            case 11:
                return null;
        }
    }
}
