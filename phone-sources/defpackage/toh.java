package defpackage;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class toh implements View.OnKeyListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public toh(SeekBarPreference seekBarPreference, int i) {
        this.b = i;
        this.a = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.b == 0) {
            if (i == 4) {
                return false;
            }
            if (keyEvent.getAction() == 0) {
                Object obj = this.a;
                char unicodeChar = (char) keyEvent.getUnicodeChar();
                if (unicodeChar == 0) {
                    ((tok) obj).d.e(i);
                    return true;
                }
                ((tok) obj).d.f(String.valueOf(unicodeChar));
            }
            return true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = (SeekBarPreference) this.a;
        if ((!seekBarPreference.e && (i == 21 || i == 22)) || i == 23 || i == 66) {
            return false;
        }
        SeekBar seekBar = seekBarPreference.d;
        if (seekBar != null) {
            return seekBar.onKeyDown(i, keyEvent);
        }
        Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
        return false;
    }

    public /* synthetic */ toh(tok tokVar, int i) {
        this.b = i;
        this.a = tokVar;
    }
}
