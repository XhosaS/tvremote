package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ynk implements yjv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ynk(int i) {
        this.b = i;
        this.a = "";
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, yjv] */
    @Override // defpackage.yjv
    public final Object a(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objE;
        switch (this.b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                boolean zL = ylh.L(str);
                Object obj2 = this.a;
                return zL ? str.length() >= ((String) obj2).length() ? str : obj2 : ((String) obj2).concat(str);
            case 1:
                return ((ynh) this.a).b(((Integer) obj).intValue());
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                return ((String) this.a).concat(str2);
            case 3:
                Throwable th = (Throwable) obj;
                int i = ywx.a;
                try {
                    Throwable th2 = (Throwable) this.a.a(th);
                    boolean zE = yks.e(th.getMessage(), th2.getMessage());
                    objE = th2;
                    if (!zE) {
                        boolean zE2 = yks.e(th2.getMessage(), th.toString());
                        objE = th2;
                        if (!zE2) {
                            objE = null;
                        }
                    }
                } catch (Throwable th3) {
                    objE = ybn.e(th3);
                }
                return (Throwable) (true != (objE instanceof yfx) ? objE : null);
            case 4:
                Throwable th4 = (Throwable) obj;
                int i2 = ywx.a;
                Object objNewInstance = ((Constructor) this.a).newInstance(th4.getMessage(), th4);
                objNewInstance.getClass();
                return (Throwable) objNewInstance;
            case 5:
                Throwable th5 = (Throwable) obj;
                int i3 = ywx.a;
                Object objNewInstance2 = ((Constructor) this.a).newInstance(th5.getMessage());
                objNewInstance2.getClass();
                Throwable th6 = (Throwable) objNewInstance2;
                th6.initCause(th5);
                return th6;
            case 6:
                int i4 = ywx.a;
                Object objNewInstance3 = ((Constructor) this.a).newInstance((Throwable) obj);
                objNewInstance3.getClass();
                return (Throwable) objNewInstance3;
            case 7:
                int i5 = ywx.a;
                Object objNewInstance4 = ((Constructor) this.a).newInstance(null);
                objNewInstance4.getClass();
                Throwable th7 = (Throwable) objNewInstance4;
                th7.initCause((Throwable) obj);
                return th7;
            default:
                ((yyk) this.a).d();
                return ygi.a;
        }
    }

    public /* synthetic */ ynk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
