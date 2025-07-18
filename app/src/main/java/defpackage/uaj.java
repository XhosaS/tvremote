package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.google.android.katniss.R;
import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uaj {
    public final ForegroundColorSpan c;
    public int d;
    public int e;
    private final TextPaint f;
    public final BreakIterator b = BreakIterator.getWordInstance(Locale.getDefault());
    public final SpannableStringBuilder a = new SpannableStringBuilder();

    public uaj(Context context, TextPaint textPaint) {
        this.c = new ForegroundColorSpan(context.getColor(R.color.google_grey500));
        this.f = textPaint;
    }

    public final Layout a(String str) {
        return StaticLayout.Builder.obtain(str, 0, str.length(), this.f, this.e).build();
    }
}
