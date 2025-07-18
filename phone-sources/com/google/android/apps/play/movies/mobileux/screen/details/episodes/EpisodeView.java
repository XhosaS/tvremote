package com.google.android.apps.play.movies.mobileux.screen.details.episodes;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.play.layout.ForegroundRelativeLayout;
import com.google.android.videos.R;
import defpackage.hjr;
import defpackage.hke;
import defpackage.htc;
import defpackage.hvc;
import defpackage.jyr;
import defpackage.kaj;
import defpackage.ksi;
import defpackage.kuj;
import defpackage.kuo;
import defpackage.kxg;
import defpackage.lio;
import defpackage.lip;
import defpackage.liq;
import defpackage.mvb;
import defpackage.mwk;
import defpackage.mxs;
import defpackage.mxt;
import defpackage.mxv;
import defpackage.mxw;
import defpackage.myd;
import defpackage.nbo;
import defpackage.sij;
import defpackage.tst;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class EpisodeView extends FrameLayout implements nbo<mxs> {
    public ForegroundRelativeLayout a;
    public TextView b;
    public View c;
    public mvb d;
    private RelativeLayout e;
    private ImageView f;
    private TextView g;
    private ProgressBar h;
    private ImageView i;
    private ImageView j;
    private TextView k;
    private TextView l;
    private ImageView m;
    private ImageView n;
    private TextView o;
    private MaterialButton p;
    private MaterialButton q;

    public EpisodeView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.nbo
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(mxs mxsVar) throws Resources.NotFoundException {
        this.a.setVisibility(0);
        final kuo kuoVar = mxsVar.k;
        String str = kuoVar.n;
        this.a.setTag(str);
        ForegroundRelativeLayout foregroundRelativeLayout = this.a;
        int i = mxsVar.l;
        foregroundRelativeLayout.setOnClickListener(new jyr(new mxw(i), 20));
        TextView textView = this.k;
        Resources resources = getResources();
        String str2 = kuoVar.e;
        textView.setText(resources.getString(R.string.episode_number_title, str, str2));
        if (mxsVar.p) {
            this.k.setOnLongClickListener(new View.OnLongClickListener() { // from class: mxq
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    new AlertDialog.Builder(this.a.getContext()).setCancelable(true).setTitle("Episode AssetId: ".concat(kuoVar.c.b)).setPositiveButton("Ok", new ixr(13)).create().show();
                    return false;
                }
            });
        }
        String strE = ksi.e(kuoVar.t);
        if (sij.F(strE)) {
            this.l.setVisibility(8);
        } else {
            this.l.setText(strE);
            this.l.setVisibility(0);
        }
        this.c.setVisibility(true != mxsVar.e ? 8 : 0);
        boolean z = mxsVar.m;
        if (z) {
            this.f.setVisibility(0);
            ((hke) hjr.c(getContext()).e(kuoVar.q).g(htc.b()).h(hvc.d(R.color.play_movies_thumbnail_placeholder)).m()).k(this.f);
        } else {
            this.f.setVisibility(8);
        }
        lio lioVar = mxsVar.n;
        tst tstVar = mxsVar.f;
        if (tstVar.g()) {
            ((View) this.d).setVisibility(0);
            this.d.e(str2);
            ((View) this.d).setOnClickListener(new jyr(new mxt(kuoVar, lioVar), 20));
            this.d.c((kuj) tstVar.c());
            lioVar.d(liq.e(612));
        } else {
            ((View) this.d).setVisibility(8);
        }
        this.m.setVisibility(true != mxsVar.g ? 8 : 0);
        tst tstVar2 = mxsVar.c;
        boolean zG = tstVar2.g();
        tst tstVar3 = mxsVar.h;
        if (tstVar3.g()) {
            this.n.setVisibility(0);
            this.n.setImageDrawable(AppCompatResources.getDrawable(getContext(), ((Integer) tstVar3.c()).intValue()));
        } else {
            this.n.setVisibility(8);
        }
        tst tstVar4 = mxsVar.i;
        if (tstVar4.g()) {
            this.o.setVisibility(0);
            this.o.setText((CharSequence) tstVar4.c());
        } else {
            this.o.setVisibility(8);
        }
        tst tstVar5 = mxsVar.j;
        if (tstVar5.g()) {
            myd mydVar = (myd) tstVar5.c();
            mwk mwkVar = mydVar.a;
            int i2 = mydVar.b;
            if (i2 == 2) {
                this.p.setVisibility(8);
                this.q.setVisibility(0);
                this.q.setText(mwkVar.a);
                String str3 = mwkVar.b;
                if (!sij.F(str3)) {
                    this.q.setContentDescription(str3);
                }
            } else {
                this.q.setVisibility(8);
                this.p.setVisibility(0);
                this.p.setText(mwkVar.a);
                liq liqVar = lip.g;
                lioVar.d(liqVar);
                String str4 = mwkVar.b;
                if (!sij.F(str4)) {
                    this.p.setContentDescription(str4);
                }
                this.p.setOnClickListener(new jyr(new mxv(kuoVar, i2, lioVar), 20));
                lioVar.d(liqVar);
            }
        } else {
            this.p.setVisibility(8);
            this.q.setVisibility(8);
        }
        this.i.setImageResource(true != mxsVar.r ? R.drawable.ic_play_btn_episode : R.drawable.ic_gtv_play_btn_episode);
        if (tstVar2.g()) {
            this.k.setTextColor(getResources().getColor(R.color.play_movies_details_episode_tile_play));
            this.j.setVisibility(8);
            this.i.setVisibility(0);
            this.i.setContentDescription(getContext().getString(R.string.play_episode_content_description, str));
            this.i.setOnClickListener(new kaj(mxsVar, kuoVar, lioVar, 3, (char[]) null));
            lioVar.d(liq.g(600, ((kxg) tstVar2.c()).c));
        } else {
            this.k.setTextColor(getResources().getColor(R.color.play_movies_details_episode_tile_play));
            this.i.setVisibility(8);
            this.j.setVisibility(8);
        }
        tst tstVar6 = mxsVar.a;
        if (tstVar6.g() && z) {
            this.h.setVisibility(0);
            this.h.setMax(kuoVar.m);
            this.h.setProgress(((Integer) tstVar6.c()).intValue());
        } else {
            this.h.setVisibility(8);
        }
        tst tstVar7 = mxsVar.b;
        if (tstVar7.g() && z) {
            this.g.setVisibility(0);
            this.g.setText((CharSequence) tstVar7.c());
        } else {
            this.g.setVisibility(8);
        }
        this.e.setVisibility((z || zG) ? 0 : 8);
        String string = kuoVar.u;
        if (sij.F(string)) {
            string = getResources().getString(R.string.details_episode_no_description_avaialble);
        }
        this.b.setText(string);
        this.b.setVisibility(true != mxsVar.d ? 8 : 0);
        Resources resources2 = getResources();
        int i3 = R.dimen.details_episode_synospsis_padding_start;
        if (!z && zG) {
            i3 = R.dimen.details_episode_synospsis_padding_start_watchable_third_party;
        }
        int dimensionPixelSize = resources2.getDimensionPixelSize(i3);
        TextView textView2 = this.b;
        textView2.setPaddingRelative(dimensionPixelSize, textView2.getPaddingTop(), this.b.getPaddingEnd(), this.b.getPaddingBottom());
        if (mxsVar.q) {
            return;
        }
        this.b.setOnClickListener(new jyr(new mxw(i), 20));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ForegroundRelativeLayout) findViewById(R.id.cluster_item_detailed_episode);
        this.e = (RelativeLayout) findViewById(R.id.thumbnail_frame);
        this.f = (ImageView) findViewById(R.id.thumbnail_img);
        this.g = (TextView) findViewById(R.id.episode_status);
        this.h = (ProgressBar) findViewById(R.id.episode_progressbar);
        this.i = (ImageView) findViewById(R.id.episode_play_button);
        this.j = (ImageView) findViewById(R.id.episode_lock_button);
        this.k = (TextView) findViewById(R.id.title);
        this.l = (TextView) findViewById(R.id.release_date);
        this.b = (TextView) findViewById(R.id.episode_synopsis);
        this.c = findViewById(R.id.dim_overlay);
        this.m = (ImageView) findViewById(R.id.episode_family_library);
        this.n = (ImageView) findViewById(R.id.entitled_mark);
        this.o = (TextView) findViewById(R.id.annotation);
        this.p = (MaterialButton) findViewById(R.id.episode_purchase);
        this.q = (MaterialButton) findViewById(R.id.episode_season_only);
        this.d = (mvb) findViewById(R.id.episode_download_view);
    }

    public EpisodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EpisodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
