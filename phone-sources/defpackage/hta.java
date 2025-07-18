package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hta {
    private static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i, Resources.Theme theme) {
        Context context3;
        try {
            if (a) {
                if (theme != null) {
                    hc hcVar = new hc(context2, theme);
                    hcVar.a(theme.getResources().getConfiguration());
                    context3 = hcVar;
                } else {
                    context3 = context2;
                }
                return AppCompatResources.getDrawable(context3, i);
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
        ThreadLocal threadLocal = cso.a;
        return resources.getDrawable(i, theme);
    }
}
