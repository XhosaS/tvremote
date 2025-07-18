package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.play.movies.mobile.usecase.details.MovieExtraClusterItemView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mml implements icv {
    private final lio a;
    private final ieh b;
    private final int c;
    private final mru d;

    public mml(lio lioVar, mru mruVar, ieh iehVar, int i) {
        this.a = lioVar;
        this.d = mruVar;
        this.b = iehVar;
        this.c = i;
    }

    @Override // defpackage.icv
    public final /* synthetic */ void a(Object obj, Object obj2) {
        kvf kvfVar = (kvf) obj;
        MovieExtraClusterItemView movieExtraClusterItemView = (MovieExtraClusterItemView) obj2;
        movieExtraClusterItemView.c.setText(kvfVar.E());
        int iC = kvfVar.c();
        if (iC >= 60) {
            TextView textView = movieExtraClusterItemView.d;
            Resources resources = movieExtraClusterItemView.getContext().getResources();
            Integer numValueOf = Integer.valueOf(iC / 60);
            textView.setText(resources.getString(R.string.movie_duration, numValueOf));
            movieExtraClusterItemView.d.setContentDescription(movieExtraClusterItemView.getContext().getResources().getString(R.string.accessibility_movie_duration, numValueOf));
        } else {
            TextView textView2 = movieExtraClusterItemView.d;
            Resources resources2 = movieExtraClusterItemView.getContext().getResources();
            Integer numValueOf2 = Integer.valueOf(iC);
            textView2.setText(resources2.getString(R.string.movie_duration_seconds, numValueOf2));
            movieExtraClusterItemView.d.setContentDescription(movieExtraClusterItemView.getContext().getResources().getString(R.string.accessibility_movie_duration_seconds, numValueOf2));
        }
        Uri uriH = kvfVar.h();
        int i = this.c;
        int paddingTop = (((int) (i / movieExtraClusterItemView.e)) - movieExtraClusterItemView.f.getPaddingTop()) - movieExtraClusterItemView.f.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = movieExtraClusterItemView.f.getLayoutParams();
        layoutParams.height = paddingTop;
        layoutParams.width = i;
        movieExtraClusterItemView.f.setLayoutParams(layoutParams);
        ((hke) hjr.c(movieExtraClusterItemView.getContext()).e(uriH).g(htc.b()).h(hvc.d(R.color.play_movies_thumbnail_placeholder)).m()).k(movieExtraClusterItemView.f);
        int iC2 = kvfVar.c();
        int i2 = ((kva) this.b.a()).a(kvfVar).d;
        movieExtraClusterItemView.b.setMax(iC2);
        movieExtraClusterItemView.b.setProgress(i2);
        movieExtraClusterItemView.k(this.a, liq.h(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBar, kvfVar));
        mgo mgoVar = new mgo(kvfVar, this.d);
        movieExtraClusterItemView.setOnClickListener(mgoVar);
        movieExtraClusterItemView.a.setOnClickListener(mgoVar);
    }
}
