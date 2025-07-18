package defpackage;

import android.view.View;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mry {
    public static Set a(View view, int i) {
        Object tag = view.getTag(i);
        if (!(tag instanceof mrx)) {
            tag = new mrx();
            view.setTag(i, tag);
        }
        return (mrx) tag;
    }
}
