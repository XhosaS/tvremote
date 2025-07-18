package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mwd implements mwb {
    public final tbb a;
    private final View b;
    private final TextView c;
    private final Button d;
    private final Button e;

    public mwd(View view, String str) {
        tbb tbbVarN = tbb.n(view, str, -2);
        this.a = tbbVarN;
        TextView textView = (TextView) tbbVarN.j.findViewById(R.id.snackbar_text);
        textView.setMaxLines(2);
        textView.setImportantForAccessibility(2);
        Snackbar$SnackbarLayout snackbar$SnackbarLayout = (Snackbar$SnackbarLayout) tbbVarN.j;
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(R.layout.accessibility_snackbar, (ViewGroup) null);
        this.b = viewInflate;
        snackbar$SnackbarLayout.addView(viewInflate);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.snackbar_description_view);
        this.c = textView2;
        textView2.setText(str);
        this.d = (Button) viewInflate.findViewById(R.id.action_button_view);
        this.e = (Button) viewInflate.findViewById(R.id.dismiss_button_view);
    }

    private static final void i(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.setMargins(0, layoutParams.topMargin, 0, layoutParams.bottomMargin);
        button.setLayoutParams(layoutParams);
        button.setTextAlignment(6);
        button.setPadding(0, button.getPaddingTop(), 0, button.getPaddingBottom());
        button.setGravity(5);
    }

    private static final void j(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, 0, layoutParams.rightMargin, 0);
        button.setLayoutParams(layoutParams);
        button.setPadding(button.getPaddingLeft(), 0, button.getPaddingRight(), 0);
        button.setGravity(16);
    }

    @Override // defpackage.mwb
    public final tbb a() {
        return this.a;
    }

    @Override // defpackage.mwb
    public final void b() {
        tay tayVar = this.a.j;
        Resources resources = tayVar.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tayVar.getLayoutParams();
            marginLayoutParams.rightMargin = resources.getDimensionPixelSize(identifier);
            tayVar.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // defpackage.mwb
    public final void c(int i, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        Button button = this.d;
        button.setVisibility(0);
        Context context = this.a.i;
        button.setText(context.getText(i));
        button.setContentDescription(context.getText(i));
        button.setOnClickListener(new mwc(this, onClickListener));
        jwq.W(button);
        Button button2 = this.e;
        button2.setVisibility(0);
        button2.setText(context.getText(R.string.snackbar_dismissal));
        button2.setOnClickListener(new mwc(this, onClickListener2));
    }

    @Override // defpackage.mwb
    public final void d(String str) throws Resources.NotFoundException {
        tbb tbbVar = this.a;
        tay tayVar = tbbVar.j;
        Context context = tayVar.getContext();
        if (!"Light".equals(str)) {
            tbbVar.q(tayVar.getResources().getColor(R.color.gray_800));
            this.c.setTextColor(tayVar.getResources().getColor(R.color.gray_300));
            return;
        }
        tbbVar.q(tayVar.getResources().getColor(R.color.play_movies_snackbar_light_bg));
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.user_feedback_snackbar_padding_horizontal);
        tayVar.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        this.b.setBackgroundColor(tayVar.getResources().getColor(R.color.play_movies_snackbar_light_bg));
        TextView textView = this.c;
        textView.setBackgroundColor(tayVar.getResources().getColor(R.color.play_movies_snackbar_light_bg));
        textView.setTextColor(tayVar.getResources().getColor(R.color.play_movies_snackbar_text_color));
        Button button = this.d;
        button.setStateListAnimator(null);
        button.setBackgroundColor(tayVar.getResources().getColor(R.color.full_transparent));
        Button button2 = this.e;
        button2.setStateListAnimator(null);
        button2.setBackgroundColor(tayVar.getResources().getColor(R.color.full_transparent));
        tayVar.setLayoutParams((ViewGroup.MarginLayoutParams) tayVar.getLayoutParams());
    }

    @Override // defpackage.mwb
    public final void e() {
        Context context = this.a.j.getContext();
        TextView textView = this.c;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = context.getResources().getDimensionPixelSize(R.dimen.user_feedback_snackbar_height);
        textView.setLayoutParams(layoutParams);
        Button button = this.d;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams2.height = context.getResources().getDimensionPixelSize(R.dimen.user_feedback_snackbar_height);
        button.setLayoutParams(layoutParams2);
        Button button2 = this.e;
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button2.getLayoutParams();
        layoutParams3.height = context.getResources().getDimensionPixelSize(R.dimen.user_feedback_snackbar_height);
        button2.setLayoutParams(layoutParams3);
    }

    @Override // defpackage.mwb
    public final void f() {
        this.c.setTextSize(2, this.b.getContext().getResources().getInteger(R.integer.user_feedback_snackbar_textsize));
    }

    @Override // defpackage.mwb
    public final void g() {
        tay tayVar = this.a.j;
        tayVar.setPadding(tayVar.getPaddingLeft(), 0, tayVar.getPaddingRight(), 0);
        View view = this.b;
        view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), 0);
        TextView textView = this.c;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, 0, layoutParams.rightMargin, 0);
        textView.setLayoutParams(layoutParams);
        textView.setPadding(textView.getPaddingLeft(), 0, textView.getPaddingRight(), 0);
        textView.setGravity(16);
        j(this.d);
        j(this.e);
    }

    @Override // defpackage.mwb
    public final void h() throws Resources.NotFoundException {
        tay tayVar = this.a.j;
        int dimensionPixelOffset = tayVar.getContext().getResources().getDimensionPixelOffset(R.dimen.user_feedback_snackbar_padding_horizontal);
        tayVar.setPadding(dimensionPixelOffset, tayVar.getPaddingTop(), dimensionPixelOffset, tayVar.getPaddingBottom());
        TextView textView = this.c;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.setMargins(0, layoutParams.topMargin, 0, layoutParams.bottomMargin);
        textView.setLayoutParams(layoutParams);
        textView.setPadding(0, textView.getPaddingTop(), 0, textView.getPaddingBottom());
        textView.setGravity(3);
        i(this.d);
        i(this.e);
    }
}
