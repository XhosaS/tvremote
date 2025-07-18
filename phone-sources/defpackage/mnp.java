package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.play.movies.mobile.usecase.downloads.DownloadItemView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mnp implements View.OnClickListener, icv {
    private final ieh a;
    private final lio b;
    private final idy c;
    private final /* synthetic */ int d;

    public mnp(ieh iehVar, lio lioVar, idy idyVar, int i) {
        this.d = i;
        this.a = iehVar;
        this.b = lioVar;
        this.c = idyVar;
    }

    @Override // defpackage.icv
    public final /* synthetic */ void a(Object obj, Object obj2) throws Resources.NotFoundException {
        if (this.d == 0) {
            kvf kvfVar = (kvf) obj;
            DownloadItemView downloadItemView = (DownloadItemView) obj2;
            downloadItemView.j();
            String strE = kvfVar.E();
            kuj kujVarA = ((kuk) this.a.a()).a(kvfVar.o());
            downloadItemView.h(kujVarA.f(), kujVarA.d, kujVarA.b, kujVarA.e);
            downloadItemView.g(strE);
            downloadItemView.b.c(kujVarA);
            downloadItemView.f(kvfVar.g());
            downloadItemView.k(this.b, liq.h(500, kvfVar));
            downloadItemView.i(this, kvfVar);
            return;
        }
        kuo kuoVar = (kuo) obj;
        DownloadItemView downloadItemView2 = (DownloadItemView) obj2;
        downloadItemView2.j();
        String str = kuoVar.e;
        String string = downloadItemView2.getResources().getString(R.string.show_and_episode_title, kuoVar.s, str);
        kuk kukVar = (kuk) this.a.a();
        ksy ksyVar = kuoVar.c;
        kuj kujVarA2 = kukVar.a(ksyVar);
        downloadItemView2.h(kujVarA2.f(), kujVarA2.d, kujVarA2.b, kujVarA2.e);
        downloadItemView2.g(string);
        downloadItemView2.b.c(kujVarA2);
        downloadItemView2.f(kuoVar.f);
        String string2 = kuoVar.o;
        String str2 = kuoVar.p;
        String str3 = kuoVar.n;
        TextView textView = downloadItemView2.c;
        if (textView != null) {
            textView.setVisibility(0);
            TextView textView2 = downloadItemView2.c;
            Resources resources = downloadItemView2.getResources();
            if (TextUtils.isEmpty(string2)) {
                string2 = downloadItemView2.getResources().getString(R.string.season_number, str2);
            }
            textView2.setText(resources.getString(R.string.season_title_and_episode_number, string2, str3));
        }
        downloadItemView2.k(this.b, liq.a(500, ksyVar, kuoVar.dW()));
        downloadItemView2.i(this, kuoVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.d != 0) {
            this.c.c((kuo) view.getTag(R.id.video_list_item_position_tag));
        } else {
            this.c.c((kvf) view.getTag(R.id.video_list_item_position_tag));
        }
    }
}
