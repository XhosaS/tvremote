package kotlinx.coroutines.android;

import android.os.Build;
import defpackage.yid;
import defpackage.yil;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AndroidExceptionPreHandler extends yid implements CoroutineExceptionHandler {
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.d);
        this._preHandler = this;
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(yil yilVar, Throwable th) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i >= 28) {
            return;
        }
        Method methodPreHandler = preHandler();
        Object objInvoke = methodPreHandler != null ? methodPreHandler.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
