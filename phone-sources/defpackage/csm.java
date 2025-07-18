package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class csm {
    public static Handler getHandler(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }

    public final void callbackFailAsync(int i, Handler handler) {
        getHandler(handler).post(new csl(this, i, 0));
    }

    public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
        getHandler(handler).post(new be(this, typeface, 13));
    }

    /* renamed from: onFontRetrievalFailed, reason: merged with bridge method [inline-methods] */
    public abstract void m339xb24343b7(int i);

    /* renamed from: onFontRetrieved, reason: merged with bridge method [inline-methods] */
    public abstract void m340x46c88379(Typeface typeface);
}
