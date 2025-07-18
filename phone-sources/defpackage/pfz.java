package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pfz extends URLSpan {
    public pfz(String str) {
        super(str);
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        String url = getURL();
        url.getClass();
        new fx((byte[]) null).e().r(context, Uri.parse(url));
    }
}
