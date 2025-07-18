package defpackage;

import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsr extends fsy {
    public final /* synthetic */ PlayerControlView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsr(PlayerControlView playerControlView) {
        super(playerControlView);
        this.a = playerControlView;
    }

    @Override // defpackage.fsy
    public final void a(String str) {
        this.a.i.a(1, str);
    }

    public final boolean b(ebf ebfVar) {
        for (int i = 0; i < this.b.size(); i++) {
            if (ebfVar.am.containsKey(((ebg) ((rza) this.b.get(i)).c).f)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fsy
    public final void c(rcg rcgVar) {
        ((TextView) rcgVar.b).setText(R.string.exo_track_selection_auto);
        eao eaoVar = this.a.I;
        eaoVar.getClass();
        rcgVar.a.setVisibility(true != b(eaoVar.O()) ? 0 : 4);
        rcgVar.itemView.setOnClickListener(new fsq(this, 0));
    }
}
