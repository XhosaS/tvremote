package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Annotation;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpm {
    public final utx a(String str, final Drawable[] drawableArr, final String[] strArr) {
        final Spanned spannedFromHtml = Html.fromHtml(str, 0, null, new hph());
        spannedFromHtml.getClass();
        return new utx() { // from class: hpl
            @Override // defpackage.utx
            public final /* synthetic */ CharSequence a(int i) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannedFromHtml;
                int i2 = 0;
                Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Annotation.class);
                spans.getClass();
                int i3 = 0;
                while (i2 < spans.length) {
                    int i4 = i3 + 1;
                    Annotation annotation = (Annotation) spans[i2];
                    if (agvy.c(annotation.getKey(), "image")) {
                        String[] strArr2 = strArr;
                        Drawable drawable = (Drawable) agqj.l(drawableArr, i3);
                        String str2 = (String) agqj.l(strArr2, i3);
                        if (drawable == null || str2 == null) {
                            spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(annotation), spannableStringBuilder.getSpanEnd(annotation));
                        } else {
                            uvr uvrVar = new uvr(drawable, str2);
                            uvrVar.a = i;
                            spannableStringBuilder.setSpan(uvrVar, spannableStringBuilder.getSpanStart(annotation), spannableStringBuilder.getSpanEnd(annotation), 18);
                        }
                    }
                    i2++;
                    i3 = i4;
                }
                return new SpannableString(spannableStringBuilder);
            }
        };
    }
}
