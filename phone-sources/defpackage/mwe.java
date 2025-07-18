package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.content.res.AppCompatResources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mwe implements mwb {
    private final tbb a;

    public mwe(View view, String str) {
        tbb tbbVarN = tbb.n(view, str, 0);
        this.a = tbbVarN;
        ((TextView) tbbVarN.j.findViewById(R.id.snackbar_text)).setMaxLines(2);
    }

    private final void i(View view, TextView textView) throws Resources.NotFoundException {
        this.a.q(view.getResources().getColor(R.color.gray_800, null));
        textView.setTextColor(view.getResources().getColor(R.color.gray_300, null));
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
        this.a.o(i, onClickListener);
    }

    @Override // defpackage.mwb
    public final void d(String str) throws Resources.NotFoundException {
        tay tayVar = this.a.j;
        Context context = tayVar.getContext();
        TextView textView = (TextView) tayVar.findViewById(R.id.snackbar_text);
        Button button = (Button) tayVar.findViewById(R.id.snackbar_action);
        int iHashCode = str.hashCode();
        if (iHashCode == 2122646) {
            if (str.equals("Dark")) {
                i(tayVar, textView);
                return;
            }
            return;
        }
        if (iHashCode != 73417974) {
            if (iHashCode == 1080094955 && str.equals("New_Gtv_Dark")) {
                i(tayVar, textView);
                button.setTextColor(tayVar.getResources().getColor(R.color.google_grey100, null));
                return;
            }
            return;
        }
        if (str.equals("Light")) {
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.user_feedback_snackbar_padding_horizontal);
            tayVar.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
            textView.setTextColor(tayVar.getResources().getColor(R.color.play_movies_snackbar_text_color, null));
            tayVar.setBackground(AppCompatResources.getDrawable(context, R.drawable.ic_snackbar_background));
            tayVar.setLayoutParams((ViewGroup.MarginLayoutParams) tayVar.getLayoutParams());
            button.setTextColor(jwq.C(context, android.R.attr.colorAccent));
        }
    }

    @Override // defpackage.mwb
    public final void e() {
        tay tayVar = this.a.j;
        Context context = tayVar.getContext();
        TextView textView = (TextView) tayVar.findViewById(R.id.snackbar_text);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = context.getResources().getDimensionPixelSize(R.dimen.user_feedback_snackbar_height);
        textView.setLayoutParams(layoutParams);
        Button button = (Button) tayVar.findViewById(R.id.snackbar_action);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams2.height = context.getResources().getDimensionPixelSize(R.dimen.user_feedback_snackbar_height);
        button.setLayoutParams(layoutParams2);
    }

    @Override // defpackage.mwb
    public final void f() {
        ((TextView) this.a.j.findViewById(R.id.snackbar_text)).setTextSize(2, r0.getContext().getResources().getInteger(R.integer.user_feedback_snackbar_textsize));
    }

    @Override // defpackage.mwb
    public final void g() {
        tay tayVar = this.a.j;
        tayVar.setPadding(tayVar.getPaddingLeft(), 0, tayVar.getPaddingRight(), 0);
        TextView textView = (TextView) tayVar.findViewById(R.id.snackbar_text);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, 0, layoutParams.rightMargin, 0);
        textView.setLayoutParams(layoutParams);
        textView.setPadding(textView.getPaddingLeft(), 0, textView.getPaddingRight(), 0);
        textView.setGravity(16);
        Button button = (Button) tayVar.findViewById(R.id.snackbar_action);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams2.setMargins(layoutParams2.leftMargin, 0, layoutParams2.rightMargin, 0);
        button.setLayoutParams(layoutParams2);
        button.setPadding(button.getPaddingLeft(), 0, button.getPaddingRight(), 0);
        button.setGravity(16);
    }

    @Override // defpackage.mwb
    public final void h() throws Resources.NotFoundException {
        tay tayVar = this.a.j;
        int dimensionPixelOffset = tayVar.getContext().getResources().getDimensionPixelOffset(R.dimen.user_feedback_snackbar_padding_horizontal);
        tayVar.setPadding(dimensionPixelOffset, tayVar.getPaddingTop(), dimensionPixelOffset, tayVar.getPaddingBottom());
        TextView textView = (TextView) tayVar.findViewById(R.id.snackbar_text);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.setMargins(0, layoutParams.topMargin, 0, layoutParams.bottomMargin);
        textView.setLayoutParams(layoutParams);
        textView.setPadding(0, textView.getPaddingTop(), 0, textView.getPaddingBottom());
        textView.setGravity(3);
        Button button = (Button) tayVar.findViewById(R.id.snackbar_action);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams2.setMargins(0, layoutParams2.topMargin, 0, layoutParams2.bottomMargin);
        button.setLayoutParams(layoutParams2);
        button.setTextAlignment(6);
        button.setPadding(0, button.getPaddingTop(), 0, button.getPaddingBottom());
        button.setGravity(5);
    }
}
