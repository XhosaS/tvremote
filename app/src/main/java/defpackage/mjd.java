package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mjd implements ofy {
    private final oco a;

    public mjd(oco ocoVar) {
        this.a = ocoVar;
    }

    private final Typeface c(Context context, String str) {
        try {
            return aco.a(context, str.startsWith("google-sans-text-medium") ? R.font.google_sans_text_medium : str.startsWith("google-sans-text") ? R.font.google_sans_text : str.startsWith("google-sans-medium") ? R.font.google_sans_medium : R.font.google_sans);
        } catch (Resources.NotFoundException e) {
            this.a.d(acsw.LOG_LEVEL_INFO_DEPRECATED, oal.A, e, "Font not found: %s. For steps to resolve this error, please refer to go/elements-android-fonts#heading=h.n4awqg1rbygf.", str);
            return null;
        } catch (RuntimeException e2) {
            this.a.d(acsw.LOG_LEVEL_INFO_DEPRECATED, oal.A, e2, "Failed to load font: %s", str);
            return null;
        }
    }

    @Override // defpackage.ofy
    public final Typeface a(Context context, String str) {
        Typeface typefaceC;
        if (str.startsWith("google-sans") && (typefaceC = c(context, str)) != null) {
            return Typeface.create(typefaceC, str.endsWith("-bold") ? 1 : str.endsWith("-italic") ? 2 : str.endsWith("-bold-italic") ? 3 : 0);
        }
        return null;
    }

    @Override // defpackage.ofy
    public final Typeface b(Context context, String str, int i, boolean z) {
        Typeface typefaceC;
        if (str.startsWith("google-sans") && (typefaceC = c(context, str)) != null) {
            return Typeface.create(typefaceC, i, z);
        }
        return null;
    }
}
