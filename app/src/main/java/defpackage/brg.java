package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.slice.widget.RemoteInputView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class brg implements TextView.OnEditorActionListener {
    final /* synthetic */ RemoteInputView a;

    public brg(RemoteInputView remoteInputView) {
        this.a = remoteInputView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int keyCode;
        boolean z = keyEvent == null && (i == 6 || i == 5 || i == 4);
        boolean z2 = keyEvent != null && ((keyCode = keyEvent.getKeyCode()) == 23 || keyCode == 62 || keyCode == 66 || keyCode == 160) && keyEvent.getAction() == 0;
        if (!z && !z2) {
            return false;
        }
        if (this.a.a.length() <= 0) {
            return true;
        }
        new Bundle();
        throw null;
    }
}
