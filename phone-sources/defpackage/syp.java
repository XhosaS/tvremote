package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.googletv.app.presentation.pages.search.SearchQueryPageActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syp implements TextWatcher {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public syp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.b != 0) {
            String string = editable != null ? editable.toString() : null;
            SearchQueryPageActivity searchQueryPageActivity = (SearchQueryPageActivity) this.a;
            if (yks.e(searchQueryPageActivity.b().b, string)) {
                return;
            }
            keg kegVarB = searchQueryPageActivity.b();
            if (string == null) {
                string = "";
            }
            kegVarB.b = string;
            jth jthVarA = searchQueryPageActivity.b().a();
            String str = searchQueryPageActivity.b().b;
            str.getClass();
            jthVarA.c = true;
            jtj jtjVar = jthVarA.a;
            jtjVar.n = str;
            jtjVar.k(false);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.b != 0) {
            return;
        }
        ((sys) this.a).l.setVisibility(charSequence.length() > 0 ? 0 : 8);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
