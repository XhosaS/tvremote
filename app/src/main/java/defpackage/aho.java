package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aho implements agxs {
    public final /* synthetic */ ViewGroup a;

    public aho(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // defpackage.agxs
    public final Iterator a() {
        return new ahq(this.a);
    }
}
