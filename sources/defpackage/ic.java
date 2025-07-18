package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ic extends hz implements ia {
    public static Method a;
    public ia b;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public ic(Context context, int i) {
        super(context, null, i, null);
    }

    @Override // defpackage.hz
    public final hf p(Context context, boolean z) {
        ib ibVar = new ib(context, z);
        ibVar.e = this;
        return ibVar;
    }
}
