package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aev {
    private final TextPaint a;
    private final TextDirectionHeuristic b;
    private final int c;
    private final int d;

    public aev(PrecomputedText.Params params) {
        this.a = params.getTextPaint();
        this.b = params.getTextDirection();
        this.c = params.getBreakStrategy();
        this.d = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aev)) {
            return false;
        }
        aev aevVar = (aev) obj;
        if (this.c == aevVar.c && this.d == aevVar.d) {
            TextPaint textPaint = this.a;
            TextPaint textPaint2 = aevVar.a;
            if (textPaint.getTextSize() == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.b == aevVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        LocaleList textLocales = textPaint.getTextLocales();
        java.util.Objects.toString(textLocales);
        sb.append(", textLocale=".concat(String.valueOf(textLocales)));
        Typeface typeface = textPaint.getTypeface();
        java.util.Objects.toString(typeface);
        sb.append(", typeface=".concat(String.valueOf(typeface)));
        sb.append(", variationSettings=".concat(String.valueOf(textPaint.getFontVariationSettings())));
        TextDirectionHeuristic textDirectionHeuristic = this.b;
        java.util.Objects.toString(textDirectionHeuristic);
        sb.append(", textDir=".concat(String.valueOf(textDirectionHeuristic)));
        sb.append(", breakStrategy=" + this.c);
        sb.append(", hyphenationFrequency=" + this.d);
        sb.append("}");
        return sb.toString();
    }
}
