package defpackage;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.Button;
import android.widget.TextView;
import java.text.BreakIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uar implements vyv {
    final /* synthetic */ uas a;
    private final TextView b;
    private final TextView c;
    private final uah d;
    private final Button e;
    private final uaj f;
    private txo g = txo.k().a();
    private boolean h = false;

    public uar(uas uasVar, TextView textView, TextView textView2, uah uahVar, Button button) {
        this.a = uasVar;
        this.b = textView;
        this.c = textView2;
        this.d = uahVar;
        this.e = button;
        this.f = new uaj(textView2.getContext(), textView2.getPaint());
    }

    @Override // defpackage.vyv
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) uas.a.d()).p(th)).q("com/google/android/libraries/speech/transcription/ui/TranscriptionFragmentPeer$TranscriptionStateSubscriptionCallbacks", "onError", (char) 257, "TranscriptionFragmentPeer.java")).u("#onError");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    @Override // defpackage.vyv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void b(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uar.b(java.lang.Object):void");
    }

    public final void d() {
        int iFollowing;
        tuw tuwVarE = this.g.e();
        ((zdv) ((zdv) uas.a.b()).q("com/google/android/libraries/speech/transcription/ui/TranscriptionFragmentPeer$TranscriptionStateSubscriptionCallbacks", "setLatestRecognizedText", 230, "TranscriptionFragmentPeer.java")).F("#setLatestRecognizedText stableText: %s, pendingText: %s", tuwVarE.c, tuwVarE.d);
        TextView textView = this.c;
        int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
        uaj uajVar = this.f;
        if (uajVar.e != width) {
            uajVar.d = 0;
            uajVar.e = width;
        }
        String str = tuwVarE.c;
        String str2 = tuwVarE.d;
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf(str2);
        int i = uajVar.d;
        String strConcat = strValueOf.concat(strValueOf2);
        if (i > strConcat.length()) {
            uajVar.d = 0;
            i = 0;
        }
        if (uajVar.a(strConcat.substring(i)).getLineCount() > 2) {
            BreakIterator breakIterator = uajVar.b;
            breakIterator.setText(strConcat);
            while (uajVar.a("…".concat(String.valueOf(strConcat.substring(uajVar.d).trim()))).getLineCount() > 2 && (iFollowing = breakIterator.following(uajVar.d)) != -1) {
                uajVar.d = iFollowing;
            }
        }
        SpannableStringBuilder spannableStringBuilder = uajVar.a;
        spannableStringBuilder.clear();
        spannableStringBuilder.clearSpans();
        if (uajVar.d > 0) {
            spannableStringBuilder.append((CharSequence) "…");
        }
        spannableStringBuilder.append((CharSequence) strConcat.substring(uajVar.d).trim());
        int length = str2.length() < spannableStringBuilder.length() ? spannableStringBuilder.length() - str2.length() : 0;
        if (length != spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(uajVar.c, length, spannableStringBuilder.length(), 33);
        }
        textView.setText(new SpannedString(spannableStringBuilder));
    }

    @Override // defpackage.vyv
    public final /* synthetic */ void c() {
    }
}
