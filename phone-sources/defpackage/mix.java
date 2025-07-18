package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListLayout;
import com.google.android.videos.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mix implements View.OnClickListener, iej, kri {
    private final Activity a;
    private final PlayHeaderListLayout b;
    private final ieh c;
    private final ids d;
    private final lys e;
    private final lfz f;

    public mix(Activity activity, PlayHeaderListLayout playHeaderListLayout, lfz lfzVar, lys lysVar, ieh iehVar, ids idsVar) {
        this.a = activity;
        this.b = playHeaderListLayout;
        this.f = lfzVar;
        this.e = lysVar;
        this.c = iehVar;
        this.d = idsVar;
    }

    private final void c(boolean z) {
        this.b.t((this.f.g() || this.e.m(((ldy) this.c).a())) ? this.b.getContext().getString(R.string.banner_content_filtering_on).toUpperCase(Locale.getDefault()) : null, z);
    }

    @Override // defpackage.kri
    public final void a() {
        c(false);
        this.b.a.setOnClickListener(this);
        this.d.ea(this);
    }

    @Override // defpackage.kri
    public final void b() {
        this.d.ee(this);
    }

    @Override // defpackage.iej
    public final void dM() {
        c(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity activity = this.a;
        activity.startActivity(jbr.S(activity));
    }
}
