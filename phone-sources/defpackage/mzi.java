package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import com.google.common.collect.UnmodifiableIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mzi extends mum {
    private mzl a;

    @Override // defpackage.sfg, defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mzl mzlVar = (mzl) getArguments().getParcelable("season_picker_viewmodel");
        mzlVar.getClass();
        this.a = mzlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sfg
    public final View onCreateReplayDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a.getClass();
        String string = getString(R.string.details_seasonpicker_dialog_title);
        mun munVar = new mun(this);
        sfx sfxVar = new sfx();
        sfxVar.b(string);
        munVar.e(sfxVar);
        munVar.e(new sfk());
        sfw sfwVar = new sfw();
        sfwVar.b();
        munVar.c(sfwVar);
        UnmodifiableIterator it = this.a.b.iterator();
        while (it.hasNext()) {
            mzm mzmVar = (mzm) it.next();
            iuy iuyVar = new iuy(this, mzmVar, 17, null);
            String str = mzmVar.a.e;
            if (mzmVar.equals(this.a.c)) {
                muo muoVar = new muo();
                muoVar.a = str;
                muoVar.c = iuyVar;
                muoVar.b = getResources().getString(R.string.season_picker_content_description_selected, str, Integer.toString(this.a.b.size()));
                muoVar.d = true;
                munVar.c(muoVar);
            } else {
                muo muoVar2 = new muo();
                muoVar2.a = str;
                muoVar2.c = iuyVar;
                muoVar2.b = getResources().getString(R.string.season_picker_content_description_not_selected, str, Integer.toString(this.a.b.size()));
                muoVar2.d = false;
                munVar.c(muoVar2);
            }
        }
        return munVar.a();
    }
}
