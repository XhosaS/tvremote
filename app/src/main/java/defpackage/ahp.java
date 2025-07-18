package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahp implements agux {
    public static final ahp a = new ahp();

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return new ahq(new aho(viewGroup).a);
        }
        return null;
    }
}
