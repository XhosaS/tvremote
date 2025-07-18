package defpackage;

import android.content.Context;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rcp {
    private static final vpv a = new vpv(16);
    private final yyh b;

    public rcp(yyh yyhVar) {
        this.b = yyhVar;
    }

    public final void a(ImageView imageView) {
        Context context = imageView.getContext();
        context.getClass();
        imageView.setImageDrawable(this.b.g(context, a));
    }
}
