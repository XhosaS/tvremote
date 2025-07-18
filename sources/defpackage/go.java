package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class go extends gn {
    @Override // defpackage.gn, defpackage.ii
    public final void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.ii
    public final boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
