package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gel implements yjk {
    private final /* synthetic */ int a;

    public /* synthetic */ gel(int i) {
        this.a = i;
    }

    @Override // defpackage.yjk
    public final Object a() {
        Class<?> returnType;
        WindowLayoutComponent windowLayoutComponentC;
        switch (this.a) {
            case 0:
                return ygi.a;
            case 1:
                return ygi.a;
            case 2:
                int i = gft.f;
                return true;
            case 3:
                bcp bcpVar = ghg.a;
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 4:
                String[] strArr = ghu.a;
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 5:
                String[] strArr2 = ghu.a;
                try {
                    Method methodS = gli.s();
                    if (methodS != null && (returnType = methodS.getReturnType()) != null) {
                        Class<?> cls = Integer.TYPE;
                        return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                    }
                } catch (Throwable unused2) {
                }
                return null;
            case 6:
                int i2 = gnp.b;
                try {
                    ClassLoader classLoader = gnq.class.getClassLoader();
                    cvi cviVar = classLoader != null ? new cvi(classLoader, new gna(classLoader)) : null;
                    if (cviVar != null && (windowLayoutComponentC = cviVar.C()) != null) {
                        gna gnaVar = new gna(classLoader);
                        int i3 = gnb.a;
                        int iA = gnb.a();
                        return iA >= 9 ? new gnx(windowLayoutComponentC, gnaVar) : iA >= 6 ? new gnx(windowLayoutComponentC, gnaVar) : iA >= 2 ? new gnx(windowLayoutComponentC, gnaVar) : iA == 1 ? new gnw(windowLayoutComponentC, gnaVar) : new gnv();
                    }
                } catch (Throwable unused3) {
                }
                return null;
            case 7:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 8:
                return new zch();
            case 9:
                int i4 = ics.a;
                return new Handler(Looper.getMainLooper());
            case 10:
                wkx wkxVar = iyd.a;
                return new ixk();
            case 11:
                wkx wkxVar2 = iyd.a;
                return new ixk();
            case 12:
                throw new IllegalStateException("GtvmComposeVisualElements not provided.");
            case 13:
                return new bci("", bcz.c);
            case 14:
                return new bci("", bcz.c);
            case 15:
                return jxm.$r8$lambda$swMqOljlQwRUXgvJY7TvpKtb5RU();
            case 16:
                return a.ak();
            case 17:
                return a.ak();
            case 18:
                return ygi.a;
            case 19:
                return ygi.a;
            default:
                return ygi.a;
        }
    }
}
