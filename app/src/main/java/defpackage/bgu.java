package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgu {
    public static void a(bfy bfyVar) {
        bfyVar.h = -3.4028235E38f;
        bfyVar.g = Integer.MIN_VALUE;
        CharSequence charSequence = bfyVar.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                bfyVar.a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = bfyVar.a;
            charSequence2.getClass();
            b((Spannable) charSequence2, new yqx() { // from class: bgt
                @Override // defpackage.yqx
                public final boolean a(Object obj) {
                    return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
                }
            });
        }
    }

    public static void b(Spannable spannable, yqx yqxVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (yqxVar.a(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float c(int i, float f, int i2) {
        if (f != -3.4028235E38f && i == 0) {
            return f * i2;
        }
        return -3.4028235E38f;
    }
}
