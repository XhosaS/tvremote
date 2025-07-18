package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbn {
    public static final cbn a = new cbn();

    private cbn() {
    }

    public static final PointerIcon b(Context context, bsw bswVar) {
        if (!(bswVar instanceof bsi)) {
            return bswVar instanceof bsj ? PointerIcon.getSystemIcon(context, ((bsj) bswVar).a) : PointerIcon.getSystemIcon(context, 1000);
        }
        throw null;
    }

    public final void a(View view, bsw bswVar) {
        PointerIcon pointerIconB = b(view.getContext(), bswVar);
        if (yks.e(view.getPointerIcon(), pointerIconB)) {
            return;
        }
        view.setPointerIcon(pointerIconB);
    }
}
