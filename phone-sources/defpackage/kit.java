package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kit implements kiu {
    public final tbb a;
    private final View b;
    private final TextView c;
    private final MaterialButton d;
    private final MaterialButton e;

    public kit(View view, String str) {
        tbb tbbVarN = tbb.n(view, str, -2);
        this.a = tbbVarN;
        TextView textView = (TextView) tbbVarN.j.findViewById(R.id.snackbar_text);
        textView.setMaxLines(2);
        textView.setImportantForAccessibility(2);
        textView.setVisibility(8);
        tay tayVar = tbbVarN.j;
        tayVar.getClass();
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(R.layout.accessibility_snackbar, (ViewGroup) view, false);
        viewInflate.getClass();
        this.b = viewInflate;
        ((Snackbar$SnackbarLayout) tayVar).addView(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.snackbar_description_view);
        viewFindViewById.getClass();
        TextView textView2 = (TextView) viewFindViewById;
        this.c = textView2;
        textView2.setText(str);
        View viewFindViewById2 = viewInflate.findViewById(R.id.action_button_view);
        viewFindViewById2.getClass();
        this.d = (MaterialButton) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.dismiss_button_view);
        viewFindViewById3.getClass();
        this.e = (MaterialButton) viewFindViewById3;
    }

    @Override // defpackage.kiu
    public final tbb a() {
        return this.a;
    }

    @Override // defpackage.kiu
    public final void b(int i, View.OnClickListener onClickListener) {
        Context context = this.a.i;
        context.getClass();
        MaterialButton materialButton = this.d;
        materialButton.setVisibility(0);
        materialButton.setText(context.getText(i));
        materialButton.setContentDescription(context.getText(i));
        materialButton.setOnClickListener(new kis(this, onClickListener));
        jwq.W(materialButton);
        MaterialButton materialButton2 = this.e;
        materialButton2.setVisibility(0);
        materialButton2.setText(context.getText(R.string.snackbar_dismissal));
        materialButton2.setOnClickListener(new kis(this, null));
    }

    @Override // defpackage.kiu
    public final void c(float f) {
        this.a.j.setTranslationY(f);
    }
}
