package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsu extends RecyclerView.Adapter {
    public final String[] a;
    public final float[] b;
    public int c;
    final /* synthetic */ PlayerControlView d;

    public fsu(PlayerControlView playerControlView, String[] strArr, float[] fArr) {
        this.d = playerControlView;
        this.a = strArr;
        this.b = fArr;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.length;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        String[] strArr = this.a;
        rcg rcgVar = (rcg) viewHolder;
        if (i < strArr.length) {
            ((TextView) rcgVar.b).setText(strArr[i]);
        }
        if (i == this.c) {
            rcgVar.itemView.setSelected(true);
            rcgVar.a.setVisibility(0);
        } else {
            rcgVar.itemView.setSelected(false);
            rcgVar.a.setVisibility(4);
        }
        rcgVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: fst
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                fsu fsuVar = this.a;
                if (i2 != fsuVar.c) {
                    PlayerControlView playerControlView = fsuVar.d;
                    float f = fsuVar.b[i2];
                    eao eaoVar = playerControlView.I;
                    if (eaoVar != null && eaoVar.q(13)) {
                        eao eaoVar2 = playerControlView.I;
                        eaoVar2.ac(eaoVar2.L().a(f));
                    }
                }
                fsuVar.d.m.dismiss();
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new rcg(LayoutInflater.from(this.d.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
