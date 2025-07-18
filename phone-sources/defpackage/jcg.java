package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.media3.ui.PlayerView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcg implements cvk {
    final /* synthetic */ jcm a;

    public jcg(jcm jcmVar) {
        this.a = jcmVar;
    }

    @Override // defpackage.cvk
    public final void a(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.zoom_menu_v2, menu);
        jcm jcmVar = this.a;
        mjo.t(menu, R.id.menu_zoom_in, !jcmVar.l());
        mjo.t(menu, R.id.menu_zoom_out, jcmVar.l());
    }

    @Override // defpackage.cvk
    public final void c(Menu menu) {
        menu.getClass();
    }

    @Override // defpackage.cvk
    public final boolean d(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_zoom_in) {
            jcm jcmVar = this.a;
            PlayerView playerView = jcmVar.u;
            if (playerView != null) {
                playerView.i(4);
            }
            jcmVar.requireActivity().invalidateOptionsMenu();
            PlayerView playerView2 = jcmVar.u;
            if (playerView2 == null) {
                return true;
            }
            playerView2.d();
            return true;
        }
        if (itemId != R.id.menu_zoom_out) {
            return false;
        }
        jcm jcmVar2 = this.a;
        PlayerView playerView3 = jcmVar2.u;
        if (playerView3 != null) {
            playerView3.i(0);
        }
        jcmVar2.requireActivity().invalidateOptionsMenu();
        PlayerView playerView4 = jcmVar2.u;
        if (playerView4 == null) {
            return true;
        }
        playerView4.d();
        return true;
    }

    @Override // defpackage.cvk
    public final /* synthetic */ void b(Menu menu) {
    }
}
