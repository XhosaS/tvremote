package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.content.res.AppCompatResources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.play.movies.mobileux.view.widget.BasicCardItemView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mlo implements icv {
    public final icv a;
    private final lis b;
    private final lis c;

    public mlo(lis lisVar, lis lisVar2, icv icvVar) {
        this.b = lisVar;
        this.c = lisVar2;
        this.a = icvVar;
    }

    @Override // defpackage.icv
    public final /* synthetic */ void a(Object obj, Object obj2) {
        mtu mtuVar = (mtu) obj;
        View view = (View) obj2;
        Context context = view.getContext();
        Resources resources = view.getResources();
        view.setLayoutParams(new RelativeLayout.LayoutParams(mtuVar.b, -2));
        mjo.c(view, this.c, mtuVar, (lio) mtuVar.r.g(), true);
        ((BasicCardItemView) view.findViewById(R.id.thumbnail_frame)).setLayoutParams(new RelativeLayout.LayoutParams(mtuVar.p, mtuVar.q));
        ((hke) hjr.c(context).e(mtuVar.o).g(htc.b()).h(hvc.d(R.color.play_movies_thumbnail_placeholder)).m()).k((ImageView) view.findViewById(R.id.thumbnail_img));
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.play_button_frame);
        relativeLayout.setContentDescription(mtuVar.n);
        mit mitVar = mtuVar.l;
        relativeLayout.setVisibility(mitVar != null ? 0 : 8);
        mjo.c(relativeLayout, this.b, mitVar, mtuVar.m, mitVar != null);
        ((TextView) view.findViewById(R.id.details_title)).setText(mtuVar.c);
        TextView textView = (TextView) view.findViewById(R.id.details_subtitle);
        textView.setText(mtuVar.d);
        textView.setContentDescription(mtuVar.e);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ratings_container);
        String str = mtuVar.i;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean z = !zIsEmpty;
        boolean z2 = mtuVar.f;
        linearLayout.setVisibility((z2 || !zIsEmpty) ? 0 : 8);
        TextView textView2 = (TextView) view.findViewById(R.id.star_rating);
        textView2.setText(str);
        textView2.setContentDescription(resources.getString(R.string.accessibility_star_rating_description, str));
        int i = true != z ? 8 : 0;
        textView2.setVisibility(i);
        view.findViewById(R.id.star_rating_img).setVisibility(i);
        ImageView imageView = (ImageView) view.findViewById(R.id.tomato_rating_img);
        if (z2) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, mtuVar.h));
        } else {
            imageView.setVisibility(8);
        }
        TextView textView3 = (TextView) view.findViewById(R.id.tomato_rating);
        Integer numValueOf = Integer.valueOf(mtuVar.g);
        textView3.setText(resources.getString(R.string.review_percent, numValueOf));
        textView3.setContentDescription(resources.getString(R.string.accessibility_rotten_tomatoes_rating, numValueOf));
        textView3.setVisibility(true != z2 ? 8 : 0);
        view.findViewById(R.id.badge_4k).setVisibility(8);
        View viewFindViewById = view.findViewById(R.id.download_icon);
        viewFindViewById.setVisibility(true == mtuVar.j ? 0 : 8);
        viewFindViewById.setOnClickListener(new iuy(this, mtuVar, 10, null));
        mtuVar.k.c(viewFindViewById);
    }
}
