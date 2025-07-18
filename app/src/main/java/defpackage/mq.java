package defpackage;

import android.graphics.Paint;
import android.widget.TextView;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class mq {
    public static final wt a = new wt(30);
    public static Paint b;

    public static float a(float f) {
        if (f < 1.0f) {
            return 1.0f;
        }
        return Math.min(f, 1000.0f);
    }

    static void b(TextView textView, String str) {
        if (Objects.equals(textView.getFontVariationSettings(), str)) {
            textView.setFontVariationSettings("");
        }
        textView.setFontVariationSettings(str);
    }
}
