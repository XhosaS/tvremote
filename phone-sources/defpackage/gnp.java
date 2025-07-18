package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnp {
    static final /* synthetic */ gnp a = new gnp();
    public static final /* synthetic */ int b = 0;
    private static final yft c;

    static {
        int i = ylg.a;
        new ykl(gnq.class).c();
        c = new yga(new gel(6));
    }

    private gnp() {
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.window.sidecar.SidecarInterface, java.lang.Object] */
    public final gnq a(Context context) {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        context.getClass();
        gnu gnuVar = (gnu) c.a();
        if (gnuVar == null) {
            if (goh.a == null) {
                ReentrantLock reentrantLock = goh.b;
                reentrantLock.lock();
                try {
                    if (goh.a == null) {
                        goe goeVar = null;
                        try {
                            gnf gnfVarO = gli.O();
                            if (gnfVarO != null && gnfVarO.compareTo(gnf.a) >= 0) {
                                goe goeVar2 = new goe(context);
                                ?? r6 = goeVar2.a;
                                Method method = (r6 == 0 || (cls4 = r6.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
                                Class<?> returnType = method != null ? method.getReturnType() : null;
                                if (!yks.e(returnType, Void.TYPE)) {
                                    throw new NoSuchMethodException(a.cm(returnType, "Illegal return type for 'setSidecarCallback': "));
                                }
                                if (r6 != 0) {
                                    r6.getDeviceState();
                                }
                                if (r6 != 0) {
                                    r6.onDeviceStateListenersChanged(true);
                                }
                                Method method2 = (r6 == 0 || (cls3 = r6.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
                                Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
                                if (!yks.e(returnType2, SidecarWindowLayoutInfo.class)) {
                                    throw new NoSuchMethodException(a.cm(returnType2, "Illegal return type for 'getWindowLayoutInfo': "));
                                }
                                Method method3 = (r6 == 0 || (cls2 = r6.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                                Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
                                if (!yks.e(returnType3, Void.TYPE)) {
                                    throw new NoSuchMethodException(a.cm(returnType3, "Illegal return type for 'onWindowLayoutChangeListenerAdded': "));
                                }
                                Method method4 = (r6 == 0 || (cls = r6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                                Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
                                if (!yks.e(returnType4, Void.TYPE)) {
                                    throw new NoSuchMethodException(a.cm(returnType4, "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "));
                                }
                                SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                                try {
                                    sidecarDeviceState.posture = 3;
                                } catch (NoSuchFieldError unused) {
                                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                                    Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                                    objInvoke.getClass();
                                    if (((Integer) objInvoke).intValue() != 3) {
                                        throw new Exception("Invalid device posture getter/setter");
                                    }
                                }
                                SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
                                Rect rect = sidecarDisplayFeature.getRect();
                                rect.getClass();
                                sidecarDisplayFeature.setRect(rect);
                                sidecarDisplayFeature.getType();
                                sidecarDisplayFeature.setType(1);
                                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                                try {
                                    List list = sidecarWindowLayoutInfo.displayFeatures;
                                } catch (NoSuchFieldError unused2) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(sidecarDisplayFeature);
                                    SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                                    Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                                    objInvoke2.getClass();
                                    if (!yks.e(arrayList, (List) objInvoke2)) {
                                        throw new Exception("Invalid display feature getter/setter");
                                    }
                                }
                                goeVar = goeVar2;
                            }
                        } catch (Throwable unused3) {
                        }
                        goh.a = new goh(goeVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            gnuVar = goh.a;
            gnuVar.getClass();
        }
        yfm.r(1, 2, 4, 8, 16, 32, 64, 128);
        int i = gnb.a;
        gnb.a();
        return new gnr(gnuVar);
    }
}
