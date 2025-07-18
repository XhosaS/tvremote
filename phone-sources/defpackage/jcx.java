package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcx implements cvk {
    final /* synthetic */ jdd a;

    public jcx(jdd jddVar) {
        this.a = jddVar;
    }

    @Override // defpackage.cvk
    public final void a(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.subtitle_menu, menu);
        menuInflater.inflate(R.menu.zoom_menu_v2, menu);
        jdd jddVar = this.a;
        mjo.t(menu, R.id.menu_zoom_in, !jddVar.K());
        mjo.t(menu, R.id.menu_zoom_out, jddVar.K());
    }

    @Override // defpackage.cvk
    public final void c(Menu menu) {
        menu.getClass();
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_subtitle);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_subtitle_selected);
        jdd jddVar = this.a;
        boolean z = false;
        jddVar.x = jddVar.v.size() > 1 || jddVar.w.size() > 1;
        ouk oukVar = jddVar.A;
        boolean z2 = (oukVar == null || yks.e(oukVar, ouk.a)) ? false : true;
        menuItemFindItem.setVisible(jddVar.x && !z2);
        if (jddVar.x && z2) {
            z = true;
        }
        menuItemFindItem2.setVisible(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    @Override // defpackage.cvk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.view.MenuItem r20) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jcx.d(android.view.MenuItem):boolean");
    }

    @Override // defpackage.cvk
    public final /* synthetic */ void b(Menu menu) {
    }
}
