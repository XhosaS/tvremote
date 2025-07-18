package defpackage;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixe implements ixb {
    public static final tui a = tui.l("com/google/android/apps/googletv/app/download/KinetoscopeDownloadPokerImpl");
    public final lie b;
    public final jdr c;
    public final iwz d;
    private final yow e;

    public ixe(jdr jdrVar, yow yowVar, iwz iwzVar, lie lieVar) {
        this.c = jdrVar;
        this.e = yowVar;
        this.d = iwzVar;
        this.b = lieVar;
    }

    @Override // defpackage.ixb
    public final void a(by byVar, ksy ksyVar, String str) {
        etn etnVarA = this.c.a(ksyVar);
        if (etnVarA == null) {
            ykr.q(this.e, null, 0, new ixd(this, byVar, ksyVar, null), 3);
            return;
        }
        int i = etnVarA.b;
        if (i == 0 || i == 2 || i == 3) {
            iwz iwzVar = this.d;
            if (str == null) {
                str = "";
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) str).append('\n');
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append('\n');
            spannableStringBuilder.append((CharSequence) byVar.getString(R.string.download_dialog_message_movie));
            jxu jxuVar = new jxu(byVar.getString(i == 3 ? R.string.download_dialog_title_queued : R.string.download_dialog_title_movie), spannableStringBuilder, byVar.getString(R.string.delete_now), byVar.getString(R.string.cancel));
            Bundle bundle = new Bundle();
            bundle.putParcelable("CONFIRMATION_DIALOG_FRAGMENT_MODEL_KEY", jxuVar);
            jxv jxvVar = new jxv();
            jxvVar.setArguments(bundle);
            jxvVar.b = new iwv(iwzVar, byVar, ksyVar, jxvVar, 0);
            jxvVar.c = new fsq(jxvVar, 10);
            jxvVar.show(byVar.getSupportFragmentManager(), "download setting dialog");
            this.b.ai(ksyVar, false);
        }
    }
}
