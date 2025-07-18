package defpackage;

import android.view.View;
import com.google.android.videos.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cec {
    public static final Map a = new LinkedHashMap();

    public static final baw a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof baw) {
            return (baw) tag;
        }
        return null;
    }

    public static final void b(View view, baw bawVar) {
        view.setTag(R.id.androidx_compose_ui_view_composition_context, bawVar);
    }
}
