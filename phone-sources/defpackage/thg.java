package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.play.search.PlaySearchToolbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thg extends cur {
    final /* synthetic */ PlaySearchToolbar a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thg(PlaySearchToolbar playSearchToolbar, Context context) {
        super(context);
        this.a = playSearchToolbar;
    }

    @Override // defpackage.cur
    public final View onCreateActionView() {
        return this.a.c;
    }
}
