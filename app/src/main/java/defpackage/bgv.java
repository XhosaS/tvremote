package defpackage;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.media3.ui.TrackSelectionView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bgv implements View.OnClickListener {
    final /* synthetic */ TrackSelectionView a;

    public bgv(TrackSelectionView trackSelectionView) {
        this.a = trackSelectionView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TrackSelectionView trackSelectionView = this.a;
        CheckedTextView checkedTextView = trackSelectionView.a;
        if (view == checkedTextView) {
            trackSelectionView.e = true;
            trackSelectionView.d.clear();
        } else {
            if (view != trackSelectionView.b) {
                trackSelectionView.e = false;
                Object tag = view.getTag();
                tag.getClass();
                throw null;
            }
            trackSelectionView.e = false;
            trackSelectionView.d.clear();
        }
        checkedTextView.setChecked(trackSelectionView.e);
        trackSelectionView.b.setChecked(!trackSelectionView.e && trackSelectionView.d.size() == 0);
        throw null;
    }
}
