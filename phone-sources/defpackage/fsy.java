package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fsy extends RecyclerView.Adapter {
    public List b = new ArrayList();
    public final /* synthetic */ PlayerControlView c;

    protected fsy(PlayerControlView playerControlView) {
        this.c = playerControlView;
    }

    public abstract void a(String str);

    protected abstract void c(rcg rcgVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(rcg rcgVar, int i) {
        eao eaoVar = this.c.I;
        if (eaoVar == null) {
            return;
        }
        if (i == 0) {
            c(rcgVar);
            return;
        }
        rza rzaVar = (rza) this.b.get(i - 1);
        eba ebaVar = ((ebg) rzaVar.c).f;
        boolean z = eaoVar.O().am.get(ebaVar) != null && rzaVar.g();
        ((TextView) rcgVar.b).setText((CharSequence) rzaVar.b);
        rcgVar.a.setVisibility(true != z ? 4 : 0);
        rcgVar.itemView.setOnClickListener(new iwv(this, eaoVar, ebaVar, rzaVar, 1));
    }

    public final void e() {
        this.b = Collections.EMPTY_LIST;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.b.isEmpty()) {
            return 0;
        }
        return this.b.size() + 1;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new rcg(LayoutInflater.from(this.c.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
