package defpackage;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes.dex */
class cvx extends cwk {
    private final View a;

    public cvx(View view) {
        this.a = view;
    }

    @Override // defpackage.cwk
    public void a() {
        View view = this.a;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // defpackage.cwk
    public void b() {
        View viewFindViewById;
        View view = this.a;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new caw(viewFindViewById, 9));
    }
}
