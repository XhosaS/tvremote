package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czd {
    public static final String[] a = new String[0];

    public static void a(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static void b(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            cwr.d(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            cwr.d(editorInfo, charSequence);
            return;
        }
        int i = editorInfo.initialSelStart > editorInfo.initialSelEnd ? editorInfo.initialSelEnd : editorInfo.initialSelStart;
        int i2 = editorInfo.initialSelStart > editorInfo.initialSelEnd ? editorInfo.initialSelStart : editorInfo.initialSelEnd;
        int length = charSequence.length();
        if (i < 0 || i2 > length) {
            d(editorInfo, null, 0, 0);
            return;
        }
        int i3 = editorInfo.inputType & 4095;
        if (i3 == 129 || i3 == 225 || i3 == 18) {
            d(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            d(editorInfo, charSequence, i, i2);
            return;
        }
        int i4 = i2 - i;
        int length2 = charSequence.length() - i2;
        int i5 = i4 > 1024 ? 0 : i4;
        int i6 = 2048 - i5;
        int iMin = Math.min(length2, i6 - Math.min(i, (int) (i6 * 0.8d)));
        int iMin2 = Math.min(i, i6 - iMin);
        int i7 = i - iMin2;
        if (e(charSequence, i7, 0)) {
            i7++;
            iMin2--;
        }
        if (e(charSequence, (i2 + iMin) - 1, 1)) {
            iMin--;
        }
        int i8 = iMin2 + i5;
        d(editorInfo, i5 != i4 ? TextUtils.concat(charSequence.subSequence(i7, i7 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i7, iMin + i8 + i7), iMin2, i8);
    }

    public static void c(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            editorInfo.setStylusHandwritingEnabled(z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    private static void d(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    private static boolean e(CharSequence charSequence, int i, int i2) {
        return i2 != 0 ? Character.isHighSurrogate(charSequence.charAt(i)) : Character.isLowSurrogate(charSequence.charAt(i));
    }
}
