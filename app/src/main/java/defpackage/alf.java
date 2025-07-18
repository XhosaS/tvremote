package defpackage;

import android.view.View;
import com.google.android.katniss.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alf {
    public static final alh a(View view) {
        alh alhVar = (alh) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (alhVar != null) {
            return alhVar;
        }
        alh alhVar2 = new alh();
        view.setTag(R.id.pooling_container_listener_holder_tag, alhVar2);
        return alhVar2;
    }

    public static final void b(View view) {
        Iterator itA = new agxw(new ahs(view, null)).a();
        while (itA.hasNext()) {
            a((View) itA.next()).a();
        }
    }
}
