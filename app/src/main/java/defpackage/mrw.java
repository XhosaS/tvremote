package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import com.google.android.libraries.elements.interfaces.IntersectionSubscription;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mrw {
    public final agow a;
    public Set b;

    public mrw(agow agowVar) {
        this.a = agowVar;
    }

    static /* synthetic */ void a(IntersectionSubscription intersectionSubscription) {
        if (intersectionSubscription != null) {
            intersectionSubscription.cancel();
        }
    }

    public final void b(String str, Rect rect, Rect rect2, Rect rect3, boolean z) {
        ((IntersectionEngine) this.a.a()).onSizeChange(str, rect, rect2, rect3, z);
    }

    public final boolean c() {
        Set set = this.b;
        return (set == null || set.isEmpty()) ? false : true;
    }
}
