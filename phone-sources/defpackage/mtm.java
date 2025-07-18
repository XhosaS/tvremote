package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtm extends RecyclerView.Adapter {
    public final List a;
    public final Set b;
    public final int c;
    public final int d;
    public final tfz e;
    public final san f;
    public msz g;
    private final float h;
    private final idf i;
    private final Executor j;
    private final rzy k;

    public mtm(Context context, idf idfVar, Executor executor, san sanVar, rzy rzyVar) throws Resources.NotFoundException {
        this.i = idfVar;
        this.j = executor;
        this.f = sanVar;
        this.k = rzyVar;
        Resources resources = context.getResources();
        float dimension = resources.getDimension(R.dimen.second_screen_entity_dimmed_dimension);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.second_screen_entity_dimension);
        this.c = dimensionPixelSize;
        this.h = dimension / dimensionPixelSize;
        this.d = resources.getDimensionPixelSize(R.dimen.second_screen_entity_image_dimension);
        this.a = new ArrayList();
        this.b = new HashSet();
        this.e = tfz.e(resources);
    }

    private static final void b(View view) {
        int[] iArr = cww.a;
        cwm.m(view, null);
        cww.d(view).a();
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    public final void a(lwq lwqVar) {
        List list = this.a;
        if (list.contains(lwqVar)) {
            return;
        }
        list.add(0, lwqVar);
        notifyItemInserted(0);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return Math.min(this.a.size(), 4);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.a.get(i) instanceof lwt ? R.layout.second_screen_song_item : R.layout.second_screen_actor_item;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String strG;
        mtl mtlVar = (mtl) viewHolder;
        lwq lwqVar = (lwq) this.a.get(i);
        if (this.b.contains(lwqVar)) {
            mtlVar.i = this.h;
        } else {
            mtlVar.i = 1.0f;
        }
        if (lwqVar instanceof lws) {
            mtlVar.j = (rzy) ((sah) this.f.g(this.k).a(wgi.ACTOR_INFO_CARD)).e();
            mtlVar.a.setForeground(mtlVar.f);
            TextView textView = mtlVar.e;
            Resources resources = textView.getResources();
            List list = ((lws) lwqVar).f;
            int size = list.size();
            if (size != 0) {
                String[] strArr = new String[size];
                for (int i2 = 0; i2 < size; i2++) {
                    strArr[i2] = resources.getString(R.string.knowledge_character_quotes, list.get(i2));
                }
                strG = jwq.G(resources, false, strArr);
            } else {
                strG = null;
            }
            textView.setText(strG);
        } else if (lwqVar instanceof lwt) {
            saf safVar = (saf) this.f.h(this.k).a(wgi.SONG_INFO_CARD);
            vtw vtwVarM = wge.a.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            wge wgeVar = (wge) vucVar;
            wgeVar.e = 2;
            wgeVar.b |= 4;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            wge wgeVar2 = (wge) vtwVarM.b;
            wgeVar2.d = 4;
            wgeVar2.b |= 2;
            lwt lwtVar = (lwt) lwqVar;
            String strD = lwtVar.d();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wge wgeVar3 = (wge) vtwVarM.b;
            strD.getClass();
            wgeVar3.b = 1 | wgeVar3.b;
            wgeVar3.c = strD;
            safVar.a = (wge) vtwVarM.r();
            mtlVar.j = (rzy) safVar.e();
            mtlVar.a.setForeground(mtlVar.g);
            mtlVar.e.setText(lwtVar.f);
        }
        if (lwqVar.e != null) {
            mtlVar.h.b(lwqVar, this.i, this.j);
        } else {
            mtlVar.c.setVisibility(4);
        }
        mtlVar.d.setText(lwqVar.c);
        mtlVar.a.setTag(lwqVar);
        mtlVar.b.setTag(lwqVar);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new mtl(this, LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false), i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        mtl mtlVar = (mtl) viewHolder;
        mge mgeVar = mtlVar.h;
        if (mgeVar != null) {
            mgeVar.d();
        }
        b(mtlVar.a);
        View view = mtlVar.c;
        b(view);
        view.setVisibility(4);
        if (view instanceof ImageView) {
            ((ImageView) view).setImageMatrix(null);
        }
    }
}
