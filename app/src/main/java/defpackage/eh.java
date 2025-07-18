package defpackage;

import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eh {
    public final eo a(ViewGroup viewGroup, de deVar) {
        viewGroup.getClass();
        ct ctVarAb = deVar.ab();
        ctVarAb.getClass();
        return b(viewGroup, ctVarAb);
    }

    public final eo b(ViewGroup viewGroup, ct ctVar) {
        ctVar.getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof eo) {
            return (eo) tag;
        }
        ba baVar = new ba(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, baVar);
        return baVar;
    }
}
