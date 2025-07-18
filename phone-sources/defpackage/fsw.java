package defpackage;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsw extends RecyclerView.Adapter {
    final /* synthetic */ PlayerControlView a;
    private final String[] b;
    private final String[] c = new String[2];
    private final Drawable[] d;

    public fsw(PlayerControlView playerControlView, String[] strArr, Drawable[] drawableArr) {
        this.a = playerControlView;
        this.b = strArr;
        this.d = drawableArr;
    }

    public final void a(int i, String str) {
        this.c[i] = str;
    }

    public final boolean b(int i) {
        PlayerControlView playerControlView = this.a;
        eao eaoVar = playerControlView.I;
        if (eaoVar == null) {
            return false;
        }
        if (i == 0) {
            return eaoVar.q(13);
        }
        if (i != 1) {
            return true;
        }
        return eaoVar.q(30) && playerControlView.I.q(29);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 2;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        mtx mtxVar = (mtx) viewHolder;
        if (b(i)) {
            mtxVar.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        } else {
            mtxVar.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
        }
        ((TextView) mtxVar.c).setText(this.b[i]);
        String str = this.c[i];
        if (str == null) {
            mtxVar.a.setVisibility(8);
        } else {
            mtxVar.a.setText(str);
        }
        Drawable drawable = this.d[i];
        if (drawable == null) {
            ((ImageView) mtxVar.b).setVisibility(8);
        } else {
            ((ImageView) mtxVar.b).setImageDrawable(drawable);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        PlayerControlView playerControlView = this.a;
        return new mtx(playerControlView, LayoutInflater.from(playerControlView.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
    }
}
