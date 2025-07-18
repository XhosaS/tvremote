package defpackage;

import android.graphics.PorterDuff;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sid extends RecyclerView.Adapter {
    final /* synthetic */ List a;
    public final /* synthetic */ sif b;

    public sid(sif sifVar, List list) {
        this.a = list;
        this.b = sifVar;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size() + (!this.b.j ? 1 : 0);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ust ustVar = (ust) viewHolder;
        View view = (View) ustVar.a;
        view.setClickable(true);
        sif sifVar = this.b;
        if (i == 0) {
            view.setPadding(sifVar.a.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_thirdparty_app_tray_side_padding), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        } else {
            view.setPadding(0, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.peoplekit_third_party_new_app_icon_id);
        TextView textView = (TextView) view.findViewById(R.id.peoplekit_third_party_new_app_name_id);
        int i2 = sifVar.g.c;
        if (i2 != 0) {
            textView.setTextColor(sifVar.a.getColor(i2));
        }
        if (!sifVar.j && i == this.a.size()) {
            appCompatImageView.setImageResource(R.drawable.quantum_ic_more_horiz_vd_theme_24);
            textView.setText(R.string.peoplekit_show_more);
            appCompatImageView.setBackgroundResource(R.drawable.peoplekit_circle_outline);
            appCompatImageView.setColorFilter(sifVar.a.getColor(R.color.google_grey600), PorterDuff.Mode.SRC_IN);
            she sheVar = sifVar.l;
            shh shhVar = new shh();
            shhVar.a(new siu(vgl.b));
            shhVar.c(sifVar.c);
            sheVar.b(-1, shhVar);
            view.setOnClickListener(new nay((RecyclerView.Adapter) this, (Object) ustVar, 15));
            return;
        }
        appCompatImageView.setScaleType(sifVar.k.b);
        shu shuVar = (shu) this.a.get(i);
        if (shuVar.e == null) {
            try {
                shuVar.e = shuVar.a.loadIcon(appCompatImageView.getContext().getPackageManager());
            } catch (SecurityException e) {
                e.toString();
            }
            if (shuVar.e == null) {
                shuVar.e = shuVar.a.activityInfo.applicationInfo.loadIcon(appCompatImageView.getContext().getPackageManager());
            }
        }
        appCompatImageView.setImageDrawable(shuVar.e);
        if (shuVar.d == null) {
            shuVar.d = shuVar.a.loadLabel(textView.getContext().getPackageManager()).toString();
        }
        textView.setText(shuVar.d);
        view.setOnClickListener(new sic(this, shuVar, ustVar));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        sif sifVar = this.b;
        return new ust(LayoutInflater.from(sifVar.a).inflate(true != sifVar.g.d ? R.layout.peoplekit_single_app_item : R.layout.peoplekit_single_app_item_gm3, (ViewGroup) sifVar.e, false));
    }
}
