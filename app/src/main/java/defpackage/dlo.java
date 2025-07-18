package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlo {
    private static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i, Resources.Theme theme) {
        Context context3;
        try {
            if (a) {
                if (theme != null) {
                    ve veVar = new ve(context2, theme);
                    veVar.b(theme.getResources().getConfiguration());
                    context3 = veVar;
                } else {
                    context3 = context2;
                }
                return ra.e().c(context3, i);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        WeakHashMap weakHashMap = aco.a;
        return resources.getDrawable(i, theme);
    }
}
