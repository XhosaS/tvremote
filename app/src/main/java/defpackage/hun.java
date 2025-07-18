package defpackage;

import android.view.KeyEvent;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes.dex */
class hun extends hai {
    final /* synthetic */ huo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hun(huo huoVar) {
        super("WebViewFragment");
        this.a = huoVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode;
        huo huoVar = this.a;
        if (huoVar.a != null && keyEvent.getAction() == 1 && ((keyCode = keyEvent.getKeyCode()) == 4 || keyCode == 2 || keyCode == 1 || keyCode == 22 || keyCode == 21 || keyCode == 20 || keyCode == 19 || keyCode == 96 || keyCode == 97)) {
            huoVar.a.f();
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }
}
