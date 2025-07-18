package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.play.movies.mobileux.screen.details.distributors.DistributorItemView;
import com.google.android.videos.R;
import com.google.common.collect.UnmodifiableIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxf extends mum {
    private mxo a;

    private final void a(mun munVar, mxe mxeVar, boolean z) {
        DistributorItemView distributorItemView = (DistributorItemView) LayoutInflater.from(getContext()).inflate(R.layout.details_distributors_item, (ViewGroup) null);
        distributorItemView.a(mxeVar);
        distributorItemView.setOnClickListener(new iuy(this, mxeVar, 16));
        if (z) {
            distributorItemView.setBackgroundColor(getContext().getColor(R.color.gray_800));
            int color = getContext().getColor(R.color.gray_400);
            distributorItemView.a.setTextColor(color);
            distributorItemView.b.setTextColor(color);
        }
        munVar.b(distributorItemView);
    }

    @Override // defpackage.sfg, defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mxo mxoVar = (mxo) getArguments().getParcelable("distributors_viewmodel");
        mxoVar.getClass();
        this.a = mxoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sfg
    public final View onCreateReplayDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a.getClass();
        String string = this.a.f ? getString(R.string.details_more_distributors_picker_dialog_title) : getString(R.string.details_distributors_picker_dialog_title);
        boolean z = this.a.h;
        mun munVar = new mun(this);
        sfx sfxVar = new sfx();
        sfxVar.b(string);
        munVar.e(sfxVar);
        if (!z) {
            munVar.e(new sfk());
        }
        sfw sfwVar = new sfw();
        sfwVar.b();
        munVar.c(sfwVar);
        a(munVar, this.a.c, true);
        UnmodifiableIterator it = this.a.b.iterator();
        while (it.hasNext()) {
            a(munVar, (mxe) it.next(), false);
        }
        return munVar.a();
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onStart() {
        super.onStart();
        kff.s(getView(), new mxh(this.a));
    }
}
