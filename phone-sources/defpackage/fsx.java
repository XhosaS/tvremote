package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsx extends fsy {
    final /* synthetic */ PlayerControlView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsx(PlayerControlView playerControlView) {
        super(playerControlView);
        this.a = playerControlView;
    }

    public final void b(List list) {
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                break;
            }
            if (((rza) list.get(i)).g()) {
                z = true;
                break;
            }
            i++;
        }
        PlayerControlView playerControlView = this.a;
        ImageView imageView = playerControlView.v;
        if (imageView != null) {
            imageView.setImageDrawable(z ? playerControlView.E : playerControlView.F);
            imageView.setContentDescription(z ? playerControlView.G : playerControlView.H);
        }
        this.b = list;
    }

    @Override // defpackage.fsy
    public final void c(rcg rcgVar) {
        boolean z;
        ((TextView) rcgVar.b).setText(R.string.exo_track_selection_none);
        int i = 0;
        while (true) {
            if (i >= this.b.size()) {
                z = true;
                break;
            } else {
                if (((rza) this.b.get(i)).g()) {
                    z = false;
                    break;
                }
                i++;
            }
        }
        rcgVar.a.setVisibility(true != z ? 4 : 0);
        rcgVar.itemView.setOnClickListener(new fsq(this, 2));
    }

    @Override // defpackage.fsy
    /* renamed from: d */
    public final void onBindViewHolder(rcg rcgVar, int i) {
        super.onBindViewHolder(rcgVar, i);
        if (i > 0) {
            rcgVar.a.setVisibility(true != ((rza) this.b.get(i + (-1))).g() ? 4 : 0);
        }
    }

    @Override // defpackage.fsy, android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((rcg) viewHolder, i);
    }

    @Override // defpackage.fsy
    public final void a(String str) {
    }
}
