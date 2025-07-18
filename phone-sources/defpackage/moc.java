package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class moc extends sbx {
    private final ntp a;

    public moc(ntp ntpVar) {
        this.a = ntpVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int i = ((mob) obj).a - 1;
        return new mkv(i != 0 ? i != 1 ? R.layout.empty_state_downloaded : R.layout.empty_state_shows : R.layout.empty_state_movies);
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        mkv mkvVar = (mkv) obj2;
        mkvVar.a = new scc("R.id.button", mkvVar, new jub((mob) obj, 10));
        mkvVar.G(0);
    }
}
