package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kiv implements kiu {
    private final tbb a;

    public kiv(View view, String str) {
        tbb tbbVarN = tbb.n(view, str, 0);
        this.a = tbbVarN;
        View viewFindViewById = tbbVarN.j.findViewById(R.id.snackbar_text);
        viewFindViewById.getClass();
        ((TextView) viewFindViewById).setMaxLines(2);
    }

    @Override // defpackage.kiu
    public final tbb a() {
        return this.a;
    }

    @Override // defpackage.kiu
    public final void b(int i, View.OnClickListener onClickListener) {
        this.a.o(i, onClickListener);
    }

    @Override // defpackage.kiu
    public final void c(float f) {
        System.out.println("doggo y: " + f);
        this.a.j.setTranslationY(f);
    }
}
