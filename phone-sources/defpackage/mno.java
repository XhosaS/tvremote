package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.play.movies.mobile.usecase.downloads.ManageDownloadsActivity;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mno extends mvr {
    final /* synthetic */ ManageDownloadsActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mno(ManageDownloadsActivity manageDownloadsActivity, Context context) {
        super(context);
        this.a = manageDownloadsActivity;
    }

    @Override // defpackage.mvr
    public final int a() {
        return mtz.j(this.a);
    }

    @Override // defpackage.mvr
    public final int b() {
        return 1;
    }

    @Override // defpackage.mvr
    public final void i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        viewGroup.addView(layoutInflater.inflate(R.layout.rv_content, viewGroup, false));
    }

    @Override // defpackage.mvr
    public final int m() {
        return 1;
    }

    @Override // defpackage.mvr
    public final boolean n() {
        return true;
    }

    @Override // defpackage.mvr
    public final int o() {
        return sip.d(this.a.getBaseContext(), R.attr.colorPrimary, -1);
    }

    @Override // defpackage.mvr
    public final int p() {
        return mtz.i(this.a);
    }
}
