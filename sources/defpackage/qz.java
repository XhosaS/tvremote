package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qz implements ctu {
    public static final qz a = new qz();

    @Override // defpackage.ctu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return new ra(viewGroup, 1).a();
        }
        return null;
    }
}
