package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class mxr implements View.OnLayoutChangeListener {
    final /* synthetic */ int a;
    final /* synthetic */ CharSequence b;
    final /* synthetic */ CharSequence c;
    final /* synthetic */ mxx d;

    public mxr(mxx mxxVar, int i, CharSequence charSequence, CharSequence charSequence2) {
        this.a = i;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = mxxVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        mxx mxxVar = this.d;
        Layout layout = mxxVar.getLayout();
        if (layout == null) {
            return;
        }
        int i9 = this.a;
        CharSequence charSequence = this.b;
        CharSequence charSequence2 = this.c;
        SpannableString spannableString = null;
        if (i9 > 0 && layout.getLineCount() > i9 && charSequence2.length() > 0 && charSequence.length() > 0) {
            SpannableString spannableString2 = new SpannableString(charSequence2);
            if (spannableString2.length() > 0) {
                spannableString2.setSpan(new elc(), 0, spannableString2.length(), 18);
            }
            int i10 = i9 - 1;
            int lineEnd = layout.getLineEnd(i10);
            if (lineEnd < charSequence.length()) {
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, lineEnd);
                Layout layoutA = mxxVar.a(TextUtils.concat(charSequenceSubSequence, spannableString2));
                while (layoutA.getLineCount() > i9 && charSequenceSubSequence.length() > 0) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, charSequenceSubSequence.length() - 1);
                    layoutA = mxxVar.a(TextUtils.concat(charSequenceSubSequence, spannableString2));
                }
                int lineStart = layoutA.getLineStart(Math.min(layoutA.getLineCount(), i10));
                while (charSequenceSubSequence.length() > 0 && Character.isWhitespace(charSequenceSubSequence.charAt(charSequenceSubSequence.length() - 1)) && charSequenceSubSequence.length() - 1 > lineStart) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, charSequenceSubSequence.length() - 1);
                }
                SpannableString spannableString3 = new SpannableString(TextUtils.concat(charSequenceSubSequence, spannableString2));
                myf.e(spannableString3, spannableString2, ClickableSpan.class);
                myf.e(spannableString3, spannableString2, ForegroundColorSpan.class);
                myf.e(spannableString3, spannableString2, UnderlineSpan.class);
                spannableString = spannableString3;
            }
        }
        if (spannableString != null) {
            mxxVar.setText(spannableString);
            charSequence = spannableString;
        }
        mxxVar.a = new mxq();
        mxxVar.a.b(layout, charSequence);
    }
}
